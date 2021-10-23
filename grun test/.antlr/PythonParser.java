// Generated from c:\Users\Samuele Gervasi\My Drive\LIFE\Information\u005Cuniversity\Triennale Informatica\Terzo Anno\Stage e Tesi\Reversible Computing\OrthrusPythonTranslator\grun test\PythonParser.g4 by ANTLR 4.8
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
		RULE_stmt = 4, RULE_compound_stmt = 5, RULE_rev_stmt = 6, RULE_rev_i = 7, 
		RULE_rev_assign = 8, RULE_rev_block = 9, RULE_suite = 10, RULE_decorator = 11, 
		RULE_elif_clause = 12, RULE_else_clause = 13, RULE_finally_clause = 14, 
		RULE_with_item = 15, RULE_except_clause = 16, RULE_classdef = 17, RULE_funcdef = 18, 
		RULE_typedargslist = 19, RULE_args = 20, RULE_kwargs = 21, RULE_def_parameters = 22, 
		RULE_def_parameter = 23, RULE_named_parameter = 24, RULE_simple_stmt = 25, 
		RULE_small_stmt = 26, RULE_testlist_star_expr = 27, RULE_star_expr = 28, 
		RULE_assign_part = 29, RULE_exprlist = 30, RULE_import_as_names = 31, 
		RULE_import_as_name = 32, RULE_dotted_as_names = 33, RULE_dotted_as_name = 34, 
		RULE_test = 35, RULE_varargslist = 36, RULE_vardef_parameters = 37, RULE_vardef_parameter = 38, 
		RULE_varargs = 39, RULE_varkwargs = 40, RULE_logical_test = 41, RULE_comparison = 42, 
		RULE_expr = 43, RULE_atom = 44, RULE_dictorsetmaker = 45, RULE_testlist_comp = 46, 
		RULE_testlist = 47, RULE_dotted_name = 48, RULE_name = 49, RULE_number = 50, 
		RULE_integer = 51, RULE_yield_expr = 52, RULE_yield_arg = 53, RULE_trailer = 54, 
		RULE_arguments = 55, RULE_arglist = 56, RULE_argument = 57, RULE_subscriptlist = 58, 
		RULE_subscript = 59, RULE_sliceop = 60, RULE_comp_for = 61, RULE_comp_iter = 62;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "single_input", "file_input", "eval_input", "stmt", "compound_stmt", 
			"rev_stmt", "rev_i", "rev_assign", "rev_block", "suite", "decorator", 
			"elif_clause", "else_clause", "finally_clause", "with_item", "except_clause", 
			"classdef", "funcdef", "typedargslist", "args", "kwargs", "def_parameters", 
			"def_parameter", "named_parameter", "simple_stmt", "small_stmt", "testlist_star_expr", 
			"star_expr", "assign_part", "exprlist", "import_as_names", "import_as_name", 
			"dotted_as_names", "dotted_as_name", "test", "varargslist", "vardef_parameters", 
			"vardef_parameter", "varargs", "varkwargs", "logical_test", "comparison", 
			"expr", "atom", "dictorsetmaker", "testlist_comp", "testlist", "dotted_name", 
			"name", "number", "integer", "yield_expr", "yield_arg", "trailer", "arguments", 
			"arglist", "argument", "subscriptlist", "subscript", "sliceop", "comp_for", 
			"comp_iter"
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
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(126);
				single_input();
				}
				break;
			case 2:
				{
				setState(127);
				file_input();
				}
				break;
			case 3:
				{
				setState(128);
				eval_input();
				}
				break;
			}
			setState(131);
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
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(LINE_BREAK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				simple_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				compound_stmt();
				setState(136);
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
			setState(142); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(142);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(140);
						match(LINE_BREAK);
						}
						break;
					case 2:
						{
						setState(141);
						stmt();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(144); 
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
			setState(146);
			testlist();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_BREAK) {
				{
				{
				setState(147);
				match(LINE_BREAK);
				}
				}
				setState(152);
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
		public Rev_stmtContext rev_stmt() {
			return getRuleContext(Rev_stmtContext.class,0);
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
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				simple_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				compound_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				rev_stmt();
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
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new If_stmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(IF);
				setState(159);
				((If_stmtContext)_localctx).cond = test();
				setState(160);
				match(COLON);
				setState(161);
				suite();
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(162);
						elif_clause();
						}
						} 
					}
					setState(167);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(169);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(168);
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
				setState(171);
				match(WHILE);
				setState(172);
				test();
				setState(173);
				match(COLON);
				setState(174);
				suite();
				setState(176);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(175);
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
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASYNC) {
					{
					setState(178);
					match(ASYNC);
					}
				}

				setState(181);
				match(FOR);
				setState(182);
				exprlist();
				setState(183);
				match(IN);
				setState(184);
				testlist();
				setState(185);
				match(COLON);
				setState(186);
				suite();
				setState(188);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(187);
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
				setState(190);
				match(TRY);
				setState(191);
				match(COLON);
				setState(192);
				suite();
				setState(205);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EXCEPT:
					{
					setState(194); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(193);
							except_clause();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(196); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(199);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(198);
						else_clause();
						}
						break;
					}
					setState(202);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(201);
						finally_clause();
						}
						break;
					}
					}
					break;
				case FINALLY:
					{
					setState(204);
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
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASYNC) {
					{
					setState(207);
					match(ASYNC);
					}
				}

				setState(210);
				match(WITH);
				setState(211);
				with_item();
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(212);
					match(COMMA);
					setState(213);
					with_item();
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(219);
				match(COLON);
				setState(220);
				suite();
				}
				break;
			case 6:
				_localctx = new Class_or_func_def_stmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(222);
					decorator();
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(230);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(228);
					classdef();
					}
					break;
				case DEF:
				case ASYNC:
					{
					setState(229);
					funcdef();
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

	public static class Rev_stmtContext extends ParserRuleContext {
		public TerminalNode REV() { return getToken(PythonParser.REV, 0); }
		public Rev_iContext rev_i() {
			return getRuleContext(Rev_iContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public Rev_blockContext rev_block() {
			return getRuleContext(Rev_blockContext.class,0);
		}
		public Rev_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rev_stmt; }
	}

	public final Rev_stmtContext rev_stmt() throws RecognitionException {
		Rev_stmtContext _localctx = new Rev_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rev_stmt);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(REV);
				setState(235);
				rev_i();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(REV);
				setState(237);
				match(COLON);
				setState(238);
				rev_block();
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

	public static class Rev_iContext extends ParserRuleContext {
		public Testlist_star_exprContext testlist_star_expr() {
			return getRuleContext(Testlist_star_exprContext.class,0);
		}
		public Rev_assignContext rev_assign() {
			return getRuleContext(Rev_assignContext.class,0);
		}
		public Yield_exprContext yield_expr() {
			return getRuleContext(Yield_exprContext.class,0);
		}
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public Rev_iContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rev_i; }
	}

	public final Rev_iContext rev_i() throws RecognitionException {
		Rev_iContext _localctx = new Rev_iContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rev_i);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			testlist_star_expr();
			setState(242);
			rev_assign();
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YIELD:
				{
				setState(243);
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
				setState(244);
				testlist();
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

	public static class Rev_assignContext extends ParserRuleContext {
		public Token op;
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
		public Rev_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rev_assign; }
	}

	public final Rev_assignContext rev_assign() throws RecognitionException {
		Rev_assignContext _localctx = new Rev_assignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rev_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			((Rev_assignContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (ADD_ASSIGN - 71)) | (1L << (SUB_ASSIGN - 71)) | (1L << (MULT_ASSIGN - 71)) | (1L << (AT_ASSIGN - 71)) | (1L << (DIV_ASSIGN - 71)) | (1L << (MOD_ASSIGN - 71)) | (1L << (AND_ASSIGN - 71)) | (1L << (OR_ASSIGN - 71)) | (1L << (XOR_ASSIGN - 71)) | (1L << (LEFT_SHIFT_ASSIGN - 71)) | (1L << (RIGHT_SHIFT_ASSIGN - 71)) | (1L << (POWER_ASSIGN - 71)) | (1L << (IDIV_ASSIGN - 71)))) != 0)) ) {
				((Rev_assignContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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

	public static class Rev_blockContext extends ParserRuleContext {
		public TerminalNode LINE_BREAK() { return getToken(PythonParser.LINE_BREAK, 0); }
		public TerminalNode INDENT() { return getToken(PythonParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(PythonParser.DEDENT, 0); }
		public TerminalNode NONE() { return getToken(PythonParser.NONE, 0); }
		public List<Rev_iContext> rev_i() {
			return getRuleContexts(Rev_iContext.class);
		}
		public Rev_iContext rev_i(int i) {
			return getRuleContext(Rev_iContext.class,i);
		}
		public Rev_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rev_block; }
	}

	public final Rev_blockContext rev_block() throws RecognitionException {
		Rev_blockContext _localctx = new Rev_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rev_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(LINE_BREAK);
			setState(250);
			match(INDENT);
			setState(252); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(251);
				rev_i();
				}
				}
				setState(254); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << LAMBDA) | (1L << NOT) | (1L << AWAIT) | (1L << PRINT) | (1L << EXEC) | (1L << TRUE) | (1L << FALSE) | (1L << ELLIPSIS) | (1L << REVERSE_QUOTE) | (1L << STAR) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (STRING - 84)) | (1L << (DECIMAL_INTEGER - 84)) | (1L << (OCT_INTEGER - 84)) | (1L << (HEX_INTEGER - 84)) | (1L << (BIN_INTEGER - 84)) | (1L << (IMAG_NUMBER - 84)) | (1L << (FLOAT_NUMBER - 84)) | (1L << (OPEN_PAREN - 84)) | (1L << (OPEN_BRACE - 84)) | (1L << (OPEN_BRACKET - 84)) | (1L << (NAME - 84)))) != 0) );
			setState(256);
			match(DEDENT);
			setState(257);
			match(NONE);
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
		enterRule(_localctx, 20, RULE_suite);
		try {
			int _alt;
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				simple_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(LINE_BREAK);
				setState(261);
				match(INDENT);
				setState(263); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(262);
						stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(265); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(267);
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
		enterRule(_localctx, 22, RULE_decorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(AT);
			setState(272);
			dotted_name(0);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(273);
				match(OPEN_PAREN);
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << LAMBDA) | (1L << NOT) | (1L << AWAIT) | (1L << PRINT) | (1L << EXEC) | (1L << TRUE) | (1L << FALSE) | (1L << ELLIPSIS) | (1L << REVERSE_QUOTE) | (1L << STAR) | (1L << POWER) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (STRING - 84)) | (1L << (DECIMAL_INTEGER - 84)) | (1L << (OCT_INTEGER - 84)) | (1L << (HEX_INTEGER - 84)) | (1L << (BIN_INTEGER - 84)) | (1L << (IMAG_NUMBER - 84)) | (1L << (FLOAT_NUMBER - 84)) | (1L << (OPEN_PAREN - 84)) | (1L << (OPEN_BRACE - 84)) | (1L << (OPEN_BRACKET - 84)) | (1L << (NAME - 84)))) != 0)) {
					{
					setState(274);
					arglist();
					}
				}

				setState(277);
				match(CLOSE_PAREN);
				}
			}

			setState(280);
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
		enterRule(_localctx, 24, RULE_elif_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(ELIF);
			setState(283);
			test();
			setState(284);
			match(COLON);
			setState(285);
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
		enterRule(_localctx, 26, RULE_else_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(ELSE);
			setState(288);
			match(COLON);
			setState(289);
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
		enterRule(_localctx, 28, RULE_finally_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(FINALLY);
			setState(292);
			match(COLON);
			setState(293);
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
		enterRule(_localctx, 30, RULE_with_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			test();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(296);
				match(AS);
				setState(297);
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
		enterRule(_localctx, 32, RULE_except_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(EXCEPT);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << LAMBDA) | (1L << NOT) | (1L << AWAIT) | (1L << PRINT) | (1L << EXEC) | (1L << TRUE) | (1L << FALSE) | (1L << ELLIPSIS) | (1L << REVERSE_QUOTE) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (STRING - 84)) | (1L << (DECIMAL_INTEGER - 84)) | (1L << (OCT_INTEGER - 84)) | (1L << (HEX_INTEGER - 84)) | (1L << (BIN_INTEGER - 84)) | (1L << (IMAG_NUMBER - 84)) | (1L << (FLOAT_NUMBER - 84)) | (1L << (OPEN_PAREN - 84)) | (1L << (OPEN_BRACE - 84)) | (1L << (OPEN_BRACKET - 84)) | (1L << (NAME - 84)))) != 0)) {
				{
				setState(301);
				test();
				setState(312);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(302);
					if (!(CheckVersion(2))) throw new FailedPredicateException(this, "CheckVersion(2)");
					setState(303);
					match(COMMA);
					setState(304);
					name();
					SetVersion(2);
					}
					break;
				case 2:
					{
					setState(307);
					if (!(CheckVersion(3))) throw new FailedPredicateException(this, "CheckVersion(3)");
					setState(308);
					match(AS);
					setState(309);
					name();
					SetVersion(3);
					}
					break;
				}
				}
			}

			setState(316);
			match(COLON);
			setState(317);
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
		enterRule(_localctx, 34, RULE_classdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(CLASS);
			setState(320);
			name();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(321);
				match(OPEN_PAREN);
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << LAMBDA) | (1L << NOT) | (1L << AWAIT) | (1L << PRINT) | (1L << EXEC) | (1L << TRUE) | (1L << FALSE) | (1L << ELLIPSIS) | (1L << REVERSE_QUOTE) | (1L << STAR) | (1L << POWER) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (STRING - 84)) | (1L << (DECIMAL_INTEGER - 84)) | (1L << (OCT_INTEGER - 84)) | (1L << (HEX_INTEGER - 84)) | (1L << (BIN_INTEGER - 84)) | (1L << (IMAG_NUMBER - 84)) | (1L << (FLOAT_NUMBER - 84)) | (1L << (OPEN_PAREN - 84)) | (1L << (OPEN_BRACE - 84)) | (1L << (OPEN_BRACKET - 84)) | (1L << (NAME - 84)))) != 0)) {
					{
					setState(322);
					arglist();
					}
				}

				setState(325);
				match(CLOSE_PAREN);
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
		enterRule(_localctx, 36, RULE_funcdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(331);
				match(ASYNC);
				}
			}

			setState(334);
			match(DEF);
			setState(335);
			name();
			setState(336);
			match(OPEN_PAREN);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (TRUE - 39)) | (1L << (FALSE - 39)) | (1L << (STAR - 39)) | (1L << (POWER - 39)) | (1L << (NAME - 39)))) != 0)) {
				{
				setState(337);
				typedargslist();
				}
			}

			setState(340);
			match(CLOSE_PAREN);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(341);
				match(ARROW);
				setState(342);
				test();
				}
			}

			setState(345);
			match(COLON);
			setState(346);
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
		enterRule(_localctx, 38, RULE_typedargslist);
		int _la;
		try {
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(348);
					def_parameters();
					setState(349);
					match(COMMA);
					}
					break;
				}
				setState(363);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(353);
					args();
					setState(356);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(354);
						match(COMMA);
						setState(355);
						def_parameters();
						}
						break;
					}
					setState(360);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						setState(358);
						match(COMMA);
						setState(359);
						kwargs();
						}
						break;
					}
					}
					break;
				case POWER:
					{
					setState(362);
					kwargs();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(365);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				def_parameters();
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(369);
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
		enterRule(_localctx, 40, RULE_args);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(STAR);
			setState(375);
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
		enterRule(_localctx, 42, RULE_kwargs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(POWER);
			setState(378);
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
		enterRule(_localctx, 44, RULE_def_parameters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			def_parameter();
			setState(385);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(381);
					match(COMMA);
					setState(382);
					def_parameter();
					}
					} 
				}
				setState(387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		enterRule(_localctx, 46, RULE_def_parameter);
		int _la;
		try {
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				named_parameter();
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(389);
					match(ASSIGN);
					setState(390);
					test();
					}
				}

				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
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
		enterRule(_localctx, 48, RULE_named_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			name();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(397);
				match(COLON);
				setState(398);
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
		enterRule(_localctx, 50, RULE_simple_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			small_stmt();
			setState(406);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(402);
					match(SEMI_COLON);
					setState(403);
					small_stmt();
					}
					} 
				}
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_COLON) {
				{
				setState(409);
				match(SEMI_COLON);
				}
			}

			setState(412);
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
		enterRule(_localctx, 52, RULE_small_stmt);
		int _la;
		try {
			int _alt;
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				_localctx = new Expr_stmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				testlist_star_expr();
				setState(416);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(415);
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
				setState(418);
				if (!(CheckVersion(2))) throw new FailedPredicateException(this, "CheckVersion(2)");
				setState(419);
				match(PRINT);
				setState(442);
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
					setState(420);
					test();
					setState(425);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(421);
							match(COMMA);
							setState(422);
							test();
							}
							} 
						}
						setState(427);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
					}
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(428);
						match(COMMA);
						}
					}

					}
					}
					break;
				case RIGHT_SHIFT:
					{
					setState(431);
					match(RIGHT_SHIFT);
					setState(432);
					test();
					{
					setState(435); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(433);
							match(COMMA);
							setState(434);
							test();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(437); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(440);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(439);
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
				setState(446);
				match(DEL);
				setState(447);
				exprlist();
				}
				break;
			case 4:
				_localctx = new Pass_stmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(448);
				match(PASS);
				}
				break;
			case 5:
				_localctx = new Break_stmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(449);
				match(BREAK);
				}
				break;
			case 6:
				_localctx = new Continue_stmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(450);
				match(CONTINUE);
				}
				break;
			case 7:
				_localctx = new Return_stmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(451);
				match(RETURN);
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << LAMBDA) | (1L << NOT) | (1L << AWAIT) | (1L << PRINT) | (1L << EXEC) | (1L << TRUE) | (1L << FALSE) | (1L << ELLIPSIS) | (1L << REVERSE_QUOTE) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (STRING - 84)) | (1L << (DECIMAL_INTEGER - 84)) | (1L << (OCT_INTEGER - 84)) | (1L << (HEX_INTEGER - 84)) | (1L << (BIN_INTEGER - 84)) | (1L << (IMAG_NUMBER - 84)) | (1L << (FLOAT_NUMBER - 84)) | (1L << (OPEN_PAREN - 84)) | (1L << (OPEN_BRACE - 84)) | (1L << (OPEN_BRACKET - 84)) | (1L << (NAME - 84)))) != 0)) {
					{
					setState(452);
					testlist();
					}
				}

				}
				break;
			case 8:
				_localctx = new Raise_stmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(455);
				match(RAISE);
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << LAMBDA) | (1L << NOT) | (1L << AWAIT) | (1L << PRINT) | (1L << EXEC) | (1L << TRUE) | (1L << FALSE) | (1L << ELLIPSIS) | (1L << REVERSE_QUOTE) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (STRING - 84)) | (1L << (DECIMAL_INTEGER - 84)) | (1L << (OCT_INTEGER - 84)) | (1L << (HEX_INTEGER - 84)) | (1L << (BIN_INTEGER - 84)) | (1L << (IMAG_NUMBER - 84)) | (1L << (FLOAT_NUMBER - 84)) | (1L << (OPEN_PAREN - 84)) | (1L << (OPEN_BRACE - 84)) | (1L << (OPEN_BRACKET - 84)) | (1L << (NAME - 84)))) != 0)) {
					{
					setState(456);
					test();
					setState(463);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(457);
						match(COMMA);
						setState(458);
						test();
						setState(461);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(459);
							match(COMMA);
							setState(460);
							test();
							}
						}

						}
					}

					}
				}

				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(467);
					match(FROM);
					setState(468);
					test();
					}
				}

				}
				break;
			case 9:
				_localctx = new Yield_stmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(471);
				yield_expr();
				}
				break;
			case 10:
				_localctx = new Import_stmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(472);
				match(IMPORT);
				setState(473);
				dotted_as_names();
				}
				break;
			case 11:
				_localctx = new From_stmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(474);
				match(FROM);
				setState(487);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(478);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DOT || _la==ELLIPSIS) {
						{
						{
						setState(475);
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
						setState(480);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(481);
					dotted_name(0);
					}
					break;
				case 2:
					{
					setState(483); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(482);
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
						setState(485); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==DOT || _la==ELLIPSIS );
					}
					break;
				}
				setState(489);
				match(IMPORT);
				setState(496);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(490);
					match(STAR);
					}
					break;
				case OPEN_PAREN:
					{
					setState(491);
					match(OPEN_PAREN);
					setState(492);
					import_as_names();
					setState(493);
					match(CLOSE_PAREN);
					}
					break;
				case TRUE:
				case FALSE:
				case NAME:
					{
					setState(495);
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
				setState(498);
				match(GLOBAL);
				setState(499);
				name();
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(500);
					match(COMMA);
					setState(501);
					name();
					}
					}
					setState(506);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 13:
				_localctx = new Exec_stmtContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(507);
				if (!(CheckVersion(2))) throw new FailedPredicateException(this, "CheckVersion(2)");
				setState(508);
				match(EXEC);
				setState(509);
				expr(0);
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(510);
					match(IN);
					setState(511);
					test();
					setState(514);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(512);
						match(COMMA);
						setState(513);
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
				setState(520);
				match(ASSERT);
				setState(521);
				test();
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(522);
					match(COMMA);
					setState(523);
					test();
					}
				}

				}
				break;
			case 15:
				_localctx = new Nonlocal_stmtContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(526);
				if (!(CheckVersion(3))) throw new FailedPredicateException(this, "CheckVersion(3)");
				setState(527);
				match(NONLOCAL);
				setState(528);
				name();
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(529);
					match(COMMA);
					setState(530);
					name();
					}
					}
					setState(535);
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
		enterRule(_localctx, 54, RULE_testlist_star_expr);
		try {
			int _alt;
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(546); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(542);
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
							setState(540);
							test();
							}
							break;
						case STAR:
							{
							setState(541);
							star_expr();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(544);
						match(COMMA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(548); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(552);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(550);
					test();
					}
					break;
				case 2:
					{
					setState(551);
					star_expr();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
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
		enterRule(_localctx, 56, RULE_star_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(STAR);
			setState(558);
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
		enterRule(_localctx, 58, RULE_assign_part);
		int _la;
		try {
			int _alt;
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				match(ASSIGN);
				setState(574);
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
					setState(561);
					testlist_star_expr();
					setState(566);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(562);
							match(ASSIGN);
							setState(563);
							testlist_star_expr();
							}
							} 
						}
						setState(568);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
					}
					setState(571);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(569);
						match(ASSIGN);
						setState(570);
						yield_expr();
						}
					}

					}
					break;
				case YIELD:
					{
					setState(573);
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
				setState(576);
				if (!(CheckVersion(3))) throw new FailedPredicateException(this, "CheckVersion(3)");
				setState(577);
				match(COLON);
				setState(578);
				test();
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(579);
					match(ASSIGN);
					setState(580);
					testlist();
					}
				}

				SetVersion(3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(585);
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
				setState(588);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case YIELD:
					{
					setState(586);
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
					setState(587);
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
		enterRule(_localctx, 60, RULE_exprlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			expr(0);
			setState(597);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(593);
					match(COMMA);
					setState(594);
					expr(0);
					}
					} 
				}
				setState(599);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(600);
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
		enterRule(_localctx, 62, RULE_import_as_names);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			import_as_name();
			setState(608);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(604);
					match(COMMA);
					setState(605);
					import_as_name();
					}
					} 
				}
				setState(610);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(611);
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
		enterRule(_localctx, 64, RULE_import_as_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			name();
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(615);
				match(AS);
				setState(616);
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
		enterRule(_localctx, 66, RULE_dotted_as_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			dotted_as_name();
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(620);
				match(COMMA);
				setState(621);
				dotted_as_name();
				}
				}
				setState(626);
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
		enterRule(_localctx, 68, RULE_dotted_as_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			dotted_name(0);
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(628);
				match(AS);
				setState(629);
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
		enterRule(_localctx, 70, RULE_test);
		int _la;
		try {
			setState(646);
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
				setState(632);
				logical_test(0);
				setState(638);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(633);
					match(IF);
					setState(634);
					logical_test(0);
					setState(635);
					match(ELSE);
					setState(636);
					test();
					}
					break;
				}
				}
				break;
			case LAMBDA:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				match(LAMBDA);
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (TRUE - 39)) | (1L << (FALSE - 39)) | (1L << (STAR - 39)) | (1L << (POWER - 39)) | (1L << (NAME - 39)))) != 0)) {
					{
					setState(641);
					varargslist();
					}
				}

				setState(644);
				match(COLON);
				setState(645);
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
		enterRule(_localctx, 72, RULE_varargslist);
		int _la;
		try {
			setState(672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(651);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(648);
					vardef_parameters();
					setState(649);
					match(COMMA);
					}
					break;
				}
				setState(663);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(653);
					varargs();
					setState(656);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
					case 1:
						{
						setState(654);
						match(COMMA);
						setState(655);
						vardef_parameters();
						}
						break;
					}
					setState(660);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
					case 1:
						{
						setState(658);
						match(COMMA);
						setState(659);
						varkwargs();
						}
						break;
					}
					}
					break;
				case POWER:
					{
					setState(662);
					varkwargs();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(665);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(668);
				vardef_parameters();
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(669);
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
		enterRule(_localctx, 74, RULE_vardef_parameters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			vardef_parameter();
			setState(679);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(675);
					match(COMMA);
					setState(676);
					vardef_parameter();
					}
					} 
				}
				setState(681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
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
		enterRule(_localctx, 76, RULE_vardef_parameter);
		int _la;
		try {
			setState(688);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(682);
				name();
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(683);
					match(ASSIGN);
					setState(684);
					test();
					}
				}

				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(687);
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
		enterRule(_localctx, 78, RULE_varargs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			match(STAR);
			setState(691);
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
		enterRule(_localctx, 80, RULE_varkwargs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(POWER);
			setState(694);
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_logical_test, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
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
				setState(697);
				comparison(0);
				}
				break;
			case NOT:
				{
				setState(698);
				match(NOT);
				setState(699);
				logical_test(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(710);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(708);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
					case 1:
						{
						_localctx = new Logical_testContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logical_test);
						setState(702);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(703);
						((Logical_testContext)_localctx).op = match(AND);
						setState(704);
						logical_test(3);
						}
						break;
					case 2:
						{
						_localctx = new Logical_testContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logical_test);
						setState(705);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(706);
						((Logical_testContext)_localctx).op = match(OR);
						setState(707);
						logical_test(2);
						}
						break;
					}
					} 
				}
				setState(712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
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
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_comparison, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(714);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(737);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ComparisonContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_comparison);
					setState(716);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(732);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LESS_THAN:
						{
						setState(717);
						match(LESS_THAN);
						}
						break;
					case GREATER_THAN:
						{
						setState(718);
						match(GREATER_THAN);
						}
						break;
					case EQUALS:
						{
						setState(719);
						match(EQUALS);
						}
						break;
					case GT_EQ:
						{
						setState(720);
						match(GT_EQ);
						}
						break;
					case LT_EQ:
						{
						setState(721);
						match(LT_EQ);
						}
						break;
					case NOT_EQ_1:
						{
						setState(722);
						match(NOT_EQ_1);
						}
						break;
					case NOT_EQ_2:
						{
						setState(723);
						match(NOT_EQ_2);
						}
						break;
					case IN:
					case NOT:
						{
						setState(725);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(724);
							((ComparisonContext)_localctx).optional = match(NOT);
							}
						}

						setState(727);
						match(IN);
						}
						break;
					case IS:
						{
						setState(728);
						match(IS);
						setState(730);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(729);
							((ComparisonContext)_localctx).optional = match(NOT);
							}
						}

						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(734);
					comparison(3);
					}
					} 
				}
				setState(739);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
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
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AWAIT) {
					{
					setState(741);
					match(AWAIT);
					}
				}

				setState(744);
				atom();
				setState(748);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(745);
						trailer();
						}
						} 
					}
					setState(750);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(751);
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
				setState(752);
				expr(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(778);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(776);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(755);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(756);
						((ExprContext)_localctx).op = match(POWER);
						setState(757);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(758);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(759);
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
						setState(760);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(761);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(762);
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
						setState(763);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(764);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(765);
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
						setState(766);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(767);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(768);
						((ExprContext)_localctx).op = match(AND_OP);
						setState(769);
						expr(4);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(770);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(771);
						((ExprContext)_localctx).op = match(XOR);
						setState(772);
						expr(3);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(773);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(774);
						((ExprContext)_localctx).op = match(OR_OP);
						setState(775);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(780);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
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
		enterRule(_localctx, 88, RULE_atom);
		int _la;
		try {
			int _alt;
			setState(818);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				match(OPEN_PAREN);
				setState(784);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case YIELD:
					{
					setState(782);
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
					setState(783);
					testlist_comp();
					}
					break;
				case CLOSE_PAREN:
					break;
				default:
					break;
				}
				setState(786);
				match(CLOSE_PAREN);
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
				match(OPEN_BRACKET);
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << LAMBDA) | (1L << NOT) | (1L << AWAIT) | (1L << PRINT) | (1L << EXEC) | (1L << TRUE) | (1L << FALSE) | (1L << ELLIPSIS) | (1L << REVERSE_QUOTE) | (1L << STAR) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (STRING - 84)) | (1L << (DECIMAL_INTEGER - 84)) | (1L << (OCT_INTEGER - 84)) | (1L << (HEX_INTEGER - 84)) | (1L << (BIN_INTEGER - 84)) | (1L << (IMAG_NUMBER - 84)) | (1L << (FLOAT_NUMBER - 84)) | (1L << (OPEN_PAREN - 84)) | (1L << (OPEN_BRACE - 84)) | (1L << (OPEN_BRACKET - 84)) | (1L << (NAME - 84)))) != 0)) {
					{
					setState(788);
					testlist_comp();
					}
				}

				setState(791);
				match(CLOSE_BRACKET);
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(792);
				match(OPEN_BRACE);
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << LAMBDA) | (1L << NOT) | (1L << AWAIT) | (1L << PRINT) | (1L << EXEC) | (1L << TRUE) | (1L << FALSE) | (1L << ELLIPSIS) | (1L << REVERSE_QUOTE) | (1L << STAR) | (1L << POWER) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (STRING - 84)) | (1L << (DECIMAL_INTEGER - 84)) | (1L << (OCT_INTEGER - 84)) | (1L << (HEX_INTEGER - 84)) | (1L << (BIN_INTEGER - 84)) | (1L << (IMAG_NUMBER - 84)) | (1L << (FLOAT_NUMBER - 84)) | (1L << (OPEN_PAREN - 84)) | (1L << (OPEN_BRACE - 84)) | (1L << (OPEN_BRACKET - 84)) | (1L << (NAME - 84)))) != 0)) {
					{
					setState(793);
					dictorsetmaker();
					}
				}

				setState(796);
				match(CLOSE_BRACE);
				}
				break;
			case REVERSE_QUOTE:
				enterOuterAlt(_localctx, 4);
				{
				setState(797);
				match(REVERSE_QUOTE);
				setState(798);
				testlist();
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(799);
					match(COMMA);
					}
				}

				setState(802);
				match(REVERSE_QUOTE);
				}
				break;
			case ELLIPSIS:
				enterOuterAlt(_localctx, 5);
				{
				setState(804);
				match(ELLIPSIS);
				}
				break;
			case TRUE:
			case FALSE:
			case NAME:
				enterOuterAlt(_localctx, 6);
				{
				setState(805);
				name();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 7);
				{
				setState(806);
				match(PRINT);
				}
				break;
			case EXEC:
				enterOuterAlt(_localctx, 8);
				{
				setState(807);
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
				setState(809);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(808);
					match(MINUS);
					}
				}

				setState(811);
				number();
				}
				break;
			case NONE:
				enterOuterAlt(_localctx, 10);
				{
				setState(812);
				match(NONE);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 11);
				{
				setState(814); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(813);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(816); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
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
		enterRule(_localctx, 90, RULE_dictorsetmaker);
		int _la;
		try {
			int _alt;
			setState(851);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(826);
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
					setState(820);
					test();
					setState(821);
					match(COLON);
					setState(822);
					test();
					}
					break;
				case POWER:
					{
					setState(824);
					match(POWER);
					setState(825);
					expr(0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(839);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(828);
						match(COMMA);
						setState(835);
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
							setState(829);
							test();
							setState(830);
							match(COLON);
							setState(831);
							test();
							}
							break;
						case POWER:
							{
							setState(833);
							match(POWER);
							setState(834);
							expr(0);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(841);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
				}
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(842);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(845);
				test();
				setState(846);
				match(COLON);
				setState(847);
				test();
				setState(848);
				comp_for();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(850);
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
		enterRule(_localctx, 92, RULE_testlist_comp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
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
				setState(853);
				test();
				}
				break;
			case STAR:
				{
				setState(854);
				star_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(871);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				{
				setState(857);
				comp_for();
				}
				break;
			case COMMA:
			case CLOSE_PAREN:
			case CLOSE_BRACE:
			case CLOSE_BRACKET:
				{
				setState(865);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(858);
						match(COMMA);
						setState(861);
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
							setState(859);
							test();
							}
							break;
						case STAR:
							{
							setState(860);
							star_expr();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(867);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
				}
				setState(869);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(868);
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
		enterRule(_localctx, 94, RULE_testlist);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			test();
			setState(878);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(874);
					match(COMMA);
					setState(875);
					test();
					}
					} 
				}
				setState(880);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
			}
			setState(882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(881);
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
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_dotted_name, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(885);
			name();
			}
			_ctx.stop = _input.LT(-1);
			setState(892);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Dotted_nameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dotted_name);
					setState(887);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(888);
					match(DOT);
					setState(889);
					name();
					}
					} 
				}
				setState(894);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
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
		enterRule(_localctx, 98, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
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
		enterRule(_localctx, 100, RULE_number);
		try {
			setState(900);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(897);
				integer();
				}
				break;
			case IMAG_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(898);
				match(IMAG_NUMBER);
				}
				break;
			case FLOAT_NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(899);
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
		enterRule(_localctx, 102, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
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
		enterRule(_localctx, 104, RULE_yield_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			match(YIELD);
			setState(906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(905);
				yield_arg();
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
		enterRule(_localctx, 106, RULE_yield_arg);
		try {
			setState(911);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				match(FROM);
				setState(909);
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
				setState(910);
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
		enterRule(_localctx, 108, RULE_trailer);
		try {
			setState(919);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(913);
				match(DOT);
				setState(914);
				name();
				setState(916);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(915);
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
				setState(918);
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
		enterRule(_localctx, 110, RULE_arguments);
		int _la;
		try {
			setState(930);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(921);
				match(OPEN_PAREN);
				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << LAMBDA) | (1L << NOT) | (1L << AWAIT) | (1L << PRINT) | (1L << EXEC) | (1L << TRUE) | (1L << FALSE) | (1L << ELLIPSIS) | (1L << REVERSE_QUOTE) | (1L << STAR) | (1L << POWER) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (STRING - 84)) | (1L << (DECIMAL_INTEGER - 84)) | (1L << (OCT_INTEGER - 84)) | (1L << (HEX_INTEGER - 84)) | (1L << (BIN_INTEGER - 84)) | (1L << (IMAG_NUMBER - 84)) | (1L << (FLOAT_NUMBER - 84)) | (1L << (OPEN_PAREN - 84)) | (1L << (OPEN_BRACE - 84)) | (1L << (OPEN_BRACKET - 84)) | (1L << (NAME - 84)))) != 0)) {
					{
					setState(922);
					arglist();
					}
				}

				setState(925);
				match(CLOSE_PAREN);
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(926);
				match(OPEN_BRACKET);
				setState(927);
				subscriptlist();
				setState(928);
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
		enterRule(_localctx, 112, RULE_arglist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			argument();
			setState(937);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(933);
					match(COMMA);
					setState(934);
					argument();
					}
					} 
				}
				setState(939);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			}
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(940);
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
		enterRule(_localctx, 114, RULE_argument);
		int _la;
		try {
			setState(951);
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
				setState(943);
				test();
				setState(947);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FOR:
					{
					setState(944);
					comp_for();
					}
					break;
				case ASSIGN:
					{
					setState(945);
					match(ASSIGN);
					setState(946);
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
				setState(949);
				_la = _input.LA(1);
				if ( !(_la==STAR || _la==POWER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(950);
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
		enterRule(_localctx, 116, RULE_subscriptlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			subscript();
			setState(958);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(954);
					match(COMMA);
					setState(955);
					subscript();
					}
					} 
				}
				setState(960);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			}
			setState(962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(961);
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
		enterRule(_localctx, 118, RULE_subscript);
		int _la;
		try {
			setState(982);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(964);
				match(ELLIPSIS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(965);
				test();
				setState(973);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(966);
					match(COLON);
					setState(968);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << LAMBDA) | (1L << NOT) | (1L << AWAIT) | (1L << PRINT) | (1L << EXEC) | (1L << TRUE) | (1L << FALSE) | (1L << ELLIPSIS) | (1L << REVERSE_QUOTE) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (STRING - 84)) | (1L << (DECIMAL_INTEGER - 84)) | (1L << (OCT_INTEGER - 84)) | (1L << (HEX_INTEGER - 84)) | (1L << (BIN_INTEGER - 84)) | (1L << (IMAG_NUMBER - 84)) | (1L << (FLOAT_NUMBER - 84)) | (1L << (OPEN_PAREN - 84)) | (1L << (OPEN_BRACE - 84)) | (1L << (OPEN_BRACKET - 84)) | (1L << (NAME - 84)))) != 0)) {
						{
						setState(967);
						test();
						}
					}

					setState(971);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COLON) {
						{
						setState(970);
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
				setState(975);
				match(COLON);
				setState(977);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << LAMBDA) | (1L << NOT) | (1L << AWAIT) | (1L << PRINT) | (1L << EXEC) | (1L << TRUE) | (1L << FALSE) | (1L << ELLIPSIS) | (1L << REVERSE_QUOTE) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (STRING - 84)) | (1L << (DECIMAL_INTEGER - 84)) | (1L << (OCT_INTEGER - 84)) | (1L << (HEX_INTEGER - 84)) | (1L << (BIN_INTEGER - 84)) | (1L << (IMAG_NUMBER - 84)) | (1L << (FLOAT_NUMBER - 84)) | (1L << (OPEN_PAREN - 84)) | (1L << (OPEN_BRACE - 84)) | (1L << (OPEN_BRACKET - 84)) | (1L << (NAME - 84)))) != 0)) {
					{
					setState(976);
					test();
					}
				}

				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(979);
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
		enterRule(_localctx, 120, RULE_sliceop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
			match(COLON);
			setState(986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << LAMBDA) | (1L << NOT) | (1L << AWAIT) | (1L << PRINT) | (1L << EXEC) | (1L << TRUE) | (1L << FALSE) | (1L << ELLIPSIS) | (1L << REVERSE_QUOTE) | (1L << ADD) | (1L << MINUS) | (1L << NOT_OP))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (STRING - 84)) | (1L << (DECIMAL_INTEGER - 84)) | (1L << (OCT_INTEGER - 84)) | (1L << (HEX_INTEGER - 84)) | (1L << (BIN_INTEGER - 84)) | (1L << (IMAG_NUMBER - 84)) | (1L << (FLOAT_NUMBER - 84)) | (1L << (OPEN_PAREN - 84)) | (1L << (OPEN_BRACE - 84)) | (1L << (OPEN_BRACKET - 84)) | (1L << (NAME - 84)))) != 0)) {
				{
				setState(985);
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
		enterRule(_localctx, 122, RULE_comp_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			match(FOR);
			setState(989);
			exprlist();
			setState(990);
			match(IN);
			setState(991);
			logical_test(0);
			setState(993);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF || _la==FOR) {
				{
				setState(992);
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
		enterRule(_localctx, 124, RULE_comp_iter);
		int _la;
		try {
			setState(1001);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(995);
				comp_for();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(996);
				match(IF);
				setState(997);
				test();
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF || _la==FOR) {
					{
					setState(998);
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
		case 16:
			return except_clause_sempred((Except_clauseContext)_localctx, predIndex);
		case 26:
			return small_stmt_sempred((Small_stmtContext)_localctx, predIndex);
		case 29:
			return assign_part_sempred((Assign_partContext)_localctx, predIndex);
		case 41:
			return logical_test_sempred((Logical_testContext)_localctx, predIndex);
		case 42:
			return comparison_sempred((ComparisonContext)_localctx, predIndex);
		case 43:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 48:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3g\u03ee\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\5\2\u0084\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\5\3\u008d\n\3\3\4\3\4\6\4\u0091\n\4\r\4\16\4\u0092\3\5\3\5\7\5\u0097"+
		"\n\5\f\5\16\5\u009a\13\5\3\6\3\6\3\6\5\6\u009f\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\7\7\u00a6\n\7\f\7\16\7\u00a9\13\7\3\7\5\7\u00ac\n\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u00b3\n\7\3\7\5\7\u00b6\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00bf"+
		"\n\7\3\7\3\7\3\7\3\7\6\7\u00c5\n\7\r\7\16\7\u00c6\3\7\5\7\u00ca\n\7\3"+
		"\7\5\7\u00cd\n\7\3\7\5\7\u00d0\n\7\3\7\5\7\u00d3\n\7\3\7\3\7\3\7\3\7\7"+
		"\7\u00d9\n\7\f\7\16\7\u00dc\13\7\3\7\3\7\3\7\3\7\7\7\u00e2\n\7\f\7\16"+
		"\7\u00e5\13\7\3\7\3\7\5\7\u00e9\n\7\5\7\u00eb\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u00f2\n\b\3\t\3\t\3\t\3\t\5\t\u00f8\n\t\3\n\3\n\3\13\3\13\3\13\6"+
		"\13\u00ff\n\13\r\13\16\13\u0100\3\13\3\13\3\13\3\f\3\f\3\f\3\f\6\f\u010a"+
		"\n\f\r\f\16\f\u010b\3\f\3\f\5\f\u0110\n\f\3\r\3\r\3\r\3\r\5\r\u0116\n"+
		"\r\3\r\5\r\u0119\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u012d\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u013b\n\22\5\22\u013d"+
		"\n\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u0146\n\23\3\23\5\23\u0149"+
		"\n\23\3\23\3\23\3\23\3\24\5\24\u014f\n\24\3\24\3\24\3\24\3\24\5\24\u0155"+
		"\n\24\3\24\3\24\3\24\5\24\u015a\n\24\3\24\3\24\3\24\3\25\3\25\3\25\5\25"+
		"\u0162\n\25\3\25\3\25\3\25\5\25\u0167\n\25\3\25\3\25\5\25\u016b\n\25\3"+
		"\25\5\25\u016e\n\25\3\25\5\25\u0171\n\25\3\25\3\25\5\25\u0175\n\25\5\25"+
		"\u0177\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u0182\n"+
		"\30\f\30\16\30\u0185\13\30\3\31\3\31\3\31\5\31\u018a\n\31\3\31\5\31\u018d"+
		"\n\31\3\32\3\32\3\32\5\32\u0192\n\32\3\33\3\33\3\33\7\33\u0197\n\33\f"+
		"\33\16\33\u019a\13\33\3\33\5\33\u019d\n\33\3\33\3\33\3\34\3\34\5\34\u01a3"+
		"\n\34\3\34\3\34\3\34\3\34\3\34\7\34\u01aa\n\34\f\34\16\34\u01ad\13\34"+
		"\3\34\5\34\u01b0\n\34\3\34\3\34\3\34\3\34\6\34\u01b6\n\34\r\34\16\34\u01b7"+
		"\3\34\5\34\u01bb\n\34\5\34\u01bd\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\5\34\u01c8\n\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01d0"+
		"\n\34\5\34\u01d2\n\34\5\34\u01d4\n\34\3\34\3\34\5\34\u01d8\n\34\3\34\3"+
		"\34\3\34\3\34\3\34\7\34\u01df\n\34\f\34\16\34\u01e2\13\34\3\34\3\34\6"+
		"\34\u01e6\n\34\r\34\16\34\u01e7\5\34\u01ea\n\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\5\34\u01f3\n\34\3\34\3\34\3\34\3\34\7\34\u01f9\n\34\f\34"+
		"\16\34\u01fc\13\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0205\n\34"+
		"\5\34\u0207\n\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u020f\n\34\3\34\3"+
		"\34\3\34\3\34\3\34\7\34\u0216\n\34\f\34\16\34\u0219\13\34\3\34\3\34\5"+
		"\34\u021d\n\34\3\35\3\35\5\35\u0221\n\35\3\35\3\35\6\35\u0225\n\35\r\35"+
		"\16\35\u0226\3\35\3\35\5\35\u022b\n\35\3\35\5\35\u022e\n\35\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\7\37\u0237\n\37\f\37\16\37\u023a\13\37\3\37"+
		"\3\37\5\37\u023e\n\37\3\37\5\37\u0241\n\37\3\37\3\37\3\37\3\37\3\37\5"+
		"\37\u0248\n\37\3\37\3\37\3\37\3\37\3\37\5\37\u024f\n\37\5\37\u0251\n\37"+
		"\3 \3 \3 \7 \u0256\n \f \16 \u0259\13 \3 \5 \u025c\n \3!\3!\3!\7!\u0261"+
		"\n!\f!\16!\u0264\13!\3!\5!\u0267\n!\3\"\3\"\3\"\5\"\u026c\n\"\3#\3#\3"+
		"#\7#\u0271\n#\f#\16#\u0274\13#\3$\3$\3$\5$\u0279\n$\3%\3%\3%\3%\3%\3%"+
		"\5%\u0281\n%\3%\3%\5%\u0285\n%\3%\3%\5%\u0289\n%\3&\3&\3&\5&\u028e\n&"+
		"\3&\3&\3&\5&\u0293\n&\3&\3&\5&\u0297\n&\3&\5&\u029a\n&\3&\5&\u029d\n&"+
		"\3&\3&\5&\u02a1\n&\5&\u02a3\n&\3\'\3\'\3\'\7\'\u02a8\n\'\f\'\16\'\u02ab"+
		"\13\'\3(\3(\3(\5(\u02b0\n(\3(\5(\u02b3\n(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3"+
		"+\5+\u02bf\n+\3+\3+\3+\3+\3+\3+\7+\u02c7\n+\f+\16+\u02ca\13+\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u02d8\n,\3,\3,\3,\5,\u02dd\n,\5,\u02df"+
		"\n,\3,\7,\u02e2\n,\f,\16,\u02e5\13,\3-\3-\5-\u02e9\n-\3-\3-\7-\u02ed\n"+
		"-\f-\16-\u02f0\13-\3-\3-\5-\u02f4\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u030b\n-\f-\16-\u030e\13-\3.\3.\3.\5"+
		".\u0313\n.\3.\3.\3.\5.\u0318\n.\3.\3.\3.\5.\u031d\n.\3.\3.\3.\3.\5.\u0323"+
		"\n.\3.\3.\3.\3.\3.\3.\3.\5.\u032c\n.\3.\3.\3.\6.\u0331\n.\r.\16.\u0332"+
		"\5.\u0335\n.\3/\3/\3/\3/\3/\3/\5/\u033d\n/\3/\3/\3/\3/\3/\3/\3/\5/\u0346"+
		"\n/\7/\u0348\n/\f/\16/\u034b\13/\3/\5/\u034e\n/\3/\3/\3/\3/\3/\3/\5/\u0356"+
		"\n/\3\60\3\60\5\60\u035a\n\60\3\60\3\60\3\60\3\60\5\60\u0360\n\60\7\60"+
		"\u0362\n\60\f\60\16\60\u0365\13\60\3\60\5\60\u0368\n\60\5\60\u036a\n\60"+
		"\3\61\3\61\3\61\7\61\u036f\n\61\f\61\16\61\u0372\13\61\3\61\5\61\u0375"+
		"\n\61\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u037d\n\62\f\62\16\62\u0380\13"+
		"\62\3\63\3\63\3\64\3\64\3\64\5\64\u0387\n\64\3\65\3\65\3\66\3\66\5\66"+
		"\u038d\n\66\3\67\3\67\3\67\5\67\u0392\n\67\38\38\38\58\u0397\n8\38\58"+
		"\u039a\n8\39\39\59\u039e\n9\39\39\39\39\39\59\u03a5\n9\3:\3:\3:\7:\u03aa"+
		"\n:\f:\16:\u03ad\13:\3:\5:\u03b0\n:\3;\3;\3;\3;\5;\u03b6\n;\3;\3;\5;\u03ba"+
		"\n;\3<\3<\3<\7<\u03bf\n<\f<\16<\u03c2\13<\3<\5<\u03c5\n<\3=\3=\3=\3=\5"+
		"=\u03cb\n=\3=\5=\u03ce\n=\5=\u03d0\n=\3=\3=\5=\u03d4\n=\3=\5=\u03d7\n"+
		"=\5=\u03d9\n=\3>\3>\5>\u03dd\n>\3?\3?\3?\3?\3?\5?\u03e4\n?\3@\3@\3@\3"+
		"@\5@\u03ea\n@\5@\u03ec\n@\3@\2\6TVXbA\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\2\f\3"+
		"\2IU\3\3\5\5\3\2,-\4\2:;??\5\2//<>GG\3\2:;\3\289\4\2)*cc\3\2WZ\4\2//\63"+
		"\63\2\u047b\2\u0083\3\2\2\2\4\u008c\3\2\2\2\6\u0090\3\2\2\2\b\u0094\3"+
		"\2\2\2\n\u009e\3\2\2\2\f\u00ea\3\2\2\2\16\u00f1\3\2\2\2\20\u00f3\3\2\2"+
		"\2\22\u00f9\3\2\2\2\24\u00fb\3\2\2\2\26\u010f\3\2\2\2\30\u0111\3\2\2\2"+
		"\32\u011c\3\2\2\2\34\u0121\3\2\2\2\36\u0125\3\2\2\2 \u0129\3\2\2\2\"\u012e"+
		"\3\2\2\2$\u0141\3\2\2\2&\u014e\3\2\2\2(\u0176\3\2\2\2*\u0178\3\2\2\2,"+
		"\u017b\3\2\2\2.\u017e\3\2\2\2\60\u018c\3\2\2\2\62\u018e\3\2\2\2\64\u0193"+
		"\3\2\2\2\66\u021c\3\2\2\28\u022d\3\2\2\2:\u022f\3\2\2\2<\u0250\3\2\2\2"+
		">\u0252\3\2\2\2@\u025d\3\2\2\2B\u0268\3\2\2\2D\u026d\3\2\2\2F\u0275\3"+
		"\2\2\2H\u0288\3\2\2\2J\u02a2\3\2\2\2L\u02a4\3\2\2\2N\u02b2\3\2\2\2P\u02b4"+
		"\3\2\2\2R\u02b7\3\2\2\2T\u02be\3\2\2\2V\u02cb\3\2\2\2X\u02f3\3\2\2\2Z"+
		"\u0334\3\2\2\2\\\u0355\3\2\2\2^\u0359\3\2\2\2`\u036b\3\2\2\2b\u0376\3"+
		"\2\2\2d\u0381\3\2\2\2f\u0386\3\2\2\2h\u0388\3\2\2\2j\u038a\3\2\2\2l\u0391"+
		"\3\2\2\2n\u0399\3\2\2\2p\u03a4\3\2\2\2r\u03a6\3\2\2\2t\u03b9\3\2\2\2v"+
		"\u03bb\3\2\2\2x\u03d8\3\2\2\2z\u03da\3\2\2\2|\u03de\3\2\2\2~\u03eb\3\2"+
		"\2\2\u0080\u0084\5\4\3\2\u0081\u0084\5\6\4\2\u0082\u0084\5\b\5\2\u0083"+
		"\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7\2\2\3\u0086\3\3\2\2\2\u0087\u008d"+
		"\7\5\2\2\u0088\u008d\5\64\33\2\u0089\u008a\5\f\7\2\u008a\u008b\7\5\2\2"+
		"\u008b\u008d\3\2\2\2\u008c\u0087\3\2\2\2\u008c\u0088\3\2\2\2\u008c\u0089"+
		"\3\2\2\2\u008d\5\3\2\2\2\u008e\u0091\7\5\2\2\u008f\u0091\5\n\6\2\u0090"+
		"\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\7\3\2\2\2\u0094\u0098\5`\61\2\u0095\u0097"+
		"\7\5\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\t\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009f\5\64\33"+
		"\2\u009c\u009f\5\f\7\2\u009d\u009f\5\16\b\2\u009e\u009b\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\13\3\2\2\2\u00a0\u00a1\7\17\2"+
		"\2\u00a1\u00a2\5H%\2\u00a2\u00a3\7\61\2\2\u00a3\u00a7\5\26\f\2\u00a4\u00a6"+
		"\5\32\16\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2"+
		"\u00a7\u00a8\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ac"+
		"\5\34\17\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00eb\3\2\2\2"+
		"\u00ad\u00ae\7\22\2\2\u00ae\u00af\5H%\2\u00af\u00b0\7\61\2\2\u00b0\u00b2"+
		"\5\26\f\2\u00b1\u00b3\5\34\17\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2"+
		"\2\u00b3\u00eb\3\2\2\2\u00b4\u00b6\7%\2\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7\23\2\2\u00b8\u00b9\5> \2\u00b9"+
		"\u00ba\7\24\2\2\u00ba\u00bb\5`\61\2\u00bb\u00bc\7\61\2\2\u00bc\u00be\5"+
		"\26\f\2\u00bd\u00bf\5\34\17\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2"+
		"\u00bf\u00eb\3\2\2\2\u00c0\u00c1\7\25\2\2\u00c1\u00c2\7\61\2\2\u00c2\u00cf"+
		"\5\26\f\2\u00c3\u00c5\5\"\22\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2"+
		"\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00ca"+
		"\5\34\17\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2"+
		"\u00cb\u00cd\5\36\20\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d0"+
		"\3\2\2\2\u00ce\u00d0\5\36\20\2\u00cf\u00c4\3\2\2\2\u00cf\u00ce\3\2\2\2"+
		"\u00d0\u00eb\3\2\2\2\u00d1\u00d3\7%\2\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\7\30\2\2\u00d5\u00da\5 \21\2"+
		"\u00d6\u00d7\7\60\2\2\u00d7\u00d9\5 \21\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00de\7\61\2\2\u00de\u00df\5\26\f\2\u00df\u00eb\3"+
		"\2\2\2\u00e0\u00e2\5\30\r\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e8\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e6\u00e9\5$\23\2\u00e7\u00e9\5&\24\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e7\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00a0\3\2\2\2\u00ea\u00ad\3\2"+
		"\2\2\u00ea\u00b5\3\2\2\2\u00ea\u00c0\3\2\2\2\u00ea\u00d2\3\2\2\2\u00ea"+
		"\u00e3\3\2\2\2\u00eb\r\3\2\2\2\u00ec\u00ed\7+\2\2\u00ed\u00f2\5\20\t\2"+
		"\u00ee\u00ef\7+\2\2\u00ef\u00f0\7\61\2\2\u00f0\u00f2\5\24\13\2\u00f1\u00ec"+
		"\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f2\17\3\2\2\2\u00f3\u00f4\58\35\2\u00f4"+
		"\u00f7\5\22\n\2\u00f5\u00f8\5j\66\2\u00f6\u00f8\5`\61\2\u00f7\u00f5\3"+
		"\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\21\3\2\2\2\u00f9\u00fa\t\2\2\2\u00fa"+
		"\23\3\2\2\2\u00fb\u00fc\7\5\2\2\u00fc\u00fe\7\3\2\2\u00fd\u00ff\5\20\t"+
		"\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\7\4\2\2\u0103\u0104\7\26\2\2"+
		"\u0104\25\3\2\2\2\u0105\u0110\5\64\33\2\u0106\u0107\7\5\2\2\u0107\u0109"+
		"\7\3\2\2\u0108\u010a\5\n\6\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\7\4"+
		"\2\2\u010e\u0110\3\2\2\2\u010f\u0105\3\2\2\2\u010f\u0106\3\2\2\2\u0110"+
		"\27\3\2\2\2\u0111\u0112\7G\2\2\u0112\u0118\5b\62\2\u0113\u0115\7]\2\2"+
		"\u0114\u0116\5r:\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117\u0119\7^\2\2\u0118\u0113\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011b\7\5\2\2\u011b\31\3\2\2\2\u011c\u011d\7\20\2"+
		"\2\u011d\u011e\5H%\2\u011e\u011f\7\61\2\2\u011f\u0120\5\26\f\2\u0120\33"+
		"\3\2\2\2\u0121\u0122\7\21\2\2\u0122\u0123\7\61\2\2\u0123\u0124\5\26\f"+
		"\2\u0124\35\3\2\2\2\u0125\u0126\7\27\2\2\u0126\u0127\7\61\2\2\u0127\u0128"+
		"\5\26\f\2\u0128\37\3\2\2\2\u0129\u012c\5H%\2\u012a\u012b\7\f\2\2\u012b"+
		"\u012d\5X-\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d!\3\2\2\2\u012e"+
		"\u013c\7\31\2\2\u012f\u013a\5H%\2\u0130\u0131\6\22\2\2\u0131\u0132\7\60"+
		"\2\2\u0132\u0133\5d\63\2\u0133\u0134\b\22\1\2\u0134\u013b\3\2\2\2\u0135"+
		"\u0136\6\22\3\2\u0136\u0137\7\f\2\2\u0137\u0138\5d\63\2\u0138\u0139\b"+
		"\22\1\2\u0139\u013b\3\2\2\2\u013a\u0130\3\2\2\2\u013a\u0135\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u012f\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d\u013e\3\2\2\2\u013e\u013f\7\61\2\2\u013f\u0140\5\26\f\2\u0140"+
		"#\3\2\2\2\u0141\u0142\7\37\2\2\u0142\u0148\5d\63\2\u0143\u0145\7]\2\2"+
		"\u0144\u0146\5r:\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147"+
		"\3\2\2\2\u0147\u0149\7^\2\2\u0148\u0143\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u014b\7\61\2\2\u014b\u014c\5\26\f\2\u014c%\3\2\2"+
		"\2\u014d\u014f\7%\2\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\u0151\7\6\2\2\u0151\u0152\5d\63\2\u0152\u0154\7]\2\2\u0153"+
		"\u0155\5(\25\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2"+
		"\2\2\u0156\u0159\7^\2\2\u0157\u0158\7H\2\2\u0158\u015a\5H%\2\u0159\u0157"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\7\61\2\2"+
		"\u015c\u015d\5\26\f\2\u015d\'\3\2\2\2\u015e\u015f\5.\30\2\u015f\u0160"+
		"\7\60\2\2\u0160\u0162\3\2\2\2\u0161\u015e\3\2\2\2\u0161\u0162\3\2\2\2"+
		"\u0162\u016d\3\2\2\2\u0163\u0166\5*\26\2\u0164\u0165\7\60\2\2\u0165\u0167"+
		"\5.\30\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u016a\3\2\2\2\u0168"+
		"\u0169\7\60\2\2\u0169\u016b\5,\27\2\u016a\u0168\3\2\2\2\u016a\u016b\3"+
		"\2\2\2\u016b\u016e\3\2\2\2\u016c\u016e\5,\27\2\u016d\u0163\3\2\2\2\u016d"+
		"\u016c\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u0171\7\60\2\2\u0170\u016f\3"+
		"\2\2\2\u0170\u0171\3\2\2\2\u0171\u0177\3\2\2\2\u0172\u0174\5.\30\2\u0173"+
		"\u0175\7\60\2\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3"+
		"\2\2\2\u0176\u0161\3\2\2\2\u0176\u0172\3\2\2\2\u0177)\3\2\2\2\u0178\u0179"+
		"\7/\2\2\u0179\u017a\5\62\32\2\u017a+\3\2\2\2\u017b\u017c\7\63\2\2\u017c"+
		"\u017d\5\62\32\2\u017d-\3\2\2\2\u017e\u0183\5\60\31\2\u017f\u0180\7\60"+
		"\2\2\u0180\u0182\5\60\31\2\u0181\u017f\3\2\2\2\u0182\u0185\3\2\2\2\u0183"+
		"\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184/\3\2\2\2\u0185\u0183\3\2\2\2"+
		"\u0186\u0189\5\62\32\2\u0187\u0188\7\64\2\2\u0188\u018a\5H%\2\u0189\u0187"+
		"\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u018d\7/\2\2\u018c"+
		"\u0186\3\2\2\2\u018c\u018b\3\2\2\2\u018d\61\3\2\2\2\u018e\u0191\5d\63"+
		"\2\u018f\u0190\7\61\2\2\u0190\u0192\5H%\2\u0191\u018f\3\2\2\2\u0191\u0192"+
		"\3\2\2\2\u0192\63\3\2\2\2\u0193\u0198\5\66\34\2\u0194\u0195\7\62\2\2\u0195"+
		"\u0197\5\66\34\2\u0196\u0194\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3"+
		"\2\2\2\u0198\u0199\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019b"+
		"\u019d\7\62\2\2\u019c\u019b\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3"+
		"\2\2\2\u019e\u019f\t\3\2\2\u019f\65\3\2\2\2\u01a0\u01a2\58\35\2\u01a1"+
		"\u01a3\5<\37\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u021d\3\2"+
		"\2\2\u01a4\u01a5\6\34\4\2\u01a5\u01bc\7\'\2\2\u01a6\u01ab\5H%\2\u01a7"+
		"\u01a8\7\60\2\2\u01a8\u01aa\5H%\2\u01a9\u01a7\3\2\2\2\u01aa\u01ad\3\2"+
		"\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad"+
		"\u01ab\3\2\2\2\u01ae\u01b0\7\60\2\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3"+
		"\2\2\2\u01b0\u01bd\3\2\2\2\u01b1\u01b2\79\2\2\u01b2\u01b5\5H%\2\u01b3"+
		"\u01b4\7\60\2\2\u01b4\u01b6\5H%\2\u01b5\u01b3\3\2\2\2\u01b6\u01b7\3\2"+
		"\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\3\2\2\2\u01b9"+
		"\u01bb\7\60\2\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3"+
		"\2\2\2\u01bc\u01a6\3\2\2\2\u01bc\u01b1\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"\u01bf\b\34\1\2\u01bf\u021d\3\2\2\2\u01c0\u01c1\7!\2\2\u01c1\u021d\5>"+
		" \2\u01c2\u021d\7\"\2\2\u01c3\u021d\7$\2\2\u01c4\u021d\7#\2\2\u01c5\u01c7"+
		"\7\7\2\2\u01c6\u01c8\5`\61\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u021d\3\2\2\2\u01c9\u01d3\7\b\2\2\u01ca\u01d1\5H%\2\u01cb\u01cc\7\60"+
		"\2\2\u01cc\u01cf\5H%\2\u01cd\u01ce\7\60\2\2\u01ce\u01d0\5H%\2\u01cf\u01cd"+
		"\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01cb\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01ca\3\2\2\2\u01d3\u01d4\3\2"+
		"\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d6\7\t\2\2\u01d6\u01d8\5H%\2\u01d7\u01d5"+
		"\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u021d\3\2\2\2\u01d9\u021d\5j\66\2\u01da"+
		"\u01db\7\n\2\2\u01db\u021d\5D#\2\u01dc\u01e9\7\t\2\2\u01dd\u01df\t\4\2"+
		"\2\u01de\u01dd\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1"+
		"\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01ea\5b\62\2\u01e4"+
		"\u01e6\t\4\2\2\u01e5\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e5\3\2"+
		"\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01e0\3\2\2\2\u01e9"+
		"\u01e5\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01f2\7\n\2\2\u01ec\u01f3\7/"+
		"\2\2\u01ed\u01ee\7]\2\2\u01ee\u01ef\5@!\2\u01ef\u01f0\7^\2\2\u01f0\u01f3"+
		"\3\2\2\2\u01f1\u01f3\5@!\2\u01f2\u01ec\3\2\2\2\u01f2\u01ed\3\2\2\2\u01f2"+
		"\u01f1\3\2\2\2\u01f3\u021d\3\2\2\2\u01f4\u01f5\7\r\2\2\u01f5\u01fa\5d"+
		"\63\2\u01f6\u01f7\7\60\2\2\u01f7\u01f9\5d\63\2\u01f8\u01f6\3\2\2\2\u01f9"+
		"\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u021d\3\2"+
		"\2\2\u01fc\u01fa\3\2\2\2\u01fd\u01fe\6\34\5\2\u01fe\u01ff\7(\2\2\u01ff"+
		"\u0206\5X-\2\u0200\u0201\7\24\2\2\u0201\u0204\5H%\2\u0202\u0203\7\60\2"+
		"\2\u0203\u0205\5H%\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0207"+
		"\3\2\2\2\u0206\u0200\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\3\2\2\2\u0208"+
		"\u0209\b\34\1\2\u0209\u021d\3\2\2\2\u020a\u020b\7\16\2\2\u020b\u020e\5"+
		"H%\2\u020c\u020d\7\60\2\2\u020d\u020f\5H%\2\u020e\u020c\3\2\2\2\u020e"+
		"\u020f\3\2\2\2\u020f\u021d\3\2\2\2\u0210\u0211\6\34\6\2\u0211\u0212\7"+
		"\13\2\2\u0212\u0217\5d\63\2\u0213\u0214\7\60\2\2\u0214\u0216\5d\63\2\u0215"+
		"\u0213\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2"+
		"\2\2\u0218\u021a\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021b\b\34\1\2\u021b"+
		"\u021d\3\2\2\2\u021c\u01a0\3\2\2\2\u021c\u01a4\3\2\2\2\u021c\u01c0\3\2"+
		"\2\2\u021c\u01c2\3\2\2\2\u021c\u01c3\3\2\2\2\u021c\u01c4\3\2\2\2\u021c"+
		"\u01c5\3\2\2\2\u021c\u01c9\3\2\2\2\u021c\u01d9\3\2\2\2\u021c\u01da\3\2"+
		"\2\2\u021c\u01dc\3\2\2\2\u021c\u01f4\3\2\2\2\u021c\u01fd\3\2\2\2\u021c"+
		"\u020a\3\2\2\2\u021c\u0210\3\2\2\2\u021d\67\3\2\2\2\u021e\u0221\5H%\2"+
		"\u021f\u0221\5:\36\2\u0220\u021e\3\2\2\2\u0220\u021f\3\2\2\2\u0221\u0222"+
		"\3\2\2\2\u0222\u0223\7\60\2\2\u0223\u0225\3\2\2\2\u0224\u0220\3\2\2\2"+
		"\u0225\u0226\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u022a"+
		"\3\2\2\2\u0228\u022b\5H%\2\u0229\u022b\5:\36\2\u022a\u0228\3\2\2\2\u022a"+
		"\u0229\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022e\5`"+
		"\61\2\u022d\u0224\3\2\2\2\u022d\u022c\3\2\2\2\u022e9\3\2\2\2\u022f\u0230"+
		"\7/\2\2\u0230\u0231\5X-\2\u0231;\3\2\2\2\u0232\u0240\7\64\2\2\u0233\u0238"+
		"\58\35\2\u0234\u0235\7\64\2\2\u0235\u0237\58\35\2\u0236\u0234\3\2\2\2"+
		"\u0237\u023a\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023d"+
		"\3\2\2\2\u023a\u0238\3\2\2\2\u023b\u023c\7\64\2\2\u023c\u023e\5j\66\2"+
		"\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0241\3\2\2\2\u023f\u0241"+
		"\5j\66\2\u0240\u0233\3\2\2\2\u0240\u023f\3\2\2\2\u0241\u0251\3\2\2\2\u0242"+
		"\u0243\6\37\7\2\u0243\u0244\7\61\2\2\u0244\u0247\5H%\2\u0245\u0246\7\64"+
		"\2\2\u0246\u0248\5`\61\2\u0247\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248"+
		"\u0249\3\2\2\2\u0249\u024a\b\37\1\2\u024a\u0251\3\2\2\2\u024b\u024e\t"+
		"\2\2\2\u024c\u024f\5j\66\2\u024d\u024f\5`\61\2\u024e\u024c\3\2\2\2\u024e"+
		"\u024d\3\2\2\2\u024f\u0251\3\2\2\2\u0250\u0232\3\2\2\2\u0250\u0242\3\2"+
		"\2\2\u0250\u024b\3\2\2\2\u0251=\3\2\2\2\u0252\u0257\5X-\2\u0253\u0254"+
		"\7\60\2\2\u0254\u0256\5X-\2\u0255\u0253\3\2\2\2\u0256\u0259\3\2\2\2\u0257"+
		"\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2"+
		"\2\2\u025a\u025c\7\60\2\2\u025b\u025a\3\2\2\2\u025b\u025c\3\2\2\2\u025c"+
		"?\3\2\2\2\u025d\u0262\5B\"\2\u025e\u025f\7\60\2\2\u025f\u0261\5B\"\2\u0260"+
		"\u025e\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260\3\2\2\2\u0262\u0263\3\2"+
		"\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0265\u0267\7\60\2\2\u0266"+
		"\u0265\3\2\2\2\u0266\u0267\3\2\2\2\u0267A\3\2\2\2\u0268\u026b\5d\63\2"+
		"\u0269\u026a\7\f\2\2\u026a\u026c\5d\63\2\u026b\u0269\3\2\2\2\u026b\u026c"+
		"\3\2\2\2\u026cC\3\2\2\2\u026d\u0272\5F$\2\u026e\u026f\7\60\2\2\u026f\u0271"+
		"\5F$\2\u0270\u026e\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272"+
		"\u0273\3\2\2\2\u0273E\3\2\2\2\u0274\u0272\3\2\2\2\u0275\u0278\5b\62\2"+
		"\u0276\u0277\7\f\2\2\u0277\u0279\5d\63\2\u0278\u0276\3\2\2\2\u0278\u0279"+
		"\3\2\2\2\u0279G\3\2\2\2\u027a\u0280\5T+\2\u027b\u027c\7\17\2\2\u027c\u027d"+
		"\5T+\2\u027d\u027e\7\21\2\2\u027e\u027f\5H%\2\u027f\u0281\3\2\2\2\u0280"+
		"\u027b\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0289\3\2\2\2\u0282\u0284\7\32"+
		"\2\2\u0283\u0285\5J&\2\u0284\u0283\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286"+
		"\3\2\2\2\u0286\u0287\7\61\2\2\u0287\u0289\5H%\2\u0288\u027a\3\2\2\2\u0288"+
		"\u0282\3\2\2\2\u0289I\3\2\2\2\u028a\u028b\5L\'\2\u028b\u028c\7\60\2\2"+
		"\u028c\u028e\3\2\2\2\u028d\u028a\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0299"+
		"\3\2\2\2\u028f\u0292\5P)\2\u0290\u0291\7\60\2\2\u0291\u0293\5L\'\2\u0292"+
		"\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0296\3\2\2\2\u0294\u0295\7\60"+
		"\2\2\u0295\u0297\5R*\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u029a"+
		"\3\2\2\2\u0298\u029a\5R*\2\u0299\u028f\3\2\2\2\u0299\u0298\3\2\2\2\u029a"+
		"\u029c\3\2\2\2\u029b\u029d\7\60\2\2\u029c\u029b\3\2\2\2\u029c\u029d\3"+
		"\2\2\2\u029d\u02a3\3\2\2\2\u029e\u02a0\5L\'\2\u029f\u02a1\7\60\2\2\u02a0"+
		"\u029f\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a3\3\2\2\2\u02a2\u028d\3\2"+
		"\2\2\u02a2\u029e\3\2\2\2\u02a3K\3\2\2\2\u02a4\u02a9\5N(\2\u02a5\u02a6"+
		"\7\60\2\2\u02a6\u02a8\5N(\2\u02a7\u02a5\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9"+
		"\u02a7\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aaM\3\2\2\2\u02ab\u02a9\3\2\2\2"+
		"\u02ac\u02af\5d\63\2\u02ad\u02ae\7\64\2\2\u02ae\u02b0\5H%\2\u02af\u02ad"+
		"\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1\u02b3\7/\2\2\u02b2"+
		"\u02ac\3\2\2\2\u02b2\u02b1\3\2\2\2\u02b3O\3\2\2\2\u02b4\u02b5\7/\2\2\u02b5"+
		"\u02b6\5d\63\2\u02b6Q\3\2\2\2\u02b7\u02b8\7\63\2\2\u02b8\u02b9\5d\63\2"+
		"\u02b9S\3\2\2\2\u02ba\u02bb\b+\1\2\u02bb\u02bf\5V,\2\u02bc\u02bd\7\35"+
		"\2\2\u02bd\u02bf\5T+\5\u02be\u02ba\3\2\2\2\u02be\u02bc\3\2\2\2\u02bf\u02c8"+
		"\3\2\2\2\u02c0\u02c1\f\4\2\2\u02c1\u02c2\7\34\2\2\u02c2\u02c7\5T+\5\u02c3"+
		"\u02c4\f\3\2\2\u02c4\u02c5\7\33\2\2\u02c5\u02c7\5T+\4\u02c6\u02c0\3\2"+
		"\2\2\u02c6\u02c3\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8"+
		"\u02c9\3\2\2\2\u02c9U\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cb\u02cc\b,\1\2\u02cc"+
		"\u02cd\5X-\2\u02cd\u02e3\3\2\2\2\u02ce\u02de\f\4\2\2\u02cf\u02df\7@\2"+
		"\2\u02d0\u02df\7A\2\2\u02d1\u02df\7B\2\2\u02d2\u02df\7C\2\2\u02d3\u02df"+
		"\7D\2\2\u02d4\u02df\7E\2\2\u02d5\u02df\7F\2\2\u02d6\u02d8\7\35\2\2\u02d7"+
		"\u02d6\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02df\7\24"+
		"\2\2\u02da\u02dc\7\36\2\2\u02db\u02dd\7\35\2\2\u02dc\u02db\3\2\2\2\u02dc"+
		"\u02dd\3\2\2\2\u02dd\u02df\3\2\2\2\u02de\u02cf\3\2\2\2\u02de\u02d0\3\2"+
		"\2\2\u02de\u02d1\3\2\2\2\u02de\u02d2\3\2\2\2\u02de\u02d3\3\2\2\2\u02de"+
		"\u02d4\3\2\2\2\u02de\u02d5\3\2\2\2\u02de\u02d7\3\2\2\2\u02de\u02da\3\2"+
		"\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e2\5V,\5\u02e1\u02ce\3\2\2\2\u02e2\u02e5"+
		"\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4W\3\2\2\2\u02e5"+
		"\u02e3\3\2\2\2\u02e6\u02e8\b-\1\2\u02e7\u02e9\7&\2\2\u02e8\u02e7\3\2\2"+
		"\2\u02e8\u02e9\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02ee\5Z.\2\u02eb\u02ed"+
		"\5n8\2\u02ec\u02eb\3\2\2\2\u02ed\u02f0\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee"+
		"\u02ef\3\2\2\2\u02ef\u02f4\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f1\u02f2\t\5"+
		"\2\2\u02f2\u02f4\5X-\t\u02f3\u02e6\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f4\u030c"+
		"\3\2\2\2\u02f5\u02f6\f\n\2\2\u02f6\u02f7\7\63\2\2\u02f7\u030b\5X-\n\u02f8"+
		"\u02f9\f\b\2\2\u02f9\u02fa\t\6\2\2\u02fa\u030b\5X-\t\u02fb\u02fc\f\7\2"+
		"\2\u02fc\u02fd\t\7\2\2\u02fd\u030b\5X-\b\u02fe\u02ff\f\6\2\2\u02ff\u0300"+
		"\t\b\2\2\u0300\u030b\5X-\7\u0301\u0302\f\5\2\2\u0302\u0303\7\67\2\2\u0303"+
		"\u030b\5X-\6\u0304\u0305\f\4\2\2\u0305\u0306\7\66\2\2\u0306\u030b\5X-"+
		"\5\u0307\u0308\f\3\2\2\u0308\u0309\7\65\2\2\u0309\u030b\5X-\4\u030a\u02f5"+
		"\3\2\2\2\u030a\u02f8\3\2\2\2\u030a\u02fb\3\2\2\2\u030a\u02fe\3\2\2\2\u030a"+
		"\u0301\3\2\2\2\u030a\u0304\3\2\2\2\u030a\u0307\3\2\2\2\u030b\u030e\3\2"+
		"\2\2\u030c\u030a\3\2\2\2\u030c\u030d\3\2\2\2\u030dY\3\2\2\2\u030e\u030c"+
		"\3\2\2\2\u030f\u0312\7]\2\2\u0310\u0313\5j\66\2\u0311\u0313\5^\60\2\u0312"+
		"\u0310\3\2\2\2\u0312\u0311\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0314\3\2"+
		"\2\2\u0314\u0335\7^\2\2\u0315\u0317\7a\2\2\u0316\u0318\5^\60\2\u0317\u0316"+
		"\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u0335\7b\2\2\u031a"+
		"\u031c\7_\2\2\u031b\u031d\5\\/\2\u031c\u031b\3\2\2\2\u031c\u031d\3\2\2"+
		"\2\u031d\u031e\3\2\2\2\u031e\u0335\7`\2\2\u031f\u0320\7.\2\2\u0320\u0322"+
		"\5`\61\2\u0321\u0323\7\60\2\2\u0322\u0321\3\2\2\2\u0322\u0323\3\2\2\2"+
		"\u0323\u0324\3\2\2\2\u0324\u0325\7.\2\2\u0325\u0335\3\2\2\2\u0326\u0335"+
		"\7-\2\2\u0327\u0335\5d\63\2\u0328\u0335\7\'\2\2\u0329\u0335\7(\2\2\u032a"+
		"\u032c\7;\2\2\u032b\u032a\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032d\3\2"+
		"\2\2\u032d\u0335\5f\64\2\u032e\u0335\7\26\2\2\u032f\u0331\7V\2\2\u0330"+
		"\u032f\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0330\3\2\2\2\u0332\u0333\3\2"+
		"\2\2\u0333\u0335\3\2\2\2\u0334\u030f\3\2\2\2\u0334\u0315\3\2\2\2\u0334"+
		"\u031a\3\2\2\2\u0334\u031f\3\2\2\2\u0334\u0326\3\2\2\2\u0334\u0327\3\2"+
		"\2\2\u0334\u0328\3\2\2\2\u0334\u0329\3\2\2\2\u0334\u032b\3\2\2\2\u0334"+
		"\u032e\3\2\2\2\u0334\u0330\3\2\2\2\u0335[\3\2\2\2\u0336\u0337\5H%\2\u0337"+
		"\u0338\7\61\2\2\u0338\u0339\5H%\2\u0339\u033d\3\2\2\2\u033a\u033b\7\63"+
		"\2\2\u033b\u033d\5X-\2\u033c\u0336\3\2\2\2\u033c\u033a\3\2\2\2\u033d\u0349"+
		"\3\2\2\2\u033e\u0345\7\60\2\2\u033f\u0340\5H%\2\u0340\u0341\7\61\2\2\u0341"+
		"\u0342\5H%\2\u0342\u0346\3\2\2\2\u0343\u0344\7\63\2\2\u0344\u0346\5X-"+
		"\2\u0345\u033f\3\2\2\2\u0345\u0343\3\2\2\2\u0346\u0348\3\2\2\2\u0347\u033e"+
		"\3\2\2\2\u0348\u034b\3\2\2\2\u0349\u0347\3\2\2\2\u0349\u034a\3\2\2\2\u034a"+
		"\u034d\3\2\2\2\u034b\u0349\3\2\2\2\u034c\u034e\7\60\2\2\u034d\u034c\3"+
		"\2\2\2\u034d\u034e\3\2\2\2\u034e\u0356\3\2\2\2\u034f\u0350\5H%\2\u0350"+
		"\u0351\7\61\2\2\u0351\u0352\5H%\2\u0352\u0353\5|?\2\u0353\u0356\3\2\2"+
		"\2\u0354\u0356\5^\60\2\u0355\u033c\3\2\2\2\u0355\u034f\3\2\2\2\u0355\u0354"+
		"\3\2\2\2\u0356]\3\2\2\2\u0357\u035a\5H%\2\u0358\u035a\5:\36\2\u0359\u0357"+
		"\3\2\2\2\u0359\u0358\3\2\2\2\u035a\u0369\3\2\2\2\u035b\u036a\5|?\2\u035c"+
		"\u035f\7\60\2\2\u035d\u0360\5H%\2\u035e\u0360\5:\36\2\u035f\u035d\3\2"+
		"\2\2\u035f\u035e\3\2\2\2\u0360\u0362\3\2\2\2\u0361\u035c\3\2\2\2\u0362"+
		"\u0365\3\2\2\2\u0363\u0361\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0367\3\2"+
		"\2\2\u0365\u0363\3\2\2\2\u0366\u0368\7\60\2\2\u0367\u0366\3\2\2\2\u0367"+
		"\u0368\3\2\2\2\u0368\u036a\3\2\2\2\u0369\u035b\3\2\2\2\u0369\u0363\3\2"+
		"\2\2\u036a_\3\2\2\2\u036b\u0370\5H%\2\u036c\u036d\7\60\2\2\u036d\u036f"+
		"\5H%\2\u036e\u036c\3\2\2\2\u036f\u0372\3\2\2\2\u0370\u036e\3\2\2\2\u0370"+
		"\u0371\3\2\2\2\u0371\u0374\3\2\2\2\u0372\u0370\3\2\2\2\u0373\u0375\7\60"+
		"\2\2\u0374\u0373\3\2\2\2\u0374\u0375\3\2\2\2\u0375a\3\2\2\2\u0376\u0377"+
		"\b\62\1\2\u0377\u0378\5d\63\2\u0378\u037e\3\2\2\2\u0379\u037a\f\4\2\2"+
		"\u037a\u037b\7,\2\2\u037b\u037d\5d\63\2\u037c\u0379\3\2\2\2\u037d\u0380"+
		"\3\2\2\2\u037e\u037c\3\2\2\2\u037e\u037f\3\2\2\2\u037fc\3\2\2\2\u0380"+
		"\u037e\3\2\2\2\u0381\u0382\t\t\2\2\u0382e\3\2\2\2\u0383\u0387\5h\65\2"+
		"\u0384\u0387\7[\2\2\u0385\u0387\7\\\2\2\u0386\u0383\3\2\2\2\u0386\u0384"+
		"\3\2\2\2\u0386\u0385\3\2\2\2\u0387g\3\2\2\2\u0388\u0389\t\n\2\2\u0389"+
		"i\3\2\2\2\u038a\u038c\7 \2\2\u038b\u038d\5l\67\2\u038c\u038b\3\2\2\2\u038c"+
		"\u038d\3\2\2\2\u038dk\3\2\2\2\u038e\u038f\7\t\2\2\u038f\u0392\5H%\2\u0390"+
		"\u0392\5`\61\2\u0391\u038e\3\2\2\2\u0391\u0390\3\2\2\2\u0392m\3\2\2\2"+
		"\u0393\u0394\7,\2\2\u0394\u0396\5d\63\2\u0395\u0397\5p9\2\u0396\u0395"+
		"\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u039a\3\2\2\2\u0398\u039a\5p9\2\u0399"+
		"\u0393\3\2\2\2\u0399\u0398\3\2\2\2\u039ao\3\2\2\2\u039b\u039d\7]\2\2\u039c"+
		"\u039e\5r:\2\u039d\u039c\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u039f\3\2\2"+
		"\2\u039f\u03a5\7^\2\2\u03a0\u03a1\7a\2\2\u03a1\u03a2\5v<\2\u03a2\u03a3"+
		"\7b\2\2\u03a3\u03a5\3\2\2\2\u03a4\u039b\3\2\2\2\u03a4\u03a0\3\2\2\2\u03a5"+
		"q\3\2\2\2\u03a6\u03ab\5t;\2\u03a7\u03a8\7\60\2\2\u03a8\u03aa\5t;\2\u03a9"+
		"\u03a7\3\2\2\2\u03aa\u03ad\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ab\u03ac\3\2"+
		"\2\2\u03ac\u03af\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ae\u03b0\7\60\2\2\u03af"+
		"\u03ae\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0s\3\2\2\2\u03b1\u03b5\5H%\2\u03b2"+
		"\u03b6\5|?\2\u03b3\u03b4\7\64\2\2\u03b4\u03b6\5H%\2\u03b5\u03b2\3\2\2"+
		"\2\u03b5\u03b3\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03ba\3\2\2\2\u03b7\u03b8"+
		"\t\13\2\2\u03b8\u03ba\5H%\2\u03b9\u03b1\3\2\2\2\u03b9\u03b7\3\2\2\2\u03ba"+
		"u\3\2\2\2\u03bb\u03c0\5x=\2\u03bc\u03bd\7\60\2\2\u03bd\u03bf\5x=\2\u03be"+
		"\u03bc\3\2\2\2\u03bf\u03c2\3\2\2\2\u03c0\u03be\3\2\2\2\u03c0\u03c1\3\2"+
		"\2\2\u03c1\u03c4\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c3\u03c5\7\60\2\2\u03c4"+
		"\u03c3\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5w\3\2\2\2\u03c6\u03d9\7-\2\2\u03c7"+
		"\u03cf\5H%\2\u03c8\u03ca\7\61\2\2\u03c9\u03cb\5H%\2\u03ca\u03c9\3\2\2"+
		"\2\u03ca\u03cb\3\2\2\2\u03cb\u03cd\3\2\2\2\u03cc\u03ce\5z>\2\u03cd\u03cc"+
		"\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03d0\3\2\2\2\u03cf\u03c8\3\2\2\2\u03cf"+
		"\u03d0\3\2\2\2\u03d0\u03d9\3\2\2\2\u03d1\u03d3\7\61\2\2\u03d2\u03d4\5"+
		"H%\2\u03d3\u03d2\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d6\3\2\2\2\u03d5"+
		"\u03d7\5z>\2\u03d6\u03d5\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d9\3\2\2"+
		"\2\u03d8\u03c6\3\2\2\2\u03d8\u03c7\3\2\2\2\u03d8\u03d1\3\2\2\2\u03d9y"+
		"\3\2\2\2\u03da\u03dc\7\61\2\2\u03db\u03dd\5H%\2\u03dc\u03db\3\2\2\2\u03dc"+
		"\u03dd\3\2\2\2\u03dd{\3\2\2\2\u03de\u03df\7\23\2\2\u03df\u03e0\5> \2\u03e0"+
		"\u03e1\7\24\2\2\u03e1\u03e3\5T+\2\u03e2\u03e4\5~@\2\u03e3\u03e2\3\2\2"+
		"\2\u03e3\u03e4\3\2\2\2\u03e4}\3\2\2\2\u03e5\u03ec\5|?\2\u03e6\u03e7\7"+
		"\17\2\2\u03e7\u03e9\5H%\2\u03e8\u03ea\5~@\2\u03e9\u03e8\3\2\2\2\u03e9"+
		"\u03ea\3\2\2\2\u03ea\u03ec\3\2\2\2\u03eb\u03e5\3\2\2\2\u03eb\u03e6\3\2"+
		"\2\2\u03ec\177\3\2\2\2\u009c\u0083\u008c\u0090\u0092\u0098\u009e\u00a7"+
		"\u00ab\u00b2\u00b5\u00be\u00c6\u00c9\u00cc\u00cf\u00d2\u00da\u00e3\u00e8"+
		"\u00ea\u00f1\u00f7\u0100\u010b\u010f\u0115\u0118\u012c\u013a\u013c\u0145"+
		"\u0148\u014e\u0154\u0159\u0161\u0166\u016a\u016d\u0170\u0174\u0176\u0183"+
		"\u0189\u018c\u0191\u0198\u019c\u01a2\u01ab\u01af\u01b7\u01ba\u01bc\u01c7"+
		"\u01cf\u01d1\u01d3\u01d7\u01e0\u01e7\u01e9\u01f2\u01fa\u0204\u0206\u020e"+
		"\u0217\u021c\u0220\u0226\u022a\u022d\u0238\u023d\u0240\u0247\u024e\u0250"+
		"\u0257\u025b\u0262\u0266\u026b\u0272\u0278\u0280\u0284\u0288\u028d\u0292"+
		"\u0296\u0299\u029c\u02a0\u02a2\u02a9\u02af\u02b2\u02be\u02c6\u02c8\u02d7"+
		"\u02dc\u02de\u02e3\u02e8\u02ee\u02f3\u030a\u030c\u0312\u0317\u031c\u0322"+
		"\u032b\u0332\u0334\u033c\u0345\u0349\u034d\u0355\u0359\u035f\u0363\u0367"+
		"\u0369\u0370\u0374\u037e\u0386\u038c\u0391\u0396\u0399\u039d\u03a4\u03ab"+
		"\u03af\u03b5\u03b9\u03c0\u03c4\u03ca\u03cd\u03cf\u03d3\u03d6\u03d8\u03dc"+
		"\u03e3\u03e9\u03eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}