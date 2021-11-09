import java.io.*;
import antlr.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class OrtrOPythonTranslator extends PythonPrettyPrinter { // Extends GrammarNameBaseListener


    // Main
    public static void main(String[] args) throws IOException {
        // objects declaration
        String input_path = args[0]; // from commands line, otherwise "IO\\input.py";
        String output_path = "IO\\output.py";
        String code = "";
        FileWriter myWriter = new FileWriter(output_path); // write on the output_path
        PythonLexer lexer = new PythonLexer(CharStreams.fromFileName(input_path)); // GrammarNameLexer lexer = new ..
        CommonTokenStream tokens = new CommonTokenStream(lexer); // Tokens stream from lexer
        PythonParser parser = new PythonParser(tokens); // GrammarNameParser parser = new GrammarNameParser from tokens
        ParseTree tree = parser.root(); // parser.StarterRule() for ParseTree
        ParseTreeWalker walker = new ParseTreeWalker(); // walker
        OrtrOPythonTranslator listener = new OrtrOPythonTranslator(); // main listener

        // actions
        walker.walk(listener, tree); // walker walks the ParseTree using the final listener
        code = listener.getTarget(); // we recover the string target completed
        if (listener.getError()) {
            System.out.println("Parsing error occured, please check your input code");
        } else {
            myWriter.write(code);// we write on file
            System.out.println("code wrote successfully");
        }
        myWriter.close(); // close the file

    }
}