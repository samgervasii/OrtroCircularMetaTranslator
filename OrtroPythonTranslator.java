import java.io.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;
import java.util.AbstractMap.SimpleEntry;

//Extends GrammarNameBaseListener
public class OrtroPythonTranslator extends PythonPrettyPrinter { 
  //set of arguments in rev function
  protected Set<String> _rev_args = new HashSet<String>(); 
  protected Set<String> _rev_args_unavailable = new HashSet<String>();
  //indicates if we are visiting for the bwd
  protected boolean _bwd_visit = false;
  //indicates if we are visiting for the fwd 
  protected boolean _fwd_visit = false;
  //indicates if we are visiting for the conditional branching 
  protected boolean _conditional_visit = false; 

  //check if a String is a numeric value
  public boolean isNumeric(String str) {
    try {
      Double.parseDouble(str);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

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

  // return unique string of arguments from a Set
  public String argStringify(Set<String> set) {
    String args = "";
    for (String arg : set) {
      args += arg + " , ";
    }
    args = args.substring(0, args.length() - 2);
    return args;
  }

  // order available args based on return arguments in fwd visit
  public Set<String> orderArgs(String ret_args) {
    Set<String> nset = new HashSet<String>();
    for (String s : literal(ret_args).split(",")) {
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
    return applyIndents() + func_fwd + "\n" + func_bwd;
  }

  // manually decides when visitChildren or visitChildrenBwd
  @Override
  public String visitRev_block(PythonParser.Rev_blockContext ctx) {
    _indents += _IND;
    String block = "";
    if (_fwd_visit) {
      block = "\n" + visitChildren(ctx);
      //delete redundant NEW LINE
      block = block.substring(0, block.length() - 1); 
      _indents -= _IND;
      return block;
    }
    block = "\n" + visitChildrenBwd(ctx);
    //delete redundant NEW LINE
    block = block.substring(0, block.length() - 1); 
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
      if (right.contains(literal(left) + " ")) {
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

  // create entries for checking the soundness in the variable occurrences
  @Override
  public String visitRev_if(PythonParser.Rev_ifContext ctx) {
    // save state pre if
    SimpleEntry<Set<String>, Set<String>> pre_if = new SimpleEntry<Set<String>, Set<String>>(
        new HashSet<String>(_rev_args), new HashSet<String>(_rev_args_unavailable));

    // start the conditional visit for check which variable can't be modified in the
    // for body
    _conditional_visit = true;
    String logical_test = visit(ctx.test());
    _conditional_visit = false;

    // save state post conditional visit (and pre body)
    SimpleEntry<Set<String>, Set<String>> post_cond = new SimpleEntry<Set<String>, Set<String>>(
        new HashSet<String>(_rev_args), new HashSet<String>(_rev_args_unavailable));

    String suite = visit(ctx.rev_suite());
    String if_stmt = ctx.IF() + " " + logical_test + ctx.COLON() + " " + suite;

    // case where if with else
    if (ctx.rev_else() != null) {
      // save post body
      SimpleEntry<Set<String>, Set<String>> post_body = new SimpleEntry<Set<String>, Set<String>>(
          new HashSet<String>(_rev_args), new HashSet<String>(_rev_args_unavailable));

      // reset Sets in state post_cond to proceed with else
      _rev_args = new HashSet<String>(post_cond.getKey());
      _rev_args_unavailable = new HashSet<String>(post_cond.getValue());
      String else_stmt = visit(ctx.rev_else());

      // save state post else
      SimpleEntry<Set<String>, Set<String>> post_else = new SimpleEntry<Set<String>, Set<String>>(
          new HashSet<String>(_rev_args), new HashSet<String>(_rev_args_unavailable));

      // states must coincide
      if (!post_body.equals(post_else)) {
        System.err.println("\n\nERROR! Conflict of variables in if-else clause");
        System.exit(1);
      }
      // state management then return
      pre_if.getKey().removeAll(post_cond.getKey());
      _rev_args.addAll(pre_if.getKey());
      _rev_args_unavailable.removeAll(pre_if.getKey());

      return applyIndents() + if_stmt + else_stmt + "\n";
    }

    // case if without else and state management
    pre_if.getKey().removeAll(post_cond.getKey());
    _rev_args.addAll(pre_if.getKey());
    _rev_args_unavailable.removeAll(pre_if.getKey());

    return applyIndents() + if_stmt + "\n";
  }

 //check in a conditional visit if a variable is available and then put it in the unavailable (non numeric atom)
  @Override
  public String visitExpr1(PythonParser.Expr1Context ctx) {
    if (ctx.trailer().isEmpty() && ctx.AWAIT() == null) {
      String atom = visit(ctx.atom());
      if (_conditional_visit && _fwd_visit && !isNumeric(atom)) {
        if (_rev_args_unavailable.contains(literal(atom))) {
          System.err.println("ERROR! the conditional variable is not available");
          System.exit(1);
        }
        _rev_args_unavailable.add(literal(atom));
        _rev_args.remove(literal(atom));
      }
      return atom;
    }
    return visitChildren(ctx);
  }

  @Override
  public String visitRev_suite(PythonParser.Rev_suiteContext ctx) {
    _indents += _IND;
    String suite = "";
    if (_fwd_visit) {
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
    return "\n" + applyIndents() + visitChildren(ctx);
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
    return applyIndents() + expr + "\n";
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
    return applyIndents() + expr + "\n";
  }

  @Override
  public String visitRev_for(PythonParser.Rev_forContext ctx) {
    // save state precedent to for
    SimpleEntry<Set<String>, Set<String>> pre_for = new SimpleEntry<Set<String>, Set<String>>(
        new HashSet<String>(_rev_args), new HashSet<String>(_rev_args_unavailable));
    // start the conditional visit for check which variable can't be modified in the
    // for body
    _conditional_visit = true;
    String index = visit(ctx.exprlist());
    String iterable = visit(ctx.testlist());
    _conditional_visit = false;

    // save state pre body
    SimpleEntry<Set<String>, Set<String>> pre_body = new SimpleEntry<Set<String>, Set<String>>(
        new HashSet<String>(_rev_args), new HashSet<String>(_rev_args_unavailable));
    String body = visit(ctx.rev_suite());

    // Sets management
    pre_for.getKey().removeAll(pre_body.getKey());
    _rev_args.addAll(pre_for.getKey());
    _rev_args_unavailable.removeAll(pre_for.getKey());

    if (_bwd_visit) {
      return applyIndents() + ctx.FOR() + " " + index + ctx.IN() + " reversed ( " + iterable + " ) " + ctx.COLON()
          + body + "\n";
    }
    return applyIndents() + ctx.FOR() + " " + index + ctx.IN() + " " + iterable + ctx.COLON() + body + "\n";

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
    return applyIndents() + end + "\n";
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

  // if in a function occures a variable in the Set, throw error
  @Override
  public String visitArgument(PythonParser.ArgumentContext ctx) {
    String terminal_argument = visitChildren(ctx);
    if (_fwd_visit) {
      if (_rev_args_unavailable.contains(literal(terminal_argument)) && !_conditional_visit) {
        System.err.println("ERROR! An unavailable variable is being modified in the same valutation by a function");
        System.exit(1);
      }
    }
    return terminal_argument;
  }

  // Main
  public static void main(String[] args) throws IOException {
    // objects declaration
    String input_path = args[0];
    String output_path = args[1]; 
    //file writer
    FileWriter targetWriter = new FileWriter(output_path);
    //GrammarNameLexer lexer = new ..
    PythonLexer lexer = new PythonLexer(CharStreams.fromFileName(input_path));
    //Tokens stream from lexer 
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    //GrammarNameParser parser = new GrammarNameParser from tokens 
    PythonParser parser = new PythonParser(tokens);
    //parser.StarterRule() for ParseTree 
    ParseTree tree = parser.root(); 
    OrtroPythonTranslator visitor = new OrtroPythonTranslator();

    // actions
    //we recover the string target completed
    String c = visitor.visit(tree); 
    targetWriter.write(c);
    System.out.println("code written on file succesfully");
    targetWriter.close();
  }
}
