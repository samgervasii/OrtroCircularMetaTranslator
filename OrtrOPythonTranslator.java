import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;
import java.util.AbstractMap.SimpleEntry;

public class OrtrOPythonTranslator extends PythonPrettyPrinter { // Extends GrammarNameBaseListener

  protected Set<String> _rev_args = new HashSet<String>(); // set of arguments in rev function
  protected Set<String> _rev_args_unavailable = new HashSet<String>();
  protected boolean _bwd_visit = false; // indicates if we are visiting for the bwd
  protected boolean _fwd_visit = false; // indicates if we are visiting for the fwd
  protected boolean _conditional_visit = false; // indicates if we are visiting for the conditional branching

  // replace all the spaces added by visitTerminal, useful for operations on set
  private String literal(String s) {
    return s.replaceAll(" ", "");
  }

  // like visitChildren but append all the childs in a string
  public String visitChildrenBwd(RuleNode node) {
    String result = defaultResult();
    if (result == null)
      result = "";
    int n = node.getChildCount();
    for (int i = 0; i < n; i++) {
      if (!shouldVisitNextChild(node, result)) {
        break;
      }
      ParseTree c = node.getChild(i);
      String childResult = c.accept(this);
      if (childResult.contains("return"))
        result += childResult;
      else
        result = childResult + result;
    }
    return result;
  }

  //return unique string of arguments from a Set
  public String argStringify(Set<String> set) {
    String args = "";
    for (String arg : set) {
      args += arg + " , ";
    }
    args = args.substring(0, args.length() - 2);
    return args;
  }

  //order available args based on return arguments in fwd visit
  public Set<String> orderArgs(String ret_args){
    Set<String> nset = new HashSet<String>();
    for(String s: literal(ret_args).split(",")){
      nset.add(s);
    }
    return nset;
  }

  // manually make all the visits to complete the fwd and bwd functions
  @Override
  public String visitRev_func(PythonParser.Rev_funcContext ctx) {
    _fwd_visit = true;

    String rule_rev = "def ";
    String name_fwd = visit(ctx.name()) + "_fwd";
    name_fwd = literal(name_fwd);
    String args = " ( " + visit(ctx.typedargslist()) + ") :";
    String rev_block_fwd = visit(ctx.rev_block());
    String func_fwd = rule_rev + name_fwd + args + rev_block_fwd;

    _fwd_visit = false;
    _bwd_visit = true;

    String name_bwd = name_fwd.replace("fwd", "bwd");
    String bwd_args = " ( " + argStringify(_rev_args) + ")" + " :";
    String rev_block_bwd = visit(ctx.rev_block());
    String func_bwd = rule_rev + name_bwd + bwd_args + rev_block_bwd;

    _bwd_visit = false;
    _rev_args.clear();
    _rev_args_unavailable.clear();

    if (_indents > 0) {
      return applyIndents() + func_fwd + "\n" + func_bwd;
    }
    return func_fwd + "\n" + func_bwd;
  }

  // manually decides when visitChildren or visitChildrenBwd
  @Override
  public String visitRev_block(PythonParser.Rev_blockContext ctx) {
    _indents += _IND;
    String block = "";
    if (!_bwd_visit) {
      block = "\n" + visitChildren(ctx);
      block = block.substring(0, block.length() - 1); // delete redundant NEW LINE
      _indents -= _IND;
      return block;
    }
    block = "\n" + visitChildrenBwd(ctx);
    block = block.substring(0, block.length() - 1); // delete redundant NEW LINE
    _indents -= _IND;
    return block;
  }

  // manually switch operator
  @Override
  public String visitRev_expr(PythonParser.Rev_exprContext ctx) {
    String left = visit(ctx.testlist_star_expr());
    if (_fwd_visit) {
      if (_rev_args_unavailable.contains(literal(left))) {
        System.err.println("ERROR! An unavailable variable is being modified");
        System.exit(1);
      }
      _rev_args_unavailable.add(literal(left));
      _rev_args.remove(literal(left));
    }
    String right = visit(ctx.testlist());
    if (_fwd_visit) {
      if (right.contains(literal(left) + " ") && _rev_args_unavailable.contains(literal(left))) {
        System.err.println("ERROR! An unavailable variable is being modified in the same valutation by itself.");
        System.exit(1);
      }
      _rev_args_unavailable.remove(literal(left));
      _rev_args.add(literal(left));
    }
    String op = ctx.op.getText() + " ";
    if (_bwd_visit) {
      if (op.contains("+="))
        op = "-= ";
      else
        op = "+= ";
    }
    String expr = left + op + right;
    if (_indents > 0) {
      return applyIndents() + expr + "\n";
    }
    return expr + "\n";
  }

