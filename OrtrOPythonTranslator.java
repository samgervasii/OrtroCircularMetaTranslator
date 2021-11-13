import java.io.*;
import antlr.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class OrtrOPythonTranslator extends PythonPrettyPrinter { // Extends GrammarNameBaseListener

    private int _rev_mode = 0; // reversible mode flag, 0=normal 1=nameFunctionAnalyze 2=revStmtAnalize
    private String _rev_instruction = ""; // single instruction from a rev block to be reversed
    private String _bwd_name_function = ""; // def name_bwd(...): function backward to push into the
                                            // _bwd_entire_function
    private String _bwd_body_function = ""; // the body of the bwd function, a group of _rev_instructions
    private String _bwd_entire_function = ""; // our entire bwd function
    private boolean _args_flag = false; // arguments flag for rev definition

    protected int getRevMode() {
        return this._rev_mode;
    }

    protected void setRevMode(int rev_mode) {
        this._rev_mode = rev_mode;
    }

    protected String getRevInstruction() {
        return this._rev_instruction;
    }

    protected void resetRevInstruction() {
        this._rev_instruction = "";
    }

    protected void addToRevInstruction(String atom) {
        this._rev_instruction += atom;
    }

    protected void rmLastCharRevInstruction(){ // = removeLastChar but on String _rev_instruction
        this._rev_instruction = _rev_instruction.substring(0, _rev_instruction.length() - 1);
    }

    protected String getBwdNameFunction() {
        return this._bwd_name_function;
    }

    protected void addToBwdNameFunction(String atom) {
        this._bwd_name_function += atom;
    }

    protected String getBwdBodyFunction() {
        return this._bwd_body_function;
    }

    protected void appendToBwdBodyFunction(String atom) {
        this._bwd_body_function = atom + this._bwd_body_function;
    }

    protected void resetBwdBodyFunction() {
        this._bwd_body_function = "";
    }

    protected String getBwdEntireFunction() {
        return this._bwd_entire_function;
    }

    protected void setBwdEntireFunction(String function) {
        this._bwd_entire_function = function;
    }

    protected void resetBwdEntireFunction() {
        this._bwd_entire_function = "";
    }

    protected boolean getArgsFlag() {
        return this._args_flag;
    }

    protected void setArgsFlag(boolean args_flag) {
        this._args_flag = args_flag;
    }

    protected void applyIndentsRevInstruction() { // = applyIndents but on strin _rev_instruction
        for (int i = 0; i < getIndents(); i++) {
            addToRevInstruction(" "); // add white space based on number on indents, that can only be a multiple of
                              // IND (4)
        }
    }

    protected void nameFunctionAnalyze(TerminalNode node) {
        switch (node.getText()) {
        case "rev": // rev add 2 def (fwd and bwd)
            addToTarget("def" + " ");
            addToBwdNameFunction("def" + " ");
            break;
        case "(": // case known, double write
            addToTarget(node.getText() + " ");
            addToBwdNameFunction(node.getText() + " ");
            break;
        case ")": // case known, double write
            addToTarget(node.getText() + " ");
            addToBwdNameFunction(node.getText() + " ");
            break;
        case ":": // case known, double write
            addToTarget(node.getText() + " ");
            addToBwdNameFunction(node.getText() + " " + "\n");
            break;
        default:
            if (!getArgsFlag()) { // we are writine the function name so double it with postfix fwd and bwd
                addToTarget(node.getText() + "_fwd ");
                addToBwdNameFunction(node.getText() + "_bwd ");
            } else { // we are writing arguments
                addToTarget(node.getText() + " ");
                addToBwdNameFunction(node.getText() + " ");
            }
        }

    }

    protected void revStmtAnalize(TerminalNode node) {
        System.out.println(getRevInstruction());
        switch (node.getText()) {
        case "+=":
            addToTarget(node.getText() + " ");
            addToRevInstruction("-=" + " "); // rev op
            break;
        case "-=":
            addToTarget(node.getText() + " ");
            addToRevInstruction("+=" + " "); // rev op
            break;
        default:
            addToTarget(node.getText() + " ");
            addToRevInstruction(node.getText() + " ");
        }
    }

    // override listener methods

    @Override
    public void enterRev_func(PythonParser.Rev_funcContext ctx) {
        setRevMode(1); // starting the reverse listening
    }

    @Override
    public void exitRev_func(PythonParser.Rev_funcContext ctx) {
        setBwdEntireFunction(getBwdNameFunction() + getBwdBodyFunction()); // _bwd_entire_function = _bwd_name_function and _bwd_body_function
        addToTarget(getBwdEntireFunction());
        resetBwdBodyFunction();
        resetBwdEntireFunction();
        setRevMode(0); // exit the reverse listening
    }

    @Override
    public void enterRev_block(PythonParser.Rev_blockContext ctx) {
        addToTarget("\n"); // newline on on every revblock that indents
        addIndents();
        if (getRevMode() != 2)
            setRevMode(2); // enter reversible code if we arrive from the definition
    }

    @Override
    public void exitRev_block(PythonParser.Rev_blockContext ctx) {
        cutIndents();
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
            applyIndents();
            applyIndentsRevInstruction();
        }
    }

    @Override
    public void exitRev_expr(PythonParser.Rev_exprContext ctx) {
        appendToBwdBodyFunction(getRevInstruction() + "\n"); // append rev instruction and reset
        resetRevInstruction();
        addToTarget("\n");
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        if (node.getText() != "<EOF>") { // do not print <EOF>
            if (getRevMode() == 1) {
                nameFunctionAnalyze(node);
            } else if (getRevMode() == 2) {
                revStmtAnalize(node);
            } else if (getRevMode() == 0) {
                addToTarget(node.getText() + " "); // every terminal node is whitespaced
            }

            if (node.getText() == "") { // redundant newline or indents
                removeLastChar();
                if(getRevMode() == 2){
                    rmLastCharRevInstruction();
                }
            }
        }
    }

    // Main
    public static void main(String[] args) throws IOException {
        // objects declaration
        String input_path = args[0]; // from commands line, otherwise "IO\\input.py";
        String output_path = args[1];
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