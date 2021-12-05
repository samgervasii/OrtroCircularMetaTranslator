import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.*;

public class OrtrOPythonTranslator extends PythonPrettyPrinter { // Extends GrammarNameBaseListener

  protected Set<String> _rev_args = new HashSet<String>(); // set of arguments in rev function
  protected Set<String> _rev_args_unavailable = new HashSet<String>();
  protected boolean _bwd_visit = false; // indicates if we are visiting for the bwd
  protected boolean _fwd_visit = false; // indicates if we are visiting for the bwd

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

  // manually make all the visits to complete the fwd and bwd functions
  @Override
  public String visitRev_func(PythonParser.Rev_funcContext ctx) {
    _fwd_visit = true;

    String rule_rev = "def ";
    String name_fwd = visit(ctx.name()) + "_fwd ";
    name_fwd = literal(name_fwd);
    String args = "( " + visit(ctx.typedargslist()) + ") :";
    String rev_block_fwd = visit(ctx.rev_block());
    String func_fwd = rule_rev + name_fwd + args + rev_block_fwd;

    _fwd_visit = false;
    _bwd_visit = true;

    String name_bwd = name_fwd.replace("fwd", "bwd");
    String rev_block_bwd = visit(ctx.rev_block());
    String func_bwd = rule_rev + name_bwd + args + rev_block_bwd;

    _bwd_visit = false;

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
    if (_fwd_visit)
      _rev_args_unavailable.add(literal(left));
    String right = visit(ctx.testlist());
    if (_fwd_visit) {
      if(literal(left).equals(literal(right))){
        System.err.println("ERROR! An unavailable variable is being modified in the same valutation by itself.");
        System.exit(1);
      }
      _rev_args_unavailable.remove(literal(left));
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

  // check if arguments are equals to definition arguments and not more or less
  @Override
  public String visitRev_return(PythonParser.Rev_returnContext ctx) {
    String ret = "return ";
    String args = visit(ctx.testlist());
    if (_fwd_visit) {
      String[] arguments = literal(args).split(",");
      for (String arg : arguments) {
        if (_rev_args.contains(arg)) {
          _rev_args.remove(arg);
        } else {
          System.err.println("ERROR! return statement contains more arguments or different arguments than definition");
          System.exit(1);
        }
      }
      if (!_rev_args.isEmpty()) {
        System.err.println("ERROR! return statement has less number of arguments than definition");
        System.exit(1);
      }
    }
    String end = ret + args;
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