  //create entries for checking the soundness in the variable occurrences
  @Override
  public String visitRev_if(PythonParser.Rev_ifContext ctx) {
    SimpleEntry<Set<String>, Set<String>> pre_if = new SimpleEntry<Set<String>, Set<String>>(
        new HashSet<String>(_rev_args), new HashSet<String>(_rev_args_unavailable));
    _conditional_visit = true;
    String logical_test = visit(ctx.test());
    _conditional_visit = false;
    SimpleEntry<Set<String>, Set<String>> post_cond = new SimpleEntry<Set<String>, Set<String>>(
        new HashSet<String>(_rev_args), new HashSet<String>(_rev_args_unavailable));
    String suite = visit(ctx.rev_suite());
    String if_stmt = ctx.IF() + " " + logical_test + ctx.COLON() + " " + suite;
    if (ctx.rev_else() != null) {
      SimpleEntry<Set<String>, Set<String>> post_body = new SimpleEntry<Set<String>, Set<String>>(
          new HashSet<String>(_rev_args), new HashSet<String>(_rev_args_unavailable));
      _rev_args = new HashSet<String>(post_cond.getKey());
      _rev_args_unavailable = new HashSet<String>(post_cond.getValue());
      String else_stmt = visit(ctx.rev_else());
      SimpleEntry<Set<String>, Set<String>> post_else = new SimpleEntry<Set<String>, Set<String>>(
          new HashSet<String>(_rev_args), new HashSet<String>(_rev_args_unavailable));
      if (!post_body.equals(post_else)) {
        System.err.println("ERROR! Conflict of variables in if-else clause");
        System.exit(1);
      }
      pre_if.getKey().removeAll(post_cond.getKey());
      _rev_args.addAll(pre_if.getKey());
      _rev_args_unavailable.removeAll(pre_if.getKey());
      return applyIndents() + if_stmt + else_stmt + "\n";
    }
    pre_if.getKey().removeAll(post_cond.getKey());
    _rev_args.addAll(pre_if.getKey());
    _rev_args_unavailable.removeAll(pre_if.getKey());
    return applyIndents() + if_stmt + "\n";
  }

  @Override
  public String visitName(PythonParser.NameContext ctx) {
    String name = visitChildren(ctx);
    if (_conditional_visit && _fwd_visit) {
      if (_rev_args_unavailable.contains(literal(name))) {
        System.err.println("ERROR! the conditional variable is not available");
        System.exit(1);
      }
      _rev_args_unavailable.add(literal(name));
      _rev_args.remove(literal(name));
    }
    return name;
  }

  @Override
  public String visitRev_suite(PythonParser.Rev_suiteContext ctx) {
    _indents += _IND;
    String suite = "";
    if (!_bwd_visit) {
      suite = "\n" + visitChildren(ctx);
      suite = suite.substring(0, suite.length() - 1); // delete redundant NEW LINE
      _indents -= _IND;
      return suite;
    }
    suite = "\n" + visitChildrenBwd(ctx);
    suite = suite.substring(0, suite.length() - 1); // delete redundant NEW LINE
    _indents -= _IND;
    return suite;
  }

  @Override
  public String visitRev_else(PythonParser.Rev_elseContext ctx) {
    if (_indents > 0) {
      return "\n" + applyIndents() + visitChildren(ctx);
    }
    return "\n" + visitChildren(ctx);
  }
 
  @Override
  public String visitRev_alloc(PythonParser.Rev_allocContext ctx) {
    String new_variables = visit(ctx.testlist_comp());
    String left_tuple = ctx.open.getText() + " " + new_variables + ctx.close.getText();
    String op = " " + ctx.ASSIGN() + " ";
    String right = visit(ctx.name());
    if (_fwd_visit) {
      _rev_args_unavailable.add(literal(right));
      _rev_args.remove(literal(right));
      for (String arg : literal(new_variables).split(",")) {
        if (_rev_args.contains(arg)) {
          System.err.println("ERROR! allocating to variable that has already a value");
          System.exit(1);
        }
        _rev_args.add(literal(arg));
      }
    }
    if (_bwd_visit) {
      _rev_args.add(literal(right));
      _rev_args_unavailable.remove(literal(right));
      for (String arg : literal(new_variables).split(",")) {
        _rev_args_unavailable.add(literal(arg));
        _rev_args.remove(literal(arg));
      }
    }
    String expr = left_tuple + op + right;
    if (_bwd_visit) {
      expr = right + op + left_tuple;
    }
    if (_indents > 0) {
      return applyIndents() + expr + "\n";
    }
    return expr + "\n";
  }

