// Generated from c:\Users\Samuele Gervasi\My Drive\LIFE\Information\u005Cuniversity\Triennale Informatica\Terzo Anno\Stage e Tesi\Reversible Computing\OrthrusPythonTranslator\antlr\PythonParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PythonParser extends PythonParserBase {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, LINE_BREAK=3, DEF=4, RETURN=5, RAISE=6, FROM=7, IMPORT=8, 
		NONLOCAL=9, AS=10, GLOBAL=11, ASSERT=12, IF=13, ELIF=14, ELSE=15, WHILE=16, 
		FOR=17, IN=18, TRY=19, NONE=20, FINALLY=21, WITH=22, EXCEPT=23, LAMBDA=24, 
		OR=25, AND=26, NOT=27, IS=28, CLASS=29, YIELD=30, DEL=31, PASS=32, CONTINUE=33, 
		BREAK=34, ASYNC=35, AWAIT=36, PRINT=37, EXEC=38, TRUE=39, FALSE=40, REV=41, 
		DOT=42, ELLIPSIS=43, REVERSE_QUOTE=44, STAR=45, COMMA=46, COLON=47, SEMI_COLON=48, 
		POWER=49, ASSIGN=50, OR_OP=51, XOR=52, AND_OP=53, LEFT_SHIFT=54, RIGHT_SHIFT=55, 
		ADD=56, MINUS=57, DIV=58, MOD=59, IDIV=60, NOT_OP=61, LESS_THAN=62, GREATER_THAN=63, 
		EQUALS=64, GT_EQ=65, LT_EQ=66, NOT_EQ_1=67, NOT_EQ_2=68, AT=69, ARROW=70, 
		ADD_ASSIGN=71, SUB_ASSIGN=72, MULT_ASSIGN=73, AT_ASSIGN=74, DIV_ASSIGN=75, 
		MOD_ASSIGN=76, AND_ASSIGN=77, OR_ASSIGN=78, XOR_ASSIGN=79, LEFT_SHIFT_ASSIGN=80, 
		RIGHT_SHIFT_ASSIGN=81, POWER_ASSIGN=82, IDIV_ASSIGN=83, STRING=84, DECIMAL_INTEGER=85, 
		OCT_INTEGER=86, HEX_INTEGER=87, BIN_INTEGER=88, IMAG_NUMBER=89, FLOAT_NUMBER=90, 
		OPEN_PAREN=91, CLOSE_PAREN=92, OPEN_BRACE=93, CLOSE_BRACE=94, OPEN_BRACKET=95, 
		CLOSE_BRACKET=96, NAME=97, LINE_JOIN=98, NEWLINE=99, WS=100, COMMENT=101;
	public static final int
		RULE_root = 0, RULE_single_input = 1, RULE_file_input = 2, RULE_eval_input = 3, 
		RULE_stmt = 4, RULE_compound_stmt = 5, RULE_revblock = 6, RULE_suite = 7, 
		RULE_decorator = 8, RULE_elif_clause = 9, RULE_else_clause = 10, RULE_finally_clause = 11, 
		RULE_with_item = 12, RULE_except_clause = 13, RULE_classdef = 14, RULE_funcdef = 15, 
		RULE_typedargslist = 16, RULE_args = 17, RULE_kwargs = 18, RULE_def_parameters = 19, 
		RULE_def_parameter = 20, RULE_named_parameter = 21, RULE_simple_stmt = 22, 
		RULE_small_stmt = 23, RULE_testlist_star_expr = 24, RULE_star_expr = 25, 
		RULE_assign_part = 26, RULE_exprlist = 27, RULE_import_as_names = 28, 
		RULE_import_as_name = 29, RULE_dotted_as_names = 30, RULE_dotted_as_name = 31, 
		RULE_test = 32, RULE_varargslist = 33, RULE_vardef_parameters = 34, RULE_vardef_parameter = 35, 
		RULE_varargs = 36, RULE_varkwargs = 37, RULE_logical_test = 38, RULE_comparison = 39, 
		RULE_expr = 40, RULE_atom = 41, RULE_dictorsetmaker = 42, RULE_testlist_comp = 43, 
		RULE_testlist = 44, RULE_dotted_name = 45, RULE_name = 46, RULE_number = 47, 
		RULE_integer = 48, RULE_yield_expr = 49, RULE_yield_arg = 50, RULE_trailer = 51, 
		RULE_arguments = 52, RULE_arglist = 53, RULE_argument = 54, RULE_subscriptlist = 55, 
		RULE_subscript = 56, RULE_sliceop = 57, RULE_comp_for = 58, RULE_comp_iter = 59;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "single_input", "file_input", "eval_input", "stmt", "compound_stmt", 
			"revblock", "suite", "decorator", "elif_clause", "else_clause", "finally_clause", 
			"with_item", "except_clause", "classdef", "funcdef", "typedargslist", 
			"args", "kwargs", "def_parameters", "def_parameter", "named_parameter", 
			"simple_stmt", "small_stmt", "testlist_star_expr", "star_expr", "assign_part", 
			"exprlist", "import_as_names", "import_as_name", "dotted_as_names", "dotted_as_name", 
			"test", "varargslist", "vardef_parameters", "vardef_parameter", "varargs", 
			"varkwargs", "logical_test", "comparison", "expr", "atom", "dictorsetmaker", 
			"testlist_comp", "testlist", "dotted_name", "name", "number", "integer", 
			"yield_expr", "yield_arg", "trailer", "arguments", "arglist", "argument", 
			"subscriptlist", "subscript", "sliceop", "comp_for", "comp_iter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'def'", "'return'", "'raise'", "'from'", "'import'", 
			"'nonlocal'", "'as'", "'global'", "'assert'", "'if'", "'elif'", "'else'", 
			"'while'", "'for'", "'in'", "'try'", "'None'", "'finally'", "'with'", 
			"'except'", "'lambda'", "'or'", "'and'", "'not'", "'is'", "'class'", 
			"'yield'", "'del'", "'pass'", "'continue'", "'break'", "'async'", "'await'", 
			"'print'", "'exec'", "'True'", "'False'", "'rev'", "'.'", "'...'", "'`'", 
			"'*'", "','", "':'", "';'", "'**'", "'='", "'|'", "'^'", "'&'", "'<<'", 
			"'>>'", "'+'", "'-'", "'/'", "'%'", "'//'", "'~'", "'<'", "'>'", "'=='", 
			"'>='", "'<='", "'<>'", "'!='", "'@'", "'->'", "'+='", "'-='", "'*='", 
			"'@='", "'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", "'>>='", "'**='", 
			"'//='", null, null, null, null, null, null, null, "'('", "')'", "'{'", 
			"'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "LINE_BREAK", "DEF", "RETURN", "RAISE", "FROM", 
			"IMPORT", "NONLOCAL", "AS", "GLOBAL", "ASSERT", "IF", "ELIF", "ELSE", 
			"WHILE", "FOR", "IN", "TRY", "NONE", "FINALLY", "WITH", "EXCEPT", "LAMBDA", 
			"OR", "AND", "NOT", "IS", "CLASS", "YIELD", "DEL", "PASS", "CONTINUE", 
			"BREAK", "ASYNC", "AWAIT", "PRINT", "EXEC", "TRUE", "FALSE", "REV", "DOT", 
			"ELLIPSIS", "REVERSE_QUOTE", "STAR", "COMMA", "COLON", "SEMI_COLON", 
			"POWER", "ASSIGN", "OR_OP", "XOR", "AND_OP", "LEFT_SHIFT", "RIGHT_SHIFT", 
			"ADD", "MINUS", "DIV", "MOD", "IDIV", "NOT_OP", "LESS_THAN", "GREATER_THAN", 
			"EQUALS", "GT_EQ", "LT_EQ", "NOT_EQ_1", "NOT_EQ_2", "AT", "ARROW", "ADD_ASSIGN", 
			"SUB_ASSIGN", "MULT_ASSIGN", "AT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "LEFT_SHIFT_ASSIGN", "RIGHT_SHIFT_ASSIGN", 
			"POWER_ASSIGN", "IDIV_ASSIGN", "STRING", "DECIMAL_INTEGER", "OCT_INTEGER", 
			"HEX_INTEGER", "BIN_INTEGER", "IMAG_NUMBER", "FLOAT_NUMBER", "OPEN_PAREN", 
			"CLOSE_PAREN", "OPEN_BRACE", "CLOSE_BRACE", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"NAME", "LINE_JOIN", "NEWLINE", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PythonParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public Single_inputContext single_input() {
			return getRuleContext(Single_inputContext.class,0);
		}
		public File_inputContext file_input() {
			return getRuleContext(File_inputContext.class,0);
		}
		public Eval_inputContext eval_input() {
			return getRuleContext(Eval_inputContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(120);
				single_input();
				}
				break;
			case 2:
				{
				setState(121);
				file_input();
				}
				break;
			case 3:
				{
				setState(122);
				eval_input();
				}
				break;
			}
			setState(125);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_inputContext extends ParserRuleContext {
		public TerminalNode LINE_BREAK() { return getToken(PythonParser.LINE_BREAK, 0); }
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Single_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_input; }
	}

	public final Single_inputContext single_input() throws RecognitionException {
		Single_inputContext _localctx = new Single_inputContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_single_input);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(LINE_BREAK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				simple_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				compound_stmt();
				setState(130);
				match(LINE_BREAK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class File_inputContext extends ParserRuleContext {
		public List<TerminalNode> LINE_BREAK() { return getTokens(PythonParser.LINE_BREAK); }
		public TerminalNode LINE_BREAK(int i) {
			return getToken(PythonParser.LINE_BREAK, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public File_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_input; }
	}

	public final File_inputContext file_input() throws RecognitionException {
		File_inputContext _localctx = new File_inputContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_file_input);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(136);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(134);
						match(LINE_BREAK);
						}
						break;
					case 2:
						{
						setState(135);
						stmt();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(138); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Eval_inputContext extends ParserRuleContext {
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public List<TerminalNode> LINE_BREAK() { return getTokens(PythonParser.LINE_BREAK); }
		public TerminalNode LINE_BREAK(int i) {
			return getToken(PythonParser.LINE_BREAK, i);
		}
		public Eval_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval_input; }
	}

	public final Eval_inputContext eval_input() throws RecognitionException {
		Eval_inputContext _localctx = new Eval_inputContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_eval_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			testlist();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_BREAK) {
				{
				{
				setState(141);
				match(LINE_BREAK);
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				simple_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				compound_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_stmtContext extends ParserRuleContext {
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
	 
		public Compound_stmtContext() { }
		public void copyFrom(Compound_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class While_stmtContext extends Compound_stmtContext {
		public TerminalNode WHILE() { return getToken(PythonParser.WHILE, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public While_stmtContext(Compound_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class Rev_stmtContext extends Compound_stmtContext {
		public TerminalNode REV() { return getToken(PythonParser.REV, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public RevblockContext revblock() {
			return getRuleContext(RevblockContext.class,0);
		}
		public Rev_stmtContext(Compound_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class Try_stmtContext extends Compound_stmtContext {
		public TerminalNode TRY() { return getToken(PythonParser.TRY, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public Finally_clauseContext finally_clause() {
			return getRuleContext(Finally_clauseContext.class,0);
		}
		public List<Except_clauseContext> except_clause() {
			return getRuleContexts(Except_clauseContext.class);
		}
		public Except_clauseContext except_clause(int i) {
			return getRuleContext(Except_clauseContext.class,i);
		}
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public Try_stmtContext(Compound_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class If_stmtContext extends Compound_stmtContext {
		public TestContext cond;
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public List<Elif_clauseContext> elif_clause() {
			return getRuleContexts(Elif_clauseContext.class);
		}
		public Elif_clauseContext elif_clause(int i) {
			return getRuleContext(Elif_clauseContext.class,i);
		}
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public If_stmtContext(Compound_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class With_stmtContext extends Compound_stmtContext {
		public TerminalNode WITH() { return getToken(PythonParser.WITH, 0); }
		public List<With_itemContext> with_item() {
			return getRuleContexts(With_itemContext.class);
		}
		public With_itemContext with_item(int i) {
			return getRuleContext(With_itemContext.class,i);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(PythonParser.ASYNC, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public With_stmtContext(Compound_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class Class_or_func_def_stmtContext extends Compound_stmtContext {
		public ClassdefContext classdef() {
			return getRuleContext(ClassdefContext.class,0);
		}
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public Class_or_func_def_stmtContext(Compound_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class For_stmtContext extends Compound_stmtContext {
		public TerminalNode FOR() { return getToken(PythonParser.FOR, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(PythonParser.ASYNC, 0); }
		public Else_clauseContext else_clause() {
			return getRuleContext(Else_clauseContext.class,0);
		}
		public For_stmtContext(Compound_stmtContext ctx) { copyFrom(ctx); }
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_compound_stmt);
		int _la;
		try {
			int _alt;
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new If_stmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(IF);
				setState(152);
				((If_stmtContext)_localctx).cond = test();
				setState(153);
				match(COLON);
				setState(154);
				suite();
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(155);
						elif_clause();
						}
						} 
					}
					setState(160);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(161);
					else_clause();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new While_stmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(WHILE);
				setState(165);
				test();
				setState(166);
				match(COLON);
				setState(167);
				suite();
				setState(169);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(168);
					else_clause();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new For_stmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASYNC) {
					{
					setState(171);
					match(ASYNC);
					}
				}

				setState(174);
				match(FOR);
				setState(175);
				exprlist();
				setState(176);
				match(IN);
				setState(177);
				testlist();
				setState(178);
				match(COLON);
				setState(179);
				suite();
				setState(181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(180);
					else_clause();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new Try_stmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(183);
				match(TRY);
				setState(184);
				match(COLON);
				setState(185);
				suite();
				setState(198);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EXCEPT:
					{
					setState(187); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(186);
							except_clause();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(189); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(192);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(191);
						else_clause();
						}
						break;
					}
					setState(195);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(194);
						finally_clause();
						}
						break;
					}
					}
					break;
				case FINALLY:
					{
					setState(197);
					finally_clause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 5:
				_localctx = new With_stmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASYNC) {
					{
					setState(200);
					match(ASYNC);
					}
				}

				setState(203);
				match(WITH);
				setState(204);
				with_item();
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(205);
					match(COMMA);
					setState(206);
					with_item();
					}
					}
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(212);
				match(COLON);
				setState(213);
				suite();
				}
				break;
			case 6:
				_localctx = new Class_or_func_def_stmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(215);
					decorator();
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(223);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(221);
					classdef();
					}
					break;
				case DEF:
				case ASYNC:
					{
					setState(222);
					funcdef();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 7:
				_localctx = new Rev_stmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(225);
				match(REV);
				setState(226);
				match(COLON);
				setState(227);
				revblock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RevblockContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public TerminalNode LINE_BREAK() { return getToken(PythonParser.LINE_BREAK, 0); }
		public TerminalNode INDENT() { return getToken(PythonParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(PythonParser.DEDENT, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public RevblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revblock; }
	}

	public final RevblockContext revblock() throws RecognitionException {
		RevblockContext _localctx = new RevblockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_revblock);
		try {
			int _alt;
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				simple_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(LINE_BREAK);
				setState(232);
				match(INDENT);
				setState(234); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(233);
						stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(236); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(238);
				match(DEDENT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuiteContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public TerminalNode LINE_BREAK() { return getToken(PythonParser.LINE_BREAK, 0); }
		public TerminalNode INDENT() { return getToken(PythonParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(PythonParser.DEDENT, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public SuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite; }
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_suite);
		try {
			int _alt;
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				simple_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(LINE_BREAK);
				setState(244);
				match(INDENT);
				setState(246); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(245);
						stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(248); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(250);
				match(DEDENT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecoratorContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(PythonParser.AT, 0); }
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public TerminalNode LINE_BREAK() { return getToken(PythonParser.LINE_BREAK, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PythonParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PythonParser.CLOSE_PAREN, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_decorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(AT);
			setState(255);
			dotted_name(0);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(256);
				match(OPEN_PAREN);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << LAMBDA) | (1L << NOT) | (1L << AWAIT) | (1L << PRINT) | (1L << EXEC) | (1L << TRUE) | (1L << FALSE) | (1L << ELLIPSIS) | (1L << REVERSE_QUOTE) | (1L << STAR) | (1L << POWER) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (STRING - 84)) | (1L << (DECIMAL_INTEGER - 84)) | (1L << (OCT_INTEGER - 84)) | (1L << (HEX_INTEGER - 84)) | (1L << (BIN_INTEGER - 84)) | (1L << (IMAG_NUMBER - 84)) | (1L << (FLOAT_NUMBER - 84)) | (1L << (OPEN_PAREN - 84)) | (1L << (OPEN_BRACE - 84)) | (1L << (OPEN_BRACKET - 84)) | (1L << (NAME - 84)))) != 0)) {
					{
					setState(257);
					arglist();
					}
				}

				setState(260);
				match(CLOSE_PAREN);
				}
			}

			setState(263);
			match(LINE_BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Elif_clauseContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(PythonParser.ELIF, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public Elif_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_clause; }
	}

	public final Elif_clauseContext elif_clause() throws RecognitionException {
		Elif_clauseContext _localctx = new Elif_clauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elif_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(ELIF);
			setState(266);
			test();
			setState(267);
			match(COLON);
			setState(268);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_clauseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(PythonParser.ELSE, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public Else_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_clause; }
	}

	public final Else_clauseContext else_clause() throws RecognitionException {
		Else_clauseContext _localctx = new Else_clauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_else_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(ELSE);
			setState(271);
			match(COLON);
			setState(272);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Finally_clauseContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(PythonParser.FINALLY, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public Finally_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_clause; }
	}

	public final Finally_clauseContext finally_clause() throws RecognitionException {
		Finally_clauseContext _localctx = new Finally_clauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_finally_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(FINALLY);
			setState(275);
			match(COLON);
			setState(276);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_itemContext extends ParserRuleContext {
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public With_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_item; }
	}

	public final With_itemContext with_item() throws RecognitionException {
		With_itemContext _localctx = new With_itemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_with_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			test();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(279);
				match(AS);
				setState(280);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Except_clauseContext extends ParserRuleContext {
		public TerminalNode EXCEPT() { return getToken(PythonParser.EXCEPT, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public Except_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_except_clause; }
	}

	public final Except_clauseContext except_clause() throws RecognitionException {
		Except_clauseContext _localctx = new Except_clauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_except_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(EXCEPT);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << LAMBDA) | (1L << NOT) | (1L << AWAIT) | (1L << PRINT) | (1L << EXEC) | (1L << TRUE) | (1L << FALSE) | (1L << ELLIPSIS) | (1L << REVERSE_QUOTE) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (STRING - 84)) | (1L << (DECIMAL_INTEGER - 84)) | (1L << (OCT_INTEGER - 84)) | (1L << (HEX_INTEGER - 84)) | (1L << (BIN_INTEGER - 84)) | (1L << (IMAG_NUMBER - 84)) | (1L << (FLOAT_NUMBER - 84)) | (1L << (OPEN_PAREN - 84)) | (1L << (OPEN_BRACE - 84)) | (1L << (OPEN_BRACKET - 84)) | (1L << (NAME - 84)))) != 0)) {
				{
				setState(284);
				test();
				setState(295);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(285);
					if (!(CheckVersion(2))) throw new FailedPredicateException(this, "CheckVersion(2)");
					setState(286);
					match(COMMA);
					setState(287);
					name();
					SetVersion(2);
					}
					break;
				case 2:
					{
					setState(290);
					if (!(CheckVersion(3))) throw new FailedPredicateException(this, "CheckVersion(3)");
					setState(291);
					match(AS);
					setState(292);
					name();
					SetVersion(3);
					}
					break;
				}
				}
			}

			setState(299);
			match(COLON);
			setState(300);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassdefContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(PythonParser.CLASS, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(PythonParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PythonParser.CLOSE_PAREN, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public ClassdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdef; }
	}

	public final ClassdefContext classdef() throws RecognitionException {
		ClassdefContext _localctx = new ClassdefContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_classdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(CLASS);
			setState(303);
			name();
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(304);
				match(OPEN_PAREN);
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << LAMBDA) | (1L << NOT) | (1L << AWAIT) | (1L << PRINT) | (1L << EXEC) | (1L << TRUE) | (1L << FALSE) | (1L << ELLIPSIS) | (1L << REVERSE_QUOTE) | (1L << STAR) | (1L << POWER) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (STRING - 84)) | (1L << (DECIMAL_INTEGER - 84)) | (1L << (OCT_INTEGER - 84)) | (1L << (HEX_INTEGER - 84)) | (1L << (BIN_INTEGER - 84)) | (1L << (IMAG_NUMBER - 84)) | (1L << (FLOAT_NUMBER - 84)) | (1L << (OPEN_PAREN - 84)) | (1L << (OPEN_BRACE - 84)) | (1L << (OPEN_BRACKET - 84)) | (1L << (NAME - 84)))) != 0)) {
					{
					setState(305);
					arglist();
					}
				}

				setState(308);
				match(CLOSE_PAREN);
				}
			}

			setState(311);
			match(COLON);
			setState(312);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncdefContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(PythonParser.DEF, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(PythonParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PythonParser.CLOSE_PAREN, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(PythonParser.ASYNC, 0); }
		public TypedargslistContext typedargslist() {
			return getRuleContext(TypedargslistContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(PythonParser.ARROW, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funcdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(314);
				match(ASYNC);
				}
			}

			setState(317);
			match(DEF);
			setState(318);
			name();
			setState(319);
			match(OPEN_PAREN);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (TRUE - 39)) | (1L << (FALSE - 39)) | (1L << (STAR - 39)) | (1L << (POWER - 39)) | (1L << (NAME - 39)))) != 0)) {
				{
				setState(320);
				typedargslist();
				}
			}

			setState(323);
			match(CLOSE_PAREN);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(324);
				match(ARROW);
				setState(325);
				test();
				}
			}

			setState(328);
			match(COLON);
			setState(329);
			suite();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedargslistContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public KwargsContext kwargs() {
			return getRuleContext(KwargsContext.class,0);
		}
		public List<Def_parametersContext> def_parameters() {
			return getRuleContexts(Def_parametersContext.class);
		}
		public Def_parametersContext def_parameters(int i) {
			return getRuleContext(Def_parametersContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public TypedargslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedargslist; }
	}

	public final TypedargslistContext typedargslist() throws RecognitionException {
		TypedargslistContext _localctx = new TypedargslistContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typedargslist);
		int _la;
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(331);
					def_parameters();
					setState(332);
					match(COMMA);
					}
					break;
				}
				setState(346);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(336);
					args();
					setState(339);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						setState(337);
						match(COMMA);
						setState(338);
						def_parameters();
						}
						break;
					}
					setState(343);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(341);
						match(COMMA);
						setState(342);
						kwargs();
						}
						break;
					}
					}
					break;
				case POWER:
					{
					setState(345);
					kwargs();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(348);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				def_parameters();
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(352);
					match(COMMA);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public Named_parameterContext named_parameter() {
			return getRuleContext(Named_parameterContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_args);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(STAR);
			setState(358);
			named_parameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KwargsContext extends ParserRuleContext {
		public TerminalNode POWER() { return getToken(PythonParser.POWER, 0); }
		public Named_parameterContext named_parameter() {
			return getRuleContext(Named_parameterContext.class,0);
		}
		public KwargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwargs; }
	}

	public final KwargsContext kwargs() throws RecognitionException {
		KwargsContext _localctx = new KwargsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_kwargs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(POWER);
			setState(361);
			named_parameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_parametersContext extends ParserRuleContext {
		public List<Def_parameterContext> def_parameter() {
			return getRuleContexts(Def_parameterContext.class);
		}
		public Def_parameterContext def_parameter(int i) {
			return getRuleContext(Def_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Def_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_parameters; }
	}

	public final Def_parametersContext def_parameters() throws RecognitionException {
		Def_parametersContext _localctx = new Def_parametersContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_def_parameters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			def_parameter();
			setState(368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(364);
					match(COMMA);
					setState(365);
					def_parameter();
					}
					} 
				}
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_parameterContext extends ParserRuleContext {
		public Named_parameterContext named_parameter() {
			return getRuleContext(Named_parameterContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public Def_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_parameter; }
	}

	public final Def_parameterContext def_parameter() throws RecognitionException {
		Def_parameterContext _localctx = new Def_parameterContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_def_parameter);
		int _la;
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				named_parameter();
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(372);
					match(ASSIGN);
					setState(373);
					test();
					}
				}

				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Named_parameterContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public Named_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_parameter; }
	}

	public final Named_parameterContext named_parameter() throws RecognitionException {
		Named_parameterContext _localctx = new Named_parameterContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_named_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			name();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(380);
				match(COLON);
				setState(381);
				test();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_stmtContext extends ParserRuleContext {
		public List<Small_stmtContext> small_stmt() {
			return getRuleContexts(Small_stmtContext.class);
		}
		public Small_stmtContext small_stmt(int i) {
			return getRuleContext(Small_stmtContext.class,i);
		}
		public TerminalNode LINE_BREAK() { return getToken(PythonParser.LINE_BREAK, 0); }
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(PythonParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(PythonParser.SEMI_COLON, i);
		}
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_simple_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			small_stmt();
			setState(389);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(385);
					match(SEMI_COLON);
					setState(386);
					small_stmt();
					}
					} 
				}
				setState(391);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_COLON) {
				{
				setState(392);
				match(SEMI_COLON);
				}
			}

			setState(395);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==LINE_BREAK) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Small_stmtContext extends ParserRuleContext {
		public Small_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_small_stmt; }
	 
		public Small_stmtContext() { }
		public void copyFrom(Small_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Assert_stmtContext extends Small_stmtContext {
		public TerminalNode ASSERT() { return getToken(PythonParser.ASSERT, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public Assert_stmtContext(Small_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class Nonlocal_stmtContext extends Small_stmtContext {
		public TerminalNode NONLOCAL() { return getToken(PythonParser.NONLOCAL, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Nonlocal_stmtContext(Small_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class Pass_stmtContext extends Small_stmtContext {
		public TerminalNode PASS() { return getToken(PythonParser.PASS, 0); }
		public Pass_stmtContext(Small_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class Import_stmtContext extends Small_stmtContext {
		public TerminalNode IMPORT() { return getToken(PythonParser.IMPORT, 0); }
		public Dotted_as_namesContext dotted_as_names() {
			return getRuleContext(Dotted_as_namesContext.class,0);
		}
		public Import_stmtContext(Small_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class Expr_stmtContext extends Small_stmtContext {
		public Testlist_star_exprContext testlist_star_expr() {
			return getRuleContext(Testlist_star_exprContext.class,0);
		}
		public Assign_partContext assign_part() {
			return getRuleContext(Assign_partContext.class,0);
		}
		public Expr_stmtContext(Small_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class Raise_stmtContext extends Small_stmtContext {
		public TerminalNode RAISE() { return getToken(PythonParser.RAISE, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TerminalNode FROM() { return getToken(PythonParser.FROM, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Raise_stmtContext(Small_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class Yield_stmtContext extends Small_stmtContext {
		public Yield_exprContext yield_expr() {
			return getRuleContext(Yield_exprContext.class,0);
		}
		public Yield_stmtContext(Small_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class From_stmtContext extends Small_stmtContext {
		public TerminalNode FROM() { return getToken(PythonParser.FROM, 0); }
		public TerminalNode IMPORT() { return getToken(PythonParser.IMPORT, 0); }
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PythonParser.OPEN_PAREN, 0); }
		public Import_as_namesContext import_as_names() {
			return getRuleContext(Import_as_namesContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PythonParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> DOT() { return getTokens(PythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PythonParser.DOT, i);
		}
		public List<TerminalNode> ELLIPSIS() { return getTokens(PythonParser.ELLIPSIS); }
		public TerminalNode ELLIPSIS(int i) {
			return getToken(PythonParser.ELLIPSIS, i);
		}
		public From_stmtContext(Small_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class Global_stmtContext extends Small_stmtContext {
		public TerminalNode GLOBAL() { return getToken(PythonParser.GLOBAL, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Global_stmtContext(Small_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class Continue_stmtContext extends Small_stmtContext {
		public TerminalNode CONTINUE() { return getToken(PythonParser.CONTINUE, 0); }
		public Continue_stmtContext(Small_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class Exec_stmtContext extends Small_stmtContext {
		public TerminalNode EXEC() { return getToken(PythonParser.EXEC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public Exec_stmtContext(Small_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class Break_stmtContext extends Small_stmtContext {
		public TerminalNode BREAK() { return getToken(PythonParser.BREAK, 0); }
		public Break_stmtContext(Small_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class Del_stmtContext extends Small_stmtContext {
		public TerminalNode DEL() { return getToken(PythonParser.DEL, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public Del_stmtContext(Small_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class Print_stmtContext extends Small_stmtContext {
		public TerminalNode PRINT() { return getToken(PythonParser.PRINT, 0); }
		public TerminalNode RIGHT_SHIFT() { return getToken(PythonParser.RIGHT_SHIFT, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Print_stmtContext(Small_stmtContext ctx) { copyFrom(ctx); }
	}
	public static class Return_stmtContext extends Small_stmtContext {
		public TerminalNode RETURN() { return getToken(PythonParser.RETURN, 0); }
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public Return_stmtContext(Small_stmtContext ctx) { copyFrom(ctx); }
	}

	public final Small_stmtContext small_stmt() throws RecognitionException {
		Small_stmtContext _localctx = new Small_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_small_stmt);
		int _la;
		try {
			int _alt;
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				_localctx = new Expr_stmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				testlist_star_expr();
				setState(399);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(398);
					assign_part();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new Print_stmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				if (!(CheckVersion(2))) throw new FailedPredicateException(this, "CheckVersion(2)");
				setState(402);
				match(PRINT);
				setState(425);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NONE:
				case LAMBDA:
				case NOT:
				case AWAIT:
				case PRINT:
				case EXEC:
				case TRUE:
				case FALSE:
				case ELLIPSIS:
				case REVERSE_QUOTE:
				case ADD:
				case MINUS:
				case NOT_OP:
				case STRING:
				case DECIMAL_INTEGER:
				case OCT_INTEGER:
				case HEX_INTEGER:
				case BIN_INTEGER:
				case IMAG_NUMBER:
				case FLOAT_NUMBER:
				case OPEN_PAREN:
				case OPEN_BRACE:
				case OPEN_BRACKET:
				case NAME:
					{
					{
					setState(403);
					test();
					setState(408);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(404);
							match(COMMA);
							setState(405);
							test();
							}
							} 
						}
						setState(410);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
					}
					setState(412);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(411);
						match(COMMA);
						}
					}

					}
					}
					break;
				case RIGHT_SHIFT:
					{
					setState(414);
					match(RIGHT_SHIFT);
					setState(415);
					test();
					{
					setState(418); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(416);
							match(COMMA);
							setState(417);
							test();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(420); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(423);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(422);
						match(COMMA);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				SetVersion(2);
				}
				break;
			case 3:
				_localctx = new Del_stmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(429);
				match(DEL);
				setState(430);
				exprlist();
				}
				break;
			case 4:
				_localctx = new Pass_stmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(431);
				match(PASS);
				}
				break;
			case 5:
				_localctx = new Break_stmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(432);
				match(BREAK);
				}
				break;
			case 6:
				_localctx = new Continue_stmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(433);
				match(CONTINUE);
				}
				break;
			case 7:
				_localctx = new Return_stmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(434);
				match(RETURN);
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << LAMBDA) | (1L << NOT) | (1L << AWAIT) | (1L << PRINT) | (1L << EXEC) | (1L << TRUE) | (1L << FALSE) | (1L << ELLIPSIS) | (1L << REVERSE_QUOTE) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (STRING - 84)) | (1L << (DECIMAL_INTEGER - 84)) | (1L << (OCT_INTEGER - 84)) | (1L << (HEX_INTEGER - 84)) | (1L << (BIN_INTEGER - 84)) | (1L << (IMAG_NUMBER - 84)) | (1L << (FLOAT_NUMBER - 84)) | (1L << (OPEN_PAREN - 84)) | (1L << (OPEN_BRACE - 84)) | (1L << (OPEN_BRACKET - 84)) | (1L << (NAME - 84)))) != 0)) {
					{
					setState(435);
					testlist();
					}
				}

				}
				break;
			case 8:
				_localctx = new Raise_stmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(438);
				match(RAISE);
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << LAMBDA) | (1L << NOT) | (1L << AWAIT) | (1L << PRINT) | (1L << EXEC) | (1L << TRUE) | (1L << FALSE) | (1L << ELLIPSIS) | (1L << REVERSE_QUOTE) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (STRING - 84)) | (1L << (DECIMAL_INTEGER - 84)) | (1L << (OCT_INTEGER - 84)) | (1L << (HEX_INTEGER - 84)) | (1L << (BIN_INTEGER - 84)) | (1L << (IMAG_NUMBER - 84)) | (1L << (FLOAT_NUMBER - 84)) | (1L << (OPEN_PAREN - 84)) | (1L << (OPEN_BRACE - 84)) | (1L << (OPEN_BRACKET - 84)) | (1L << (NAME - 84)))) != 0)) {
					{
					setState(439);
					test();
					setState(446);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(440);
						match(COMMA);
						setState(441);
						test();
						setState(444);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(442);
							match(COMMA);
							setState(443);
							test();
							}
						}

						}
					}

					}
				}

				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(450);
					match(FROM);
					setState(451);
					test();
					}
				}

				}
				break;
			case 9:
				_localctx = new Yield_stmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(454);
				yield_expr();
				}
				break;
			case 10:
				_localctx = new Import_stmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(455);
				match(IMPORT);
				setState(456);
				dotted_as_names();
				}
				break;
			case 11:
				_localctx = new From_stmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(457);
				match(FROM);
				setState(470);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(461);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DOT || _la==ELLIPSIS) {
						{
						{
						setState(458);
						_la = _input.LA(1);
						if ( !(_la==DOT || _la==ELLIPSIS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(463);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(464);
					dotted_name(0);
					}
					break;
				case 2:
					{
					setState(466); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(465);
						_la = _input.LA(1);
						if ( !(_la==DOT || _la==ELLIPSIS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(468); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==DOT || _la==ELLIPSIS );
					}
					break;
				}
				setState(472);
				match(IMPORT);
				setState(479);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(473);
					match(STAR);
					}
					break;
				case OPEN_PAREN:
					{
					setState(474);
					match(OPEN_PAREN);
					setState(475);
					import_as_names();
					setState(476);
					match(CLOSE_PAREN);
					}
					break;
				case TRUE:
				case FALSE:
				case NAME:
					{
					setState(478);
					import_as_names();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 12:
				_localctx = new Global_stmtContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(481);
				match(GLOBAL);
				setState(482);
				name();
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(483);
					match(COMMA);
					setState(484);
					name();
					}
					}
					setState(489);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 13:
				_localctx = new Exec_stmtContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(490);
				if (!(CheckVersion(2))) throw new FailedPredicateException(this, "CheckVersion(2)");
				setState(491);
				match(EXEC);
				setState(492);
				expr(0);
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(493);
					match(IN);
					setState(494);
					test();
					setState(497);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(495);
						match(COMMA);
						setState(496);
						test();
						}
					}

					}
				}

				SetVersion(2);
				}
				break;
			case 14:
				_localctx = new Assert_stmtContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(503);
				match(ASSERT);
				setState(504);
				test();
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(505);
					match(COMMA);
					setState(506);
					test();
					}
				}

				}
				break;
			case 15:
				_localctx = new Nonlocal_stmtContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(509);
				if (!(CheckVersion(3))) throw new FailedPredicateException(this, "CheckVersion(3)");
				setState(510);
				match(NONLOCAL);
				setState(511);
				name();
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(512);
					match(COMMA);
					setState(513);
					name();
					}
					}
					setState(518);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				SetVersion(3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Testlist_star_exprContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<Star_exprContext> star_expr() {
			return getRuleContexts(Star_exprContext.class);
		}
		public Star_exprContext star_expr(int i) {
			return getRuleContext(Star_exprContext.class,i);
		}
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public Testlist_star_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testlist_star_expr; }
	}

	public final Testlist_star_exprContext testlist_star_expr() throws RecognitionException {
		Testlist_star_exprContext _localctx = new Testlist_star_exprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_testlist_star_expr);
		try {
			int _alt;
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(529); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(525);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case NONE:
						case LAMBDA:
						case NOT:
						case AWAIT:
						case PRINT:
						case EXEC:
						case TRUE:
						case FALSE:
						case ELLIPSIS:
						case REVERSE_QUOTE:
						case ADD:
						case MINUS:
						case NOT_OP:
						case STRING:
						case DECIMAL_INTEGER:
						case OCT_INTEGER:
						case HEX_INTEGER:
						case BIN_INTEGER:
						case IMAG_NUMBER:
						case FLOAT_NUMBER:
						case OPEN_PAREN:
						case OPEN_BRACE:
						case OPEN_BRACKET:
						case NAME:
							{
							setState(523);
							test();
							}
							break;
						case STAR:
							{
							setState(524);
							star_expr();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(527);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(531); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(535);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(533);
					test();
					}
					break;
				case 2:
					{
					setState(534);
					star_expr();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				testlist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Star_exprContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Star_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_expr; }
	}

	public final Star_exprContext star_expr() throws RecognitionException {
		Star_exprContext _localctx = new Star_exprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_star_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(STAR);
			setState(541);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_partContext extends ParserRuleContext {
		public Token op;
		public List<TerminalNode> ASSIGN() { return getTokens(PythonParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(PythonParser.ASSIGN, i);
		}
		public List<Testlist_star_exprContext> testlist_star_expr() {
			return getRuleContexts(Testlist_star_exprContext.class);
		}
		public Testlist_star_exprContext testlist_star_expr(int i) {
			return getRuleContext(Testlist_star_exprContext.class,i);
		}
		public Yield_exprContext yield_expr() {
			return getRuleContext(Yield_exprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public TerminalNode ADD_ASSIGN() { return getToken(PythonParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(PythonParser.SUB_ASSIGN, 0); }
		public TerminalNode MULT_ASSIGN() { return getToken(PythonParser.MULT_ASSIGN, 0); }
		public TerminalNode AT_ASSIGN() { return getToken(PythonParser.AT_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(PythonParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(PythonParser.MOD_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(PythonParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(PythonParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(PythonParser.XOR_ASSIGN, 0); }
		public TerminalNode LEFT_SHIFT_ASSIGN() { return getToken(PythonParser.LEFT_SHIFT_ASSIGN, 0); }
		public TerminalNode RIGHT_SHIFT_ASSIGN() { return getToken(PythonParser.RIGHT_SHIFT_ASSIGN, 0); }
		public TerminalNode POWER_ASSIGN() { return getToken(PythonParser.POWER_ASSIGN, 0); }
		public TerminalNode IDIV_ASSIGN() { return getToken(PythonParser.IDIV_ASSIGN, 0); }
		public Assign_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_part; }
	}

	public final Assign_partContext assign_part() throws RecognitionException {
		Assign_partContext _localctx = new Assign_partContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_assign_part);
		int _la;
		try {
			int _alt;
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				match(ASSIGN);
				setState(557);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NONE:
				case LAMBDA:
				case NOT:
				case AWAIT:
				case PRINT:
				case EXEC:
				case TRUE:
				case FALSE:
				case ELLIPSIS:
				case REVERSE_QUOTE:
				case STAR:
				case ADD:
				case MINUS:
				case NOT_OP:
				case STRING:
				case DECIMAL_INTEGER:
				case OCT_INTEGER:
				case HEX_INTEGER:
				case BIN_INTEGER:
				case IMAG_NUMBER:
				case FLOAT_NUMBER:
				case OPEN_PAREN:
				case OPEN_BRACE:
				case OPEN_BRACKET:
				case NAME:
					{
					setState(544);
					testlist_star_expr();
					setState(549);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(545);
							match(ASSIGN);
							setState(546);
							testlist_star_expr();
							}
							} 
						}
						setState(551);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
					}
					setState(554);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(552);
						match(ASSIGN);
						setState(553);
						yield_expr();
						}
					}

					}
					break;
				case YIELD:
					{
					setState(556);
					yield_expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(559);
				if (!(CheckVersion(3))) throw new FailedPredicateException(this, "CheckVersion(3)");
				setState(560);
				match(COLON);
				setState(561);
				test();
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(562);
					match(ASSIGN);
					setState(563);
					testlist();
					}
				}

				SetVersion(3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(568);
				((Assign_partContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (ADD_ASSIGN - 71)) | (1L << (SUB_ASSIGN - 71)) | (1L << (MULT_ASSIGN - 71)) | (1L << (AT_ASSIGN - 71)) | (1L << (DIV_ASSIGN - 71)) | (1L << (MOD_ASSIGN - 71)) | (1L << (AND_ASSIGN - 71)) | (1L << (OR_ASSIGN - 71)) | (1L << (XOR_ASSIGN - 71)) | (1L << (LEFT_SHIFT_ASSIGN - 71)) | (1L << (RIGHT_SHIFT_ASSIGN - 71)) | (1L << (POWER_ASSIGN - 71)) | (1L << (IDIV_ASSIGN - 71)))) != 0)) ) {
					((Assign_partContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(571);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case YIELD:
					{
					setState(569);
					yield_expr();
					}
					break;
				case NONE:
				case LAMBDA:
				case NOT:
				case AWAIT:
				case PRINT:
				case EXEC:
				case TRUE:
				case FALSE:
				case ELLIPSIS:
				case REVERSE_QUOTE:
				case ADD:
				case MINUS:
				case NOT_OP:
				case STRING:
				case DECIMAL_INTEGER:
				case OCT_INTEGER:
				case HEX_INTEGER:
				case BIN_INTEGER:
				case IMAG_NUMBER:
				case FLOAT_NUMBER:
				case OPEN_PAREN:
				case OPEN_BRACE:
				case OPEN_BRACKET:
				case NAME:
					{
					setState(570);
					testlist();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprlistContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_exprlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			expr(0);
			setState(580);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(576);
					match(COMMA);
					setState(577);
					expr(0);
					}
					} 
				}
				setState(582);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(583);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_as_namesContext extends ParserRuleContext {
		public List<Import_as_nameContext> import_as_name() {
			return getRuleContexts(Import_as_nameContext.class);
		}
		public Import_as_nameContext import_as_name(int i) {
			return getRuleContext(Import_as_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Import_as_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_as_names; }
	}

	public final Import_as_namesContext import_as_names() throws RecognitionException {
		Import_as_namesContext _localctx = new Import_as_namesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_import_as_names);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			import_as_name();
			setState(591);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(587);
					match(COMMA);
					setState(588);
					import_as_name();
					}
					} 
				}
				setState(593);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(594);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_as_nameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public Import_as_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_as_name; }
	}

	public final Import_as_nameContext import_as_name() throws RecognitionException {
		Import_as_nameContext _localctx = new Import_as_nameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_import_as_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			name();
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(598);
				match(AS);
				setState(599);
				name();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dotted_as_namesContext extends ParserRuleContext {
		public List<Dotted_as_nameContext> dotted_as_name() {
			return getRuleContexts(Dotted_as_nameContext.class);
		}
		public Dotted_as_nameContext dotted_as_name(int i) {
			return getRuleContext(Dotted_as_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Dotted_as_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_as_names; }
	}

	public final Dotted_as_namesContext dotted_as_names() throws RecognitionException {
		Dotted_as_namesContext _localctx = new Dotted_as_namesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_dotted_as_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			dotted_as_name();
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(603);
				match(COMMA);
				setState(604);
				dotted_as_name();
				}
				}
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dotted_as_nameContext extends ParserRuleContext {
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Dotted_as_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_as_name; }
	}

	public final Dotted_as_nameContext dotted_as_name() throws RecognitionException {
		Dotted_as_nameContext _localctx = new Dotted_as_nameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_dotted_as_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			dotted_name(0);
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(611);
				match(AS);
				setState(612);
				name();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TestContext extends ParserRuleContext {
		public List<Logical_testContext> logical_test() {
			return getRuleContexts(Logical_testContext.class);
		}
		public Logical_testContext logical_test(int i) {
			return getRuleContext(Logical_testContext.class,i);
		}
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(PythonParser.ELSE, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TerminalNode LAMBDA() { return getToken(PythonParser.LAMBDA, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public VarargslistContext varargslist() {
			return getRuleContext(VarargslistContext.class,0);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_test);
		int _la;
		try {
			setState(629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONE:
			case NOT:
			case AWAIT:
			case PRINT:
			case EXEC:
			case TRUE:
			case FALSE:
			case ELLIPSIS:
			case REVERSE_QUOTE:
			case ADD:
			case MINUS:
			case NOT_OP:
			case STRING:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case IMAG_NUMBER:
			case FLOAT_NUMBER:
			case OPEN_PAREN:
			case OPEN_BRACE:
			case OPEN_BRACKET:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(615);
				logical_test(0);
				setState(621);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(616);
					match(IF);
					setState(617);
					logical_test(0);
					setState(618);
					match(ELSE);
					setState(619);
					test();
					}
					break;
				}
				}
				break;
			case LAMBDA:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				match(LAMBDA);
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (TRUE - 39)) | (1L << (FALSE - 39)) | (1L << (STAR - 39)) | (1L << (POWER - 39)) | (1L << (NAME - 39)))) != 0)) {
					{
					setState(624);
					varargslist();
					}
				}

				setState(627);
				match(COLON);
				setState(628);
				test();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarargslistContext extends ParserRuleContext {
		public VarargsContext varargs() {
			return getRuleContext(VarargsContext.class,0);
		}
		public VarkwargsContext varkwargs() {
			return getRuleContext(VarkwargsContext.class,0);
		}
		public List<Vardef_parametersContext> vardef_parameters() {
			return getRuleContexts(Vardef_parametersContext.class);
		}
		public Vardef_parametersContext vardef_parameters(int i) {
			return getRuleContext(Vardef_parametersContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public VarargslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varargslist; }
	}

	public final VarargslistContext varargslist() throws RecognitionException {
		VarargslistContext _localctx = new VarargslistContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_varargslist);
		int _la;
		try {
			setState(655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(631);
					vardef_parameters();
					setState(632);
					match(COMMA);
					}
					break;
				}
				setState(646);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(636);
					varargs();
					setState(639);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
					case 1:
						{
						setState(637);
						match(COMMA);
						setState(638);
						vardef_parameters();
						}
						break;
					}
					setState(643);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
					case 1:
						{
						setState(641);
						match(COMMA);
						setState(642);
						varkwargs();
						}
						break;
					}
					}
					break;
				case POWER:
					{
					setState(645);
					varkwargs();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(648);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				vardef_parameters();
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(652);
					match(COMMA);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Vardef_parametersContext extends ParserRuleContext {
		public List<Vardef_parameterContext> vardef_parameter() {
			return getRuleContexts(Vardef_parameterContext.class);
		}
		public Vardef_parameterContext vardef_parameter(int i) {
			return getRuleContext(Vardef_parameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Vardef_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef_parameters; }
	}

	public final Vardef_parametersContext vardef_parameters() throws RecognitionException {
		Vardef_parametersContext _localctx = new Vardef_parametersContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_vardef_parameters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			vardef_parameter();
			setState(662);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(658);
					match(COMMA);
					setState(659);
					vardef_parameter();
					}
					} 
				}
				setState(664);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Vardef_parameterContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public Vardef_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef_parameter; }
	}

	public final Vardef_parameterContext vardef_parameter() throws RecognitionException {
		Vardef_parameterContext _localctx = new Vardef_parameterContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_vardef_parameter);
		int _la;
		try {
			setState(671);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(665);
				name();
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(666);
					match(ASSIGN);
					setState(667);
					test();
					}
				}

				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(670);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarargsContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public VarargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varargs; }
	}

	public final VarargsContext varargs() throws RecognitionException {
		VarargsContext _localctx = new VarargsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_varargs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(STAR);
			setState(674);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarkwargsContext extends ParserRuleContext {
		public TerminalNode POWER() { return getToken(PythonParser.POWER, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public VarkwargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varkwargs; }
	}

	public final VarkwargsContext varkwargs() throws RecognitionException {
		VarkwargsContext _localctx = new VarkwargsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_varkwargs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			match(POWER);
			setState(677);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_testContext extends ParserRuleContext {
		public Token op;
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public List<Logical_testContext> logical_test() {
			return getRuleContexts(Logical_testContext.class);
		}
		public Logical_testContext logical_test(int i) {
			return getRuleContext(Logical_testContext.class,i);
		}
		public TerminalNode AND() { return getToken(PythonParser.AND, 0); }
		public TerminalNode OR() { return getToken(PythonParser.OR, 0); }
		public Logical_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_test; }
	}

	public final Logical_testContext logical_test() throws RecognitionException {
		return logical_test(0);
	}

	private Logical_testContext logical_test(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_testContext _localctx = new Logical_testContext(_ctx, _parentState);
		Logical_testContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_logical_test, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONE:
			case AWAIT:
			case PRINT:
			case EXEC:
			case TRUE:
			case FALSE:
			case ELLIPSIS:
			case REVERSE_QUOTE:
			case ADD:
			case MINUS:
			case NOT_OP:
			case STRING:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case IMAG_NUMBER:
			case FLOAT_NUMBER:
			case OPEN_PAREN:
			case OPEN_BRACE:
			case OPEN_BRACKET:
			case NAME:
				{
				setState(680);
				comparison(0);
				}
				break;
			case NOT:
				{
				setState(681);
				match(NOT);
				setState(682);
				logical_test(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(693);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(691);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
					case 1:
						{
						_localctx = new Logical_testContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logical_test);
						setState(685);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(686);
						((Logical_testContext)_localctx).op = match(AND);
						setState(687);
						logical_test(3);
						}
						break;
					case 2:
						{
						_localctx = new Logical_testContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logical_test);
						setState(688);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(689);
						((Logical_testContext)_localctx).op = match(OR);
						setState(690);
						logical_test(2);
						}
						break;
					}
					} 
				}
				setState(695);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public Token optional;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public TerminalNode LESS_THAN() { return getToken(PythonParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(PythonParser.GREATER_THAN, 0); }
		public TerminalNode EQUALS() { return getToken(PythonParser.EQUALS, 0); }
		public TerminalNode GT_EQ() { return getToken(PythonParser.GT_EQ, 0); }
		public TerminalNode LT_EQ() { return getToken(PythonParser.LT_EQ, 0); }
		public TerminalNode NOT_EQ_1() { return getToken(PythonParser.NOT_EQ_1, 0); }
		public TerminalNode NOT_EQ_2() { return getToken(PythonParser.NOT_EQ_2, 0); }
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public TerminalNode IS() { return getToken(PythonParser.IS, 0); }
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	}

	public final ComparisonContext comparison() throws RecognitionException {
		return comparison(0);
	}

	private ComparisonContext comparison(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ComparisonContext _localctx = new ComparisonContext(_ctx, _parentState);
		ComparisonContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_comparison, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(697);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(720);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ComparisonContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_comparison);
					setState(699);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(715);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LESS_THAN:
						{
						setState(700);
						match(LESS_THAN);
						}
						break;
					case GREATER_THAN:
						{
						setState(701);
						match(GREATER_THAN);
						}
						break;
					case EQUALS:
						{
						setState(702);
						match(EQUALS);
						}
						break;
					case GT_EQ:
						{
						setState(703);
						match(GT_EQ);
						}
						break;
					case LT_EQ:
						{
						setState(704);
						match(LT_EQ);
						}
						break;
					case NOT_EQ_1:
						{
						setState(705);
						match(NOT_EQ_1);
						}
						break;
					case NOT_EQ_2:
						{
						setState(706);
						match(NOT_EQ_2);
						}
						break;
					case IN:
					case NOT:
						{
						setState(708);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(707);
							((ComparisonContext)_localctx).optional = match(NOT);
							}
						}

						setState(710);
						match(IN);
						}
						break;
					case IS:
						{
						setState(711);
						match(IS);
						setState(713);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(712);
							((ComparisonContext)_localctx).optional = match(NOT);
							}
						}

						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(717);
					comparison(3);
					}
					} 
				}
				setState(722);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Token op;
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode AWAIT() { return getToken(PythonParser.AWAIT, 0); }
		public List<TrailerContext> trailer() {
			return getRuleContexts(TrailerContext.class);
		}
		public TrailerContext trailer(int i) {
			return getRuleContext(TrailerContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(PythonParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(PythonParser.MINUS, 0); }
		public TerminalNode NOT_OP() { return getToken(PythonParser.NOT_OP, 0); }
		public TerminalNode POWER() { return getToken(PythonParser.POWER, 0); }
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(PythonParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(PythonParser.MOD, 0); }
		public TerminalNode IDIV() { return getToken(PythonParser.IDIV, 0); }
		public TerminalNode AT() { return getToken(PythonParser.AT, 0); }
		public TerminalNode LEFT_SHIFT() { return getToken(PythonParser.LEFT_SHIFT, 0); }
		public TerminalNode RIGHT_SHIFT() { return getToken(PythonParser.RIGHT_SHIFT, 0); }
		public TerminalNode AND_OP() { return getToken(PythonParser.AND_OP, 0); }
		public TerminalNode XOR() { return getToken(PythonParser.XOR, 0); }
		public TerminalNode OR_OP() { return getToken(PythonParser.OR_OP, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AWAIT) {
					{
					setState(724);
					match(AWAIT);
					}
				}

				setState(727);
				atom();
				setState(731);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(728);
						trailer();
						}
						} 
					}
					setState(733);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(734);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << MINUS) | (1L << NOT_OP))) != 0)) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(735);
				expr(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(761);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(759);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(738);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(739);
						((ExprContext)_localctx).op = match(POWER);
						setState(740);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(741);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(742);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (STAR - 45)) | (1L << (DIV - 45)) | (1L << (MOD - 45)) | (1L << (IDIV - 45)) | (1L << (AT - 45)))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(743);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(744);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(745);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==MINUS) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(746);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(747);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(748);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LEFT_SHIFT || _la==RIGHT_SHIFT) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(749);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(750);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(751);
						((ExprContext)_localctx).op = match(AND_OP);
						setState(752);
						expr(4);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(753);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(754);
						((ExprContext)_localctx).op = match(XOR);
						setState(755);
						expr(3);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(756);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(757);
						((ExprContext)_localctx).op = match(OR_OP);
						setState(758);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(763);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(PythonParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PythonParser.CLOSE_PAREN, 0); }
		public Yield_exprContext yield_expr() {
			return getRuleContext(Yield_exprContext.class,0);
		}
		public Testlist_compContext testlist_comp() {
			return getRuleContext(Testlist_compContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(PythonParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(PythonParser.CLOSE_BRACKET, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(PythonParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(PythonParser.CLOSE_BRACE, 0); }
		public DictorsetmakerContext dictorsetmaker() {
			return getRuleContext(DictorsetmakerContext.class,0);
		}
		public List<TerminalNode> REVERSE_QUOTE() { return getTokens(PythonParser.REVERSE_QUOTE); }
		public TerminalNode REVERSE_QUOTE(int i) {
			return getToken(PythonParser.REVERSE_QUOTE, i);
		}
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public TerminalNode ELLIPSIS() { return getToken(PythonParser.ELLIPSIS, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode PRINT() { return getToken(PythonParser.PRINT, 0); }
		public TerminalNode EXEC() { return getToken(PythonParser.EXEC, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(PythonParser.MINUS, 0); }
		public TerminalNode NONE() { return getToken(PythonParser.NONE, 0); }
		public List<TerminalNode> STRING() { return getTokens(PythonParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(PythonParser.STRING, i);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_atom);
		int _la;
		try {
			int _alt;
			setState(801);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(764);
				match(OPEN_PAREN);
				setState(767);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case YIELD:
					{
					setState(765);
					yield_expr();
					}
					break;
				case NONE:
				case LAMBDA:
				case NOT:
				case AWAIT:
				case PRINT:
				case EXEC:
				case TRUE:
				case FALSE:
				case ELLIPSIS:
				case REVERSE_QUOTE:
				case STAR:
				case ADD:
				case MINUS:
				case NOT_OP:
				case STRING:
				case DECIMAL_INTEGER:
				case OCT_INTEGER:
				case HEX_INTEGER:
				case BIN_INTEGER:
				case IMAG_NUMBER:
				case FLOAT_NUMBER:
				case OPEN_PAREN:
				case OPEN_BRACE:
				case OPEN_BRACKET:
				case NAME:
					{
					setState(766);
					testlist_comp();
					}
					break;
				case CLOSE_PAREN:
					break;
				default:
					break;
				}
				setState(769);
				match(CLOSE_PAREN);
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(770);
				match(OPEN_BRACKET);
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << LAMBDA) | (1L << NOT) | (1L << AWAIT) | (1L << PRINT) | (1L << EXEC) | (1L << TRUE) | (1L << FALSE) | (1L << ELLIPSIS) | (1L << REVERSE_QUOTE) | (1L << STAR) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (STRING - 84)) | (1L << (DECIMAL_INTEGER - 84)) | (1L << (OCT_INTEGER - 84)) | (1L << (HEX_INTEGER - 84)) | (1L << (BIN_INTEGER - 84)) | (1L << (IMAG_NUMBER - 84)) | (1L << (FLOAT_NUMBER - 84)) | (1L << (OPEN_PAREN - 84)) | (1L << (OPEN_BRACE - 84)) | (1L << (OPEN_BRACKET - 84)) | (1L << (NAME - 84)))) != 0)) {
					{
					setState(771);
					testlist_comp();
					}
				}

				setState(774);
				match(CLOSE_BRACKET);
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(775);
				match(OPEN_BRACE);
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << LAMBDA) | (1L << NOT) | (1L << AWAIT) | (1L << PRINT) | (1L << EXEC) | (1L << TRUE) | (1L << FALSE) | (1L << ELLIPSIS) | (1L << REVERSE_QUOTE) | (1L << STAR) | (1L << POWER) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (STRING - 84)) | (1L << (DECIMAL_INTEGER - 84)) | (1L << (OCT_INTEGER - 84)) | (1L << (HEX_INTEGER - 84)) | (1L << (BIN_INTEGER - 84)) | (1L << (IMAG_NUMBER - 84)) | (1L << (FLOAT_NUMBER - 84)) | (1L << (OPEN_PAREN - 84)) | (1L << (OPEN_BRACE - 84)) | (1L << (OPEN_BRACKET - 84)) | (1L << (NAME - 84)))) != 0)) {
					{
					setState(776);
					dictorsetmaker();
					}
				}

				setState(779);
				match(CLOSE_BRACE);
				}
				break;
			case REVERSE_QUOTE:
				enterOuterAlt(_localctx, 4);
				{
				setState(780);
				match(REVERSE_QUOTE);
				setState(781);
				testlist();
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(782);
					match(COMMA);
					}
				}

				setState(785);
				match(REVERSE_QUOTE);
				}
				break;
			case ELLIPSIS:
				enterOuterAlt(_localctx, 5);
				{
				setState(787);
				match(ELLIPSIS);
				}
				break;
			case TRUE:
			case FALSE:
			case NAME:
				enterOuterAlt(_localctx, 6);
				{
				setState(788);
				name();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 7);
				{
				setState(789);
				match(PRINT);
				}
				break;
			case EXEC:
				enterOuterAlt(_localctx, 8);
				{
				setState(790);
				match(EXEC);
				}
				break;
			case MINUS:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case IMAG_NUMBER:
			case FLOAT_NUMBER:
				enterOuterAlt(_localctx, 9);
				{
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(791);
					match(MINUS);
					}
				}

				setState(794);
				number();
				}
				break;
			case NONE:
				enterOuterAlt(_localctx, 10);
				{
				setState(795);
				match(NONE);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 11);
				{
				setState(797); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(796);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(799); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictorsetmakerContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(PythonParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PythonParser.COLON, i);
		}
		public List<TerminalNode> POWER() { return getTokens(PythonParser.POWER); }
		public TerminalNode POWER(int i) {
			return getToken(PythonParser.POWER, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Comp_forContext comp_for() {
			return getRuleContext(Comp_forContext.class,0);
		}
		public Testlist_compContext testlist_comp() {
			return getRuleContext(Testlist_compContext.class,0);
		}
		public DictorsetmakerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictorsetmaker; }
	}

	public final DictorsetmakerContext dictorsetmaker() throws RecognitionException {
		DictorsetmakerContext _localctx = new DictorsetmakerContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_dictorsetmaker);
		int _la;
		try {
			int _alt;
			setState(834);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(809);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NONE:
				case LAMBDA:
				case NOT:
				case AWAIT:
				case PRINT:
				case EXEC:
				case TRUE:
				case FALSE:
				case ELLIPSIS:
				case REVERSE_QUOTE:
				case ADD:
				case MINUS:
				case NOT_OP:
				case STRING:
				case DECIMAL_INTEGER:
				case OCT_INTEGER:
				case HEX_INTEGER:
				case BIN_INTEGER:
				case IMAG_NUMBER:
				case FLOAT_NUMBER:
				case OPEN_PAREN:
				case OPEN_BRACE:
				case OPEN_BRACKET:
				case NAME:
					{
					setState(803);
					test();
					setState(804);
					match(COLON);
					setState(805);
					test();
					}
					break;
				case POWER:
					{
					setState(807);
					match(POWER);
					setState(808);
					expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(822);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(811);
						match(COMMA);
						setState(818);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case NONE:
						case LAMBDA:
						case NOT:
						case AWAIT:
						case PRINT:
						case EXEC:
						case TRUE:
						case FALSE:
						case ELLIPSIS:
						case REVERSE_QUOTE:
						case ADD:
						case MINUS:
						case NOT_OP:
						case STRING:
						case DECIMAL_INTEGER:
						case OCT_INTEGER:
						case HEX_INTEGER:
						case BIN_INTEGER:
						case IMAG_NUMBER:
						case FLOAT_NUMBER:
						case OPEN_PAREN:
						case OPEN_BRACE:
						case OPEN_BRACKET:
						case NAME:
							{
							setState(812);
							test();
							setState(813);
							match(COLON);
							setState(814);
							test();
							}
							break;
						case POWER:
							{
							setState(816);
							match(POWER);
							setState(817);
							expr(0);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(824);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				}
				setState(826);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(825);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(828);
				test();
				setState(829);
				match(COLON);
				setState(830);
				test();
				setState(831);
				comp_for();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(833);
				testlist_comp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Testlist_compContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<Star_exprContext> star_expr() {
			return getRuleContexts(Star_exprContext.class);
		}
		public Star_exprContext star_expr(int i) {
			return getRuleContext(Star_exprContext.class,i);
		}
		public Comp_forContext comp_for() {
			return getRuleContext(Comp_forContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public Testlist_compContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testlist_comp; }
	}

	public final Testlist_compContext testlist_comp() throws RecognitionException {
		Testlist_compContext _localctx = new Testlist_compContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_testlist_comp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONE:
			case LAMBDA:
			case NOT:
			case AWAIT:
			case PRINT:
			case EXEC:
			case TRUE:
			case FALSE:
			case ELLIPSIS:
			case REVERSE_QUOTE:
			case ADD:
			case MINUS:
			case NOT_OP:
			case STRING:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case IMAG_NUMBER:
			case FLOAT_NUMBER:
			case OPEN_PAREN:
			case OPEN_BRACE:
			case OPEN_BRACKET:
			case NAME:
				{
				setState(836);
				test();
				}
				break;
			case STAR:
				{
				setState(837);
				star_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(854);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				{
				setState(840);
				comp_for();
				}
				break;
			case COMMA:
			case CLOSE_PAREN:
			case CLOSE_BRACE:
			case CLOSE_BRACKET:
				{
				setState(848);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(841);
						match(COMMA);
						setState(844);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case NONE:
						case LAMBDA:
						case NOT:
						case AWAIT:
						case PRINT:
						case EXEC:
						case TRUE:
						case FALSE:
						case ELLIPSIS:
						case REVERSE_QUOTE:
						case ADD:
						case MINUS:
						case NOT_OP:
						case STRING:
						case DECIMAL_INTEGER:
						case OCT_INTEGER:
						case HEX_INTEGER:
						case BIN_INTEGER:
						case IMAG_NUMBER:
						case FLOAT_NUMBER:
						case OPEN_PAREN:
						case OPEN_BRACE:
						case OPEN_BRACKET:
						case NAME:
							{
							setState(842);
							test();
							}
							break;
						case STAR:
							{
							setState(843);
							star_expr();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(850);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				}
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(851);
					match(COMMA);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TestlistContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public TestlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testlist; }
	}

	public final TestlistContext testlist() throws RecognitionException {
		TestlistContext _localctx = new TestlistContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_testlist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			test();
			setState(861);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(857);
					match(COMMA);
					setState(858);
					test();
					}
					} 
				}
				setState(863);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			}
			setState(865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(864);
				match(COMMA);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dotted_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public Dotted_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_name; }
	}

	public final Dotted_nameContext dotted_name() throws RecognitionException {
		return dotted_name(0);
	}

	private Dotted_nameContext dotted_name(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Dotted_nameContext _localctx = new Dotted_nameContext(_ctx, _parentState);
		Dotted_nameContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_dotted_name, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(868);
			name();
			}
			_ctx.stop = _input.LT(-1);
			setState(875);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Dotted_nameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dotted_name);
					setState(870);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(871);
					match(DOT);
					setState(872);
					name();
					}
					} 
				}
				setState(877);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public TerminalNode TRUE() { return getToken(PythonParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PythonParser.FALSE, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			_la = _input.LA(1);
			if ( !(((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (TRUE - 39)) | (1L << (FALSE - 39)) | (1L << (NAME - 39)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode IMAG_NUMBER() { return getToken(PythonParser.IMAG_NUMBER, 0); }
		public TerminalNode FLOAT_NUMBER() { return getToken(PythonParser.FLOAT_NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_number);
		try {
			setState(883);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(880);
				integer();
				}
				break;
			case IMAG_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(881);
				match(IMAG_NUMBER);
				}
				break;
			case FLOAT_NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(882);
				match(FLOAT_NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode DECIMAL_INTEGER() { return getToken(PythonParser.DECIMAL_INTEGER, 0); }
		public TerminalNode OCT_INTEGER() { return getToken(PythonParser.OCT_INTEGER, 0); }
		public TerminalNode HEX_INTEGER() { return getToken(PythonParser.HEX_INTEGER, 0); }
		public TerminalNode BIN_INTEGER() { return getToken(PythonParser.BIN_INTEGER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			_la = _input.LA(1);
			if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (DECIMAL_INTEGER - 85)) | (1L << (OCT_INTEGER - 85)) | (1L << (HEX_INTEGER - 85)) | (1L << (BIN_INTEGER - 85)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Yield_exprContext extends ParserRuleContext {
		public TerminalNode YIELD() { return getToken(PythonParser.YIELD, 0); }
		public Yield_argContext yield_arg() {
			return getRuleContext(Yield_argContext.class,0);
		}
		public Yield_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yield_expr; }
	}

	public final Yield_exprContext yield_expr() throws RecognitionException {
		Yield_exprContext _localctx = new Yield_exprContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_yield_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			match(YIELD);
			setState(889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FROM) | (1L << NONE) | (1L << LAMBDA) | (1L << NOT) | (1L << AWAIT) | (1L << PRINT) | (1L << EXEC) | (1L << TRUE) | (1L << FALSE) | (1L << ELLIPSIS) | (1L << REVERSE_QUOTE) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (STRING - 84)) | (1L << (DECIMAL_INTEGER - 84)) | (1L << (OCT_INTEGER - 84)) | (1L << (HEX_INTEGER - 84)) | (1L << (BIN_INTEGER - 84)) | (1L << (IMAG_NUMBER - 84)) | (1L << (FLOAT_NUMBER - 84)) | (1L << (OPEN_PAREN - 84)) | (1L << (OPEN_BRACE - 84)) | (1L << (OPEN_BRACKET - 84)) | (1L << (NAME - 84)))) != 0)) {
				{
				setState(888);
				yield_arg();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Yield_argContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(PythonParser.FROM, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public Yield_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yield_arg; }
	}

	public final Yield_argContext yield_arg() throws RecognitionException {
		Yield_argContext _localctx = new Yield_argContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_yield_arg);
		try {
			setState(894);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
				enterOuterAlt(_localctx, 1);
				{
				setState(891);
				match(FROM);
				setState(892);
				test();
				}
				break;
			case NONE:
			case LAMBDA:
			case NOT:
			case AWAIT:
			case PRINT:
			case EXEC:
			case TRUE:
			case FALSE:
			case ELLIPSIS:
			case REVERSE_QUOTE:
			case ADD:
			case MINUS:
			case NOT_OP:
			case STRING:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case IMAG_NUMBER:
			case FLOAT_NUMBER:
			case OPEN_PAREN:
			case OPEN_BRACE:
			case OPEN_BRACKET:
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(893);
				testlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrailerContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TrailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailer; }
	}

	public final TrailerContext trailer() throws RecognitionException {
		TrailerContext _localctx = new TrailerContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_trailer);
		try {
			setState(902);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(896);
				match(DOT);
				setState(897);
				name();
				setState(899);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(898);
					arguments();
					}
					break;
				}
				}
				break;
			case OPEN_PAREN:
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(901);
				arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(PythonParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PythonParser.CLOSE_PAREN, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(PythonParser.OPEN_BRACKET, 0); }
		public SubscriptlistContext subscriptlist() {
			return getRuleContext(SubscriptlistContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(PythonParser.CLOSE_BRACKET, 0); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_arguments);
		int _la;
		try {
			setState(913);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(904);
				match(OPEN_PAREN);
				setState(906);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << LAMBDA) | (1L << NOT) | (1L << AWAIT) | (1L << PRINT) | (1L << EXEC) | (1L << TRUE) | (1L << FALSE) | (1L << ELLIPSIS) | (1L << REVERSE_QUOTE) | (1L << STAR) | (1L << POWER) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (STRING - 84)) | (1L << (DECIMAL_INTEGER - 84)) | (1L << (OCT_INTEGER - 84)) | (1L << (HEX_INTEGER - 84)) | (1L << (BIN_INTEGER - 84)) | (1L << (IMAG_NUMBER - 84)) | (1L << (FLOAT_NUMBER - 84)) | (1L << (OPEN_PAREN - 84)) | (1L << (OPEN_BRACE - 84)) | (1L << (OPEN_BRACKET - 84)) | (1L << (NAME - 84)))) != 0)) {
					{
					setState(905);
					arglist();
					}
				}

				setState(908);
				match(CLOSE_PAREN);
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(909);
				match(OPEN_BRACKET);
				setState(910);
				subscriptlist();
				setState(911);
				match(CLOSE_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArglistContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_arglist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			argument();
			setState(920);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(916);
					match(COMMA);
					setState(917);
					argument();
					}
					} 
				}
				setState(922);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			}
			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(923);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public Comp_forContext comp_for() {
			return getRuleContext(Comp_forContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PythonParser.ASSIGN, 0); }
		public TerminalNode POWER() { return getToken(PythonParser.POWER, 0); }
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_argument);
		int _la;
		try {
			setState(934);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONE:
			case LAMBDA:
			case NOT:
			case AWAIT:
			case PRINT:
			case EXEC:
			case TRUE:
			case FALSE:
			case ELLIPSIS:
			case REVERSE_QUOTE:
			case ADD:
			case MINUS:
			case NOT_OP:
			case STRING:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case IMAG_NUMBER:
			case FLOAT_NUMBER:
			case OPEN_PAREN:
			case OPEN_BRACE:
			case OPEN_BRACKET:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(926);
				test();
				setState(930);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FOR:
					{
					setState(927);
					comp_for();
					}
					break;
				case ASSIGN:
					{
					setState(928);
					match(ASSIGN);
					setState(929);
					test();
					}
					break;
				case COMMA:
				case CLOSE_PAREN:
					break;
				default:
					break;
				}
				}
				break;
			case STAR:
			case POWER:
				enterOuterAlt(_localctx, 2);
				{
				setState(932);
				_la = _input.LA(1);
				if ( !(_la==STAR || _la==POWER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(933);
				test();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubscriptlistContext extends ParserRuleContext {
		public List<SubscriptContext> subscript() {
			return getRuleContexts(SubscriptContext.class);
		}
		public SubscriptContext subscript(int i) {
			return getRuleContext(SubscriptContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public SubscriptlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriptlist; }
	}

	public final SubscriptlistContext subscriptlist() throws RecognitionException {
		SubscriptlistContext _localctx = new SubscriptlistContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_subscriptlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			subscript();
			setState(941);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(937);
					match(COMMA);
					setState(938);
					subscript();
					}
					} 
				}
				setState(943);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			}
			setState(945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(944);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubscriptContext extends ParserRuleContext {
		public TerminalNode ELLIPSIS() { return getToken(PythonParser.ELLIPSIS, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public SliceopContext sliceop() {
			return getRuleContext(SliceopContext.class,0);
		}
		public SubscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript; }
	}

	public final SubscriptContext subscript() throws RecognitionException {
		SubscriptContext _localctx = new SubscriptContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_subscript);
		int _la;
		try {
			setState(965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(947);
				match(ELLIPSIS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(948);
				test();
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(949);
					match(COLON);
					setState(951);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << LAMBDA) | (1L << NOT) | (1L << AWAIT) | (1L << PRINT) | (1L << EXEC) | (1L << TRUE) | (1L << FALSE) | (1L << ELLIPSIS) | (1L << REVERSE_QUOTE) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (STRING - 84)) | (1L << (DECIMAL_INTEGER - 84)) | (1L << (OCT_INTEGER - 84)) | (1L << (HEX_INTEGER - 84)) | (1L << (BIN_INTEGER - 84)) | (1L << (IMAG_NUMBER - 84)) | (1L << (FLOAT_NUMBER - 84)) | (1L << (OPEN_PAREN - 84)) | (1L << (OPEN_BRACE - 84)) | (1L << (OPEN_BRACKET - 84)) | (1L << (NAME - 84)))) != 0)) {
						{
						setState(950);
						test();
						}
					}

					setState(954);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COLON) {
						{
						setState(953);
						sliceop();
						}
					}

					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(958);
				match(COLON);
				setState(960);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << LAMBDA) | (1L << NOT) | (1L << AWAIT) | (1L << PRINT) | (1L << EXEC) | (1L << TRUE) | (1L << FALSE) | (1L << ELLIPSIS) | (1L << REVERSE_QUOTE) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (STRING - 84)) | (1L << (DECIMAL_INTEGER - 84)) | (1L << (OCT_INTEGER - 84)) | (1L << (HEX_INTEGER - 84)) | (1L << (BIN_INTEGER - 84)) | (1L << (IMAG_NUMBER - 84)) | (1L << (FLOAT_NUMBER - 84)) | (1L << (OPEN_PAREN - 84)) | (1L << (OPEN_BRACE - 84)) | (1L << (OPEN_BRACKET - 84)) | (1L << (NAME - 84)))) != 0)) {
					{
					setState(959);
					test();
					}
				}

				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(962);
					sliceop();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SliceopContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public SliceopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceop; }
	}

	public final SliceopContext sliceop() throws RecognitionException {
		SliceopContext _localctx = new SliceopContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_sliceop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			match(COLON);
			setState(969);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << LAMBDA) | (1L << NOT) | (1L << AWAIT) | (1L << PRINT) | (1L << EXEC) | (1L << TRUE) | (1L << FALSE) | (1L << ELLIPSIS) | (1L << REVERSE_QUOTE) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (STRING - 84)) | (1L << (DECIMAL_INTEGER - 84)) | (1L << (OCT_INTEGER - 84)) | (1L << (HEX_INTEGER - 84)) | (1L << (BIN_INTEGER - 84)) | (1L << (IMAG_NUMBER - 84)) | (1L << (FLOAT_NUMBER - 84)) | (1L << (OPEN_PAREN - 84)) | (1L << (OPEN_BRACE - 84)) | (1L << (OPEN_BRACKET - 84)) | (1L << (NAME - 84)))) != 0)) {
				{
				setState(968);
				test();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comp_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PythonParser.FOR, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public Logical_testContext logical_test() {
			return getRuleContext(Logical_testContext.class,0);
		}
		public Comp_iterContext comp_iter() {
			return getRuleContext(Comp_iterContext.class,0);
		}
		public Comp_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_for; }
	}

	public final Comp_forContext comp_for() throws RecognitionException {
		Comp_forContext _localctx = new Comp_forContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_comp_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			match(FOR);
			setState(972);
			exprlist();
			setState(973);
			match(IN);
			setState(974);
			logical_test(0);
			setState(976);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF || _la==FOR) {
				{
				setState(975);
				comp_iter();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comp_iterContext extends ParserRuleContext {
		public Comp_forContext comp_for() {
			return getRuleContext(Comp_forContext.class,0);
		}
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public Comp_iterContext comp_iter() {
			return getRuleContext(Comp_iterContext.class,0);
		}
		public Comp_iterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_iter; }
	}

	public final Comp_iterContext comp_iter() throws RecognitionException {
		Comp_iterContext _localctx = new Comp_iterContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_comp_iter);
		int _la;
		try {
			setState(984);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(978);
				comp_for();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(979);
				match(IF);
				setState(980);
				test();
				setState(982);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF || _la==FOR) {
					{
					setState(981);
					comp_iter();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return except_clause_sempred((Except_clauseContext)_localctx, predIndex);
		case 23:
			return small_stmt_sempred((Small_stmtContext)_localctx, predIndex);
		case 26:
			return assign_part_sempred((Assign_partContext)_localctx, predIndex);
		case 38:
			return logical_test_sempred((Logical_testContext)_localctx, predIndex);
		case 39:
			return comparison_sempred((ComparisonContext)_localctx, predIndex);
		case 40:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 45:
			return dotted_name_sempred((Dotted_nameContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean except_clause_sempred(Except_clauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return CheckVersion(2);
		case 1:
			return CheckVersion(3);
		}
		return true;
	}
	private boolean small_stmt_sempred(Small_stmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return CheckVersion(2);
		case 3:
			return CheckVersion(2);
		case 4:
			return CheckVersion(3);
		}
		return true;
	}
	private boolean assign_part_sempred(Assign_partContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return CheckVersion(3);
		}
		return true;
	}
	private boolean logical_test_sempred(Logical_testContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean comparison_sempred(ComparisonContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 4);
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean dotted_name_sempred(Dotted_nameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3g\u03dd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\5\2~\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\u0087\n\3\3\4\3"+
		"\4\6\4\u008b\n\4\r\4\16\4\u008c\3\5\3\5\7\5\u0091\n\5\f\5\16\5\u0094\13"+
		"\5\3\6\3\6\5\6\u0098\n\6\3\7\3\7\3\7\3\7\3\7\7\7\u009f\n\7\f\7\16\7\u00a2"+
		"\13\7\3\7\5\7\u00a5\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ac\n\7\3\7\5\7\u00af"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00b8\n\7\3\7\3\7\3\7\3\7\6\7\u00be"+
		"\n\7\r\7\16\7\u00bf\3\7\5\7\u00c3\n\7\3\7\5\7\u00c6\n\7\3\7\5\7\u00c9"+
		"\n\7\3\7\5\7\u00cc\n\7\3\7\3\7\3\7\3\7\7\7\u00d2\n\7\f\7\16\7\u00d5\13"+
		"\7\3\7\3\7\3\7\3\7\7\7\u00db\n\7\f\7\16\7\u00de\13\7\3\7\3\7\5\7\u00e2"+
		"\n\7\3\7\3\7\3\7\5\7\u00e7\n\7\3\b\3\b\3\b\3\b\6\b\u00ed\n\b\r\b\16\b"+
		"\u00ee\3\b\3\b\5\b\u00f3\n\b\3\t\3\t\3\t\3\t\6\t\u00f9\n\t\r\t\16\t\u00fa"+
		"\3\t\3\t\5\t\u00ff\n\t\3\n\3\n\3\n\3\n\5\n\u0105\n\n\3\n\5\n\u0108\n\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\5\16\u011c\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u012a\n\17\5\17\u012c\n\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\5\20\u0135\n\20\3\20\5\20\u0138\n\20\3\20\3\20\3\20\3\21"+
		"\5\21\u013e\n\21\3\21\3\21\3\21\3\21\5\21\u0144\n\21\3\21\3\21\3\21\5"+
		"\21\u0149\n\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u0151\n\22\3\22\3\22"+
		"\3\22\5\22\u0156\n\22\3\22\3\22\5\22\u015a\n\22\3\22\5\22\u015d\n\22\3"+
		"\22\5\22\u0160\n\22\3\22\3\22\5\22\u0164\n\22\5\22\u0166\n\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\7\25\u0171\n\25\f\25\16\25\u0174\13"+
		"\25\3\26\3\26\3\26\5\26\u0179\n\26\3\26\5\26\u017c\n\26\3\27\3\27\3\27"+
		"\5\27\u0181\n\27\3\30\3\30\3\30\7\30\u0186\n\30\f\30\16\30\u0189\13\30"+
		"\3\30\5\30\u018c\n\30\3\30\3\30\3\31\3\31\5\31\u0192\n\31\3\31\3\31\3"+
		"\31\3\31\3\31\7\31\u0199\n\31\f\31\16\31\u019c\13\31\3\31\5\31\u019f\n"+
		"\31\3\31\3\31\3\31\3\31\6\31\u01a5\n\31\r\31\16\31\u01a6\3\31\5\31\u01aa"+
		"\n\31\5\31\u01ac\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u01b7\n\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01bf\n\31\5\31\u01c1\n"+
		"\31\5\31\u01c3\n\31\3\31\3\31\5\31\u01c7\n\31\3\31\3\31\3\31\3\31\3\31"+
		"\7\31\u01ce\n\31\f\31\16\31\u01d1\13\31\3\31\3\31\6\31\u01d5\n\31\r\31"+
		"\16\31\u01d6\5\31\u01d9\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01e2"+
		"\n\31\3\31\3\31\3\31\3\31\7\31\u01e8\n\31\f\31\16\31\u01eb\13\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01f4\n\31\5\31\u01f6\n\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\5\31\u01fe\n\31\3\31\3\31\3\31\3\31\3\31\7\31"+
		"\u0205\n\31\f\31\16\31\u0208\13\31\3\31\3\31\5\31\u020c\n\31\3\32\3\32"+
		"\5\32\u0210\n\32\3\32\3\32\6\32\u0214\n\32\r\32\16\32\u0215\3\32\3\32"+
		"\5\32\u021a\n\32\3\32\5\32\u021d\n\32\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\7\34\u0226\n\34\f\34\16\34\u0229\13\34\3\34\3\34\5\34\u022d\n\34\3"+
		"\34\5\34\u0230\n\34\3\34\3\34\3\34\3\34\3\34\5\34\u0237\n\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u023e\n\34\5\34\u0240\n\34\3\35\3\35\3\35\7\35\u0245"+
		"\n\35\f\35\16\35\u0248\13\35\3\35\5\35\u024b\n\35\3\36\3\36\3\36\7\36"+
		"\u0250\n\36\f\36\16\36\u0253\13\36\3\36\5\36\u0256\n\36\3\37\3\37\3\37"+
		"\5\37\u025b\n\37\3 \3 \3 \7 \u0260\n \f \16 \u0263\13 \3!\3!\3!\5!\u0268"+
		"\n!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0270\n\"\3\"\3\"\5\"\u0274\n\"\3\"\3"+
		"\"\5\"\u0278\n\"\3#\3#\3#\5#\u027d\n#\3#\3#\3#\5#\u0282\n#\3#\3#\5#\u0286"+
		"\n#\3#\5#\u0289\n#\3#\5#\u028c\n#\3#\3#\5#\u0290\n#\5#\u0292\n#\3$\3$"+
		"\3$\7$\u0297\n$\f$\16$\u029a\13$\3%\3%\3%\5%\u029f\n%\3%\5%\u02a2\n%\3"+
		"&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\5(\u02ae\n(\3(\3(\3(\3(\3(\3(\7(\u02b6"+
		"\n(\f(\16(\u02b9\13(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u02c7\n)\3"+
		")\3)\3)\5)\u02cc\n)\5)\u02ce\n)\3)\7)\u02d1\n)\f)\16)\u02d4\13)\3*\3*"+
		"\5*\u02d8\n*\3*\3*\7*\u02dc\n*\f*\16*\u02df\13*\3*\3*\5*\u02e3\n*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\7*\u02fa\n"+
		"*\f*\16*\u02fd\13*\3+\3+\3+\5+\u0302\n+\3+\3+\3+\5+\u0307\n+\3+\3+\3+"+
		"\5+\u030c\n+\3+\3+\3+\3+\5+\u0312\n+\3+\3+\3+\3+\3+\3+\3+\5+\u031b\n+"+
		"\3+\3+\3+\6+\u0320\n+\r+\16+\u0321\5+\u0324\n+\3,\3,\3,\3,\3,\3,\5,\u032c"+
		"\n,\3,\3,\3,\3,\3,\3,\3,\5,\u0335\n,\7,\u0337\n,\f,\16,\u033a\13,\3,\5"+
		",\u033d\n,\3,\3,\3,\3,\3,\3,\5,\u0345\n,\3-\3-\5-\u0349\n-\3-\3-\3-\3"+
		"-\5-\u034f\n-\7-\u0351\n-\f-\16-\u0354\13-\3-\5-\u0357\n-\5-\u0359\n-"+
		"\3.\3.\3.\7.\u035e\n.\f.\16.\u0361\13.\3.\5.\u0364\n.\3/\3/\3/\3/\3/\3"+
		"/\7/\u036c\n/\f/\16/\u036f\13/\3\60\3\60\3\61\3\61\3\61\5\61\u0376\n\61"+
		"\3\62\3\62\3\63\3\63\5\63\u037c\n\63\3\64\3\64\3\64\5\64\u0381\n\64\3"+
		"\65\3\65\3\65\5\65\u0386\n\65\3\65\5\65\u0389\n\65\3\66\3\66\5\66\u038d"+
		"\n\66\3\66\3\66\3\66\3\66\3\66\5\66\u0394\n\66\3\67\3\67\3\67\7\67\u0399"+
		"\n\67\f\67\16\67\u039c\13\67\3\67\5\67\u039f\n\67\38\38\38\38\58\u03a5"+
		"\n8\38\38\58\u03a9\n8\39\39\39\79\u03ae\n9\f9\169\u03b1\139\39\59\u03b4"+
		"\n9\3:\3:\3:\3:\5:\u03ba\n:\3:\5:\u03bd\n:\5:\u03bf\n:\3:\3:\5:\u03c3"+
		"\n:\3:\5:\u03c6\n:\5:\u03c8\n:\3;\3;\5;\u03cc\n;\3<\3<\3<\3<\3<\5<\u03d3"+
		"\n<\3=\3=\3=\3=\5=\u03d9\n=\5=\u03db\n=\3=\2\6NPR\\>\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvx\2\f\3\3\5\5\3\2,-\3\2IU\4\2:;??\5\2//<>GG\3\2:;\3\289\4\2)*cc"+
		"\3\2WZ\4\2//\63\63\2\u046c\2}\3\2\2\2\4\u0086\3\2\2\2\6\u008a\3\2\2\2"+
		"\b\u008e\3\2\2\2\n\u0097\3\2\2\2\f\u00e6\3\2\2\2\16\u00f2\3\2\2\2\20\u00fe"+
		"\3\2\2\2\22\u0100\3\2\2\2\24\u010b\3\2\2\2\26\u0110\3\2\2\2\30\u0114\3"+
		"\2\2\2\32\u0118\3\2\2\2\34\u011d\3\2\2\2\36\u0130\3\2\2\2 \u013d\3\2\2"+
		"\2\"\u0165\3\2\2\2$\u0167\3\2\2\2&\u016a\3\2\2\2(\u016d\3\2\2\2*\u017b"+
		"\3\2\2\2,\u017d\3\2\2\2.\u0182\3\2\2\2\60\u020b\3\2\2\2\62\u021c\3\2\2"+
		"\2\64\u021e\3\2\2\2\66\u023f\3\2\2\28\u0241\3\2\2\2:\u024c\3\2\2\2<\u0257"+
		"\3\2\2\2>\u025c\3\2\2\2@\u0264\3\2\2\2B\u0277\3\2\2\2D\u0291\3\2\2\2F"+
		"\u0293\3\2\2\2H\u02a1\3\2\2\2J\u02a3\3\2\2\2L\u02a6\3\2\2\2N\u02ad\3\2"+
		"\2\2P\u02ba\3\2\2\2R\u02e2\3\2\2\2T\u0323\3\2\2\2V\u0344\3\2\2\2X\u0348"+
		"\3\2\2\2Z\u035a\3\2\2\2\\\u0365\3\2\2\2^\u0370\3\2\2\2`\u0375\3\2\2\2"+
		"b\u0377\3\2\2\2d\u0379\3\2\2\2f\u0380\3\2\2\2h\u0388\3\2\2\2j\u0393\3"+
		"\2\2\2l\u0395\3\2\2\2n\u03a8\3\2\2\2p\u03aa\3\2\2\2r\u03c7\3\2\2\2t\u03c9"+
		"\3\2\2\2v\u03cd\3\2\2\2x\u03da\3\2\2\2z~\5\4\3\2{~\5\6\4\2|~\5\b\5\2}"+
		"z\3\2\2\2}{\3\2\2\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7\2\2\3"+
		"\u0080\3\3\2\2\2\u0081\u0087\7\5\2\2\u0082\u0087\5.\30\2\u0083\u0084\5"+
		"\f\7\2\u0084\u0085\7\5\2\2\u0085\u0087\3\2\2\2\u0086\u0081\3\2\2\2\u0086"+
		"\u0082\3\2\2\2\u0086\u0083\3\2\2\2\u0087\5\3\2\2\2\u0088\u008b\7\5\2\2"+
		"\u0089\u008b\5\n\6\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\7\3\2\2\2\u008e"+
		"\u0092\5Z.\2\u008f\u0091\7\5\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2"+
		"\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\t\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0095\u0098\5.\30\2\u0096\u0098\5\f\7\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0096\3\2\2\2\u0098\13\3\2\2\2\u0099\u009a\7\17\2\2\u009a\u009b\5B\""+
		"\2\u009b\u009c\7\61\2\2\u009c\u00a0\5\20\t\2\u009d\u009f\5\24\13\2\u009e"+
		"\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\5\26\f\2\u00a4"+
		"\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00e7\3\2\2\2\u00a6\u00a7\7\22"+
		"\2\2\u00a7\u00a8\5B\"\2\u00a8\u00a9\7\61\2\2\u00a9\u00ab\5\20\t\2\u00aa"+
		"\u00ac\5\26\f\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00e7\3"+
		"\2\2\2\u00ad\u00af\7%\2\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\7\23\2\2\u00b1\u00b2\58\35\2\u00b2\u00b3\7"+
		"\24\2\2\u00b3\u00b4\5Z.\2\u00b4\u00b5\7\61\2\2\u00b5\u00b7\5\20\t\2\u00b6"+
		"\u00b8\5\26\f\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00e7\3"+
		"\2\2\2\u00b9\u00ba\7\25\2\2\u00ba\u00bb\7\61\2\2\u00bb\u00c8\5\20\t\2"+
		"\u00bc\u00be\5\34\17\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00c3\5\26\f\2"+
		"\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c6"+
		"\5\30\r\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9\3\2\2\2"+
		"\u00c7\u00c9\5\30\r\2\u00c8\u00bd\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00e7"+
		"\3\2\2\2\u00ca\u00cc\7%\2\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00ce\7\30\2\2\u00ce\u00d3\5\32\16\2\u00cf\u00d0"+
		"\7\60\2\2\u00d0\u00d2\5\32\16\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2"+
		"\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3"+
		"\3\2\2\2\u00d6\u00d7\7\61\2\2\u00d7\u00d8\5\20\t\2\u00d8\u00e7\3\2\2\2"+
		"\u00d9\u00db\5\22\n\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e1\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e2\5\36\20\2\u00e0\u00e2\5 \21\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3"+
		"\2\2\2\u00e2\u00e7\3\2\2\2\u00e3\u00e4\7+\2\2\u00e4\u00e5\7\61\2\2\u00e5"+
		"\u00e7\5\16\b\2\u00e6\u0099\3\2\2\2\u00e6\u00a6\3\2\2\2\u00e6\u00ae\3"+
		"\2\2\2\u00e6\u00b9\3\2\2\2\u00e6\u00cb\3\2\2\2\u00e6\u00dc\3\2\2\2\u00e6"+
		"\u00e3\3\2\2\2\u00e7\r\3\2\2\2\u00e8\u00f3\5.\30\2\u00e9\u00ea\7\5\2\2"+
		"\u00ea\u00ec\7\3\2\2\u00eb\u00ed\5\n\6\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f1\7\4\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00e8\3\2\2\2\u00f2\u00e9\3\2"+
		"\2\2\u00f3\17\3\2\2\2\u00f4\u00ff\5.\30\2\u00f5\u00f6\7\5\2\2\u00f6\u00f8"+
		"\7\3\2\2\u00f7\u00f9\5\n\6\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\7\4"+
		"\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00f4\3\2\2\2\u00fe\u00f5\3\2\2\2\u00ff"+
		"\21\3\2\2\2\u0100\u0101\7G\2\2\u0101\u0107\5\\/\2\u0102\u0104\7]\2\2\u0103"+
		"\u0105\5l\67\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0108\7^\2\2\u0107\u0102\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\7\5\2\2\u010a\23\3\2\2\2\u010b\u010c\7\20\2"+
		"\2\u010c\u010d\5B\"\2\u010d\u010e\7\61\2\2\u010e\u010f\5\20\t\2\u010f"+
		"\25\3\2\2\2\u0110\u0111\7\21\2\2\u0111\u0112\7\61\2\2\u0112\u0113\5\20"+
		"\t\2\u0113\27\3\2\2\2\u0114\u0115\7\27\2\2\u0115\u0116\7\61\2\2\u0116"+
		"\u0117\5\20\t\2\u0117\31\3\2\2\2\u0118\u011b\5B\"\2\u0119\u011a\7\f\2"+
		"\2\u011a\u011c\5R*\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\33"+
		"\3\2\2\2\u011d\u012b\7\31\2\2\u011e\u0129\5B\"\2\u011f\u0120\6\17\2\2"+
		"\u0120\u0121\7\60\2\2\u0121\u0122\5^\60\2\u0122\u0123\b\17\1\2\u0123\u012a"+
		"\3\2\2\2\u0124\u0125\6\17\3\2\u0125\u0126\7\f\2\2\u0126\u0127\5^\60\2"+
		"\u0127\u0128\b\17\1\2\u0128\u012a\3\2\2\2\u0129\u011f\3\2\2\2\u0129\u0124"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u011e\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\7\61\2\2\u012e\u012f\5"+
		"\20\t\2\u012f\35\3\2\2\2\u0130\u0131\7\37\2\2\u0131\u0137\5^\60\2\u0132"+
		"\u0134\7]\2\2\u0133\u0135\5l\67\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136\u0138\7^\2\2\u0137\u0132\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\7\61\2\2\u013a\u013b\5"+
		"\20\t\2\u013b\37\3\2\2\2\u013c\u013e\7%\2\2\u013d\u013c\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\7\6\2\2\u0140\u0141\5^"+
		"\60\2\u0141\u0143\7]\2\2\u0142\u0144\5\"\22\2\u0143\u0142\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0148\7^\2\2\u0146\u0147\7H\2"+
		"\2\u0147\u0149\5B\"\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a"+
		"\3\2\2\2\u014a\u014b\7\61\2\2\u014b\u014c\5\20\t\2\u014c!\3\2\2\2\u014d"+
		"\u014e\5(\25\2\u014e\u014f\7\60\2\2\u014f\u0151\3\2\2\2\u0150\u014d\3"+
		"\2\2\2\u0150\u0151\3\2\2\2\u0151\u015c\3\2\2\2\u0152\u0155\5$\23\2\u0153"+
		"\u0154\7\60\2\2\u0154\u0156\5(\25\2\u0155\u0153\3\2\2\2\u0155\u0156\3"+
		"\2\2\2\u0156\u0159\3\2\2\2\u0157\u0158\7\60\2\2\u0158\u015a\5&\24\2\u0159"+
		"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u015d\5&"+
		"\24\2\u015c\u0152\3\2\2\2\u015c\u015b\3\2\2\2\u015d\u015f\3\2\2\2\u015e"+
		"\u0160\7\60\2\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0166\3"+
		"\2\2\2\u0161\u0163\5(\25\2\u0162\u0164\7\60\2\2\u0163\u0162\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0150\3\2\2\2\u0165\u0161\3\2"+
		"\2\2\u0166#\3\2\2\2\u0167\u0168\7/\2\2\u0168\u0169\5,\27\2\u0169%\3\2"+
		"\2\2\u016a\u016b\7\63\2\2\u016b\u016c\5,\27\2\u016c\'\3\2\2\2\u016d\u0172"+
		"\5*\26\2\u016e\u016f\7\60\2\2\u016f\u0171\5*\26\2\u0170\u016e\3\2\2\2"+
		"\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173)\3"+
		"\2\2\2\u0174\u0172\3\2\2\2\u0175\u0178\5,\27\2\u0176\u0177\7\64\2\2\u0177"+
		"\u0179\5B\"\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017c\3\2"+
		"\2\2\u017a\u017c\7/\2\2\u017b\u0175\3\2\2\2\u017b\u017a\3\2\2\2\u017c"+
		"+\3\2\2\2\u017d\u0180\5^\60\2\u017e\u017f\7\61\2\2\u017f\u0181\5B\"\2"+
		"\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181-\3\2\2\2\u0182\u0187\5"+
		"\60\31\2\u0183\u0184\7\62\2\2\u0184\u0186\5\60\31\2\u0185\u0183\3\2\2"+
		"\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018b"+
		"\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018c\7\62\2\2\u018b\u018a\3\2\2\2"+
		"\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\t\2\2\2\u018e/\3"+
		"\2\2\2\u018f\u0191\5\62\32\2\u0190\u0192\5\66\34\2\u0191\u0190\3\2\2\2"+
		"\u0191\u0192\3\2\2\2\u0192\u020c\3\2\2\2\u0193\u0194\6\31\4\2\u0194\u01ab"+
		"\7\'\2\2\u0195\u019a\5B\"\2\u0196\u0197\7\60\2\2\u0197\u0199\5B\"\2\u0198"+
		"\u0196\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2"+
		"\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019f\7\60\2\2\u019e"+
		"\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01ac\3\2\2\2\u01a0\u01a1\79"+
		"\2\2\u01a1\u01a4\5B\"\2\u01a2\u01a3\7\60\2\2\u01a3\u01a5\5B\"\2\u01a4"+
		"\u01a2\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2"+
		"\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01aa\7\60\2\2\u01a9\u01a8\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u0195\3\2\2\2\u01ab\u01a0\3\2"+
		"\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\b\31\1\2\u01ae\u020c\3\2\2\2\u01af"+
		"\u01b0\7!\2\2\u01b0\u020c\58\35\2\u01b1\u020c\7\"\2\2\u01b2\u020c\7$\2"+
		"\2\u01b3\u020c\7#\2\2\u01b4\u01b6\7\7\2\2\u01b5\u01b7\5Z.\2\u01b6\u01b5"+
		"\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u020c\3\2\2\2\u01b8\u01c2\7\b\2\2\u01b9"+
		"\u01c0\5B\"\2\u01ba\u01bb\7\60\2\2\u01bb\u01be\5B\"\2\u01bc\u01bd\7\60"+
		"\2\2\u01bd\u01bf\5B\"\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"\u01c1\3\2\2\2\u01c0\u01ba\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3\2"+
		"\2\2\u01c2\u01b9\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4"+
		"\u01c5\7\t\2\2\u01c5\u01c7\5B\"\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2"+
		"\2\2\u01c7\u020c\3\2\2\2\u01c8\u020c\5d\63\2\u01c9\u01ca\7\n\2\2\u01ca"+
		"\u020c\5> \2\u01cb\u01d8\7\t\2\2\u01cc\u01ce\t\3\2\2\u01cd\u01cc\3\2\2"+
		"\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2"+
		"\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d9\5\\/\2\u01d3\u01d5\t\3\2\2\u01d4"+
		"\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2"+
		"\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01cf\3\2\2\2\u01d8\u01d4\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\u01e1\7\n\2\2\u01db\u01e2\7/\2\2\u01dc\u01dd\7]\2"+
		"\2\u01dd\u01de\5:\36\2\u01de\u01df\7^\2\2\u01df\u01e2\3\2\2\2\u01e0\u01e2"+
		"\5:\36\2\u01e1\u01db\3\2\2\2\u01e1\u01dc\3\2\2\2\u01e1\u01e0\3\2\2\2\u01e2"+
		"\u020c\3\2\2\2\u01e3\u01e4\7\r\2\2\u01e4\u01e9\5^\60\2\u01e5\u01e6\7\60"+
		"\2\2\u01e6\u01e8\5^\60\2\u01e7\u01e5\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u020c\3\2\2\2\u01eb\u01e9\3\2"+
		"\2\2\u01ec\u01ed\6\31\5\2\u01ed\u01ee\7(\2\2\u01ee\u01f5\5R*\2\u01ef\u01f0"+
		"\7\24\2\2\u01f0\u01f3\5B\"\2\u01f1\u01f2\7\60\2\2\u01f2\u01f4\5B\"\2\u01f3"+
		"\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01ef\3\2"+
		"\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\b\31\1\2\u01f8"+
		"\u020c\3\2\2\2\u01f9\u01fa\7\16\2\2\u01fa\u01fd\5B\"\2\u01fb\u01fc\7\60"+
		"\2\2\u01fc\u01fe\5B\"\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u020c\3\2\2\2\u01ff\u0200\6\31\6\2\u0200\u0201\7\13\2\2\u0201\u0206\5"+
		"^\60\2\u0202\u0203\7\60\2\2\u0203\u0205\5^\60\2\u0204\u0202\3\2\2\2\u0205"+
		"\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0209\3\2"+
		"\2\2\u0208\u0206\3\2\2\2\u0209\u020a\b\31\1\2\u020a\u020c\3\2\2\2\u020b"+
		"\u018f\3\2\2\2\u020b\u0193\3\2\2\2\u020b\u01af\3\2\2\2\u020b\u01b1\3\2"+
		"\2\2\u020b\u01b2\3\2\2\2\u020b\u01b3\3\2\2\2\u020b\u01b4\3\2\2\2\u020b"+
		"\u01b8\3\2\2\2\u020b\u01c8\3\2\2\2\u020b\u01c9\3\2\2\2\u020b\u01cb\3\2"+
		"\2\2\u020b\u01e3\3\2\2\2\u020b\u01ec\3\2\2\2\u020b\u01f9\3\2\2\2\u020b"+
		"\u01ff\3\2\2\2\u020c\61\3\2\2\2\u020d\u0210\5B\"\2\u020e\u0210\5\64\33"+
		"\2\u020f\u020d\3\2\2\2\u020f\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212"+
		"\7\60\2\2\u0212\u0214\3\2\2\2\u0213\u020f\3\2\2\2\u0214\u0215\3\2\2\2"+
		"\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u021a"+
		"\5B\"\2\u0218\u021a\5\64\33\2\u0219\u0217\3\2\2\2\u0219\u0218\3\2\2\2"+
		"\u0219\u021a\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u021d\5Z.\2\u021c\u0213"+
		"\3\2\2\2\u021c\u021b\3\2\2\2\u021d\63\3\2\2\2\u021e\u021f\7/\2\2\u021f"+
		"\u0220\5R*\2\u0220\65\3\2\2\2\u0221\u022f\7\64\2\2\u0222\u0227\5\62\32"+
		"\2\u0223\u0224\7\64\2\2\u0224\u0226\5\62\32\2\u0225\u0223\3\2\2\2\u0226"+
		"\u0229\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022c\3\2"+
		"\2\2\u0229\u0227\3\2\2\2\u022a\u022b\7\64\2\2\u022b\u022d\5d\63\2\u022c"+
		"\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u0230\5d"+
		"\63\2\u022f\u0222\3\2\2\2\u022f\u022e\3\2\2\2\u0230\u0240\3\2\2\2\u0231"+
		"\u0232\6\34\7\2\u0232\u0233\7\61\2\2\u0233\u0236\5B\"\2\u0234\u0235\7"+
		"\64\2\2\u0235\u0237\5Z.\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237"+
		"\u0238\3\2\2\2\u0238\u0239\b\34\1\2\u0239\u0240\3\2\2\2\u023a\u023d\t"+
		"\4\2\2\u023b\u023e\5d\63\2\u023c\u023e\5Z.\2\u023d\u023b\3\2\2\2\u023d"+
		"\u023c\3\2\2\2\u023e\u0240\3\2\2\2\u023f\u0221\3\2\2\2\u023f\u0231\3\2"+
		"\2\2\u023f\u023a\3\2\2\2\u0240\67\3\2\2\2\u0241\u0246\5R*\2\u0242\u0243"+
		"\7\60\2\2\u0243\u0245\5R*\2\u0244\u0242\3\2\2\2\u0245\u0248\3\2\2\2\u0246"+
		"\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2"+
		"\2\2\u0249\u024b\7\60\2\2\u024a\u0249\3\2\2\2\u024a\u024b\3\2\2\2\u024b"+
		"9\3\2\2\2\u024c\u0251\5<\37\2\u024d\u024e\7\60\2\2\u024e\u0250\5<\37\2"+
		"\u024f\u024d\3\2\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252"+
		"\3\2\2\2\u0252\u0255\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u0256\7\60\2\2"+
		"\u0255\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256;\3\2\2\2\u0257\u025a\5"+
		"^\60\2\u0258\u0259\7\f\2\2\u0259\u025b\5^\60\2\u025a\u0258\3\2\2\2\u025a"+
		"\u025b\3\2\2\2\u025b=\3\2\2\2\u025c\u0261\5@!\2\u025d\u025e\7\60\2\2\u025e"+
		"\u0260\5@!\2\u025f\u025d\3\2\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2\2"+
		"\2\u0261\u0262\3\2\2\2\u0262?\3\2\2\2\u0263\u0261\3\2\2\2\u0264\u0267"+
		"\5\\/\2\u0265\u0266\7\f\2\2\u0266\u0268\5^\60\2\u0267\u0265\3\2\2\2\u0267"+
		"\u0268\3\2\2\2\u0268A\3\2\2\2\u0269\u026f\5N(\2\u026a\u026b\7\17\2\2\u026b"+
		"\u026c\5N(\2\u026c\u026d\7\21\2\2\u026d\u026e\5B\"\2\u026e\u0270\3\2\2"+
		"\2\u026f\u026a\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0278\3\2\2\2\u0271\u0273"+
		"\7\32\2\2\u0272\u0274\5D#\2\u0273\u0272\3\2\2\2\u0273\u0274\3\2\2\2\u0274"+
		"\u0275\3\2\2\2\u0275\u0276\7\61\2\2\u0276\u0278\5B\"\2\u0277\u0269\3\2"+
		"\2\2\u0277\u0271\3\2\2\2\u0278C\3\2\2\2\u0279\u027a\5F$\2\u027a\u027b"+
		"\7\60\2\2\u027b\u027d\3\2\2\2\u027c\u0279\3\2\2\2\u027c\u027d\3\2\2\2"+
		"\u027d\u0288\3\2\2\2\u027e\u0281\5J&\2\u027f\u0280\7\60\2\2\u0280\u0282"+
		"\5F$\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0285\3\2\2\2\u0283"+
		"\u0284\7\60\2\2\u0284\u0286\5L\'\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2"+
		"\2\2\u0286\u0289\3\2\2\2\u0287\u0289\5L\'\2\u0288\u027e\3\2\2\2\u0288"+
		"\u0287\3\2\2\2\u0289\u028b\3\2\2\2\u028a\u028c\7\60\2\2\u028b\u028a\3"+
		"\2\2\2\u028b\u028c\3\2\2\2\u028c\u0292\3\2\2\2\u028d\u028f\5F$\2\u028e"+
		"\u0290\7\60\2\2\u028f\u028e\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0292\3"+
		"\2\2\2\u0291\u027c\3\2\2\2\u0291\u028d\3\2\2\2\u0292E\3\2\2\2\u0293\u0298"+
		"\5H%\2\u0294\u0295\7\60\2\2\u0295\u0297\5H%\2\u0296\u0294\3\2\2\2\u0297"+
		"\u029a\3\2\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299G\3\2\2\2"+
		"\u029a\u0298\3\2\2\2\u029b\u029e\5^\60\2\u029c\u029d\7\64\2\2\u029d\u029f"+
		"\5B\"\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0"+
		"\u02a2\7/\2\2\u02a1\u029b\3\2\2\2\u02a1\u02a0\3\2\2\2\u02a2I\3\2\2\2\u02a3"+
		"\u02a4\7/\2\2\u02a4\u02a5\5^\60\2\u02a5K\3\2\2\2\u02a6\u02a7\7\63\2\2"+
		"\u02a7\u02a8\5^\60\2\u02a8M\3\2\2\2\u02a9\u02aa\b(\1\2\u02aa\u02ae\5P"+
		")\2\u02ab\u02ac\7\35\2\2\u02ac\u02ae\5N(\5\u02ad\u02a9\3\2\2\2\u02ad\u02ab"+
		"\3\2\2\2\u02ae\u02b7\3\2\2\2\u02af\u02b0\f\4\2\2\u02b0\u02b1\7\34\2\2"+
		"\u02b1\u02b6\5N(\5\u02b2\u02b3\f\3\2\2\u02b3\u02b4\7\33\2\2\u02b4\u02b6"+
		"\5N(\4\u02b5\u02af\3\2\2\2\u02b5\u02b2\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7"+
		"\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8O\3\2\2\2\u02b9\u02b7\3\2\2\2"+
		"\u02ba\u02bb\b)\1\2\u02bb\u02bc\5R*\2\u02bc\u02d2\3\2\2\2\u02bd\u02cd"+
		"\f\4\2\2\u02be\u02ce\7@\2\2\u02bf\u02ce\7A\2\2\u02c0\u02ce\7B\2\2\u02c1"+
		"\u02ce\7C\2\2\u02c2\u02ce\7D\2\2\u02c3\u02ce\7E\2\2\u02c4\u02ce\7F\2\2"+
		"\u02c5\u02c7\7\35\2\2\u02c6\u02c5\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8"+
		"\3\2\2\2\u02c8\u02ce\7\24\2\2\u02c9\u02cb\7\36\2\2\u02ca\u02cc\7\35\2"+
		"\2\u02cb\u02ca\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02ce\3\2\2\2\u02cd\u02be"+
		"\3\2\2\2\u02cd\u02bf\3\2\2\2\u02cd\u02c0\3\2\2\2\u02cd\u02c1\3\2\2\2\u02cd"+
		"\u02c2\3\2\2\2\u02cd\u02c3\3\2\2\2\u02cd\u02c4\3\2\2\2\u02cd\u02c6\3\2"+
		"\2\2\u02cd\u02c9\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d1\5P)\5\u02d0\u02bd"+
		"\3\2\2\2\u02d1\u02d4\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3"+
		"Q\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5\u02d7\b*\1\2\u02d6\u02d8\7&\2\2\u02d7"+
		"\u02d6\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02dd\5T"+
		"+\2\u02da\u02dc\5h\65\2\u02db\u02da\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd"+
		"\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02e3\3\2\2\2\u02df\u02dd\3\2"+
		"\2\2\u02e0\u02e1\t\5\2\2\u02e1\u02e3\5R*\t\u02e2\u02d5\3\2\2\2\u02e2\u02e0"+
		"\3\2\2\2\u02e3\u02fb\3\2\2\2\u02e4\u02e5\f\n\2\2\u02e5\u02e6\7\63\2\2"+
		"\u02e6\u02fa\5R*\n\u02e7\u02e8\f\b\2\2\u02e8\u02e9\t\6\2\2\u02e9\u02fa"+
		"\5R*\t\u02ea\u02eb\f\7\2\2\u02eb\u02ec\t\7\2\2\u02ec\u02fa\5R*\b\u02ed"+
		"\u02ee\f\6\2\2\u02ee\u02ef\t\b\2\2\u02ef\u02fa\5R*\7\u02f0\u02f1\f\5\2"+
		"\2\u02f1\u02f2\7\67\2\2\u02f2\u02fa\5R*\6\u02f3\u02f4\f\4\2\2\u02f4\u02f5"+
		"\7\66\2\2\u02f5\u02fa\5R*\5\u02f6\u02f7\f\3\2\2\u02f7\u02f8\7\65\2\2\u02f8"+
		"\u02fa\5R*\4\u02f9\u02e4\3\2\2\2\u02f9\u02e7\3\2\2\2\u02f9\u02ea\3\2\2"+
		"\2\u02f9\u02ed\3\2\2\2\u02f9\u02f0\3\2\2\2\u02f9\u02f3\3\2\2\2\u02f9\u02f6"+
		"\3\2\2\2\u02fa\u02fd\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc"+
		"S\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fe\u0301\7]\2\2\u02ff\u0302\5d\63\2\u0300"+
		"\u0302\5X-\2\u0301\u02ff\3\2\2\2\u0301\u0300\3\2\2\2\u0301\u0302\3\2\2"+
		"\2\u0302\u0303\3\2\2\2\u0303\u0324\7^\2\2\u0304\u0306\7a\2\2\u0305\u0307"+
		"\5X-\2\u0306\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0308\3\2\2\2\u0308"+
		"\u0324\7b\2\2\u0309\u030b\7_\2\2\u030a\u030c\5V,\2\u030b\u030a\3\2\2\2"+
		"\u030b\u030c\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u0324\7`\2\2\u030e\u030f"+
		"\7.\2\2\u030f\u0311\5Z.\2\u0310\u0312\7\60\2\2\u0311\u0310\3\2\2\2\u0311"+
		"\u0312\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0314\7.\2\2\u0314\u0324\3\2"+
		"\2\2\u0315\u0324\7-\2\2\u0316\u0324\5^\60\2\u0317\u0324\7\'\2\2\u0318"+
		"\u0324\7(\2\2\u0319\u031b\7;\2\2\u031a\u0319\3\2\2\2\u031a\u031b\3\2\2"+
		"\2\u031b\u031c\3\2\2\2\u031c\u0324\5`\61\2\u031d\u0324\7\26\2\2\u031e"+
		"\u0320\7V\2\2\u031f\u031e\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u031f\3\2"+
		"\2\2\u0321\u0322\3\2\2\2\u0322\u0324\3\2\2\2\u0323\u02fe\3\2\2\2\u0323"+
		"\u0304\3\2\2\2\u0323\u0309\3\2\2\2\u0323\u030e\3\2\2\2\u0323\u0315\3\2"+
		"\2\2\u0323\u0316\3\2\2\2\u0323\u0317\3\2\2\2\u0323\u0318\3\2\2\2\u0323"+
		"\u031a\3\2\2\2\u0323\u031d\3\2\2\2\u0323\u031f\3\2\2\2\u0324U\3\2\2\2"+
		"\u0325\u0326\5B\"\2\u0326\u0327\7\61\2\2\u0327\u0328\5B\"\2\u0328\u032c"+
		"\3\2\2\2\u0329\u032a\7\63\2\2\u032a\u032c\5R*\2\u032b\u0325\3\2\2\2\u032b"+
		"\u0329\3\2\2\2\u032c\u0338\3\2\2\2\u032d\u0334\7\60\2\2\u032e\u032f\5"+
		"B\"\2\u032f\u0330\7\61\2\2\u0330\u0331\5B\"\2\u0331\u0335\3\2\2\2\u0332"+
		"\u0333\7\63\2\2\u0333\u0335\5R*\2\u0334\u032e\3\2\2\2\u0334\u0332\3\2"+
		"\2\2\u0335\u0337\3\2\2\2\u0336\u032d\3\2\2\2\u0337\u033a\3\2\2\2\u0338"+
		"\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033c\3\2\2\2\u033a\u0338\3\2"+
		"\2\2\u033b\u033d\7\60\2\2\u033c\u033b\3\2\2\2\u033c\u033d\3\2\2\2\u033d"+
		"\u0345\3\2\2\2\u033e\u033f\5B\"\2\u033f\u0340\7\61\2\2\u0340\u0341\5B"+
		"\"\2\u0341\u0342\5v<\2\u0342\u0345\3\2\2\2\u0343\u0345\5X-\2\u0344\u032b"+
		"\3\2\2\2\u0344\u033e\3\2\2\2\u0344\u0343\3\2\2\2\u0345W\3\2\2\2\u0346"+
		"\u0349\5B\"\2\u0347\u0349\5\64\33\2\u0348\u0346\3\2\2\2\u0348\u0347\3"+
		"\2\2\2\u0349\u0358\3\2\2\2\u034a\u0359\5v<\2\u034b\u034e\7\60\2\2\u034c"+
		"\u034f\5B\"\2\u034d\u034f\5\64\33\2\u034e\u034c\3\2\2\2\u034e\u034d\3"+
		"\2\2\2\u034f\u0351\3\2\2\2\u0350\u034b\3\2\2\2\u0351\u0354\3\2\2\2\u0352"+
		"\u0350\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0356\3\2\2\2\u0354\u0352\3\2"+
		"\2\2\u0355\u0357\7\60\2\2\u0356\u0355\3\2\2\2\u0356\u0357\3\2\2\2\u0357"+
		"\u0359\3\2\2\2\u0358\u034a\3\2\2\2\u0358\u0352\3\2\2\2\u0359Y\3\2\2\2"+
		"\u035a\u035f\5B\"\2\u035b\u035c\7\60\2\2\u035c\u035e\5B\"\2\u035d\u035b"+
		"\3\2\2\2\u035e\u0361\3\2\2\2\u035f\u035d\3\2\2\2\u035f\u0360\3\2\2\2\u0360"+
		"\u0363\3\2\2\2\u0361\u035f\3\2\2\2\u0362\u0364\7\60\2\2\u0363\u0362\3"+
		"\2\2\2\u0363\u0364\3\2\2\2\u0364[\3\2\2\2\u0365\u0366\b/\1\2\u0366\u0367"+
		"\5^\60\2\u0367\u036d\3\2\2\2\u0368\u0369\f\4\2\2\u0369\u036a\7,\2\2\u036a"+
		"\u036c\5^\60\2\u036b\u0368\3\2\2\2\u036c\u036f\3\2\2\2\u036d\u036b\3\2"+
		"\2\2\u036d\u036e\3\2\2\2\u036e]\3\2\2\2\u036f\u036d\3\2\2\2\u0370\u0371"+
		"\t\t\2\2\u0371_\3\2\2\2\u0372\u0376\5b\62\2\u0373\u0376\7[\2\2\u0374\u0376"+
		"\7\\\2\2\u0375\u0372\3\2\2\2\u0375\u0373\3\2\2\2\u0375\u0374\3\2\2\2\u0376"+
		"a\3\2\2\2\u0377\u0378\t\n\2\2\u0378c\3\2\2\2\u0379\u037b\7 \2\2\u037a"+
		"\u037c\5f\64\2\u037b\u037a\3\2\2\2\u037b\u037c\3\2\2\2\u037ce\3\2\2\2"+
		"\u037d\u037e\7\t\2\2\u037e\u0381\5B\"\2\u037f\u0381\5Z.\2\u0380\u037d"+
		"\3\2\2\2\u0380\u037f\3\2\2\2\u0381g\3\2\2\2\u0382\u0383\7,\2\2\u0383\u0385"+
		"\5^\60\2\u0384\u0386\5j\66\2\u0385\u0384\3\2\2\2\u0385\u0386\3\2\2\2\u0386"+
		"\u0389\3\2\2\2\u0387\u0389\5j\66\2\u0388\u0382\3\2\2\2\u0388\u0387\3\2"+
		"\2\2\u0389i\3\2\2\2\u038a\u038c\7]\2\2\u038b\u038d\5l\67\2\u038c\u038b"+
		"\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0394\7^\2\2\u038f"+
		"\u0390\7a\2\2\u0390\u0391\5p9\2\u0391\u0392\7b\2\2\u0392\u0394\3\2\2\2"+
		"\u0393\u038a\3\2\2\2\u0393\u038f\3\2\2\2\u0394k\3\2\2\2\u0395\u039a\5"+
		"n8\2\u0396\u0397\7\60\2\2\u0397\u0399\5n8\2\u0398\u0396\3\2\2\2\u0399"+
		"\u039c\3\2\2\2\u039a\u0398\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039e\3\2"+
		"\2\2\u039c\u039a\3\2\2\2\u039d\u039f\7\60\2\2\u039e\u039d\3\2\2\2\u039e"+
		"\u039f\3\2\2\2\u039fm\3\2\2\2\u03a0\u03a4\5B\"\2\u03a1\u03a5\5v<\2\u03a2"+
		"\u03a3\7\64\2\2\u03a3\u03a5\5B\"\2\u03a4\u03a1\3\2\2\2\u03a4\u03a2\3\2"+
		"\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a9\3\2\2\2\u03a6\u03a7\t\13\2\2\u03a7"+
		"\u03a9\5B\"\2\u03a8\u03a0\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a9o\3\2\2\2\u03aa"+
		"\u03af\5r:\2\u03ab\u03ac\7\60\2\2\u03ac\u03ae\5r:\2\u03ad\u03ab\3\2\2"+
		"\2\u03ae\u03b1\3\2\2\2\u03af\u03ad\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b3"+
		"\3\2\2\2\u03b1\u03af\3\2\2\2\u03b2\u03b4\7\60\2\2\u03b3\u03b2\3\2\2\2"+
		"\u03b3\u03b4\3\2\2\2\u03b4q\3\2\2\2\u03b5\u03c8\7-\2\2\u03b6\u03be\5B"+
		"\"\2\u03b7\u03b9\7\61\2\2\u03b8\u03ba\5B\"\2\u03b9\u03b8\3\2\2\2\u03b9"+
		"\u03ba\3\2\2\2\u03ba\u03bc\3\2\2\2\u03bb\u03bd\5t;\2\u03bc\u03bb\3\2\2"+
		"\2\u03bc\u03bd\3\2\2\2\u03bd\u03bf\3\2\2\2\u03be\u03b7\3\2\2\2\u03be\u03bf"+
		"\3\2\2\2\u03bf\u03c8\3\2\2\2\u03c0\u03c2\7\61\2\2\u03c1\u03c3\5B\"\2\u03c2"+
		"\u03c1\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c5\3\2\2\2\u03c4\u03c6\5t"+
		";\2\u03c5\u03c4\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c8\3\2\2\2\u03c7"+
		"\u03b5\3\2\2\2\u03c7\u03b6\3\2\2\2\u03c7\u03c0\3\2\2\2\u03c8s\3\2\2\2"+
		"\u03c9\u03cb\7\61\2\2\u03ca\u03cc\5B\"\2\u03cb\u03ca\3\2\2\2\u03cb\u03cc"+
		"\3\2\2\2\u03ccu\3\2\2\2\u03cd\u03ce\7\23\2\2\u03ce\u03cf\58\35\2\u03cf"+
		"\u03d0\7\24\2\2\u03d0\u03d2\5N(\2\u03d1\u03d3\5x=\2\u03d2\u03d1\3\2\2"+
		"\2\u03d2\u03d3\3\2\2\2\u03d3w\3\2\2\2\u03d4\u03db\5v<\2\u03d5\u03d6\7"+
		"\17\2\2\u03d6\u03d8\5B\"\2\u03d7\u03d9\5x=\2\u03d8\u03d7\3\2\2\2\u03d8"+
		"\u03d9\3\2\2\2\u03d9\u03db\3\2\2\2\u03da\u03d4\3\2\2\2\u03da\u03d5\3\2"+
		"\2\2\u03dby\3\2\2\2\u009b}\u0086\u008a\u008c\u0092\u0097\u00a0\u00a4\u00ab"+
		"\u00ae\u00b7\u00bf\u00c2\u00c5\u00c8\u00cb\u00d3\u00dc\u00e1\u00e6\u00ee"+
		"\u00f2\u00fa\u00fe\u0104\u0107\u011b\u0129\u012b\u0134\u0137\u013d\u0143"+
		"\u0148\u0150\u0155\u0159\u015c\u015f\u0163\u0165\u0172\u0178\u017b\u0180"+
		"\u0187\u018b\u0191\u019a\u019e\u01a6\u01a9\u01ab\u01b6\u01be\u01c0\u01c2"+
		"\u01c6\u01cf\u01d6\u01d8\u01e1\u01e9\u01f3\u01f5\u01fd\u0206\u020b\u020f"+
		"\u0215\u0219\u021c\u0227\u022c\u022f\u0236\u023d\u023f\u0246\u024a\u0251"+
		"\u0255\u025a\u0261\u0267\u026f\u0273\u0277\u027c\u0281\u0285\u0288\u028b"+
		"\u028f\u0291\u0298\u029e\u02a1\u02ad\u02b5\u02b7\u02c6\u02cb\u02cd\u02d2"+
		"\u02d7\u02dd\u02e2\u02f9\u02fb\u0301\u0306\u030b\u0311\u031a\u0321\u0323"+
		"\u032b\u0334\u0338\u033c\u0344\u0348\u034e\u0352\u0356\u0358\u035f\u0363"+
		"\u036d\u0375\u037b\u0380\u0385\u0388\u038c\u0393\u039a\u039e\u03a4\u03a8"+
		"\u03af\u03b3\u03b9\u03bc\u03be\u03c2\u03c5\u03c7\u03cb\u03d2\u03d8\u03da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}