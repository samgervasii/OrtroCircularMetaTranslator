import java.io.*;
import antlr.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class OrtrOPythonTranslator extends PythonPrettyPrinter { // Extends GrammarNameBaseListener

    private int rev_mode = 0; // reversible mode flag, 0=normal 1=duoDefineFunction 2=revStmtAnalize
    private String rev_instruction = ""; // single instruction from a rev block to be reversed
    private String def_bwd = ""; // def name_bwd(...): function backward to push into the rev_little_target
    private String rev_little_target = ""; // our entire bwd function
    private boolean args_flag = false; // arguments flag for rev definition

    public int getRevMode() {
        return this.rev_mode;
    }

    public void setRevMode(int rev_mode) {
        this.rev_mode = rev_mode;
    }

    public String getRevInstruction() {
        return this.rev_instruction;
    }

    public void resetRevInstruction() {
        this.rev_instruction = "";
    }

    public String getDefBwd() {
        return this.def_bwd;
    }

    public String getRevLittleTarget() {
        return this.rev_little_target;
    }

    public boolean getArgsFlag() {
        return this.args_flag;
    }

    public void setArgsFlag(boolean args_flag) {
        this.args_flag = args_flag;
    }
//TODO i metodi sotto modificano il valore esclusivamente all'interno della funzione

    public void addToString(String s1, String s2) {
        s1 += s2;
    }

    public void appendToString(String s1, String s2) {
        s1 = s2 + s1;
    }

    public void duoDefineFunction(TerminalNode node) {
        System.out.println(node);
        System.out.println(getDefBwd());
        switch (node.getText()) {
        case "rev": // rev add 2 def (fwd and bwd)
            addToTarget("def" + " ");
            addToString(getDefBwd(), "def" + " ");
            break;
        case "(": // case known, double write
            addToTarget(node.getText() + " ");
            addToString(getDefBwd(), node.getText() + " ");
            break;
        case ")": // case known, double write
            addToTarget(node.getText() + " ");
            addToString(getDefBwd(), node.getText() + " ");
            break;
        case ":": // case known, double write
            addToTarget(node.getText() + " ");
            addToString(getDefBwd(), node.getText() + " ");
            break;
        default:
            if (!getArgsFlag()) { // we are writine the function name so double it with postfix fwd and bwd
                addToTarget(node.getText() + "_fwd ");
                addToString(getDefBwd(), node.getText() + "_bwd ");
            } else { // we are writing arguments, just fwd
                addToTarget(node.getText() + " ");
            }
        }
        
    }

    public void revStmtAnalize(TerminalNode node) {
        System.out.println(node);
        System.out.println(getRevInstruction());
        switch (node.getText()) {
        case "+=":
            addToTarget(node.getText() + " ");
            addToString(getRevInstruction(), "-=" + " "); // rev op
            break;
        case "-=":
            addToTarget(node.getText() + " ");
            addToString(getRevInstruction(), "+=" + " "); // rev op
            break;
        default:
            addToTarget(node.getText() + " ");
            addToString(getRevInstruction(), node.getText() + " ");
        }
    }

    // override listener methods

    @Override
    public void enterRev_func(PythonParser.Rev_funcContext ctx) {
        setRevMode(1); // starting the reverse listening
    }

    @Override
    public void exitRev_func(PythonParser.Rev_funcContext ctx) {
        appendToString(getRevLittleTarget(), getDefBwd());
        addToTarget(getRevLittleTarget());
        setRevMode(0); // exit the reverse listening
    }

    @Override
    public void enterRev_block(PythonParser.Rev_blockContext ctx) {
        addToTarget("\n"); // newline on on every revblock that indents
        moreIndents();
        if(getRevMode() != 2) setRevMode(2); // enter reversible code if we arrive from the definition
    }

    @Override
    public void exitRev_block(PythonParser.Rev_blockContext ctx) {
        lessIndents();
    }

    @Override
    public void enterTypedargslist(PythonParser.TypedargslistContext ctx) {
        if (getRevMode() == 1)
            setArgsFlag(true); // we have a rev definition with arguments
    }

    public void exitTypedargslist(PythonParser.TypedargslistContext ctx) {
        if (getRevMode() == 1)
            setArgsFlag(false); // out of arguments
    }

    @Override
    public void enterRev_expr(PythonParser.Rev_exprContext ctx) {
        if (getIndents() >= 0) {
            addIndents();
        }
    }

    @Override
    public void exitRev_expr(PythonParser.Rev_exprContext ctx) {
        appendToString(getRevLittleTarget(), getRevInstruction()); // append rev instruction and reset
        resetRevInstruction();
        addToTarget("\n");
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        if (node.getText() != "<EOF>") { // do not print <EOF>
            if (getRevMode() == 1) {
                duoDefineFunction(node);
            } else if (getRevMode() == 2) {
                revStmtAnalize(node);
            } else if (getRevMode() == 0) {
                addToTarget(node.getText() + " "); // every terminal node is whitespaced
            }
            if (node.getText() == "") { // redundant newline or indents
                removeLastChar();
            }
        }
    }

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