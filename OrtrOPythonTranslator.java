import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class OrtrOPythonTranslator extends PythonPrettyPrinter { // Extends GrammarNameBaseListener

  public String visitChildrenBwd(RuleNode node) {
    String result = defaultResult();
    if (result == null)
      result = "";
    int n = node.getChildCount();
    for (int i = n-1; i > 0; i--) {
      if (!shouldVisitNextChild(node, result)) {
        break;
      }
      ParseTree c = node.getChild(i);
      String childResult = c.accept(this);
      result += childResult;
    }
    return result;
  }

  @Override
  public String visitRev_func(PythonParser.Rev_funcContext ctx) {
    String rule_rev = "def ";
    String name_fwd = visit(ctx.name()) + "_fwd ";
    name_fwd = name_fwd.replaceAll(" ", "");
    String args = "( " + visit(ctx.typedargslist()) + ") :";
    String rev_block = visit(ctx.rev_block());
    String func_fwd = rule_rev + name_fwd + args + rev_block;
    String a ="\n"+ visitChildrenBwd(ctx.rev_block());


    return func_fwd;
  }

  @Override
  public String visitRev_expr(PythonParser.Rev_exprContext ctx) {
    if (_indents > 0) {
      return applyIndents() + visitChildren(ctx) + "\n";
    }
    return visitChildren(ctx) + "\n";
  }

  @Override
  public String visitRev_return(PythonParser.Rev_returnContext ctx) {
    if (_indents > 0) {
      return applyIndents() + visitChildren(ctx) + "\n";
    }
    return visitChildren(ctx) + "\n";
  }

  @Override
  public String visitRev_block(PythonParser.Rev_blockContext ctx) {
    _indents += _IND;
    String suite = "\n" + visitChildren(ctx);
    suite = suite.substring(0, suite.length() - 1); // delete redundant NEW LINE
    _indents -= _IND;
    return suite;
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