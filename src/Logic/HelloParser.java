// Generated from /home/botinok/Documents/ghjk/DataBaseManagingSystem/src/Logic/Hello.g4 by ANTLR 4.7.2
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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, K_CREATE=26, K_DROP=27, K_TABLE=28, K_SHOW=29, K_WHERE=30, K_WHEN=31, 
		K_SELECT=32, K_UPDATE=33, K_FROM=34, K_NULL=35, K_SET=36, K_INSERT=37, 
		K_INTO=38, K_VALUES=39, K_AND=40, K_OR=41, NOT=42, TRUE=43, FALSE=44, 
		K_PRIMARY_KEY=45, K_UNIQUE=46, T_CHAR=47, T_INT=48, T_FLOAT=49, STRING=50, 
		STRING_LITERAL=51, IDENTIFIER=52, SPACE=53, ENTER=54, UNEXPECTED=55, LETTER=56, 
		NUMBER=57, NUMERIC_LITERAL=58;
	public static final int
		RULE_mynumber = 0, RULE_mystring = 1, RULE_signed_number = 2, RULE_name = 3, 
		RULE_mychar = 4, RULE_myint = 5, RULE_myfloat = 6, RULE_type = 7, RULE_parse = 8, 
		RULE_sql_query = 9, RULE_show_create = 10, RULE_create = 11, RULE_drop = 12, 
		RULE_table_name_list = 13, RULE_table = 14, RULE_table_definition = 15, 
		RULE_columns_sourse = 16, RULE_column_def = 17, RULE_column_constraint = 18, 
		RULE_select = 19, RULE_select_where = 20, RULE_table_or_subquery = 21, 
		RULE_select_from = 22, RULE_select_what = 23, RULE_result_column = 24, 
		RULE_insert = 25, RULE_insert_colums = 26, RULE_insert_values = 27, RULE_insert_expr = 28, 
		RULE_update = 29, RULE_update_set = 30, RULE_update_idef = 31, RULE_update_expr = 32, 
		RULE_update_where = 33, RULE_expr = 34, RULE_literal_value = 35, RULE_unary_operator = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"mynumber", "mystring", "signed_number", "name", "mychar", "myint", "myfloat", 
			"type", "parse", "sql_query", "show_create", "create", "drop", "table_name_list", 
			"table", "table_definition", "columns_sourse", "column_def", "column_constraint", 
			"select", "select_where", "table_or_subquery", "select_from", "select_what", 
			"result_column", "insert", "insert_colums", "insert_values", "insert_expr", 
			"update", "update_set", "update_idef", "update_expr", "update_where", 
			"expr", "literal_value", "unary_operator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'['", "']'", "'('", "')'", "';'", "','", "'*'", 
			"'='", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", 
			"'>'", "'>='", "'=='", "'!='", "'<>'", "'~'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "K_CREATE", "K_DROP", "K_TABLE", "K_SHOW", "K_WHERE", "K_WHEN", 
			"K_SELECT", "K_UPDATE", "K_FROM", "K_NULL", "K_SET", "K_INSERT", "K_INTO", 
			"K_VALUES", "K_AND", "K_OR", "NOT", "TRUE", "FALSE", "K_PRIMARY_KEY", 
			"K_UNIQUE", "T_CHAR", "T_INT", "T_FLOAT", "STRING", "STRING_LITERAL", 
			"IDENTIFIER", "SPACE", "ENTER", "UNEXPECTED", "LETTER", "NUMBER", "NUMERIC_LITERAL"
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
	}

	public final MynumberContext mynumber() throws RecognitionException {
		MynumberContext _localctx = new MynumberContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mynumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
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
	}

	public final MystringContext mystring() throws RecognitionException {
		MystringContext _localctx = new MystringContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mystring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
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
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(78);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(81);
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
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
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
	}

	public final MycharContext mychar() throws RecognitionException {
		MycharContext _localctx = new MycharContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mychar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T_CHAR);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(86);
				match(T__2);
				setState(87);
				match(NUMBER);
				setState(88);
				match(T__3);
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
	}

	public final MyintContext myint() throws RecognitionException {
		MyintContext _localctx = new MyintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_myint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T_INT);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(92);
				match(T__4);
				setState(93);
				match(NUMBER);
				setState(94);
				match(T__5);
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
	}

	public final MyfloatContext myfloat() throws RecognitionException {
		MyfloatContext _localctx = new MyfloatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_myfloat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T_FLOAT);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(98);
				match(T__4);
				setState(99);
				match(NUMBER);
				setState(100);
				match(T__5);
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
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				myint();
				}
				break;
			case T_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				myfloat();
				}
				break;
			case T_CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
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
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			sql_query();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(109);
				match(T__6);
				}
			}

			setState(112);
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
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
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
	}

	public final Sql_queryContext sql_query() throws RecognitionException {
		Sql_queryContext _localctx = new Sql_queryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sql_query);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				create();
				}
				break;
			case K_DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				drop();
				}
				break;
			case K_SHOW:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				show_create();
				}
				break;
			case K_SELECT:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				select();
				}
				break;
			case K_INSERT:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				insert();
				}
				break;
			case K_UPDATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				update();
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
	}

	public final Show_createContext show_create() throws RecognitionException {
		Show_createContext _localctx = new Show_createContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_show_create);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(K_SHOW);
			setState(123);
			match(K_CREATE);
			setState(124);
			match(K_TABLE);
			setState(125);
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
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_create);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(K_CREATE);
			setState(128);
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
	}

	public final DropContext drop() throws RecognitionException {
		DropContext _localctx = new DropContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_drop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(K_DROP);
			setState(131);
			match(K_TABLE);
			setState(132);
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
	}

	public final Table_name_listContext table_name_list() throws RecognitionException {
		Table_name_listContext _localctx = new Table_name_listContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_table_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			name();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(135);
				match(T__7);
				setState(136);
				name();
				}
				}
				setState(141);
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
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(K_TABLE);
			setState(143);
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
	}

	public final Table_definitionContext table_definition() throws RecognitionException {
		Table_definitionContext _localctx = new Table_definitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_table_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			name();
			setState(146);
			match(T__4);
			setState(147);
			columns_sourse();
			setState(148);
			match(T__5);
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
	}

	public final Columns_sourseContext columns_sourse() throws RecognitionException {
		Columns_sourseContext _localctx = new Columns_sourseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_columns_sourse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(150);
				column_def();
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(151);
					match(T__7);
					setState(152);
					column_def();
					}
					}
					setState(157);
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
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			name();
			setState(161);
			type();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_PRIMARY_KEY || _la==K_UNIQUE) {
				{
				setState(162);
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
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
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

	public static class SelectContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(HelloParser.K_SELECT, 0); }
		public Select_whatContext select_what() {
			return getRuleContext(Select_whatContext.class,0);
		}
		public Select_fromContext select_from() {
			return getRuleContext(Select_fromContext.class,0);
		}
		public Select_whereContext select_where() {
			return getRuleContext(Select_whereContext.class,0);
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
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(K_SELECT);
			setState(168);
			select_what();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FROM) {
				{
				setState(169);
				select_from();
				}
			}

			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(172);
				select_where();
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

	public static class Select_whereContext extends ParserRuleContext {
		public TerminalNode K_WHERE() { return getToken(HelloParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_whereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSelect_where(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSelect_where(this);
		}
	}

	public final Select_whereContext select_where() throws RecognitionException {
		Select_whereContext _localctx = new Select_whereContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_select_where);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(K_WHERE);
			setState(176);
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

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTable_or_subquery(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_table_or_subquery);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				name();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(T__4);
				setState(180);
				select();
				setState(181);
				match(T__5);
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

	public static class Select_fromContext extends ParserRuleContext {
		public TerminalNode K_FROM() { return getToken(HelloParser.K_FROM, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Select_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSelect_from(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSelect_from(this);
		}
	}

	public final Select_fromContext select_from() throws RecognitionException {
		Select_fromContext _localctx = new Select_fromContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_select_from);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(K_FROM);
			setState(186);
			table_or_subquery();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(187);
				match(T__7);
				setState(188);
				table_or_subquery();
				}
				}
				setState(193);
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

	public static class Select_whatContext extends ParserRuleContext {
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public Select_whatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_what; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSelect_what(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSelect_what(this);
		}
	}

	public final Select_whatContext select_what() throws RecognitionException {
		Select_whatContext _localctx = new Select_whatContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_select_what);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			result_column();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(195);
				match(T__7);
				setState(196);
				result_column();
				}
				}
				setState(201);
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

	public static class Result_columnContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode UNEXPECTED() { return getToken(HelloParser.UNEXPECTED, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitResult_column(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_result_column);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				name();
				setState(205);
				match(UNEXPECTED);
				setState(206);
				match(T__8);
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

	public static class InsertContext extends ParserRuleContext {
		public TerminalNode K_INSERT() { return getToken(HelloParser.K_INSERT, 0); }
		public TerminalNode K_INTO() { return getToken(HelloParser.K_INTO, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
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
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(K_INSERT);
			setState(211);
			match(K_INTO);
			setState(212);
			name();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(213);
				insert_colums();
				}
			}

			setState(216);
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
	}

	public final Insert_columsContext insert_colums() throws RecognitionException {
		Insert_columsContext _localctx = new Insert_columsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_insert_colums);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__4);
			setState(219);
			name();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(220);
				match(T__7);
				setState(221);
				name();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			match(T__5);
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
		public TerminalNode K_VALUES() { return getToken(HelloParser.K_VALUES, 0); }
		public Insert_exprContext insert_expr() {
			return getRuleContext(Insert_exprContext.class,0);
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
	}

	public final Insert_valuesContext insert_values() throws RecognitionException {
		Insert_valuesContext _localctx = new Insert_valuesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_insert_values);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(K_VALUES);
			setState(230);
			insert_expr();
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

	public static class Insert_exprContext extends ParserRuleContext {
		public List<Literal_valueContext> literal_value() {
			return getRuleContexts(Literal_valueContext.class);
		}
		public Literal_valueContext literal_value(int i) {
			return getRuleContext(Literal_valueContext.class,i);
		}
		public Insert_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterInsert_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitInsert_expr(this);
		}
	}

	public final Insert_exprContext insert_expr() throws RecognitionException {
		Insert_exprContext _localctx = new Insert_exprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_insert_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__4);
			setState(233);
			literal_value();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(234);
				match(T__7);
				setState(235);
				literal_value();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
			match(T__5);
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
		public Update_setContext update_set() {
			return getRuleContext(Update_setContext.class,0);
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
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(K_UPDATE);
			setState(244);
			name();
			setState(245);
			update_set();
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

	public static class Update_setContext extends ParserRuleContext {
		public TerminalNode K_SET() { return getToken(HelloParser.K_SET, 0); }
		public Update_idefContext update_idef() {
			return getRuleContext(Update_idefContext.class,0);
		}
		public Update_whereContext update_where() {
			return getRuleContext(Update_whereContext.class,0);
		}
		public Update_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterUpdate_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitUpdate_set(this);
		}
	}

	public final Update_setContext update_set() throws RecognitionException {
		Update_setContext _localctx = new Update_setContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_update_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(K_SET);
			setState(248);
			update_idef();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(249);
				update_where();
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

	public static class Update_idefContext extends ParserRuleContext {
		public List<Update_exprContext> update_expr() {
			return getRuleContexts(Update_exprContext.class);
		}
		public Update_exprContext update_expr(int i) {
			return getRuleContext(Update_exprContext.class,i);
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
	}

	public final Update_idefContext update_idef() throws RecognitionException {
		Update_idefContext _localctx = new Update_idefContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_update_idef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			update_expr();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(253);
				match(T__7);
				setState(254);
				update_expr();
				}
				}
				setState(259);
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

	public static class Update_exprContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Update_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterUpdate_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitUpdate_expr(this);
		}
	}

	public final Update_exprContext update_expr() throws RecognitionException {
		Update_exprContext _localctx = new Update_exprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_update_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			name();
			setState(261);
			match(T__9);
			setState(262);
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

	public static class Update_whereContext extends ParserRuleContext {
		public TerminalNode K_WHERE() { return getToken(HelloParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Update_whereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterUpdate_where(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitUpdate_where(this);
		}
	}

	public final Update_whereContext update_where() throws RecognitionException {
		Update_whereContext _localctx = new Update_whereContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_update_where);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(K_WHERE);
			setState(265);
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
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode UNEXPECTED() { return getToken(HelloParser.UNEXPECTED, 0); }
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public TerminalNode K_AND() { return getToken(HelloParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(HelloParser.K_OR, 0); }
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
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(268);
				literal_value();
				}
				break;
			case 2:
				{
				setState(269);
				unary_operator();
				setState(270);
				expr(13);
				}
				break;
			case 3:
				{
				setState(275);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(272);
					name();
					setState(273);
					match(UNEXPECTED);
					}
					break;
				}
				setState(277);
				name();
				}
				break;
			case 4:
				{
				setState(281);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(278);
					name();
					setState(279);
					match(UNEXPECTED);
					}
					break;
				}
				setState(283);
				name();
				setState(284);
				expr(10);
				}
				break;
			case 5:
				{
				setState(286);
				match(T__4);
				setState(287);
				expr(0);
				setState(288);
				match(T__5);
				}
				break;
			case 6:
				{
				setState(290);
				match(T__4);
				setState(291);
				select();
				setState(292);
				match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(320);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(296);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(297);
						match(T__10);
						setState(298);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(299);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(300);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__11) | (1L << T__12))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(301);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(302);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(303);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(304);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(305);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(306);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(307);
						expr(8);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(308);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(309);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(310);
						expr(7);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(311);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(312);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(313);
						expr(6);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(314);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(315);
						match(K_AND);
						setState(316);
						expr(5);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(317);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(318);
						match(K_OR);
						setState(319);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		public MynumberContext mynumber() {
			return getRuleContext(MynumberContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(HelloParser.STRING_LITERAL, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitLiteral_value(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_literal_value);
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				mynumber();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(STRING_LITERAL);
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitUnary_operator(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__24))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 34:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u014e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\5\4R\n\4\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\6\3\6\5\6\\\n\6\3\7\3\7\3\7\3\7\5\7b\n\7\3\b\3\b"+
		"\3\b\3\b\5\bh\n\b\3\t\3\t\3\t\5\tm\n\t\3\n\3\n\5\nq\n\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13{\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u008c\n\17\f\17\16\17\u008f\13\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\7\22\u009c\n\22"+
		"\f\22\16\22\u009f\13\22\5\22\u00a1\n\22\3\23\3\23\3\23\5\23\u00a6\n\23"+
		"\3\24\3\24\3\25\3\25\3\25\5\25\u00ad\n\25\3\25\5\25\u00b0\n\25\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u00ba\n\27\3\30\3\30\3\30\3\30"+
		"\7\30\u00c0\n\30\f\30\16\30\u00c3\13\30\3\31\3\31\3\31\7\31\u00c8\n\31"+
		"\f\31\16\31\u00cb\13\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00d3\n\32"+
		"\3\33\3\33\3\33\3\33\5\33\u00d9\n\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34"+
		"\u00e1\n\34\f\34\16\34\u00e4\13\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\7\36\u00ef\n\36\f\36\16\36\u00f2\13\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \5 \u00fd\n \3!\3!\3!\7!\u0102\n!\f!\16!\u0105\13!"+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0116\n$\3$\3$\3"+
		"$\3$\5$\u011c\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0129\n$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u0143"+
		"\n$\f$\16$\u0146\13$\3%\3%\5%\u014a\n%\3&\3&\3&\2\3F\'\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\n\3\2;<\3\2"+
		"\3\4\3\2/\60\4\2\13\13\16\17\3\2\20\23\3\2\24\27\4\2\f\f\30\32\4\2\3\4"+
		"\33\33\2\u0154\2L\3\2\2\2\4N\3\2\2\2\6Q\3\2\2\2\bU\3\2\2\2\nW\3\2\2\2"+
		"\f]\3\2\2\2\16c\3\2\2\2\20l\3\2\2\2\22n\3\2\2\2\24z\3\2\2\2\26|\3\2\2"+
		"\2\30\u0081\3\2\2\2\32\u0084\3\2\2\2\34\u0088\3\2\2\2\36\u0090\3\2\2\2"+
		" \u0093\3\2\2\2\"\u00a0\3\2\2\2$\u00a2\3\2\2\2&\u00a7\3\2\2\2(\u00a9\3"+
		"\2\2\2*\u00b1\3\2\2\2,\u00b9\3\2\2\2.\u00bb\3\2\2\2\60\u00c4\3\2\2\2\62"+
		"\u00d2\3\2\2\2\64\u00d4\3\2\2\2\66\u00dc\3\2\2\28\u00e7\3\2\2\2:\u00ea"+
		"\3\2\2\2<\u00f5\3\2\2\2>\u00f9\3\2\2\2@\u00fe\3\2\2\2B\u0106\3\2\2\2D"+
		"\u010a\3\2\2\2F\u0128\3\2\2\2H\u0149\3\2\2\2J\u014b\3\2\2\2LM\t\2\2\2"+
		"M\3\3\2\2\2NO\7\64\2\2O\5\3\2\2\2PR\t\3\2\2QP\3\2\2\2QR\3\2\2\2RS\3\2"+
		"\2\2ST\7<\2\2T\7\3\2\2\2UV\7\66\2\2V\t\3\2\2\2W[\7\61\2\2XY\7\5\2\2YZ"+
		"\7;\2\2Z\\\7\6\2\2[X\3\2\2\2[\\\3\2\2\2\\\13\3\2\2\2]a\7\62\2\2^_\7\7"+
		"\2\2_`\7;\2\2`b\7\b\2\2a^\3\2\2\2ab\3\2\2\2b\r\3\2\2\2cg\7\63\2\2de\7"+
		"\7\2\2ef\7;\2\2fh\7\b\2\2gd\3\2\2\2gh\3\2\2\2h\17\3\2\2\2im\5\f\7\2jm"+
		"\5\16\b\2km\5\n\6\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2m\21\3\2\2\2np\5\24\13"+
		"\2oq\7\t\2\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\2\2\3s\23\3\2\2\2t{\5\30"+
		"\r\2u{\5\32\16\2v{\5\26\f\2w{\5(\25\2x{\5\64\33\2y{\5<\37\2zt\3\2\2\2"+
		"zu\3\2\2\2zv\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2{\25\3\2\2\2|}\7\37"+
		"\2\2}~\7\34\2\2~\177\7\36\2\2\177\u0080\5\34\17\2\u0080\27\3\2\2\2\u0081"+
		"\u0082\7\34\2\2\u0082\u0083\5\36\20\2\u0083\31\3\2\2\2\u0084\u0085\7\35"+
		"\2\2\u0085\u0086\7\36\2\2\u0086\u0087\5\34\17\2\u0087\33\3\2\2\2\u0088"+
		"\u008d\5\b\5\2\u0089\u008a\7\n\2\2\u008a\u008c\5\b\5\2\u008b\u0089\3\2"+
		"\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\35\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7\36\2\2\u0091\u0092\5 \21"+
		"\2\u0092\37\3\2\2\2\u0093\u0094\5\b\5\2\u0094\u0095\7\7\2\2\u0095\u0096"+
		"\5\"\22\2\u0096\u0097\7\b\2\2\u0097!\3\2\2\2\u0098\u009d\5$\23\2\u0099"+
		"\u009a\7\n\2\2\u009a\u009c\5$\23\2\u009b\u0099\3\2\2\2\u009c\u009f\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a1\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u0098\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1#\3\2\2\2"+
		"\u00a2\u00a3\5\b\5\2\u00a3\u00a5\5\20\t\2\u00a4\u00a6\5&\24\2\u00a5\u00a4"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6%\3\2\2\2\u00a7\u00a8\t\4\2\2\u00a8"+
		"\'\3\2\2\2\u00a9\u00aa\7\"\2\2\u00aa\u00ac\5\60\31\2\u00ab\u00ad\5.\30"+
		"\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00b0"+
		"\5*\26\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0)\3\2\2\2\u00b1"+
		"\u00b2\7 \2\2\u00b2\u00b3\5F$\2\u00b3+\3\2\2\2\u00b4\u00ba\5\b\5\2\u00b5"+
		"\u00b6\7\7\2\2\u00b6\u00b7\5(\25\2\u00b7\u00b8\7\b\2\2\u00b8\u00ba\3\2"+
		"\2\2\u00b9\u00b4\3\2\2\2\u00b9\u00b5\3\2\2\2\u00ba-\3\2\2\2\u00bb\u00bc"+
		"\7$\2\2\u00bc\u00c1\5,\27\2\u00bd\u00be\7\n\2\2\u00be\u00c0\5,\27\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2/\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c9\5\62\32\2\u00c5\u00c6"+
		"\7\n\2\2\u00c6\u00c8\5\62\32\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2"+
		"\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\61\3\2\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cc\u00d3\7\13\2\2\u00cd\u00d3\5\b\5\2\u00ce\u00cf\5\b\5\2"+
		"\u00cf\u00d0\79\2\2\u00d0\u00d1\7\13\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00cc"+
		"\3\2\2\2\u00d2\u00cd\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d3\63\3\2\2\2\u00d4"+
		"\u00d5\7\'\2\2\u00d5\u00d6\7(\2\2\u00d6\u00d8\5\b\5\2\u00d7\u00d9\5\66"+
		"\34\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00db\58\35\2\u00db\65\3\2\2\2\u00dc\u00dd\7\7\2\2\u00dd\u00e2\5\b\5"+
		"\2\u00de\u00df\7\n\2\2\u00df\u00e1\5\b\5\2\u00e0\u00de\3\2\2\2\u00e1\u00e4"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e6\7\b\2\2\u00e6\67\3\2\2\2\u00e7\u00e8\7)\2\2"+
		"\u00e8\u00e9\5:\36\2\u00e99\3\2\2\2\u00ea\u00eb\7\7\2\2\u00eb\u00f0\5"+
		"H%\2\u00ec\u00ed\7\n\2\2\u00ed\u00ef\5H%\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2"+
		"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f4\7\b\2\2\u00f4;\3\2\2\2\u00f5\u00f6\7#\2\2\u00f6"+
		"\u00f7\5\b\5\2\u00f7\u00f8\5> \2\u00f8=\3\2\2\2\u00f9\u00fa\7&\2\2\u00fa"+
		"\u00fc\5@!\2\u00fb\u00fd\5D#\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2"+
		"\u00fd?\3\2\2\2\u00fe\u0103\5B\"\2\u00ff\u0100\7\n\2\2\u0100\u0102\5B"+
		"\"\2\u0101\u00ff\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104A\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\5\b\5\2"+
		"\u0107\u0108\7\f\2\2\u0108\u0109\5F$\2\u0109C\3\2\2\2\u010a\u010b\7 \2"+
		"\2\u010b\u010c\5F$\2\u010cE\3\2\2\2\u010d\u010e\b$\1\2\u010e\u0129\5H"+
		"%\2\u010f\u0110\5J&\2\u0110\u0111\5F$\17\u0111\u0129\3\2\2\2\u0112\u0113"+
		"\5\b\5\2\u0113\u0114\79\2\2\u0114\u0116\3\2\2\2\u0115\u0112\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0129\5\b\5\2\u0118\u0119\5\b"+
		"\5\2\u0119\u011a\79\2\2\u011a\u011c\3\2\2\2\u011b\u0118\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\5\b\5\2\u011e\u011f\5F"+
		"$\f\u011f\u0129\3\2\2\2\u0120\u0121\7\7\2\2\u0121\u0122\5F$\2\u0122\u0123"+
		"\7\b\2\2\u0123\u0129\3\2\2\2\u0124\u0125\7\7\2\2\u0125\u0126\5(\25\2\u0126"+
		"\u0127\7\b\2\2\u0127\u0129\3\2\2\2\u0128\u010d\3\2\2\2\u0128\u010f\3\2"+
		"\2\2\u0128\u0115\3\2\2\2\u0128\u011b\3\2\2\2\u0128\u0120\3\2\2\2\u0128"+
		"\u0124\3\2\2\2\u0129\u0144\3\2\2\2\u012a\u012b\f\16\2\2\u012b\u012c\7"+
		"\r\2\2\u012c\u0143\5F$\17\u012d\u012e\f\13\2\2\u012e\u012f\t\5\2\2\u012f"+
		"\u0143\5F$\f\u0130\u0131\f\n\2\2\u0131\u0132\t\3\2\2\u0132\u0143\5F$\13"+
		"\u0133\u0134\f\t\2\2\u0134\u0135\t\6\2\2\u0135\u0143\5F$\n\u0136\u0137"+
		"\f\b\2\2\u0137\u0138\t\7\2\2\u0138\u0143\5F$\t\u0139\u013a\f\7\2\2\u013a"+
		"\u013b\t\b\2\2\u013b\u0143\5F$\b\u013c\u013d\f\6\2\2\u013d\u013e\7*\2"+
		"\2\u013e\u0143\5F$\7\u013f\u0140\f\5\2\2\u0140\u0141\7+\2\2\u0141\u0143"+
		"\5F$\6\u0142\u012a\3\2\2\2\u0142\u012d\3\2\2\2\u0142\u0130\3\2\2\2\u0142"+
		"\u0133\3\2\2\2\u0142\u0136\3\2\2\2\u0142\u0139\3\2\2\2\u0142\u013c\3\2"+
		"\2\2\u0142\u013f\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145G\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u014a\5\2\2\2"+
		"\u0148\u014a\7\65\2\2\u0149\u0147\3\2\2\2\u0149\u0148\3\2\2\2\u014aI\3"+
		"\2\2\2\u014b\u014c\t\t\2\2\u014cK\3\2\2\2\36Q[aglpz\u008d\u009d\u00a0"+
		"\u00a5\u00ac\u00af\u00b9\u00c1\u00c9\u00d2\u00d8\u00e2\u00f0\u00fc\u0103"+
		"\u0115\u011b\u0128\u0142\u0144\u0149";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}