  @Override
  public String visitRev_dealloc(PythonParser.Rev_deallocContext ctx) {
    String left = visit(ctx.name());
    String op = " " + ctx.ASSIGN() + " ";
    String new_variables = visit(ctx.testlist_comp());
    String right_tuple = ctx.open.getText() + " " + new_variables + ctx.close.getText();
    if (_fwd_visit) {
      if (_rev_args.contains(literal(left))) {
        System.err.println("ERROR! allocating to variable that has already a value");
        System.exit(1);
      }
      _rev_args.add(literal(left));
      for (String arg : literal(new_variables).split(",")) {
        _rev_args_unavailable.add(literal(arg));
        _rev_args.remove(literal(arg));
      }
    }
    if (_bwd_visit) {
      _rev_args_unavailable.add(literal(left));
      _rev_args.remove(literal(left));
      for (String arg : literal(new_variables).split(",")) {
        _rev_args.add(literal(arg));
      }
    }
    String expr = left + op + right_tuple;
    if (_bwd_visit) {
      expr = right_tuple + op + left;
    }
    if (_indents > 0) {
      return applyIndents() + expr + "\n";
    }
    return expr + "\n";
  }

  // check if arguments are equals to definition arguments and not more or less
  @Override
  public String visitRev_return(PythonParser.Rev_returnContext ctx) {
    String ret = ctx.RETURN() + " ";
    String args = visit(ctx.testlist());
    if (_fwd_visit) {
      Set<String> temp_set = new HashSet<String>(_rev_args);
      for (String arg : literal(args).split(",")) {
        if (temp_set.contains(arg)) {
          temp_set.remove(arg);
        } else {
          System.err.println("ERROR! return statement contains more arguments or different arguments than definition");
          System.exit(1);
        }
      }
      if (!temp_set.isEmpty()) {
        System.err.println("ERROR! return statement has less number of arguments than definition");
        System.exit(1);
      }
    }
    if (_bwd_visit) {
      args = argStringify(_rev_args).replace("(", "");
      args = args.replace(")", "");
    }
    String end = ret + args;
    _rev_args = orderArgs(args);
    if (_indents > 0) {
      return applyIndents() + end + "\n";
    }
    return end + "\n";
  }

  // add arguments to the Set if we are visiting rev_func in fwd
  @Override
  public String visitDef_parameter(PythonParser.Def_parameterContext ctx) {
    String param = visitChildren(ctx);
    if (_fwd_visit) {
      _rev_args.add(literal(param));
    }
    return param;
  }

  // if in a function called under rev block occures a variable in the Set, throw
  // error
  @Override
  public String visitArgument(PythonParser.ArgumentContext ctx) {
    String terminal_argument = visitChildren(ctx);
    if (_fwd_visit) {
      if (_rev_args_unavailable.contains(literal(terminal_argument))) {
        System.err.println("ERROR! An unavailable variable is being modified in the same valutation by a function");
        System.exit(1);
      }
    }
    return terminal_argument;
  }

  // Main
  public static void main(String[] args) throws IOException {
    // objects declaration
    String input_path = "IO\\input.opy";// args[0]; // from commands line, otherwise "IO\\input.py";
    String output_path = "IO\\output.py";// args[1]; // from commands line, otherwise "IO\\output.py"

    FileWriter targetWriter = new FileWriter(output_path); // file writer
    PythonLexer lexer = new PythonLexer(CharStreams.fromFileName(input_path)); // GrammarNameLexer lexer = new ..
    CommonTokenStream tokens = new CommonTokenStream(lexer); // Tokens stream from lexer
    PythonParser parser = new PythonParser(tokens); // GrammarNameParser parser = new GrammarNameParser from tokens
    ParseTree tree = parser.root(); // parser.StarterRule() for ParseTree
    OrtrOPythonTranslator visitor = new OrtrOPythonTranslator(); // main listener

    // actions
    String c = visitor.visit(tree); // we recover the string target completed
    targetWriter.write(c);
    System.out.println("code written on file succesfully");
    targetWriter.close();
  }
}