// Generated from D:/IDEA Projects/DataBaseManagingSystem/src/Logic\Hello.g4 by ANTLR 4.7.2
package Logic;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, K_CREATE=22, K_DROP=23, K_TABLE=24, 
		K_SHOW=25, K_WHERE=26, K_SELECT=27, K_UPDATE=28, K_FROM=29, K_NULL=30, 
		K_SET=31, K_INSERT=32, K_INTO=33, K_VALUES=34, AND=35, OR=36, NOT=37, 
		TRUE=38, FALSE=39, SPACE=40, ENTER=41, K_PRIMARY_KEY=42, K_UNIQUE=43, 
		T_CHAR=44, T_INT=45, T_FLOAT=46, NUMBER=47, NUMERIC_LITERAL=48, STRING=49, 
		IDENTIFIER=50, UNEXPECTED=51, SUB=52;
	public static final int
		RULE_mynumber = 0, RULE_mystring = 1, RULE_parse = 2, RULE_signed_number = 3, 
		RULE_name = 4, RULE_mychar = 5, RULE_myint = 6, RULE_myfloat = 7, RULE_type = 8, 
		RULE_sql_query = 9, RULE_value = 10, RULE_insert_value = 11, RULE_insert_values = 12, 
		RULE_insert_colums = 13, RULE_insert = 14, RULE_select_idef = 15, RULE_select_list = 16, 
		RULE_select_table_list = 17, RULE_select = 18, RULE_update_operand = 19, 
		RULE_update_idef = 20, RULE_update = 21, RULE_show_create = 22, RULE_create = 23, 
		RULE_drop = 24, RULE_table_name_list = 25, RULE_table = 26, RULE_table_definition = 27, 
		RULE_columns_sourse = 28, RULE_column_def = 29, RULE_column_constraint = 30, 
		RULE_sub_const_arifm_expr = 31, RULE_b_const_arifm_expr = 32, RULE_mul = 33, 
		RULE_div = 34, RULE_add = 35, RULE_sub = 36, RULE_concate = 37, RULE_mynull = 38, 
		RULE_const_arifm_expr = 39, RULE_sub_arifm_expr = 40, RULE_b_arifm_expr = 41, 
		RULE_arifm_expr = 42, RULE_eq = 43, RULE_neq = 44, RULE_moreeq = 45, RULE_more = 46, 
		RULE_less = 47, RULE_lesseq = 48, RULE_comp_op1 = 49, RULE_comp_op2 = 50, 
		RULE_b_const_compare_expr = 51, RULE_const_compare_expr = 52, RULE_b_compare_expr = 53, 
		RULE_compare_expr = 54, RULE_mytrue = 55, RULE_myfalse = 56, RULE_logic_literal = 57, 
		RULE_not_const_logic_expr = 58, RULE_and = 59, RULE_or = 60, RULE_b_const_logic_expr = 61, 
		RULE_const_logic_expr = 62, RULE_not_logic_expr = 63, RULE_b_logic_expr = 64, 
		RULE_logic_expr = 65, RULE_const_expr = 66, RULE_expr = 67;
	private static String[] makeRuleNames() {
		return new String[] {
			"mynumber", "mystring", "parse", "signed_number", "name", "mychar", "myint", 
			"myfloat", "type", "sql_query", "value", "insert_value", "insert_values", 
			"insert_colums", "insert", "select_idef", "select_list", "select_table_list", 
			"select", "update_operand", "update_idef", "update", "show_create", "create", 
			"drop", "table_name_list", "table", "table_definition", "columns_sourse", 
			"column_def", "column_constraint", "sub_const_arifm_expr", "b_const_arifm_expr", 
			"mul", "div", "add", "sub", "concate", "mynull", "const_arifm_expr", 
			"sub_arifm_expr", "b_arifm_expr", "arifm_expr", "eq", "neq", "moreeq", 
			"more", "less", "lesseq", "comp_op1", "comp_op2", "b_const_compare_expr", 
			"const_compare_expr", "b_compare_expr", "compare_expr", "mytrue", "myfalse", 
			"logic_literal", "not_const_logic_expr", "and", "or", "b_const_logic_expr", 
			"const_logic_expr", "not_logic_expr", "b_logic_expr", "logic_expr", "const_expr", 
			"expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'+'", "'-'", "'['", "']'", "'('", "')'", "','", "'*'", 
			"'='", "'/'", "'|'", "'=='", "'!='", "'>='", "'=>'", "'>'", "'<'", "'<='", 
			"'=<'", "'!'", null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "K_CREATE", 
			"K_DROP", "K_TABLE", "K_SHOW", "K_WHERE", "K_SELECT", "K_UPDATE", "K_FROM", 
			"K_NULL", "K_SET", "K_INSERT", "K_INTO", "K_VALUES", "AND", "OR", "NOT", 
			"TRUE", "FALSE", "SPACE", "ENTER", "K_PRIMARY_KEY", "K_UNIQUE", "T_CHAR", 
			"T_INT", "T_FLOAT", "NUMBER", "NUMERIC_LITERAL", "STRING", "IDENTIFIER", 
			"UNEXPECTED", "SUB"
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
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MynumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(HelloParser.NUMBER, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(HelloParser.NUMERIC_LITERAL, 0); }
		public MynumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mynumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMynumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMynumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMynumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MynumberContext mynumber() throws RecognitionException {
		MynumberContext _localctx = new MynumberContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mynumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==NUMERIC_LITERAL) ) {
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

	public static class MystringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(HelloParser.STRING, 0); }
		public MystringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mystring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMystring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMystring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMystring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MystringContext mystring() throws RecognitionException {
		MystringContext _localctx = new MystringContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mystring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(STRING);
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

	public static class ParseContext extends ParserRuleContext {
		public Sql_queryContext sql_query() {
			return getRuleContext(Sql_queryContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HelloParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			sql_query();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(141);
				match(T__0);
				}
			}

			setState(144);
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

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(HelloParser.NUMERIC_LITERAL, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__2) {
				{
				setState(146);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(149);
			match(NUMERIC_LITERAL);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HelloParser.IDENTIFIER, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(IDENTIFIER);
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

	public static class MycharContext extends ParserRuleContext {
		public TerminalNode T_CHAR() { return getToken(HelloParser.T_CHAR, 0); }
		public TerminalNode NUMBER() { return getToken(HelloParser.NUMBER, 0); }
		public MycharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mychar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMychar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMychar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMychar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MycharContext mychar() throws RecognitionException {
		MycharContext _localctx = new MycharContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mychar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T_CHAR);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(154);
				match(T__3);
				setState(155);
				match(NUMBER);
				setState(156);
				match(T__4);
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

	public static class MyintContext extends ParserRuleContext {
		public TerminalNode T_INT() { return getToken(HelloParser.T_INT, 0); }
		public TerminalNode NUMBER() { return getToken(HelloParser.NUMBER, 0); }
		public MyintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMyint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMyint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMyint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyintContext myint() throws RecognitionException {
		MyintContext _localctx = new MyintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_myint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T_INT);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(160);
				match(T__5);
				setState(161);
				match(NUMBER);
				setState(162);
				match(T__6);
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

	public static class MyfloatContext extends ParserRuleContext {
		public TerminalNode T_FLOAT() { return getToken(HelloParser.T_FLOAT, 0); }
		public TerminalNode NUMBER() { return getToken(HelloParser.NUMBER, 0); }
		public MyfloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myfloat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMyfloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMyfloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMyfloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyfloatContext myfloat() throws RecognitionException {
		MyfloatContext _localctx = new MyfloatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_myfloat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T_FLOAT);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(166);
				match(T__5);
				setState(167);
				match(NUMBER);
				setState(168);
				match(T__6);
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

	public static class TypeContext extends ParserRuleContext {
		public MyintContext myint() {
			return getRuleContext(MyintContext.class,0);
		}
		public MyfloatContext myfloat() {
			return getRuleContext(MyfloatContext.class,0);
		}
		public MycharContext mychar() {
			return getRuleContext(MycharContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				myint();
				}
				break;
			case T_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				myfloat();
				}
				break;
			case T_CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				mychar();
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

	public static class Sql_queryContext extends ParserRuleContext {
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public DropContext drop() {
			return getRuleContext(DropContext.class,0);
		}
		public Show_createContext show_create() {
			return getRuleContext(Show_createContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public Sql_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSql_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSql_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitSql_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_queryContext sql_query() throws RecognitionException {
		Sql_queryContext _localctx = new Sql_queryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sql_query);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				create();
				}
				break;
			case K_DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				drop();
				}
				break;
			case K_SHOW:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				show_create();
				}
				break;
			case K_SELECT:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				select();
				}
				break;
			case K_UPDATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(180);
				update();
				}
				break;
			case T__5:
			case T__20:
			case K_NULL:
			case NOT:
			case TRUE:
			case FALSE:
			case NUMBER:
			case NUMERIC_LITERAL:
			case STRING:
			case SUB:
				enterOuterAlt(_localctx, 6);
				{
				setState(181);
				const_expr();
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

	public static class ValueContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public MynumberContext mynumber() {
			return getRuleContext(MynumberContext.class,0);
		}
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_value);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				mynumber();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				logic_expr(0);
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

	public static class Insert_valueContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Insert_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterInsert_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitInsert_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitInsert_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_valueContext insert_value() throws RecognitionException {
		Insert_valueContext _localctx = new Insert_valueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_insert_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__5);
			setState(190);
			value();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(191);
				match(T__7);
				setState(192);
				value();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			match(T__6);
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

	public static class Insert_valuesContext extends ParserRuleContext {
		public List<Insert_valueContext> insert_value() {
			return getRuleContexts(Insert_valueContext.class);
		}
		public Insert_valueContext insert_value(int i) {
			return getRuleContext(Insert_valueContext.class,i);
		}
		public Insert_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterInsert_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitInsert_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitInsert_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_valuesContext insert_values() throws RecognitionException {
		Insert_valuesContext _localctx = new Insert_valuesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_insert_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__5);
			setState(201);
			insert_value();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(202);
				match(T__7);
				setState(203);
				insert_value();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			match(T__6);
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

	public static class Insert_columsContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public Insert_columsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_colums; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterInsert_colums(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitInsert_colums(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitInsert_colums(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_columsContext insert_colums() throws RecognitionException {
		Insert_columsContext _localctx = new Insert_columsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_insert_colums);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			name();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(212);
				match(T__7);
				setState(213);
				name();
				}
				}
				setState(218);
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

	public static class InsertContext extends ParserRuleContext {
		public TerminalNode K_INSERT() { return getToken(HelloParser.K_INSERT, 0); }
		public TerminalNode K_INTO() { return getToken(HelloParser.K_INTO, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode K_VALUES() { return getToken(HelloParser.K_VALUES, 0); }
		public Insert_valuesContext insert_values() {
			return getRuleContext(Insert_valuesContext.class,0);
		}
		public Insert_columsContext insert_colums() {
			return getRuleContext(Insert_columsContext.class,0);
		}
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(K_INSERT);
			setState(220);
			match(K_INTO);
			setState(221);
			name();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(222);
				match(T__5);
				setState(223);
				insert_colums();
				setState(224);
				match(T__6);
				}
			}

			setState(228);
			match(K_VALUES);
			setState(229);
			insert_values();
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

	public static class Select_idefContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(HelloParser.IDENTIFIER, 0); }
		public Select_idefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_idef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSelect_idef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSelect_idef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitSelect_idef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_idefContext select_idef() throws RecognitionException {
		Select_idefContext _localctx = new Select_idefContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_select_idef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==IDENTIFIER) ) {
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

	public static class Select_listContext extends ParserRuleContext {
		public List<Select_idefContext> select_idef() {
			return getRuleContexts(Select_idefContext.class);
		}
		public Select_idefContext select_idef(int i) {
			return getRuleContext(Select_idefContext.class,i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSelect_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitSelect_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_select_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			select_idef();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(234);
				match(T__7);
				setState(235);
				select_idef();
				}
				}
				setState(240);
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

	public static class Select_table_listContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public Select_table_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_table_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSelect_table_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSelect_table_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitSelect_table_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_table_listContext select_table_list() throws RecognitionException {
		Select_table_listContext _localctx = new Select_table_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_select_table_list);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				name();
				}
				break;
			case K_SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				select();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				match(T__5);
				setState(244);
				select();
				setState(245);
				match(T__6);
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

	public static class SelectContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(HelloParser.K_SELECT, 0); }
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode K_FROM() { return getToken(HelloParser.K_FROM, 0); }
		public Select_table_listContext select_table_list() {
			return getRuleContext(Select_table_listContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(HelloParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(K_SELECT);
			setState(250);
			select_list();
			setState(251);
			match(K_FROM);
			setState(252);
			select_table_list();
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(253);
				match(K_WHERE);
				setState(254);
				expr();
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

	public static class Update_operandContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Update_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterUpdate_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitUpdate_operand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitUpdate_operand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_operandContext update_operand() throws RecognitionException {
		Update_operandContext _localctx = new Update_operandContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_update_operand);
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				name();
				}
				break;
			case T__1:
			case T__2:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				signed_number();
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

	public static class Update_idefContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Update_idefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_idef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterUpdate_idef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitUpdate_idef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitUpdate_idef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_idefContext update_idef() throws RecognitionException {
		Update_idefContext _localctx = new Update_idefContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_update_idef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			name();
			setState(262);
			match(T__9);
			setState(263);
			expr();
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

	public static class UpdateContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(HelloParser.K_UPDATE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(HelloParser.K_SET, 0); }
		public Update_idefContext update_idef() {
			return getRuleContext(Update_idefContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(HelloParser.K_WHERE, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(K_UPDATE);
			setState(266);
			name();
			setState(267);
			match(K_SET);
			setState(268);
			update_idef();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(269);
				match(K_WHERE);
				setState(270);
				logic_expr(0);
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

	public static class Show_createContext extends ParserRuleContext {
		public TerminalNode K_SHOW() { return getToken(HelloParser.K_SHOW, 0); }
		public TerminalNode K_CREATE() { return getToken(HelloParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(HelloParser.K_TABLE, 0); }
		public Table_name_listContext table_name_list() {
			return getRuleContext(Table_name_listContext.class,0);
		}
		public Show_createContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterShow_create(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitShow_create(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitShow_create(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_createContext show_create() throws RecognitionException {
		Show_createContext _localctx = new Show_createContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_show_create);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(K_SHOW);
			setState(274);
			match(K_CREATE);
			setState(275);
			match(K_TABLE);
			setState(276);
			table_name_list();
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

	public static class CreateContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(HelloParser.K_CREATE, 0); }
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_create);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(K_CREATE);
			setState(279);
			table();
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

	public static class DropContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(HelloParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(HelloParser.K_TABLE, 0); }
		public Table_name_listContext table_name_list() {
			return getRuleContext(Table_name_listContext.class,0);
		}
		public DropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDrop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDrop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitDrop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropContext drop() throws RecognitionException {
		DropContext _localctx = new DropContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_drop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(K_DROP);
			setState(282);
			match(K_TABLE);
			setState(283);
			table_name_list();
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

	public static class Table_name_listContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public Table_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTable_name_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTable_name_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTable_name_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_name_listContext table_name_list() throws RecognitionException {
		Table_name_listContext _localctx = new Table_name_listContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_table_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			name();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(286);
				match(T__7);
				setState(287);
				name();
				}
				}
				setState(292);
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

	public static class TableContext extends ParserRuleContext {
		public TerminalNode K_TABLE() { return getToken(HelloParser.K_TABLE, 0); }
		public Table_definitionContext table_definition() {
			return getRuleContext(Table_definitionContext.class,0);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(K_TABLE);
			setState(294);
			table_definition();
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

	public static class Table_definitionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Columns_sourseContext columns_sourse() {
			return getRuleContext(Columns_sourseContext.class,0);
		}
		public Table_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTable_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTable_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTable_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_definitionContext table_definition() throws RecognitionException {
		Table_definitionContext _localctx = new Table_definitionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_table_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			name();
			setState(297);
			match(T__5);
			setState(298);
			columns_sourse();
			setState(299);
			match(T__6);
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

	public static class Columns_sourseContext extends ParserRuleContext {
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public Columns_sourseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns_sourse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterColumns_sourse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitColumns_sourse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitColumns_sourse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Columns_sourseContext columns_sourse() throws RecognitionException {
		Columns_sourseContext _localctx = new Columns_sourseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_columns_sourse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(301);
				column_def();
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(302);
					match(T__7);
					setState(303);
					column_def();
					}
					}
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Column_defContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Column_constraintContext column_constraint() {
			return getRuleContext(Column_constraintContext.class,0);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			name();
			setState(312);
			type();
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_PRIMARY_KEY || _la==K_UNIQUE) {
				{
				setState(313);
				column_constraint();
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

	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY_KEY() { return getToken(HelloParser.K_PRIMARY_KEY, 0); }
		public TerminalNode K_UNIQUE() { return getToken(HelloParser.K_UNIQUE, 0); }
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_la = _input.LA(1);
			if ( !(_la==K_PRIMARY_KEY || _la==K_UNIQUE) ) {
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

	public static class Sub_const_arifm_exprContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(HelloParser.SUB, 0); }
		public Const_arifm_exprContext const_arifm_expr() {
			return getRuleContext(Const_arifm_exprContext.class,0);
		}
		public Sub_const_arifm_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_const_arifm_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSub_const_arifm_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSub_const_arifm_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitSub_const_arifm_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sub_const_arifm_exprContext sub_const_arifm_expr() throws RecognitionException {
		Sub_const_arifm_exprContext _localctx = new Sub_const_arifm_exprContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_sub_const_arifm_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(SUB);
			setState(319);
			const_arifm_expr(0);
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

	public static class B_const_arifm_exprContext extends ParserRuleContext {
		public Const_arifm_exprContext const_arifm_expr() {
			return getRuleContext(Const_arifm_exprContext.class,0);
		}
		public B_const_arifm_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_const_arifm_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterB_const_arifm_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitB_const_arifm_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitB_const_arifm_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final B_const_arifm_exprContext b_const_arifm_expr() throws RecognitionException {
		B_const_arifm_exprContext _localctx = new B_const_arifm_exprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_b_const_arifm_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(T__5);
			setState(322);
			const_arifm_expr(0);
			setState(323);
			match(T__6);
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

	public static class MulContext extends ParserRuleContext {
		public MulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulContext mul() throws RecognitionException {
		MulContext _localctx = new MulContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_mul);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(T__8);
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

	public static class DivContext extends ParserRuleContext {
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(T__10);
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

	public static class AddContext extends ParserRuleContext {
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(T__1);
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

	public static class SubContext extends ParserRuleContext {
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(T__2);
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

	public static class ConcateContext extends ParserRuleContext {
		public ConcateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterConcate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitConcate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitConcate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcateContext concate() throws RecognitionException {
		ConcateContext _localctx = new ConcateContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_concate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(T__11);
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

	public static class MynullContext extends ParserRuleContext {
		public TerminalNode K_NULL() { return getToken(HelloParser.K_NULL, 0); }
		public MynullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mynull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMynull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMynull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMynull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MynullContext mynull() throws RecognitionException {
		MynullContext _localctx = new MynullContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_mynull);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(K_NULL);
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

	public static class Const_arifm_exprContext extends ParserRuleContext {
		public MystringContext mystring() {
			return getRuleContext(MystringContext.class,0);
		}
		public MynumberContext mynumber() {
			return getRuleContext(MynumberContext.class,0);
		}
		public Sub_const_arifm_exprContext sub_const_arifm_expr() {
			return getRuleContext(Sub_const_arifm_exprContext.class,0);
		}
		public B_const_arifm_exprContext b_const_arifm_expr() {
			return getRuleContext(B_const_arifm_exprContext.class,0);
		}
		public MynullContext mynull() {
			return getRuleContext(MynullContext.class,0);
		}
		public List<Const_arifm_exprContext> const_arifm_expr() {
			return getRuleContexts(Const_arifm_exprContext.class);
		}
		public Const_arifm_exprContext const_arifm_expr(int i) {
			return getRuleContext(Const_arifm_exprContext.class,i);
		}
		public ConcateContext concate() {
			return getRuleContext(ConcateContext.class,0);
		}
		public MulContext mul() {
			return getRuleContext(MulContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public Const_arifm_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_arifm_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterConst_arifm_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitConst_arifm_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitConst_arifm_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_arifm_exprContext const_arifm_expr() throws RecognitionException {
		return const_arifm_expr(0);
	}

	private Const_arifm_exprContext const_arifm_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Const_arifm_exprContext _localctx = new Const_arifm_exprContext(_ctx, _parentState);
		Const_arifm_exprContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_const_arifm_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(338);
				mystring();
				}
				break;
			case NUMBER:
			case NUMERIC_LITERAL:
				{
				setState(339);
				mynumber();
				}
				break;
			case SUB:
				{
				setState(340);
				sub_const_arifm_expr();
				}
				break;
			case T__5:
				{
				setState(341);
				b_const_arifm_expr();
				}
				break;
			case K_NULL:
				{
				setState(342);
				mynull();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(365);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(363);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new Const_arifm_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_const_arifm_expr);
						setState(345);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(346);
						concate();
						setState(347);
						const_arifm_expr(9);
						}
						break;
					case 2:
						{
						_localctx = new Const_arifm_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_const_arifm_expr);
						setState(349);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(352);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__8:
							{
							setState(350);
							mul();
							}
							break;
						case T__10:
							{
							setState(351);
							div();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(354);
						const_arifm_expr(8);
						}
						break;
					case 3:
						{
						_localctx = new Const_arifm_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_const_arifm_expr);
						setState(356);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(359);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__1:
							{
							setState(357);
							add();
							}
							break;
						case T__2:
							{
							setState(358);
							sub();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(361);
						const_arifm_expr(7);
						}
						break;
					}
					} 
				}
				setState(367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class Sub_arifm_exprContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(HelloParser.SUB, 0); }
		public Arifm_exprContext arifm_expr() {
			return getRuleContext(Arifm_exprContext.class,0);
		}
		public Sub_arifm_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_arifm_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSub_arifm_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSub_arifm_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitSub_arifm_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sub_arifm_exprContext sub_arifm_expr() throws RecognitionException {
		Sub_arifm_exprContext _localctx = new Sub_arifm_exprContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_sub_arifm_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(SUB);
			setState(369);
			arifm_expr(0);
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

	public static class B_arifm_exprContext extends ParserRuleContext {
		public Arifm_exprContext arifm_expr() {
			return getRuleContext(Arifm_exprContext.class,0);
		}
		public B_arifm_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_arifm_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterB_arifm_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitB_arifm_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitB_arifm_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final B_arifm_exprContext b_arifm_expr() throws RecognitionException {
		B_arifm_exprContext _localctx = new B_arifm_exprContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_b_arifm_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(T__5);
			setState(372);
			arifm_expr(0);
			setState(373);
			match(T__6);
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

	public static class Arifm_exprContext extends ParserRuleContext {
		public B_arifm_exprContext b_arifm_expr() {
			return getRuleContext(B_arifm_exprContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Const_arifm_exprContext const_arifm_expr() {
			return getRuleContext(Const_arifm_exprContext.class,0);
		}
		public Sub_arifm_exprContext sub_arifm_expr() {
			return getRuleContext(Sub_arifm_exprContext.class,0);
		}
		public List<Arifm_exprContext> arifm_expr() {
			return getRuleContexts(Arifm_exprContext.class);
		}
		public Arifm_exprContext arifm_expr(int i) {
			return getRuleContext(Arifm_exprContext.class,i);
		}
		public ConcateContext concate() {
			return getRuleContext(ConcateContext.class,0);
		}
		public MulContext mul() {
			return getRuleContext(MulContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public Arifm_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arifm_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterArifm_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitArifm_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitArifm_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arifm_exprContext arifm_expr() throws RecognitionException {
		return arifm_expr(0);
	}

	private Arifm_exprContext arifm_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arifm_exprContext _localctx = new Arifm_exprContext(_ctx, _parentState);
		Arifm_exprContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_arifm_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(376);
				b_arifm_expr();
				}
				break;
			case 2:
				{
				setState(377);
				name();
				}
				break;
			case 3:
				{
				setState(378);
				const_arifm_expr(0);
				}
				break;
			case 4:
				{
				setState(379);
				sub_arifm_expr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(400);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new Arifm_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arifm_expr);
						setState(382);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(383);
						concate();
						setState(384);
						arifm_expr(8);
						}
						break;
					case 2:
						{
						_localctx = new Arifm_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arifm_expr);
						setState(386);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(389);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__8:
							{
							setState(387);
							mul();
							}
							break;
						case T__10:
							{
							setState(388);
							div();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(391);
						arifm_expr(7);
						}
						break;
					case 3:
						{
						_localctx = new Arifm_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arifm_expr);
						setState(393);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(396);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__1:
							{
							setState(394);
							add();
							}
							break;
						case T__2:
							{
							setState(395);
							sub();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(398);
						arifm_expr(6);
						}
						break;
					}
					} 
				}
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class EqContext extends ParserRuleContext {
		public EqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqContext eq() throws RecognitionException {
		EqContext _localctx = new EqContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(T__12);
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

	public static class NeqContext extends ParserRuleContext {
		public NeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterNeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitNeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitNeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NeqContext neq() throws RecognitionException {
		NeqContext _localctx = new NeqContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_neq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(T__13);
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

	public static class MoreeqContext extends ParserRuleContext {
		public MoreeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moreeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMoreeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMoreeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMoreeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreeqContext moreeq() throws RecognitionException {
		MoreeqContext _localctx = new MoreeqContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_moreeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
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

	public static class MoreContext extends ParserRuleContext {
		public MoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_more; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoreContext more() throws RecognitionException {
		MoreContext _localctx = new MoreContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_more);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(T__16);
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

	public static class LessContext extends ParserRuleContext {
		public LessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_less; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitLess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitLess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LessContext less() throws RecognitionException {
		LessContext _localctx = new LessContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_less);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(T__17);
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

	public static class LesseqContext extends ParserRuleContext {
		public LesseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lesseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterLesseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitLesseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitLesseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LesseqContext lesseq() throws RecognitionException {
		LesseqContext _localctx = new LesseqContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_lesseq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			_la = _input.LA(1);
			if ( !(_la==T__18 || _la==T__19) ) {
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

	public static class Comp_op1Context extends ParserRuleContext {
		public EqContext eq() {
			return getRuleContext(EqContext.class,0);
		}
		public NeqContext neq() {
			return getRuleContext(NeqContext.class,0);
		}
		public Comp_op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterComp_op1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitComp_op1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitComp_op1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_op1Context comp_op1() throws RecognitionException {
		Comp_op1Context _localctx = new Comp_op1Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_comp_op1);
		try {
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				eq();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				neq();
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

	public static class Comp_op2Context extends ParserRuleContext {
		public MoreeqContext moreeq() {
			return getRuleContext(MoreeqContext.class,0);
		}
		public MoreContext more() {
			return getRuleContext(MoreContext.class,0);
		}
		public LessContext less() {
			return getRuleContext(LessContext.class,0);
		}
		public LesseqContext lesseq() {
			return getRuleContext(LesseqContext.class,0);
		}
		public Comp_op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterComp_op2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitComp_op2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitComp_op2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_op2Context comp_op2() throws RecognitionException {
		Comp_op2Context _localctx = new Comp_op2Context(_ctx, getState());
		enterRule(_localctx, 100, RULE_comp_op2);
		try {
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				moreeq();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				more();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(423);
				less();
				}
				break;
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				lesseq();
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

	public static class B_const_compare_exprContext extends ParserRuleContext {
		public Const_compare_exprContext const_compare_expr() {
			return getRuleContext(Const_compare_exprContext.class,0);
		}
		public B_const_compare_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_const_compare_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterB_const_compare_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitB_const_compare_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitB_const_compare_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final B_const_compare_exprContext b_const_compare_expr() throws RecognitionException {
		B_const_compare_exprContext _localctx = new B_const_compare_exprContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_b_const_compare_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(T__5);
			setState(428);
			const_compare_expr();
			setState(429);
			match(T__6);
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

	public static class Const_compare_exprContext extends ParserRuleContext {
		public List<Const_arifm_exprContext> const_arifm_expr() {
			return getRuleContexts(Const_arifm_exprContext.class);
		}
		public Const_arifm_exprContext const_arifm_expr(int i) {
			return getRuleContext(Const_arifm_exprContext.class,i);
		}
		public Comp_op1Context comp_op1() {
			return getRuleContext(Comp_op1Context.class,0);
		}
		public Comp_op2Context comp_op2() {
			return getRuleContext(Comp_op2Context.class,0);
		}
		public B_const_compare_exprContext b_const_compare_expr() {
			return getRuleContext(B_const_compare_exprContext.class,0);
		}
		public Const_compare_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_compare_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterConst_compare_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitConst_compare_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitConst_compare_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_compare_exprContext const_compare_expr() throws RecognitionException {
		Const_compare_exprContext _localctx = new Const_compare_exprContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_const_compare_expr);
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				const_arifm_expr(0);
				setState(432);
				comp_op1();
				setState(433);
				const_arifm_expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				const_arifm_expr(0);
				setState(436);
				comp_op2();
				setState(437);
				const_arifm_expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(439);
				b_const_compare_expr();
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

	public static class B_compare_exprContext extends ParserRuleContext {
		public Compare_exprContext compare_expr() {
			return getRuleContext(Compare_exprContext.class,0);
		}
		public B_compare_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_compare_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterB_compare_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitB_compare_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitB_compare_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final B_compare_exprContext b_compare_expr() throws RecognitionException {
		B_compare_exprContext _localctx = new B_compare_exprContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_b_compare_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(T__5);
			setState(443);
			compare_expr(0);
			setState(444);
			match(T__6);
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

	public static class Compare_exprContext extends ParserRuleContext {
		public B_compare_exprContext b_compare_expr() {
			return getRuleContext(B_compare_exprContext.class,0);
		}
		public Const_compare_exprContext const_compare_expr() {
			return getRuleContext(Const_compare_exprContext.class,0);
		}
		public Arifm_exprContext arifm_expr() {
			return getRuleContext(Arifm_exprContext.class,0);
		}
		public List<Compare_exprContext> compare_expr() {
			return getRuleContexts(Compare_exprContext.class);
		}
		public Compare_exprContext compare_expr(int i) {
			return getRuleContext(Compare_exprContext.class,i);
		}
		public Comp_op1Context comp_op1() {
			return getRuleContext(Comp_op1Context.class,0);
		}
		public Comp_op2Context comp_op2() {
			return getRuleContext(Comp_op2Context.class,0);
		}
		public Compare_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCompare_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCompare_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitCompare_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compare_exprContext compare_expr() throws RecognitionException {
		return compare_expr(0);
	}

	private Compare_exprContext compare_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Compare_exprContext _localctx = new Compare_exprContext(_ctx, _parentState);
		Compare_exprContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_compare_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(447);
				b_compare_expr();
				}
				break;
			case 2:
				{
				setState(448);
				const_compare_expr();
				}
				break;
			case 3:
				{
				setState(449);
				arifm_expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(460);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new Compare_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_compare_expr);
						setState(452);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(453);
						comp_op1();
						setState(454);
						compare_expr(6);
						}
						break;
					case 2:
						{
						_localctx = new Compare_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_compare_expr);
						setState(456);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(457);
						comp_op2();
						setState(458);
						compare_expr(5);
						}
						break;
					}
					} 
				}
				setState(464);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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

	public static class MytrueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(HelloParser.TRUE, 0); }
		public MytrueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mytrue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMytrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMytrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMytrue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MytrueContext mytrue() throws RecognitionException {
		MytrueContext _localctx = new MytrueContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_mytrue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(TRUE);
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

	public static class MyfalseContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(HelloParser.FALSE, 0); }
		public MyfalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myfalse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMyfalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMyfalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMyfalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyfalseContext myfalse() throws RecognitionException {
		MyfalseContext _localctx = new MyfalseContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_myfalse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(FALSE);
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

	public static class Logic_literalContext extends ParserRuleContext {
		public MytrueContext mytrue() {
			return getRuleContext(MytrueContext.class,0);
		}
		public MyfalseContext myfalse() {
			return getRuleContext(MyfalseContext.class,0);
		}
		public Logic_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterLogic_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitLogic_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitLogic_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_literalContext logic_literal() throws RecognitionException {
		Logic_literalContext _localctx = new Logic_literalContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_logic_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				{
				setState(469);
				mytrue();
				}
				break;
			case FALSE:
				{
				setState(470);
				myfalse();
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

	public static class Not_const_logic_exprContext extends ParserRuleContext {
		public Const_logic_exprContext const_logic_expr() {
			return getRuleContext(Const_logic_exprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(HelloParser.NOT, 0); }
		public Not_const_logic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_const_logic_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterNot_const_logic_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitNot_const_logic_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitNot_const_logic_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_const_logic_exprContext not_const_logic_expr() throws RecognitionException {
		Not_const_logic_exprContext _localctx = new Not_const_logic_exprContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_not_const_logic_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(474);
			const_logic_expr(0);
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

	public static class AndContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(HelloParser.AND, 0); }
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(AND);
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

	public static class OrContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(HelloParser.OR, 0); }
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(OR);
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

	public static class B_const_logic_exprContext extends ParserRuleContext {
		public Const_logic_exprContext const_logic_expr() {
			return getRuleContext(Const_logic_exprContext.class,0);
		}
		public B_const_logic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_const_logic_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterB_const_logic_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitB_const_logic_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitB_const_logic_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final B_const_logic_exprContext b_const_logic_expr() throws RecognitionException {
		B_const_logic_exprContext _localctx = new B_const_logic_exprContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_b_const_logic_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(T__5);
			setState(481);
			const_logic_expr(0);
			setState(482);
			match(T__6);
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

	public static class Const_logic_exprContext extends ParserRuleContext {
		public Logic_literalContext logic_literal() {
			return getRuleContext(Logic_literalContext.class,0);
		}
		public B_const_logic_exprContext b_const_logic_expr() {
			return getRuleContext(B_const_logic_exprContext.class,0);
		}
		public Not_const_logic_exprContext not_const_logic_expr() {
			return getRuleContext(Not_const_logic_exprContext.class,0);
		}
		public Const_compare_exprContext const_compare_expr() {
			return getRuleContext(Const_compare_exprContext.class,0);
		}
		public Const_arifm_exprContext const_arifm_expr() {
			return getRuleContext(Const_arifm_exprContext.class,0);
		}
		public List<Const_logic_exprContext> const_logic_expr() {
			return getRuleContexts(Const_logic_exprContext.class);
		}
		public Const_logic_exprContext const_logic_expr(int i) {
			return getRuleContext(Const_logic_exprContext.class,i);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public Const_logic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_logic_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterConst_logic_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitConst_logic_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitConst_logic_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_logic_exprContext const_logic_expr() throws RecognitionException {
		return const_logic_expr(0);
	}

	private Const_logic_exprContext const_logic_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Const_logic_exprContext _localctx = new Const_logic_exprContext(_ctx, _parentState);
		Const_logic_exprContext _prevctx = _localctx;
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_const_logic_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(485);
				logic_literal();
				}
				break;
			case 2:
				{
				setState(486);
				b_const_logic_expr();
				}
				break;
			case 3:
				{
				setState(487);
				not_const_logic_expr();
				}
				break;
			case 4:
				{
				setState(488);
				const_compare_expr();
				}
				break;
			case 5:
				{
				setState(489);
				const_arifm_expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(502);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(500);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new Const_logic_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_const_logic_expr);
						setState(492);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(493);
						or();
						setState(494);
						const_logic_expr(8);
						}
						break;
					case 2:
						{
						_localctx = new Const_logic_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_const_logic_expr);
						setState(496);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(497);
						and();
						setState(498);
						const_logic_expr(7);
						}
						break;
					}
					} 
				}
				setState(504);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

	public static class Not_logic_exprContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(HelloParser.NOT, 0); }
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public Not_logic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_logic_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterNot_logic_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitNot_logic_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitNot_logic_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_logic_exprContext not_logic_expr() throws RecognitionException {
		Not_logic_exprContext _localctx = new Not_logic_exprContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_not_logic_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(NOT);
			setState(506);
			logic_expr(0);
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

	public static class B_logic_exprContext extends ParserRuleContext {
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public B_logic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_logic_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterB_logic_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitB_logic_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitB_logic_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final B_logic_exprContext b_logic_expr() throws RecognitionException {
		B_logic_exprContext _localctx = new B_logic_exprContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_b_logic_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(T__5);
			setState(509);
			logic_expr(0);
			setState(510);
			match(T__6);
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

	public static class Logic_exprContext extends ParserRuleContext {
		public B_logic_exprContext b_logic_expr() {
			return getRuleContext(B_logic_exprContext.class,0);
		}
		public Not_logic_exprContext not_logic_expr() {
			return getRuleContext(Not_logic_exprContext.class,0);
		}
		public Const_logic_exprContext const_logic_expr() {
			return getRuleContext(Const_logic_exprContext.class,0);
		}
		public Compare_exprContext compare_expr() {
			return getRuleContext(Compare_exprContext.class,0);
		}
		public Arifm_exprContext arifm_expr() {
			return getRuleContext(Arifm_exprContext.class,0);
		}
		public List<Logic_exprContext> logic_expr() {
			return getRuleContexts(Logic_exprContext.class);
		}
		public Logic_exprContext logic_expr(int i) {
			return getRuleContext(Logic_exprContext.class,i);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public Logic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterLogic_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitLogic_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitLogic_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_exprContext logic_expr() throws RecognitionException {
		return logic_expr(0);
	}

	private Logic_exprContext logic_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logic_exprContext _localctx = new Logic_exprContext(_ctx, _parentState);
		Logic_exprContext _prevctx = _localctx;
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_logic_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(513);
				b_logic_expr();
				}
				break;
			case 2:
				{
				setState(514);
				not_logic_expr();
				}
				break;
			case 3:
				{
				setState(515);
				const_logic_expr(0);
				}
				break;
			case 4:
				{
				setState(516);
				compare_expr(0);
				}
				break;
			case 5:
				{
				setState(517);
				arifm_expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(530);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(528);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						_localctx = new Logic_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expr);
						setState(520);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(521);
						or();
						setState(522);
						logic_expr(8);
						}
						break;
					case 2:
						{
						_localctx = new Logic_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logic_expr);
						setState(524);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(525);
						and();
						setState(526);
						logic_expr(7);
						}
						break;
					}
					} 
				}
				setState(532);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	public static class Const_exprContext extends ParserRuleContext {
		public Const_arifm_exprContext const_arifm_expr() {
			return getRuleContext(Const_arifm_exprContext.class,0);
		}
		public Const_compare_exprContext const_compare_expr() {
			return getRuleContext(Const_compare_exprContext.class,0);
		}
		public Const_logic_exprContext const_logic_expr() {
			return getRuleContext(Const_logic_exprContext.class,0);
		}
		public Const_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterConst_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitConst_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitConst_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_exprContext const_expr() throws RecognitionException {
		Const_exprContext _localctx = new Const_exprContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_const_expr);
		try {
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(533);
				const_arifm_expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(534);
				const_compare_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(535);
				const_logic_expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public Const_exprContext const_expr() {
			return getRuleContext(Const_exprContext.class,0);
		}
		public Compare_exprContext compare_expr() {
			return getRuleContext(Compare_exprContext.class,0);
		}
		public Arifm_exprContext arifm_expr() {
			return getRuleContext(Arifm_exprContext.class,0);
		}
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_expr);
		try {
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				const_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
				compare_expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(540);
				arifm_expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(541);
				logic_expr(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 39:
			return const_arifm_expr_sempred((Const_arifm_exprContext)_localctx, predIndex);
		case 42:
			return arifm_expr_sempred((Arifm_exprContext)_localctx, predIndex);
		case 54:
			return compare_expr_sempred((Compare_exprContext)_localctx, predIndex);
		case 62:
			return const_logic_expr_sempred((Const_logic_exprContext)_localctx, predIndex);
		case 65:
			return logic_expr_sempred((Logic_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean const_arifm_expr_sempred(Const_arifm_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean arifm_expr_sempred(Arifm_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean compare_expr_sempred(Compare_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean const_logic_expr_sempred(Const_logic_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean logic_expr_sempred(Logic_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 7);
		case 11:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u0223\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\5\4\u0091\n\4\3\4\3\4\3\5\5\5\u0096\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\5\7\u00a0\n\7\3\b\3\b\3\b\3\b\5\b\u00a6\n\b\3\t\3\t\3\t\3\t\5\t\u00ac"+
		"\n\t\3\n\3\n\3\n\5\n\u00b1\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b9"+
		"\n\13\3\f\3\f\3\f\5\f\u00be\n\f\3\r\3\r\3\r\3\r\7\r\u00c4\n\r\f\r\16\r"+
		"\u00c7\13\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u00cf\n\16\f\16\16\16\u00d2"+
		"\13\16\3\16\3\16\3\17\3\17\3\17\7\17\u00d9\n\17\f\17\16\17\u00dc\13\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e5\n\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\7\22\u00ef\n\22\f\22\16\22\u00f2\13\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00fa\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0102\n\24\3\25\3\25\5\25\u0106\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\5\27\u0112\n\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\7\33\u0123\n\33\f\33\16\33\u0126"+
		"\13\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\7\36\u0133"+
		"\n\36\f\36\16\36\u0136\13\36\5\36\u0138\n\36\3\37\3\37\3\37\5\37\u013d"+
		"\n\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\3)\3)\3)\3)\3)\3)\5)\u015a\n)\3)\3)\3)\3)\3)\3)\3)\5)\u0163\n)\3"+
		")\3)\3)\3)\3)\5)\u016a\n)\3)\3)\7)\u016e\n)\f)\16)\u0171\13)\3*\3*\3*"+
		"\3+\3+\3+\3+\3,\3,\3,\3,\3,\5,\u017f\n,\3,\3,\3,\3,\3,\3,\3,\5,\u0188"+
		"\n,\3,\3,\3,\3,\3,\5,\u018f\n,\3,\3,\7,\u0193\n,\f,\16,\u0196\13,\3-\3"+
		"-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\5\63\u01a6\n\63"+
		"\3\64\3\64\3\64\3\64\5\64\u01ac\n\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u01bb\n\66\3\67\3\67\3\67\3\67\38"+
		"\38\38\38\58\u01c5\n8\38\38\38\38\38\38\38\38\78\u01cf\n8\f8\168\u01d2"+
		"\138\39\39\3:\3:\3;\3;\5;\u01da\n;\3<\3<\3<\3=\3=\3>\3>\3?\3?\3?\3?\3"+
		"@\3@\3@\3@\3@\3@\5@\u01ed\n@\3@\3@\3@\3@\3@\3@\3@\3@\7@\u01f7\n@\f@\16"+
		"@\u01fa\13@\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\5C\u0209\nC\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\7C\u0213\nC\fC\16C\u0216\13C\3D\3D\3D\5D\u021b\nD\3E"+
		"\3E\3E\3E\5E\u0221\nE\3E\2\7PVn~\u0084F\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\2\t\3\2\61\62\3\2\4\5\4\2\13\13\64\64\3\2,-\3"+
		"\2\21\22\3\2\25\26\4\2\27\27\'\'\2\u0227\2\u008a\3\2\2\2\4\u008c\3\2\2"+
		"\2\6\u008e\3\2\2\2\b\u0095\3\2\2\2\n\u0099\3\2\2\2\f\u009b\3\2\2\2\16"+
		"\u00a1\3\2\2\2\20\u00a7\3\2\2\2\22\u00b0\3\2\2\2\24\u00b8\3\2\2\2\26\u00bd"+
		"\3\2\2\2\30\u00bf\3\2\2\2\32\u00ca\3\2\2\2\34\u00d5\3\2\2\2\36\u00dd\3"+
		"\2\2\2 \u00e9\3\2\2\2\"\u00eb\3\2\2\2$\u00f9\3\2\2\2&\u00fb\3\2\2\2(\u0105"+
		"\3\2\2\2*\u0107\3\2\2\2,\u010b\3\2\2\2.\u0113\3\2\2\2\60\u0118\3\2\2\2"+
		"\62\u011b\3\2\2\2\64\u011f\3\2\2\2\66\u0127\3\2\2\28\u012a\3\2\2\2:\u0137"+
		"\3\2\2\2<\u0139\3\2\2\2>\u013e\3\2\2\2@\u0140\3\2\2\2B\u0143\3\2\2\2D"+
		"\u0147\3\2\2\2F\u0149\3\2\2\2H\u014b\3\2\2\2J\u014d\3\2\2\2L\u014f\3\2"+
		"\2\2N\u0151\3\2\2\2P\u0159\3\2\2\2R\u0172\3\2\2\2T\u0175\3\2\2\2V\u017e"+
		"\3\2\2\2X\u0197\3\2\2\2Z\u0199\3\2\2\2\\\u019b\3\2\2\2^\u019d\3\2\2\2"+
		"`\u019f\3\2\2\2b\u01a1\3\2\2\2d\u01a5\3\2\2\2f\u01ab\3\2\2\2h\u01ad\3"+
		"\2\2\2j\u01ba\3\2\2\2l\u01bc\3\2\2\2n\u01c4\3\2\2\2p\u01d3\3\2\2\2r\u01d5"+
		"\3\2\2\2t\u01d9\3\2\2\2v\u01db\3\2\2\2x\u01de\3\2\2\2z\u01e0\3\2\2\2|"+
		"\u01e2\3\2\2\2~\u01ec\3\2\2\2\u0080\u01fb\3\2\2\2\u0082\u01fe\3\2\2\2"+
		"\u0084\u0208\3\2\2\2\u0086\u021a\3\2\2\2\u0088\u0220\3\2\2\2\u008a\u008b"+
		"\t\2\2\2\u008b\3\3\2\2\2\u008c\u008d\7\63\2\2\u008d\5\3\2\2\2\u008e\u0090"+
		"\5\24\13\2\u008f\u0091\7\3\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2"+
		"\u0091\u0092\3\2\2\2\u0092\u0093\7\2\2\3\u0093\7\3\2\2\2\u0094\u0096\t"+
		"\3\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\7\62\2\2\u0098\t\3\2\2\2\u0099\u009a\7\64\2\2\u009a\13\3\2\2\2"+
		"\u009b\u009f\7.\2\2\u009c\u009d\7\6\2\2\u009d\u009e\7\61\2\2\u009e\u00a0"+
		"\7\7\2\2\u009f\u009c\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\r\3\2\2\2\u00a1"+
		"\u00a5\7/\2\2\u00a2\u00a3\7\b\2\2\u00a3\u00a4\7\61\2\2\u00a4\u00a6\7\t"+
		"\2\2\u00a5\u00a2\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\17\3\2\2\2\u00a7\u00ab"+
		"\7\60\2\2\u00a8\u00a9\7\b\2\2\u00a9\u00aa\7\61\2\2\u00aa\u00ac\7\t\2\2"+
		"\u00ab\u00a8\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\21\3\2\2\2\u00ad\u00b1"+
		"\5\16\b\2\u00ae\u00b1\5\20\t\2\u00af\u00b1\5\f\7\2\u00b0\u00ad\3\2\2\2"+
		"\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\23\3\2\2\2\u00b2\u00b9"+
		"\5\60\31\2\u00b3\u00b9\5\62\32\2\u00b4\u00b9\5.\30\2\u00b5\u00b9\5&\24"+
		"\2\u00b6\u00b9\5,\27\2\u00b7\u00b9\5\u0086D\2\u00b8\u00b2\3\2\2\2\u00b8"+
		"\u00b3\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b7\3\2\2\2\u00b9\25\3\2\2\2\u00ba\u00be\5\n\6\2\u00bb\u00be"+
		"\5\2\2\2\u00bc\u00be\5\u0084C\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb\3\2\2"+
		"\2\u00bd\u00bc\3\2\2\2\u00be\27\3\2\2\2\u00bf\u00c0\7\b\2\2\u00c0\u00c5"+
		"\5\26\f\2\u00c1\u00c2\7\n\2\2\u00c2\u00c4\5\26\f\2\u00c3\u00c1\3\2\2\2"+
		"\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7\t\2\2\u00c9\31\3\2\2\2\u00ca"+
		"\u00cb\7\b\2\2\u00cb\u00d0\5\30\r\2\u00cc\u00cd\7\n\2\2\u00cd\u00cf\5"+
		"\30\r\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7\t"+
		"\2\2\u00d4\33\3\2\2\2\u00d5\u00da\5\n\6\2\u00d6\u00d7\7\n\2\2\u00d7\u00d9"+
		"\5\n\6\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\35\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7\"\2"+
		"\2\u00de\u00df\7#\2\2\u00df\u00e4\5\n\6\2\u00e0\u00e1\7\b\2\2\u00e1\u00e2"+
		"\5\34\17\2\u00e2\u00e3\7\t\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e0\3\2\2\2"+
		"\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7$\2\2\u00e7\u00e8"+
		"\5\32\16\2\u00e8\37\3\2\2\2\u00e9\u00ea\t\4\2\2\u00ea!\3\2\2\2\u00eb\u00f0"+
		"\5 \21\2\u00ec\u00ed\7\n\2\2\u00ed\u00ef\5 \21\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1#\3\2\2\2"+
		"\u00f2\u00f0\3\2\2\2\u00f3\u00fa\5\n\6\2\u00f4\u00fa\5&\24\2\u00f5\u00f6"+
		"\7\b\2\2\u00f6\u00f7\5&\24\2\u00f7\u00f8\7\t\2\2\u00f8\u00fa\3\2\2\2\u00f9"+
		"\u00f3\3\2\2\2\u00f9\u00f4\3\2\2\2\u00f9\u00f5\3\2\2\2\u00fa%\3\2\2\2"+
		"\u00fb\u00fc\7\35\2\2\u00fc\u00fd\5\"\22\2\u00fd\u00fe\7\37\2\2\u00fe"+
		"\u0101\5$\23\2\u00ff\u0100\7\34\2\2\u0100\u0102\5\u0088E\2\u0101\u00ff"+
		"\3\2\2\2\u0101\u0102\3\2\2\2\u0102\'\3\2\2\2\u0103\u0106\5\n\6\2\u0104"+
		"\u0106\5\b\5\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106)\3\2\2\2"+
		"\u0107\u0108\5\n\6\2\u0108\u0109\7\f\2\2\u0109\u010a\5\u0088E\2\u010a"+
		"+\3\2\2\2\u010b\u010c\7\36\2\2\u010c\u010d\5\n\6\2\u010d\u010e\7!\2\2"+
		"\u010e\u0111\5*\26\2\u010f\u0110\7\34\2\2\u0110\u0112\5\u0084C\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112-\3\2\2\2\u0113\u0114\7\33\2\2"+
		"\u0114\u0115\7\30\2\2\u0115\u0116\7\32\2\2\u0116\u0117\5\64\33\2\u0117"+
		"/\3\2\2\2\u0118\u0119\7\30\2\2\u0119\u011a\5\66\34\2\u011a\61\3\2\2\2"+
		"\u011b\u011c\7\31\2\2\u011c\u011d\7\32\2\2\u011d\u011e\5\64\33\2\u011e"+
		"\63\3\2\2\2\u011f\u0124\5\n\6\2\u0120\u0121\7\n\2\2\u0121\u0123\5\n\6"+
		"\2\u0122\u0120\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125\65\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7\32\2\2\u0128"+
		"\u0129\58\35\2\u0129\67\3\2\2\2\u012a\u012b\5\n\6\2\u012b\u012c\7\b\2"+
		"\2\u012c\u012d\5:\36\2\u012d\u012e\7\t\2\2\u012e9\3\2\2\2\u012f\u0134"+
		"\5<\37\2\u0130\u0131\7\n\2\2\u0131\u0133\5<\37\2\u0132\u0130\3\2\2\2\u0133"+
		"\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0138\3\2"+
		"\2\2\u0136\u0134\3\2\2\2\u0137\u012f\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		";\3\2\2\2\u0139\u013a\5\n\6\2\u013a\u013c\5\22\n\2\u013b\u013d\5> \2\u013c"+
		"\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d=\3\2\2\2\u013e\u013f\t\5\2\2"+
		"\u013f?\3\2\2\2\u0140\u0141\7\66\2\2\u0141\u0142\5P)\2\u0142A\3\2\2\2"+
		"\u0143\u0144\7\b\2\2\u0144\u0145\5P)\2\u0145\u0146\7\t\2\2\u0146C\3\2"+
		"\2\2\u0147\u0148\7\13\2\2\u0148E\3\2\2\2\u0149\u014a\7\r\2\2\u014aG\3"+
		"\2\2\2\u014b\u014c\7\4\2\2\u014cI\3\2\2\2\u014d\u014e\7\5\2\2\u014eK\3"+
		"\2\2\2\u014f\u0150\7\16\2\2\u0150M\3\2\2\2\u0151\u0152\7 \2\2\u0152O\3"+
		"\2\2\2\u0153\u0154\b)\1\2\u0154\u015a\5\4\3\2\u0155\u015a\5\2\2\2\u0156"+
		"\u015a\5@!\2\u0157\u015a\5B\"\2\u0158\u015a\5N(\2\u0159\u0153\3\2\2\2"+
		"\u0159\u0155\3\2\2\2\u0159\u0156\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u0158"+
		"\3\2\2\2\u015a\u016f\3\2\2\2\u015b\u015c\f\n\2\2\u015c\u015d\5L\'\2\u015d"+
		"\u015e\5P)\13\u015e\u016e\3\2\2\2\u015f\u0162\f\t\2\2\u0160\u0163\5D#"+
		"\2\u0161\u0163\5F$\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163\u0164"+
		"\3\2\2\2\u0164\u0165\5P)\n\u0165\u016e\3\2\2\2\u0166\u0169\f\b\2\2\u0167"+
		"\u016a\5H%\2\u0168\u016a\5J&\2\u0169\u0167\3\2\2\2\u0169\u0168\3\2\2\2"+
		"\u016a\u016b\3\2\2\2\u016b\u016c\5P)\t\u016c\u016e\3\2\2\2\u016d\u015b"+
		"\3\2\2\2\u016d\u015f\3\2\2\2\u016d\u0166\3\2\2\2\u016e\u0171\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170Q\3\2\2\2\u0171\u016f\3\2\2\2"+
		"\u0172\u0173\7\66\2\2\u0173\u0174\5V,\2\u0174S\3\2\2\2\u0175\u0176\7\b"+
		"\2\2\u0176\u0177\5V,\2\u0177\u0178\7\t\2\2\u0178U\3\2\2\2\u0179\u017a"+
		"\b,\1\2\u017a\u017f\5T+\2\u017b\u017f\5\n\6\2\u017c\u017f\5P)\2\u017d"+
		"\u017f\5R*\2\u017e\u0179\3\2\2\2\u017e\u017b\3\2\2\2\u017e\u017c\3\2\2"+
		"\2\u017e\u017d\3\2\2\2\u017f\u0194\3\2\2\2\u0180\u0181\f\t\2\2\u0181\u0182"+
		"\5L\'\2\u0182\u0183\5V,\n\u0183\u0193\3\2\2\2\u0184\u0187\f\b\2\2\u0185"+
		"\u0188\5D#\2\u0186\u0188\5F$\2\u0187\u0185\3\2\2\2\u0187\u0186\3\2\2\2"+
		"\u0188\u0189\3\2\2\2\u0189\u018a\5V,\t\u018a\u0193\3\2\2\2\u018b\u018e"+
		"\f\7\2\2\u018c\u018f\5H%\2\u018d\u018f\5J&\2\u018e\u018c\3\2\2\2\u018e"+
		"\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\5V,\b\u0191\u0193\3\2\2"+
		"\2\u0192\u0180\3\2\2\2\u0192\u0184\3\2\2\2\u0192\u018b\3\2\2\2\u0193\u0196"+
		"\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195W\3\2\2\2\u0196"+
		"\u0194\3\2\2\2\u0197\u0198\7\17\2\2\u0198Y\3\2\2\2\u0199\u019a\7\20\2"+
		"\2\u019a[\3\2\2\2\u019b\u019c\t\6\2\2\u019c]\3\2\2\2\u019d\u019e\7\23"+
		"\2\2\u019e_\3\2\2\2\u019f\u01a0\7\24\2\2\u01a0a\3\2\2\2\u01a1\u01a2\t"+
		"\7\2\2\u01a2c\3\2\2\2\u01a3\u01a6\5X-\2\u01a4\u01a6\5Z.\2\u01a5\u01a3"+
		"\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6e\3\2\2\2\u01a7\u01ac\5\\/\2\u01a8\u01ac"+
		"\5^\60\2\u01a9\u01ac\5`\61\2\u01aa\u01ac\5b\62\2\u01ab\u01a7\3\2\2\2\u01ab"+
		"\u01a8\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01aa\3\2\2\2\u01acg\3\2\2\2"+
		"\u01ad\u01ae\7\b\2\2\u01ae\u01af\5j\66\2\u01af\u01b0\7\t\2\2\u01b0i\3"+
		"\2\2\2\u01b1\u01b2\5P)\2\u01b2\u01b3\5d\63\2\u01b3\u01b4\5P)\2\u01b4\u01bb"+
		"\3\2\2\2\u01b5\u01b6\5P)\2\u01b6\u01b7\5f\64\2\u01b7\u01b8\5P)\2\u01b8"+
		"\u01bb\3\2\2\2\u01b9\u01bb\5h\65\2\u01ba\u01b1\3\2\2\2\u01ba\u01b5\3\2"+
		"\2\2\u01ba\u01b9\3\2\2\2\u01bbk\3\2\2\2\u01bc\u01bd\7\b\2\2\u01bd\u01be"+
		"\5n8\2\u01be\u01bf\7\t\2\2\u01bfm\3\2\2\2\u01c0\u01c1\b8\1\2\u01c1\u01c5"+
		"\5l\67\2\u01c2\u01c5\5j\66\2\u01c3\u01c5\5V,\2\u01c4\u01c0\3\2\2\2\u01c4"+
		"\u01c2\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5\u01d0\3\2\2\2\u01c6\u01c7\f\7"+
		"\2\2\u01c7\u01c8\5d\63\2\u01c8\u01c9\5n8\b\u01c9\u01cf\3\2\2\2\u01ca\u01cb"+
		"\f\6\2\2\u01cb\u01cc\5f\64\2\u01cc\u01cd\5n8\7\u01cd\u01cf\3\2\2\2\u01ce"+
		"\u01c6\3\2\2\2\u01ce\u01ca\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2"+
		"\2\2\u01d0\u01d1\3\2\2\2\u01d1o\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4"+
		"\7(\2\2\u01d4q\3\2\2\2\u01d5\u01d6\7)\2\2\u01d6s\3\2\2\2\u01d7\u01da\5"+
		"p9\2\u01d8\u01da\5r:\2\u01d9\u01d7\3\2\2\2\u01d9\u01d8\3\2\2\2\u01dau"+
		"\3\2\2\2\u01db\u01dc\t\b\2\2\u01dc\u01dd\5~@\2\u01ddw\3\2\2\2\u01de\u01df"+
		"\7%\2\2\u01dfy\3\2\2\2\u01e0\u01e1\7&\2\2\u01e1{\3\2\2\2\u01e2\u01e3\7"+
		"\b\2\2\u01e3\u01e4\5~@\2\u01e4\u01e5\7\t\2\2\u01e5}\3\2\2\2\u01e6\u01e7"+
		"\b@\1\2\u01e7\u01ed\5t;\2\u01e8\u01ed\5|?\2\u01e9\u01ed\5v<\2\u01ea\u01ed"+
		"\5j\66\2\u01eb\u01ed\5P)\2\u01ec\u01e6\3\2\2\2\u01ec\u01e8\3\2\2\2\u01ec"+
		"\u01e9\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01eb\3\2\2\2\u01ed\u01f8\3\2"+
		"\2\2\u01ee\u01ef\f\t\2\2\u01ef\u01f0\5z>\2\u01f0\u01f1\5~@\n\u01f1\u01f7"+
		"\3\2\2\2\u01f2\u01f3\f\b\2\2\u01f3\u01f4\5x=\2\u01f4\u01f5\5~@\t\u01f5"+
		"\u01f7\3\2\2\2\u01f6\u01ee\3\2\2\2\u01f6\u01f2\3\2\2\2\u01f7\u01fa\3\2"+
		"\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\177\3\2\2\2\u01fa\u01f8"+
		"\3\2\2\2\u01fb\u01fc\7\'\2\2\u01fc\u01fd\5\u0084C\2\u01fd\u0081\3\2\2"+
		"\2\u01fe\u01ff\7\b\2\2\u01ff\u0200\5\u0084C\2\u0200\u0201\7\t\2\2\u0201"+
		"\u0083\3\2\2\2\u0202\u0203\bC\1\2\u0203\u0209\5\u0082B\2\u0204\u0209\5"+
		"\u0080A\2\u0205\u0209\5~@\2\u0206\u0209\5n8\2\u0207\u0209\5V,\2\u0208"+
		"\u0202\3\2\2\2\u0208\u0204\3\2\2\2\u0208\u0205\3\2\2\2\u0208\u0206\3\2"+
		"\2\2\u0208\u0207\3\2\2\2\u0209\u0214\3\2\2\2\u020a\u020b\f\t\2\2\u020b"+
		"\u020c\5z>\2\u020c\u020d\5\u0084C\n\u020d\u0213\3\2\2\2\u020e\u020f\f"+
		"\b\2\2\u020f\u0210\5x=\2\u0210\u0211\5\u0084C\t\u0211\u0213\3\2\2\2\u0212"+
		"\u020a\3\2\2\2\u0212\u020e\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2"+
		"\2\2\u0214\u0215\3\2\2\2\u0215\u0085\3\2\2\2\u0216\u0214\3\2\2\2\u0217"+
		"\u021b\5P)\2\u0218\u021b\5j\66\2\u0219\u021b\5~@\2\u021a\u0217\3\2\2\2"+
		"\u021a\u0218\3\2\2\2\u021a\u0219\3\2\2\2\u021b\u0087\3\2\2\2\u021c\u0221"+
		"\5\u0086D\2\u021d\u0221\5n8\2\u021e\u0221\5V,\2\u021f\u0221\5\u0084C\2"+
		"\u0220\u021c\3\2\2\2\u0220\u021d\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u021f"+
		"\3\2\2\2\u0221\u0089\3\2\2\2\60\u0090\u0095\u009f\u00a5\u00ab\u00b0\u00b8"+
		"\u00bd\u00c5\u00d0\u00da\u00e4\u00f0\u00f9\u0101\u0105\u0111\u0124\u0134"+
		"\u0137\u013c\u0159\u0162\u0169\u016d\u016f\u017e\u0187\u018e\u0192\u0194"+
		"\u01a5\u01ab\u01ba\u01c4\u01ce\u01d0\u01d9\u01ec\u01f6\u01f8\u0208\u0212"+
		"\u0214\u021a\u0220";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}