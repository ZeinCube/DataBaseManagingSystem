// Generated from /home/hehogcode/Workspace/DataBase/LogicModule/src/main/java/Logic/DBGrammar.g4 by ANTLR 4.8
package Logic.Parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DBGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, K_CREATE=21, K_DROP=22, K_TABLE=23, K_SHOW=24, 
		K_WHERE=25, K_WHEN=26, K_SELECT=27, K_UPDATE=28, K_FROM=29, K_NULL=30, 
		K_SET=31, K_INSERT=32, K_INTO=33, K_VALUES=34, K_AND=35, K_OR=36, NOT=37, 
		TRUE=38, FALSE=39, K_PRIMARY_KEY=40, K_UNIQUE=41, T_CHAR=42, T_INT=43, 
		T_FLOAT=44, STRING=45, STRING_LITERAL=46, IDENTIFIER=47, SPACE=48, ENTER=49, 
		UNEXPECTED=50, LETTER=51, NUMBER=52, NUMERIC_LITERAL=53;
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
		RULE_update_where = 33, RULE_expr = 34, RULE_not_num_value = 35, RULE_operand = 36, 
		RULE_binary_operator_sum_sub = 37, RULE_binary_operator_mul_del = 38, 
		RULE_binary_operator_comp = 39, RULE_binary_operator_eq = 40, RULE_literal_value = 41, 
		RULE_unary_operator = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"mynumber", "mystring", "signed_number", "name", "mychar", "myint", "myfloat", 
			"type", "parse", "sql_query", "show_create", "create", "drop", "table_name_list", 
			"table", "table_definition", "columns_sourse", "column_def", "column_constraint", 
			"select", "select_where", "table_or_subquery", "select_from", "select_what", 
			"result_column", "insert", "insert_colums", "insert_values", "insert_expr", 
			"update", "update_set", "update_idef", "update_expr", "update_where", 
			"expr", "not_num_value", "operand", "binary_operator_sum_sub", "binary_operator_mul_del", 
			"binary_operator_comp", "binary_operator_eq", "literal_value", "unary_operator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'['", "']'", "'('", "')'", "';'", "','", "'*'", 
			"'='", "'/'", "'%'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'<>'", 
			"'~'", null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "K_CREATE", "K_DROP", 
			"K_TABLE", "K_SHOW", "K_WHERE", "K_WHEN", "K_SELECT", "K_UPDATE", "K_FROM", 
			"K_NULL", "K_SET", "K_INSERT", "K_INTO", "K_VALUES", "K_AND", "K_OR", 
			"NOT", "TRUE", "FALSE", "K_PRIMARY_KEY", "K_UNIQUE", "T_CHAR", "T_INT", 
			"T_FLOAT", "STRING", "STRING_LITERAL", "IDENTIFIER", "SPACE", "ENTER", 
			"UNEXPECTED", "LETTER", "NUMBER", "NUMERIC_LITERAL"
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
	public String getGrammarFileName() { return "DBGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DBGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MynumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(DBGrammarParser.NUMBER, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(DBGrammarParser.NUMERIC_LITERAL, 0); }
		public MynumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mynumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterMynumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitMynumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitMynumber(this);
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
			setState(86);
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
		public TerminalNode STRING() { return getToken(DBGrammarParser.STRING, 0); }
		public MystringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mystring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterMystring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitMystring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitMystring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MystringContext mystring() throws RecognitionException {
		MystringContext _localctx = new MystringContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mystring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
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
		public TerminalNode NUMERIC_LITERAL() { return getToken(DBGrammarParser.NUMERIC_LITERAL, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(90);
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

			setState(93);
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
		public TerminalNode IDENTIFIER() { return getToken(DBGrammarParser.IDENTIFIER, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
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
		public TerminalNode T_CHAR() { return getToken(DBGrammarParser.T_CHAR, 0); }
		public TerminalNode NUMBER() { return getToken(DBGrammarParser.NUMBER, 0); }
		public MycharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mychar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterMychar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitMychar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitMychar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MycharContext mychar() throws RecognitionException {
		MycharContext _localctx = new MycharContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mychar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T_CHAR);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(98);
				match(T__2);
				setState(99);
				match(NUMBER);
				setState(100);
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
		public TerminalNode T_INT() { return getToken(DBGrammarParser.T_INT, 0); }
		public TerminalNode NUMBER() { return getToken(DBGrammarParser.NUMBER, 0); }
		public MyintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterMyint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitMyint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitMyint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyintContext myint() throws RecognitionException {
		MyintContext _localctx = new MyintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_myint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T_INT);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(104);
				match(T__4);
				setState(105);
				match(NUMBER);
				setState(106);
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
		public TerminalNode T_FLOAT() { return getToken(DBGrammarParser.T_FLOAT, 0); }
		public TerminalNode NUMBER() { return getToken(DBGrammarParser.NUMBER, 0); }
		public MyfloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myfloat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterMyfloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitMyfloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitMyfloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MyfloatContext myfloat() throws RecognitionException {
		MyfloatContext _localctx = new MyfloatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_myfloat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T_FLOAT);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(110);
				match(T__4);
				setState(111);
				match(NUMBER);
				setState(112);
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
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				myint();
				}
				break;
			case T_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				myfloat();
				}
				break;
			case T_CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
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
		public TerminalNode EOF() { return getToken(DBGrammarParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			sql_query();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(121);
				match(T__6);
				}
			}

			setState(124);
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
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterSql_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitSql_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitSql_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_queryContext sql_query() throws RecognitionException {
		Sql_queryContext _localctx = new Sql_queryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sql_query);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				create();
				}
				break;
			case K_DROP:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				drop();
				}
				break;
			case K_SHOW:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				show_create();
				}
				break;
			case K_SELECT:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				select();
				}
				break;
			case K_INSERT:
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				insert();
				}
				break;
			case K_UPDATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(131);
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
		public TerminalNode K_SHOW() { return getToken(DBGrammarParser.K_SHOW, 0); }
		public TerminalNode K_CREATE() { return getToken(DBGrammarParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(DBGrammarParser.K_TABLE, 0); }
		public Table_name_listContext table_name_list() {
			return getRuleContext(Table_name_listContext.class,0);
		}
		public Show_createContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterShow_create(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitShow_create(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitShow_create(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_createContext show_create() throws RecognitionException {
		Show_createContext _localctx = new Show_createContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_show_create);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(K_SHOW);
			setState(135);
			match(K_CREATE);
			setState(136);
			match(K_TABLE);
			setState(137);
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
		public TerminalNode K_CREATE() { return getToken(DBGrammarParser.K_CREATE, 0); }
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_create);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(K_CREATE);
			setState(140);
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
		public TerminalNode K_DROP() { return getToken(DBGrammarParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(DBGrammarParser.K_TABLE, 0); }
		public Table_name_listContext table_name_list() {
			return getRuleContext(Table_name_listContext.class,0);
		}
		public DropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterDrop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitDrop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitDrop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropContext drop() throws RecognitionException {
		DropContext _localctx = new DropContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_drop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(K_DROP);
			setState(143);
			match(K_TABLE);
			setState(144);
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
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterTable_name_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitTable_name_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitTable_name_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_name_listContext table_name_list() throws RecognitionException {
		Table_name_listContext _localctx = new Table_name_listContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_table_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			name();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(147);
				match(T__7);
				setState(148);
				name();
				}
				}
				setState(153);
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
		public TerminalNode K_TABLE() { return getToken(DBGrammarParser.K_TABLE, 0); }
		public Table_definitionContext table_definition() {
			return getRuleContext(Table_definitionContext.class,0);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(K_TABLE);
			setState(155);
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
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterTable_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitTable_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitTable_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_definitionContext table_definition() throws RecognitionException {
		Table_definitionContext _localctx = new Table_definitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_table_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			name();
			setState(158);
			match(T__4);
			setState(159);
			columns_sourse();
			setState(160);
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
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterColumns_sourse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitColumns_sourse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitColumns_sourse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Columns_sourseContext columns_sourse() throws RecognitionException {
		Columns_sourseContext _localctx = new Columns_sourseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_columns_sourse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(162);
				column_def();
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(163);
					match(T__7);
					setState(164);
					column_def();
					}
					}
					setState(169);
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
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			name();
			setState(173);
			type();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_PRIMARY_KEY || _la==K_UNIQUE) {
				{
				setState(174);
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
		public TerminalNode K_PRIMARY_KEY() { return getToken(DBGrammarParser.K_PRIMARY_KEY, 0); }
		public TerminalNode K_UNIQUE() { return getToken(DBGrammarParser.K_UNIQUE, 0); }
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
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
		public TerminalNode K_SELECT() { return getToken(DBGrammarParser.K_SELECT, 0); }
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
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(K_SELECT);
			setState(180);
			select_what();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FROM) {
				{
				setState(181);
				select_from();
				}
			}

			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(184);
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
		public TerminalNode K_WHERE() { return getToken(DBGrammarParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_whereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterSelect_where(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitSelect_where(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitSelect_where(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_whereContext select_where() throws RecognitionException {
		Select_whereContext _localctx = new Select_whereContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_select_where);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(K_WHERE);
			setState(188);
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
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_table_or_subquery);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				name();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(T__4);
				setState(192);
				select();
				setState(193);
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
		public TerminalNode K_FROM() { return getToken(DBGrammarParser.K_FROM, 0); }
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
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterSelect_from(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitSelect_from(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitSelect_from(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_fromContext select_from() throws RecognitionException {
		Select_fromContext _localctx = new Select_fromContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_select_from);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(K_FROM);
			setState(198);
			table_or_subquery();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(199);
				match(T__7);
				setState(200);
				table_or_subquery();
				}
				}
				setState(205);
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
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterSelect_what(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitSelect_what(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitSelect_what(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_whatContext select_what() throws RecognitionException {
		Select_whatContext _localctx = new Select_whatContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_select_what);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			result_column();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(207);
				match(T__7);
				setState(208);
				result_column();
				}
				}
				setState(213);
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
		public TerminalNode UNEXPECTED() { return getToken(DBGrammarParser.UNEXPECTED, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_result_column);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				name();
				setState(217);
				match(UNEXPECTED);
				setState(218);
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
		public TerminalNode K_INSERT() { return getToken(DBGrammarParser.K_INSERT, 0); }
		public TerminalNode K_INTO() { return getToken(DBGrammarParser.K_INTO, 0); }
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
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(K_INSERT);
			setState(223);
			match(K_INTO);
			setState(224);
			name();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(225);
				insert_colums();
				}
			}

			setState(228);
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
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterInsert_colums(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitInsert_colums(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitInsert_colums(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_columsContext insert_colums() throws RecognitionException {
		Insert_columsContext _localctx = new Insert_columsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_insert_colums);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__4);
			setState(231);
			name();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(232);
				match(T__7);
				setState(233);
				name();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
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
		public TerminalNode K_VALUES() { return getToken(DBGrammarParser.K_VALUES, 0); }
		public Insert_exprContext insert_expr() {
			return getRuleContext(Insert_exprContext.class,0);
		}
		public Insert_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterInsert_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitInsert_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitInsert_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_valuesContext insert_values() throws RecognitionException {
		Insert_valuesContext _localctx = new Insert_valuesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_insert_values);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(K_VALUES);
			setState(242);
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
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterInsert_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitInsert_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitInsert_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_exprContext insert_expr() throws RecognitionException {
		Insert_exprContext _localctx = new Insert_exprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_insert_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(T__4);
			setState(245);
			literal_value();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(246);
				match(T__7);
				setState(247);
				literal_value();
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
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
		public TerminalNode K_UPDATE() { return getToken(DBGrammarParser.K_UPDATE, 0); }
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
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(K_UPDATE);
			setState(256);
			name();
			setState(257);
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
		public TerminalNode K_SET() { return getToken(DBGrammarParser.K_SET, 0); }
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
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterUpdate_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitUpdate_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitUpdate_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_setContext update_set() throws RecognitionException {
		Update_setContext _localctx = new Update_setContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_update_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(K_SET);
			setState(260);
			update_idef();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(261);
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
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterUpdate_idef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitUpdate_idef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitUpdate_idef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_idefContext update_idef() throws RecognitionException {
		Update_idefContext _localctx = new Update_idefContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_update_idef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			update_expr();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(265);
				match(T__7);
				setState(266);
				update_expr();
				}
				}
				setState(271);
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
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterUpdate_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitUpdate_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitUpdate_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_exprContext update_expr() throws RecognitionException {
		Update_exprContext _localctx = new Update_exprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_update_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			name();
			setState(273);
			match(T__9);
			setState(274);
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
		public TerminalNode K_WHERE() { return getToken(DBGrammarParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Update_whereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterUpdate_where(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitUpdate_where(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitUpdate_where(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_whereContext update_where() throws RecognitionException {
		Update_whereContext _localctx = new Update_whereContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_update_where);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(K_WHERE);
			setState(277);
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
		public Not_num_valueContext not_num_value() {
			return getRuleContext(Not_num_valueContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode K_AND() { return getToken(DBGrammarParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(DBGrammarParser.K_OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
			case NUMBER:
			case NUMERIC_LITERAL:
				{
				setState(280);
				literal_value();
				}
				break;
			case T__0:
			case T__1:
			case T__19:
				{
				setState(281);
				unary_operator();
				setState(282);
				expr(11);
				}
				break;
			case IDENTIFIER:
				{
				setState(284);
				not_num_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(321);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(287);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(288);
						operand();
						setState(289);
						expr(10);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(291);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(292);
						operand();
						setState(293);
						expr(9);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(295);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(296);
						operand();
						setState(297);
						expr(8);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(299);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(300);
						operand();
						setState(301);
						expr(7);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(303);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(304);
						operand();
						setState(305);
						expr(6);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(307);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(308);
						operand();
						setState(309);
						expr(5);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(311);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(312);
						operand();
						setState(313);
						expr(4);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(315);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(316);
						match(K_AND);
						setState(317);
						expr(3);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(318);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(319);
						match(K_OR);
						setState(320);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class Not_num_valueContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode UNEXPECTED() { return getToken(DBGrammarParser.UNEXPECTED, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Not_num_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_num_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterNot_num_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitNot_num_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitNot_num_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_num_valueContext not_num_value() throws RecognitionException {
		Not_num_valueContext _localctx = new Not_num_valueContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_not_num_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(326);
				name();
				setState(327);
				match(UNEXPECTED);
				}
				break;
			}
			setState(331);
			name();
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(332);
				expr(0);
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

	public static class OperandContext extends ParserRuleContext {
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_operand);
		int _la;
		try {
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
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
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
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
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(337);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__10) | (1L << T__11))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(338);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__10) | (1L << T__11))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(339);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(340);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(341);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class Binary_operator_sum_subContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Binary_operator_sum_subContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operator_sum_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterBinary_operator_sum_sub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitBinary_operator_sum_sub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitBinary_operator_sum_sub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_operator_sum_subContext binary_operator_sum_sub() throws RecognitionException {
		Binary_operator_sum_subContext _localctx = new Binary_operator_sum_subContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_binary_operator_sum_sub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			literal_value();
			setState(345);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(346);
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

	public static class Binary_operator_mul_delContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Binary_operator_mul_delContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operator_mul_del; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterBinary_operator_mul_del(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitBinary_operator_mul_del(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitBinary_operator_mul_del(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_operator_mul_delContext binary_operator_mul_del() throws RecognitionException {
		Binary_operator_mul_delContext _localctx = new Binary_operator_mul_delContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_binary_operator_mul_del);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			literal_value();
			setState(349);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__10) | (1L << T__11))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(350);
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

	public static class Binary_operator_compContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Binary_operator_compContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operator_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterBinary_operator_comp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitBinary_operator_comp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitBinary_operator_comp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_operator_compContext binary_operator_comp() throws RecognitionException {
		Binary_operator_compContext _localctx = new Binary_operator_compContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_binary_operator_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			literal_value();
			setState(353);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(354);
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

	public static class Binary_operator_eqContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Binary_operator_eqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operator_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterBinary_operator_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitBinary_operator_eq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitBinary_operator_eq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_operator_eqContext binary_operator_eq() throws RecognitionException {
		Binary_operator_eqContext _localctx = new Binary_operator_eqContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_binary_operator_eq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			literal_value();
			setState(357);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(358);
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

	public static class Literal_valueContext extends ParserRuleContext {
		public MynumberContext mynumber() {
			return getRuleContext(MynumberContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(DBGrammarParser.STRING_LITERAL, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_literal_value);
		try {
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				mynumber();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
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
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBGrammarListener ) ((DBGrammarListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBGrammarVisitor ) return ((DBGrammarVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__19))) != 0)) ) {
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
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u0171\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\4\5\4^\n\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\5\6"+
		"h\n\6\3\7\3\7\3\7\3\7\5\7n\n\7\3\b\3\b\3\b\3\b\5\bt\n\b\3\t\3\t\3\t\5"+
		"\ty\n\t\3\n\3\n\5\n}\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0087"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\7\17\u0098\n\17\f\17\16\17\u009b\13\17\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\7\22\u00a8\n\22\f\22\16\22\u00ab\13\22\5"+
		"\22\u00ad\n\22\3\23\3\23\3\23\5\23\u00b2\n\23\3\24\3\24\3\25\3\25\3\25"+
		"\5\25\u00b9\n\25\3\25\5\25\u00bc\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\5\27\u00c6\n\27\3\30\3\30\3\30\3\30\7\30\u00cc\n\30\f\30\16\30"+
		"\u00cf\13\30\3\31\3\31\3\31\7\31\u00d4\n\31\f\31\16\31\u00d7\13\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u00df\n\32\3\33\3\33\3\33\3\33\5\33\u00e5"+
		"\n\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u00ed\n\34\f\34\16\34\u00f0\13"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u00fb\n\36\f\36"+
		"\16\36\u00fe\13\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \5 \u0109\n "+
		"\3!\3!\3!\7!\u010e\n!\f!\16!\u0111\13!\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$"+
		"\3$\3$\3$\3$\5$\u0120\n$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u0144\n$"+
		"\f$\16$\u0147\13$\3%\3%\3%\5%\u014c\n%\3%\3%\5%\u0150\n%\3&\3&\3&\3&\3"+
		"&\3&\3&\5&\u0159\n&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3"+
		"*\3+\3+\5+\u016d\n+\3,\3,\3,\2\3F-\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\t\3\2\66\67\3\2\3\4\3\2*+\4"+
		"\2\13\13\r\16\3\2\17\22\4\2\f\f\23\25\4\2\3\4\26\26\2\u0175\2X\3\2\2\2"+
		"\4Z\3\2\2\2\6]\3\2\2\2\ba\3\2\2\2\nc\3\2\2\2\fi\3\2\2\2\16o\3\2\2\2\20"+
		"x\3\2\2\2\22z\3\2\2\2\24\u0086\3\2\2\2\26\u0088\3\2\2\2\30\u008d\3\2\2"+
		"\2\32\u0090\3\2\2\2\34\u0094\3\2\2\2\36\u009c\3\2\2\2 \u009f\3\2\2\2\""+
		"\u00ac\3\2\2\2$\u00ae\3\2\2\2&\u00b3\3\2\2\2(\u00b5\3\2\2\2*\u00bd\3\2"+
		"\2\2,\u00c5\3\2\2\2.\u00c7\3\2\2\2\60\u00d0\3\2\2\2\62\u00de\3\2\2\2\64"+
		"\u00e0\3\2\2\2\66\u00e8\3\2\2\28\u00f3\3\2\2\2:\u00f6\3\2\2\2<\u0101\3"+
		"\2\2\2>\u0105\3\2\2\2@\u010a\3\2\2\2B\u0112\3\2\2\2D\u0116\3\2\2\2F\u011f"+
		"\3\2\2\2H\u014b\3\2\2\2J\u0158\3\2\2\2L\u015a\3\2\2\2N\u015e\3\2\2\2P"+
		"\u0162\3\2\2\2R\u0166\3\2\2\2T\u016c\3\2\2\2V\u016e\3\2\2\2XY\t\2\2\2"+
		"Y\3\3\2\2\2Z[\7/\2\2[\5\3\2\2\2\\^\t\3\2\2]\\\3\2\2\2]^\3\2\2\2^_\3\2"+
		"\2\2_`\7\67\2\2`\7\3\2\2\2ab\7\61\2\2b\t\3\2\2\2cg\7,\2\2de\7\5\2\2ef"+
		"\7\66\2\2fh\7\6\2\2gd\3\2\2\2gh\3\2\2\2h\13\3\2\2\2im\7-\2\2jk\7\7\2\2"+
		"kl\7\66\2\2ln\7\b\2\2mj\3\2\2\2mn\3\2\2\2n\r\3\2\2\2os\7.\2\2pq\7\7\2"+
		"\2qr\7\66\2\2rt\7\b\2\2sp\3\2\2\2st\3\2\2\2t\17\3\2\2\2uy\5\f\7\2vy\5"+
		"\16\b\2wy\5\n\6\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2y\21\3\2\2\2z|\5\24\13"+
		"\2{}\7\t\2\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7\2\2\3\177\23\3\2\2\2"+
		"\u0080\u0087\5\30\r\2\u0081\u0087\5\32\16\2\u0082\u0087\5\26\f\2\u0083"+
		"\u0087\5(\25\2\u0084\u0087\5\64\33\2\u0085\u0087\5<\37\2\u0086\u0080\3"+
		"\2\2\2\u0086\u0081\3\2\2\2\u0086\u0082\3\2\2\2\u0086\u0083\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\25\3\2\2\2\u0088\u0089\7\32\2"+
		"\2\u0089\u008a\7\27\2\2\u008a\u008b\7\31\2\2\u008b\u008c\5\34\17\2\u008c"+
		"\27\3\2\2\2\u008d\u008e\7\27\2\2\u008e\u008f\5\36\20\2\u008f\31\3\2\2"+
		"\2\u0090\u0091\7\30\2\2\u0091\u0092\7\31\2\2\u0092\u0093\5\34\17\2\u0093"+
		"\33\3\2\2\2\u0094\u0099\5\b\5\2\u0095\u0096\7\n\2\2\u0096\u0098\5\b\5"+
		"\2\u0097\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\35\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\31\2\2\u009d"+
		"\u009e\5 \21\2\u009e\37\3\2\2\2\u009f\u00a0\5\b\5\2\u00a0\u00a1\7\7\2"+
		"\2\u00a1\u00a2\5\"\22\2\u00a2\u00a3\7\b\2\2\u00a3!\3\2\2\2\u00a4\u00a9"+
		"\5$\23\2\u00a5\u00a6\7\n\2\2\u00a6\u00a8\5$\23\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ad\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00a4\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"#\3\2\2\2\u00ae\u00af\5\b\5\2\u00af\u00b1\5\20\t\2\u00b0\u00b2\5&\24\2"+
		"\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2%\3\2\2\2\u00b3\u00b4\t"+
		"\4\2\2\u00b4\'\3\2\2\2\u00b5\u00b6\7\35\2\2\u00b6\u00b8\5\60\31\2\u00b7"+
		"\u00b9\5.\30\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2"+
		"\2\2\u00ba\u00bc\5*\26\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		")\3\2\2\2\u00bd\u00be\7\33\2\2\u00be\u00bf\5F$\2\u00bf+\3\2\2\2\u00c0"+
		"\u00c6\5\b\5\2\u00c1\u00c2\7\7\2\2\u00c2\u00c3\5(\25\2\u00c3\u00c4\7\b"+
		"\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c0\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c6"+
		"-\3\2\2\2\u00c7\u00c8\7\37\2\2\u00c8\u00cd\5,\27\2\u00c9\u00ca\7\n\2\2"+
		"\u00ca\u00cc\5,\27\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce/\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00d5\5\62\32\2\u00d1\u00d2\7\n\2\2\u00d2\u00d4\5\62\32\2\u00d3\u00d1"+
		"\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\61\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00df\7\13\2\2\u00d9\u00df\5\b\5"+
		"\2\u00da\u00db\5\b\5\2\u00db\u00dc\7\64\2\2\u00dc\u00dd\7\13\2\2\u00dd"+
		"\u00df\3\2\2\2\u00de\u00d8\3\2\2\2\u00de\u00d9\3\2\2\2\u00de\u00da\3\2"+
		"\2\2\u00df\63\3\2\2\2\u00e0\u00e1\7\"\2\2\u00e1\u00e2\7#\2\2\u00e2\u00e4"+
		"\5\b\5\2\u00e3\u00e5\5\66\34\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2"+
		"\u00e5\u00e6\3\2\2\2\u00e6\u00e7\58\35\2\u00e7\65\3\2\2\2\u00e8\u00e9"+
		"\7\7\2\2\u00e9\u00ee\5\b\5\2\u00ea\u00eb\7\n\2\2\u00eb\u00ed\5\b\5\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7\b\2\2\u00f2"+
		"\67\3\2\2\2\u00f3\u00f4\7$\2\2\u00f4\u00f5\5:\36\2\u00f59\3\2\2\2\u00f6"+
		"\u00f7\7\7\2\2\u00f7\u00fc\5T+\2\u00f8\u00f9\7\n\2\2\u00f9\u00fb\5T+\2"+
		"\u00fa\u00f8\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd"+
		"\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\7\b\2\2\u0100"+
		";\3\2\2\2\u0101\u0102\7\36\2\2\u0102\u0103\5\b\5\2\u0103\u0104\5> \2\u0104"+
		"=\3\2\2\2\u0105\u0106\7!\2\2\u0106\u0108\5@!\2\u0107\u0109\5D#\2\u0108"+
		"\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109?\3\2\2\2\u010a\u010f\5B\"\2\u010b"+
		"\u010c\7\n\2\2\u010c\u010e\5B\"\2\u010d\u010b\3\2\2\2\u010e\u0111\3\2"+
		"\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110A\3\2\2\2\u0111\u010f"+
		"\3\2\2\2\u0112\u0113\5\b\5\2\u0113\u0114\7\f\2\2\u0114\u0115\5F$\2\u0115"+
		"C\3\2\2\2\u0116\u0117\7\33\2\2\u0117\u0118\5F$\2\u0118E\3\2\2\2\u0119"+
		"\u011a\b$\1\2\u011a\u0120\5T+\2\u011b\u011c\5V,\2\u011c\u011d\5F$\r\u011d"+
		"\u0120\3\2\2\2\u011e\u0120\5H%\2\u011f\u0119\3\2\2\2\u011f\u011b\3\2\2"+
		"\2\u011f\u011e\3\2\2\2\u0120\u0145\3\2\2\2\u0121\u0122\f\13\2\2\u0122"+
		"\u0123\5J&\2\u0123\u0124\5F$\f\u0124\u0144\3\2\2\2\u0125\u0126\f\n\2\2"+
		"\u0126\u0127\5J&\2\u0127\u0128\5F$\13\u0128\u0144\3\2\2\2\u0129\u012a"+
		"\f\t\2\2\u012a\u012b\5J&\2\u012b\u012c\5F$\n\u012c\u0144\3\2\2\2\u012d"+
		"\u012e\f\b\2\2\u012e\u012f\5J&\2\u012f\u0130\5F$\t\u0130\u0144\3\2\2\2"+
		"\u0131\u0132\f\7\2\2\u0132\u0133\5J&\2\u0133\u0134\5F$\b\u0134\u0144\3"+
		"\2\2\2\u0135\u0136\f\6\2\2\u0136\u0137\5J&\2\u0137\u0138\5F$\7\u0138\u0144"+
		"\3\2\2\2\u0139\u013a\f\5\2\2\u013a\u013b\5J&\2\u013b\u013c\5F$\6\u013c"+
		"\u0144\3\2\2\2\u013d\u013e\f\4\2\2\u013e\u013f\7%\2\2\u013f\u0144\5F$"+
		"\5\u0140\u0141\f\3\2\2\u0141\u0142\7&\2\2\u0142\u0144\5F$\4\u0143\u0121"+
		"\3\2\2\2\u0143\u0125\3\2\2\2\u0143\u0129\3\2\2\2\u0143\u012d\3\2\2\2\u0143"+
		"\u0131\3\2\2\2\u0143\u0135\3\2\2\2\u0143\u0139\3\2\2\2\u0143\u013d\3\2"+
		"\2\2\u0143\u0140\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146G\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\5\b\5\2"+
		"\u0149\u014a\7\64\2\2\u014a\u014c\3\2\2\2\u014b\u0148\3\2\2\2\u014b\u014c"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\5\b\5\2\u014e\u0150\5F$\2\u014f"+
		"\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150I\3\2\2\2\u0151\u0159\t\3\2\2"+
		"\u0152\u0159\t\3\2\2\u0153\u0159\t\5\2\2\u0154\u0159\t\5\2\2\u0155\u0159"+
		"\t\6\2\2\u0156\u0159\t\7\2\2\u0157\u0159\t\6\2\2\u0158\u0151\3\2\2\2\u0158"+
		"\u0152\3\2\2\2\u0158\u0153\3\2\2\2\u0158\u0154\3\2\2\2\u0158\u0155\3\2"+
		"\2\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159K\3\2\2\2\u015a\u015b"+
		"\5T+\2\u015b\u015c\t\3\2\2\u015c\u015d\5F$\2\u015dM\3\2\2\2\u015e\u015f"+
		"\5T+\2\u015f\u0160\t\5\2\2\u0160\u0161\5F$\2\u0161O\3\2\2\2\u0162\u0163"+
		"\5T+\2\u0163\u0164\t\6\2\2\u0164\u0165\5F$\2\u0165Q\3\2\2\2\u0166\u0167"+
		"\5T+\2\u0167\u0168\t\7\2\2\u0168\u0169\5F$\2\u0169S\3\2\2\2\u016a\u016d"+
		"\5\2\2\2\u016b\u016d\7\60\2\2\u016c\u016a\3\2\2\2\u016c\u016b\3\2\2\2"+
		"\u016dU\3\2\2\2\u016e\u016f\t\b\2\2\u016fW\3\2\2\2\37]gmsx|\u0086\u0099"+
		"\u00a9\u00ac\u00b1\u00b8\u00bb\u00c5\u00cd\u00d5\u00de\u00e4\u00ee\u00fc"+
		"\u0108\u010f\u011f\u0143\u0145\u014b\u014f\u0158\u016c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}