// Generated from C:/Users/Алексей/Desktop/DataBaseManagingSystem/Tester/src/parser\TestGrammar.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TestGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, K_TEST=23, K_FOR=24, 
		K_RESULT=25, K_NOT=26, K_AND=27, K_OR=28, K_CAST=29, K_AS=30, K_INT=31, 
		K_FLOAT=32, K_STRING=33, NUMERIC_LITERAL=34, STRING_LITERAL=35, IDENTIFIER=36, 
		WS=37;
	public static final int
		RULE_id = 0, RULE_parseIn = 1, RULE_parseOut = 2, RULE_result = 3, RULE_test_block = 4, 
		RULE_test = 5, RULE_myfor = 6, RULE_unary_operator = 7, RULE_type_name = 8, 
		RULE_expr = 9, RULE_literal_value = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"id", "parseIn", "parseOut", "result", "test_block", "test", "myfor", 
			"unary_operator", "type_name", "expr", "literal_value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "':'", "'='", "';'", "'-'", "'+'", 
			"'~'", "'||'", "'*'", "'/'", "'%'", "'&'", "'|'", "'<'", "'<='", "'>'", 
			"'>='", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "K_TEST", 
			"K_FOR", "K_RESULT", "K_NOT", "K_AND", "K_OR", "K_CAST", "K_AS", "K_INT", 
			"K_FLOAT", "K_STRING", "NUMERIC_LITERAL", "STRING_LITERAL", "IDENTIFIER", 
			"WS"
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
	public String getGrammarFileName() { return "TestGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TestGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TestGrammarParser.IDENTIFIER, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGrammarVisitor ) return ((TestGrammarVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_id);
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(IDENTIFIER);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				match(T__0);
				setState(24);
				match(IDENTIFIER);
				setState(25);
				match(T__1);
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

	public static class ParseInContext extends ParserRuleContext {
		public TerminalNode K_TEST() { return getToken(TestGrammarParser.K_TEST, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(TestGrammarParser.STRING_LITERAL, 0); }
		public TerminalNode EOF() { return getToken(TestGrammarParser.EOF, 0); }
		public List<Test_blockContext> test_block() {
			return getRuleContexts(Test_blockContext.class);
		}
		public Test_blockContext test_block(int i) {
			return getRuleContext(Test_blockContext.class,i);
		}
		public ParseInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parseIn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).enterParseIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).exitParseIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGrammarVisitor ) return ((TestGrammarVisitor<? extends T>)visitor).visitParseIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseInContext parseIn() throws RecognitionException {
		ParseInContext _localctx = new ParseInContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_parseIn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(K_TEST);
			setState(29);
			match(STRING_LITERAL);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(30);
				test_block();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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

	public static class ParseOutContext extends ParserRuleContext {
		public List<ResultContext> result() {
			return getRuleContexts(ResultContext.class);
		}
		public ResultContext result(int i) {
			return getRuleContext(ResultContext.class,i);
		}
		public ParseOutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parseOut; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).enterParseOut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).exitParseOut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGrammarVisitor ) return ((TestGrammarVisitor<? extends T>)visitor).visitParseOut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseOutContext parseOut() throws RecognitionException {
		ParseOutContext _localctx = new ParseOutContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parseOut);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_RESULT) {
				{
				{
				setState(38);
				result();
				}
				}
				setState(43);
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

	public static class ResultContext extends ParserRuleContext {
		public TerminalNode K_RESULT() { return getToken(TestGrammarParser.K_RESULT, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(TestGrammarParser.STRING_LITERAL, 0); }
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).exitResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGrammarVisitor ) return ((TestGrammarVisitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(K_RESULT);
			setState(45);
			match(STRING_LITERAL);
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

	public static class Test_blockContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<MyforContext> myfor() {
			return getRuleContexts(MyforContext.class);
		}
		public MyforContext myfor(int i) {
			return getRuleContext(MyforContext.class,i);
		}
		public Test_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).enterTest_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).exitTest_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGrammarVisitor ) return ((TestGrammarVisitor<? extends T>)visitor).visitTest_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Test_blockContext test_block() throws RecognitionException {
		Test_blockContext _localctx = new Test_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_test_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__2);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_TEST || _la==K_FOR) {
				{
				setState(50);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_TEST:
					{
					setState(48);
					test();
					}
					break;
				case K_FOR:
					{
					setState(49);
					myfor();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(T__3);
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
		public TerminalNode K_TEST() { return getToken(TestGrammarParser.K_TEST, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).enterTest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).exitTest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGrammarVisitor ) return ((TestGrammarVisitor<? extends T>)visitor).visitTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_test);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(K_TEST);
			setState(58);
			match(T__4);
			setState(59);
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

	public static class MyforContext extends ParserRuleContext {
		public TerminalNode K_FOR() { return getToken(TestGrammarParser.K_FOR, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Test_blockContext test_block() {
			return getRuleContext(Test_blockContext.class,0);
		}
		public MyforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myfor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).enterMyfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).exitMyfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGrammarVisitor ) return ((TestGrammarVisitor<? extends T>)visitor).visitMyfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyforContext myfor() throws RecognitionException {
		MyforContext _localctx = new MyforContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_myfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(K_FOR);
			setState(62);
			match(T__0);
			setState(63);
			id();
			setState(64);
			match(T__5);
			setState(65);
			expr(0);
			setState(66);
			match(T__6);
			setState(67);
			expr(0);
			setState(68);
			match(T__6);
			setState(69);
			id();
			setState(70);
			match(T__5);
			setState(71);
			expr(0);
			setState(72);
			match(T__1);
			setState(73);
			test_block();
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(TestGrammarParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGrammarVisitor ) return ((TestGrammarVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << K_NOT))) != 0)) ) {
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

	public static class Type_nameContext extends ParserRuleContext {
		public TerminalNode K_INT() { return getToken(TestGrammarParser.K_INT, 0); }
		public TerminalNode K_FLOAT() { return getToken(TestGrammarParser.K_FLOAT, 0); }
		public TerminalNode K_STRING() { return getToken(TestGrammarParser.K_STRING, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGrammarVisitor ) return ((TestGrammarVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_INT) | (1L << K_FLOAT) | (1L << K_STRING))) != 0)) ) {
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

	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_CAST() { return getToken(TestGrammarParser.K_CAST, 0); }
		public TerminalNode K_AS() { return getToken(TestGrammarParser.K_AS, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode K_AND() { return getToken(TestGrammarParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(TestGrammarParser.K_OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGrammarVisitor ) return ((TestGrammarVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(80);
				literal_value();
				}
				break;
			case 2:
				{
				setState(81);
				unary_operator();
				setState(82);
				expr(12);
				}
				break;
			case 3:
				{
				}
				break;
			case 4:
				{
				setState(85);
				match(T__0);
				setState(86);
				expr(0);
				setState(87);
				match(T__1);
				}
				break;
			case 5:
				{
				setState(89);
				match(K_CAST);
				setState(90);
				match(T__0);
				setState(91);
				expr(0);
				setState(92);
				match(K_AS);
				setState(93);
				type_name();
				setState(94);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(122);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(98);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(99);
						match(T__10);
						setState(100);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(101);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(102);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(103);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(104);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(105);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__8) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(106);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(107);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(108);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__15) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(109);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(110);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(111);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(112);
						expr(7);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(113);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(114);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__20) | (1L << T__21))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(115);
						expr(6);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(116);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(117);
						match(K_AND);
						setState(118);
						expr(5);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(119);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(120);
						match(K_OR);
						setState(121);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(TestGrammarParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(TestGrammarParser.STRING_LITERAL, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TestGrammarListener ) ((TestGrammarListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TestGrammarVisitor ) return ((TestGrammarVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_literal_value);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(NUMERIC_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(STRING_LITERAL);
				}
				break;
			case T__0:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				id();
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
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0087\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\5\2\35\n\2\3\3\3\3\3\3\7\3\"\n\3\f\3\16\3"+
		"%\13\3\3\3\3\3\3\4\7\4*\n\4\f\4\16\4-\13\4\3\5\3\5\3\5\3\6\3\6\3\6\7\6"+
		"\65\n\6\f\6\16\68\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13c"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13}\n\13\f\13"+
		"\16\13\u0080\13\13\3\f\3\f\3\f\5\f\u0085\n\f\3\f\2\3\24\r\2\4\6\b\n\f"+
		"\16\20\22\24\26\2\t\4\2\n\f\34\34\3\2!#\3\2\16\20\3\2\n\13\3\2\21\22\3"+
		"\2\23\26\4\2\b\b\27\30\2\u008e\2\34\3\2\2\2\4\36\3\2\2\2\6+\3\2\2\2\b"+
		".\3\2\2\2\n\61\3\2\2\2\f;\3\2\2\2\16?\3\2\2\2\20M\3\2\2\2\22O\3\2\2\2"+
		"\24b\3\2\2\2\26\u0084\3\2\2\2\30\35\7&\2\2\31\32\7\3\2\2\32\33\7&\2\2"+
		"\33\35\7\4\2\2\34\30\3\2\2\2\34\31\3\2\2\2\35\3\3\2\2\2\36\37\7\31\2\2"+
		"\37#\7%\2\2 \"\5\n\6\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2"+
		"\2\2%#\3\2\2\2&\'\7\2\2\3\'\5\3\2\2\2(*\5\b\5\2)(\3\2\2\2*-\3\2\2\2+)"+
		"\3\2\2\2+,\3\2\2\2,\7\3\2\2\2-+\3\2\2\2./\7\33\2\2/\60\7%\2\2\60\t\3\2"+
		"\2\2\61\66\7\5\2\2\62\65\5\f\7\2\63\65\5\16\b\2\64\62\3\2\2\2\64\63\3"+
		"\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\2"+
		"9:\7\6\2\2:\13\3\2\2\2;<\7\31\2\2<=\7\7\2\2=>\5\24\13\2>\r\3\2\2\2?@\7"+
		"\32\2\2@A\7\3\2\2AB\5\2\2\2BC\7\b\2\2CD\5\24\13\2DE\7\t\2\2EF\5\24\13"+
		"\2FG\7\t\2\2GH\5\2\2\2HI\7\b\2\2IJ\5\24\13\2JK\7\4\2\2KL\5\n\6\2L\17\3"+
		"\2\2\2MN\t\2\2\2N\21\3\2\2\2OP\t\3\2\2P\23\3\2\2\2QR\b\13\1\2Rc\5\26\f"+
		"\2ST\5\20\t\2TU\5\24\13\16Uc\3\2\2\2Vc\3\2\2\2WX\7\3\2\2XY\5\24\13\2Y"+
		"Z\7\4\2\2Zc\3\2\2\2[\\\7\37\2\2\\]\7\3\2\2]^\5\24\13\2^_\7 \2\2_`\5\22"+
		"\n\2`a\7\4\2\2ac\3\2\2\2bQ\3\2\2\2bS\3\2\2\2bV\3\2\2\2bW\3\2\2\2b[\3\2"+
		"\2\2c~\3\2\2\2de\f\f\2\2ef\7\r\2\2f}\5\24\13\rgh\f\13\2\2hi\t\4\2\2i}"+
		"\5\24\13\fjk\f\n\2\2kl\t\5\2\2l}\5\24\13\13mn\f\t\2\2no\t\6\2\2o}\5\24"+
		"\13\npq\f\b\2\2qr\t\7\2\2r}\5\24\13\tst\f\7\2\2tu\t\b\2\2u}\5\24\13\b"+
		"vw\f\6\2\2wx\7\35\2\2x}\5\24\13\7yz\f\5\2\2z{\7\36\2\2{}\5\24\13\6|d\3"+
		"\2\2\2|g\3\2\2\2|j\3\2\2\2|m\3\2\2\2|p\3\2\2\2|s\3\2\2\2|v\3\2\2\2|y\3"+
		"\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\25\3\2\2\2\u0080~\3\2"+
		"\2\2\u0081\u0085\7$\2\2\u0082\u0085\7%\2\2\u0083\u0085\5\2\2\2\u0084\u0081"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\27\3\2\2\2\13\34"+
		"#+\64\66b|~\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}