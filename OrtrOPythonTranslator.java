import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.*;

public class OrtrOPythonTranslator extends PythonPrettyPrinter { // Extends GrammarNameBaseListener

  protected Set<String> _rev_args = new HashSet<String>(); //set of arguments in rev function
  protected boolean _rev_visit = false; //indicates if we are visiting for the fwd or the bwd
  protected String[] _rule_names; //given a parser in a constructor defines all the names of rules

  //constructor
  public OrtrOPythonTranslator(PythonParser parser) {
    this._rule_names = parser.getRuleNames();
  }

  //like visitChildren but append all the childs in a string
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

  //manually make all the visits to complete the fwd and bwd functions
  @Override
  public String visitRev_func(PythonParser.Rev_funcContext ctx) {
    String rule_rev = "def ";

    String name_fwd = visit(ctx.name()) + "_fwd ";
    name_fwd = name_fwd.replaceAll(" ", "");
    String args = "( " + visit(ctx.typedargslist()) + ") :";
    String rev_block_fwd = visit(ctx.rev_block());
    String func_fwd = rule_rev + name_fwd + args + rev_block_fwd;
    _rev_visit = true;
    String name_bwd = name_fwd.replace("fwd", "bwd");
    String rev_block_bwd = visit(ctx.rev_block());
    String func_bwd = rule_rev + name_bwd + args + rev_block_bwd;
    _rev_visit = false;

    if (_indents > 0) {
      return applyIndents() + func_fwd + "\n" + func_bwd;
    }
    return func_fwd + "\n" + func_bwd;
  }

  //manually decides when visitChildren or visitChildrenBwd
  @Override
  public String visitRev_block(PythonParser.Rev_blockContext ctx) {
    _indents += _IND;
    String block = "";
    if (!_rev_visit) {
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

  //manually switch operator
  @Override
  public String visitRev_expr(PythonParser.Rev_exprContext ctx) {
    String left = visit(ctx.testlist_star_expr());
    String right = visit(ctx.testlist());
    String op = ctx.op.getText() + " ";
    if (_rev_visit) {
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

  //just indents
  @Override
  public String visitRev_return(PythonParser.Rev_returnContext ctx) {
    if (_indents > 0) {
      return applyIndents() + visitChildren(ctx) + "\n";
    }
    return visitChildren(ctx) + "\n";
  }

  //add arguments to the Set if we are in a rev block
  @Override
  public String visitDef_parameter(PythonParser.Def_parameterContext ctx) {
    int rev_func_parent_index = ctx.parent.parent.parent.getRuleIndex();
    if (_rule_names[rev_func_parent_index].contains("rev_func")) {
      _rev_args.add(visitChildren(ctx).replaceAll(" ", ""));
    }
    return visitChildren(ctx);
  }
  
  //if in a function called under rev block occures a variable in the Set, throw warning (why 2?)
  @Override
  public String visitArgument(PythonParser.ArgumentContext ctx) {
    String terminal_argument = visitChildren(ctx);
    RuleContext rev_stmt = ctx;
    for (int i = 0; i < 9; i++)
      rev_stmt = rev_stmt.parent;
    int rev_stmt_parent_index = rev_stmt.getRuleIndex();
    if (_rule_names[rev_stmt_parent_index].contains("rev_stmt")) {
      if (_rev_args.contains(terminal_argument.replaceAll(" ", ""))) {
        System.out.println("WARNING: a function in a rev block is calling an intern variable from these: "+ _rev_args);
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
    OrtrOPythonTranslator visitor = new OrtrOPythonTranslator(parser); // main listener

    // actions
    String c = visitor.visit(tree); // we recover the string target completed
    targetWriter.write(c);
    System.out.println("code written on file succesfully");
    targetWriter.close();
  }
}