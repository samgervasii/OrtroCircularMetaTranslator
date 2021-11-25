import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class OrtrOPythonTranslator extends PythonPrettyPrinter { // Extends GrammarNameBaseListener







    // Main  
    public static void main(String[] args) throws IOException {
    // objects declaration
    String input_path = args[0]; // from commands line, otherwise "IO\\input.py";
    String output_path = args[1]; //from commands line, otherwise "IO\\output.py"

    FileWriter targetWriter = new FileWriter(output_path); //file writer
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