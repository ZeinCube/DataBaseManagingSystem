// Generated from D:/IDEA Projects/DataBaseManagingSystem/src/Logic\Hello.g4 by ANTLR 4.7.2
package Logic;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
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
		IDENTIFIER=50, UNEXPECTED=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "K_CREATE", "K_DROP", "K_TABLE", 
			"K_SHOW", "K_WHERE", "K_SELECT", "K_UPDATE", "K_FROM", "K_NULL", "K_SET", 
			"K_INSERT", "K_INTO", "K_VALUES", "AND", "OR", "NOT", "TRUE", "FALSE", 
			"SPACE", "ENTER", "K_PRIMARY_KEY", "K_UNIQUE", "T_CHAR", "T_INT", "T_FLOAT", 
			"NUMBER", "NUMERIC_LITERAL", "STRING", "IDENTIFIER", "UNEXPECTED", "DIGIT", 
			"LETTER", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", 
			"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
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
			"UNEXPECTED"
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


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u01c7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&"+
		"\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\6)\u0135\n)\r)\16)"+
		"\u0136\3)\3)\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,"+
		"\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/"+
		"\3/\3/\3/\3/\3\60\6\60\u016a\n\60\r\60\16\60\u016b\3\61\6\61\u016f\n\61"+
		"\r\61\16\61\u0170\3\61\3\61\7\61\u0175\n\61\f\61\16\61\u0178\13\61\5\61"+
		"\u017a\n\61\3\62\3\62\3\62\3\62\7\62\u0180\n\62\f\62\16\62\u0183\13\62"+
		"\3\62\3\62\3\63\3\63\7\63\u0189\n\63\f\63\16\63\u018c\13\63\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>"+
		"\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I"+
		"\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\2\2Q\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2"+
		"\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2"+
		"\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f\2\3\2#"+
		"\5\2\13\f\17\17\"\"\3\2\f\f\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\4"+
		"\2C\\c|\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJ"+
		"jj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2"+
		"SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4"+
		"\2\\\\||\2\u01b2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3\u00a1\3\2\2"+
		"\2\5\u00a3\3\2\2\2\7\u00a5\3\2\2\2\t\u00a7\3\2\2\2\13\u00a9\3\2\2\2\r"+
		"\u00ab\3\2\2\2\17\u00ad\3\2\2\2\21\u00af\3\2\2\2\23\u00b1\3\2\2\2\25\u00b3"+
		"\3\2\2\2\27\u00b5\3\2\2\2\31\u00b7\3\2\2\2\33\u00b9\3\2\2\2\35\u00bc\3"+
		"\2\2\2\37\u00bf\3\2\2\2!\u00c2\3\2\2\2#\u00c5\3\2\2\2%\u00c7\3\2\2\2\'"+
		"\u00c9\3\2\2\2)\u00cc\3\2\2\2+\u00cf\3\2\2\2-\u00d1\3\2\2\2/\u00d8\3\2"+
		"\2\2\61\u00dd\3\2\2\2\63\u00e3\3\2\2\2\65\u00e8\3\2\2\2\67\u00ee\3\2\2"+
		"\29\u00f5\3\2\2\2;\u00fc\3\2\2\2=\u0101\3\2\2\2?\u0106\3\2\2\2A\u010a"+
		"\3\2\2\2C\u0111\3\2\2\2E\u0116\3\2\2\2G\u011d\3\2\2\2I\u0121\3\2\2\2K"+
		"\u0124\3\2\2\2M\u0128\3\2\2\2O\u012d\3\2\2\2Q\u0134\3\2\2\2S\u013a\3\2"+
		"\2\2U\u013c\3\2\2\2W\u0148\3\2\2\2Y\u014f\3\2\2\2[\u015a\3\2\2\2]\u0162"+
		"\3\2\2\2_\u0169\3\2\2\2a\u016e\3\2\2\2c\u017b\3\2\2\2e\u0186\3\2\2\2g"+
		"\u018d\3\2\2\2i\u018f\3\2\2\2k\u0191\3\2\2\2m\u0193\3\2\2\2o\u0195\3\2"+
		"\2\2q\u0197\3\2\2\2s\u0199\3\2\2\2u\u019b\3\2\2\2w\u019d\3\2\2\2y\u019f"+
		"\3\2\2\2{\u01a1\3\2\2\2}\u01a3\3\2\2\2\177\u01a5\3\2\2\2\u0081\u01a7\3"+
		"\2\2\2\u0083\u01a9\3\2\2\2\u0085\u01ab\3\2\2\2\u0087\u01ad\3\2\2\2\u0089"+
		"\u01af\3\2\2\2\u008b\u01b1\3\2\2\2\u008d\u01b3\3\2\2\2\u008f\u01b5\3\2"+
		"\2\2\u0091\u01b7\3\2\2\2\u0093\u01b9\3\2\2\2\u0095\u01bb\3\2\2\2\u0097"+
		"\u01bd\3\2\2\2\u0099\u01bf\3\2\2\2\u009b\u01c1\3\2\2\2\u009d\u01c3\3\2"+
		"\2\2\u009f\u01c5\3\2\2\2\u00a1\u00a2\7=\2\2\u00a2\4\3\2\2\2\u00a3\u00a4"+
		"\7-\2\2\u00a4\6\3\2\2\2\u00a5\u00a6\7/\2\2\u00a6\b\3\2\2\2\u00a7\u00a8"+
		"\7]\2\2\u00a8\n\3\2\2\2\u00a9\u00aa\7_\2\2\u00aa\f\3\2\2\2\u00ab\u00ac"+
		"\7*\2\2\u00ac\16\3\2\2\2\u00ad\u00ae\7+\2\2\u00ae\20\3\2\2\2\u00af\u00b0"+
		"\7.\2\2\u00b0\22\3\2\2\2\u00b1\u00b2\7,\2\2\u00b2\24\3\2\2\2\u00b3\u00b4"+
		"\7?\2\2\u00b4\26\3\2\2\2\u00b5\u00b6\7\61\2\2\u00b6\30\3\2\2\2\u00b7\u00b8"+
		"\7~\2\2\u00b8\32\3\2\2\2\u00b9\u00ba\7?\2\2\u00ba\u00bb\7?\2\2\u00bb\34"+
		"\3\2\2\2\u00bc\u00bd\7#\2\2\u00bd\u00be\7?\2\2\u00be\36\3\2\2\2\u00bf"+
		"\u00c0\7@\2\2\u00c0\u00c1\7?\2\2\u00c1 \3\2\2\2\u00c2\u00c3\7?\2\2\u00c3"+
		"\u00c4\7@\2\2\u00c4\"\3\2\2\2\u00c5\u00c6\7@\2\2\u00c6$\3\2\2\2\u00c7"+
		"\u00c8\7>\2\2\u00c8&\3\2\2\2\u00c9\u00ca\7>\2\2\u00ca\u00cb\7?\2\2\u00cb"+
		"(\3\2\2\2\u00cc\u00cd\7?\2\2\u00cd\u00ce\7>\2\2\u00ce*\3\2\2\2\u00cf\u00d0"+
		"\7#\2\2\u00d0,\3\2\2\2\u00d1\u00d2\5q9\2\u00d2\u00d3\5\u008fH\2\u00d3"+
		"\u00d4\5u;\2\u00d4\u00d5\5m\67\2\u00d5\u00d6\5\u0093J\2\u00d6\u00d7\5"+
		"u;\2\u00d7.\3\2\2\2\u00d8\u00d9\5s:\2\u00d9\u00da\5\u008fH\2\u00da\u00db"+
		"\5\u0089E\2\u00db\u00dc\5\u008bF\2\u00dc\60\3\2\2\2\u00dd\u00de\5\u0093"+
		"J\2\u00de\u00df\5m\67\2\u00df\u00e0\5o8\2\u00e0\u00e1\5\u0083B\2\u00e1"+
		"\u00e2\5u;\2\u00e2\62\3\2\2\2\u00e3\u00e4\5\u0091I\2\u00e4\u00e5\5{>\2"+
		"\u00e5\u00e6\5\u0089E\2\u00e6\u00e7\5\u0099M\2\u00e7\64\3\2\2\2\u00e8"+
		"\u00e9\5\u0099M\2\u00e9\u00ea\5{>\2\u00ea\u00eb\5u;\2\u00eb\u00ec\5\u008f"+
		"H\2\u00ec\u00ed\5u;\2\u00ed\66\3\2\2\2\u00ee\u00ef\5\u0091I\2\u00ef\u00f0"+
		"\5u;\2\u00f0\u00f1\5\u0083B\2\u00f1\u00f2\5u;\2\u00f2\u00f3\5q9\2\u00f3"+
		"\u00f4\5\u0093J\2\u00f48\3\2\2\2\u00f5\u00f6\5\u0095K\2\u00f6\u00f7\5"+
		"\u008bF\2\u00f7\u00f8\5s:\2\u00f8\u00f9\5m\67\2\u00f9\u00fa\5\u0093J\2"+
		"\u00fa\u00fb\5u;\2\u00fb:\3\2\2\2\u00fc\u00fd\5w<\2\u00fd\u00fe\5\u008f"+
		"H\2\u00fe\u00ff\5\u0089E\2\u00ff\u0100\5\u0085C\2\u0100<\3\2\2\2\u0101"+
		"\u0102\5\u0087D\2\u0102\u0103\5\u0095K\2\u0103\u0104\5\u0083B\2\u0104"+
		"\u0105\5\u0083B\2\u0105>\3\2\2\2\u0106\u0107\5\u0091I\2\u0107\u0108\5"+
		"u;\2\u0108\u0109\5\u0093J\2\u0109@\3\2\2\2\u010a\u010b\5}?\2\u010b\u010c"+
		"\5\u0087D\2\u010c\u010d\5\u0091I\2\u010d\u010e\5u;\2\u010e\u010f\5\u008f"+
		"H\2\u010f\u0110\5\u0093J\2\u0110B\3\2\2\2\u0111\u0112\5}?\2\u0112\u0113"+
		"\5\u0087D\2\u0113\u0114\5\u0093J\2\u0114\u0115\5\u0089E\2\u0115D\3\2\2"+
		"\2\u0116\u0117\5\u0097L\2\u0117\u0118\5m\67\2\u0118\u0119\5\u0083B\2\u0119"+
		"\u011a\5\u0095K\2\u011a\u011b\5u;\2\u011b\u011c\5\u0091I\2\u011cF\3\2"+
		"\2\2\u011d\u011e\5m\67\2\u011e\u011f\5\u0087D\2\u011f\u0120\5s:\2\u0120"+
		"H\3\2\2\2\u0121\u0122\5\u0089E\2\u0122\u0123\5\u008fH\2\u0123J\3\2\2\2"+
		"\u0124\u0125\5\u0087D\2\u0125\u0126\5\u0089E\2\u0126\u0127\5\u0093J\2"+
		"\u0127L\3\2\2\2\u0128\u0129\5\u0093J\2\u0129\u012a\5\u008fH\2\u012a\u012b"+
		"\5\u0095K\2\u012b\u012c\5u;\2\u012cN\3\2\2\2\u012d\u012e\5w<\2\u012e\u012f"+
		"\5m\67\2\u012f\u0130\5\u0083B\2\u0130\u0131\5\u0091I\2\u0131\u0132\5u"+
		";\2\u0132P\3\2\2\2\u0133\u0135\t\2\2\2\u0134\u0133\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u0139\b)\2\2\u0139R\3\2\2\2\u013a\u013b\t\3\2\2\u013bT\3\2\2\2\u013c"+
		"\u013d\5\u008bF\2\u013d\u013e\5\u008fH\2\u013e\u013f\5}?\2\u013f\u0140"+
		"\5\u0085C\2\u0140\u0141\5m\67\2\u0141\u0142\5\u008fH\2\u0142\u0143\5\u009d"+
		"O\2\u0143\u0144\5Q)\2\u0144\u0145\5\u0081A\2\u0145\u0146\5u;\2\u0146\u0147"+
		"\5\u009dO\2\u0147V\3\2\2\2\u0148\u0149\5\u0095K\2\u0149\u014a\5\u0087"+
		"D\2\u014a\u014b\5}?\2\u014b\u014c\5\u008dG\2\u014c\u014d\5\u0095K\2\u014d"+
		"\u014e\5u;\2\u014eX\3\2\2\2\u014f\u0150\5q9\2\u0150\u0151\5{>\2\u0151"+
		"\u0152\5m\67\2\u0152\u0153\5\u008fH\2\u0153\u0154\5m\67\2\u0154\u0155"+
		"\5q9\2\u0155\u0156\5{>\2\u0156\u0157\5\u0093J\2\u0157\u0158\5u;\2\u0158"+
		"\u0159\5\u008fH\2\u0159Z\3\2\2\2\u015a\u015b\5}?\2\u015b\u015c\5\u0087"+
		"D\2\u015c\u015d\5\u0093J\2\u015d\u015e\5u;\2\u015e\u015f\5y=\2\u015f\u0160"+
		"\5u;\2\u0160\u0161\5\u008fH\2\u0161\\\3\2\2\2\u0162\u0163\5w<\2\u0163"+
		"\u0164\5\u0083B\2\u0164\u0165\5\u0089E\2\u0165\u0166\5m\67\2\u0166\u0167"+
		"\5\u0093J\2\u0167^\3\2\2\2\u0168\u016a\5i\65\2\u0169\u0168\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c`\3\2\2\2"+
		"\u016d\u016f\5i\65\2\u016e\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e"+
		"\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0179\3\2\2\2\u0172\u0176\7\60\2\2"+
		"\u0173\u0175\5i\65\2\u0174\u0173\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174"+
		"\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0179"+
		"\u0172\3\2\2\2\u0179\u017a\3\2\2\2\u017ab\3\2\2\2\u017b\u0181\7$\2\2\u017c"+
		"\u0180\n\4\2\2\u017d\u017e\7$\2\2\u017e\u0180\7$\2\2\u017f\u017c\3\2\2"+
		"\2\u017f\u017d\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182"+
		"\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0185\7$\2\2\u0185"+
		"d\3\2\2\2\u0186\u018a\t\5\2\2\u0187\u0189\t\6\2\2\u0188\u0187\3\2\2\2"+
		"\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018bf\3"+
		"\2\2\2\u018c\u018a\3\2\2\2\u018d\u018e\7\60\2\2\u018eh\3\2\2\2\u018f\u0190"+
		"\t\7\2\2\u0190j\3\2\2\2\u0191\u0192\t\b\2\2\u0192l\3\2\2\2\u0193\u0194"+
		"\t\t\2\2\u0194n\3\2\2\2\u0195\u0196\t\n\2\2\u0196p\3\2\2\2\u0197\u0198"+
		"\t\13\2\2\u0198r\3\2\2\2\u0199\u019a\t\f\2\2\u019at\3\2\2\2\u019b\u019c"+
		"\t\r\2\2\u019cv\3\2\2\2\u019d\u019e\t\16\2\2\u019ex\3\2\2\2\u019f\u01a0"+
		"\t\17\2\2\u01a0z\3\2\2\2\u01a1\u01a2\t\20\2\2\u01a2|\3\2\2\2\u01a3\u01a4"+
		"\t\21\2\2\u01a4~\3\2\2\2\u01a5\u01a6\t\22\2\2\u01a6\u0080\3\2\2\2\u01a7"+
		"\u01a8\t\23\2\2\u01a8\u0082\3\2\2\2\u01a9\u01aa\t\24\2\2\u01aa\u0084\3"+
		"\2\2\2\u01ab\u01ac\t\25\2\2\u01ac\u0086\3\2\2\2\u01ad\u01ae\t\26\2\2\u01ae"+
		"\u0088\3\2\2\2\u01af\u01b0\t\27\2\2\u01b0\u008a\3\2\2\2\u01b1\u01b2\t"+
		"\30\2\2\u01b2\u008c\3\2\2\2\u01b3\u01b4\t\31\2\2\u01b4\u008e\3\2\2\2\u01b5"+
		"\u01b6\t\32\2\2\u01b6\u0090\3\2\2\2\u01b7\u01b8\t\33\2\2\u01b8\u0092\3"+
		"\2\2\2\u01b9\u01ba\t\34\2\2\u01ba\u0094\3\2\2\2\u01bb\u01bc\t\35\2\2\u01bc"+
		"\u0096\3\2\2\2\u01bd\u01be\t\36\2\2\u01be\u0098\3\2\2\2\u01bf\u01c0\t"+
		"\37\2\2\u01c0\u009a\3\2\2\2\u01c1\u01c2\t \2\2\u01c2\u009c\3\2\2\2\u01c3"+
		"\u01c4\t!\2\2\u01c4\u009e\3\2\2\2\u01c5\u01c6\t\"\2\2\u01c6\u00a0\3\2"+
		"\2\2\13\2\u0136\u016b\u0170\u0176\u0179\u017f\u0181\u018a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}