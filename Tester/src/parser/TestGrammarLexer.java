// Generated from C:/Users/Алексей/Desktop/DataBaseManagingSystem/Tester/src/parser\TestGrammar.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TestGrammarLexer extends Lexer {
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "A", "B", "C", "D", "E", 
			"F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", 
			"T", "U", "V", "W", "X", "Y", "Z", "COMAND", "DIGIT", "ENTER", "K_TEST", 
			"K_FOR", "K_RESULT", "K_NOT", "K_AND", "K_OR", "K_CAST", "K_AS", "K_INT", 
			"K_FLOAT", "K_STRING", "NUMERIC_LITERAL", "STRING_LITERAL", "IDENTIFIER", 
			"WS"
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


	public TestGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TestGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u016e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3"+
		",\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\38\38\38\38\39\39\39\39\3:\3:\3:\3;\3;\3;\3"+
		";\3;\3<\3<\3<\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3@\6"+
		"@\u012b\n@\r@\16@\u012c\3@\3@\7@\u0131\n@\f@\16@\u0134\13@\5@\u0136\n"+
		"@\3@\3@\5@\u013a\n@\3@\6@\u013d\n@\r@\16@\u013e\5@\u0141\n@\3@\3@\6@\u0145"+
		"\n@\r@\16@\u0146\3@\3@\5@\u014b\n@\3@\6@\u014e\n@\r@\16@\u014f\5@\u0152"+
		"\n@\5@\u0154\n@\3A\3A\3A\3A\3A\3A\7A\u015c\nA\fA\16A\u015f\13A\3A\3A\3"+
		"B\3B\3B\7B\u0166\nB\fB\16B\u0169\13B\3C\3C\3C\3C\2\2D\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2"+
		"M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\31k\32m\33o\34q\35s\36u\37"+
		"w y!{\"}#\177$\u0081%\u0083&\u0085\'\3\2#\4\2CCcc\4\2DDdd\4\2EEee\4\2"+
		"FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4"+
		"\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWw"+
		"w\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\3\2\62;\3\2\f\f\4\2--//\3"+
		"\2$$\5\2C\\aac|\6\2\62;C\\aac|\6\2\13\13\r\r\17\17\"\"\2\u015f\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2i\3\2\2\2\2k\3\2"+
		"\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2"+
		"\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\3\u0087\3\2\2\2\5\u0089\3\2\2\2\7\u008b\3\2\2"+
		"\2\t\u008d\3\2\2\2\13\u008f\3\2\2\2\r\u0091\3\2\2\2\17\u0093\3\2\2\2\21"+
		"\u0095\3\2\2\2\23\u0097\3\2\2\2\25\u0099\3\2\2\2\27\u009b\3\2\2\2\31\u009e"+
		"\3\2\2\2\33\u00a0\3\2\2\2\35\u00a2\3\2\2\2\37\u00a4\3\2\2\2!\u00a6\3\2"+
		"\2\2#\u00a8\3\2\2\2%\u00aa\3\2\2\2\'\u00ad\3\2\2\2)\u00af\3\2\2\2+\u00b2"+
		"\3\2\2\2-\u00b5\3\2\2\2/\u00b8\3\2\2\2\61\u00ba\3\2\2\2\63\u00bc\3\2\2"+
		"\2\65\u00be\3\2\2\2\67\u00c0\3\2\2\29\u00c2\3\2\2\2;\u00c4\3\2\2\2=\u00c6"+
		"\3\2\2\2?\u00c8\3\2\2\2A\u00ca\3\2\2\2C\u00cc\3\2\2\2E\u00ce\3\2\2\2G"+
		"\u00d0\3\2\2\2I\u00d2\3\2\2\2K\u00d4\3\2\2\2M\u00d6\3\2\2\2O\u00d8\3\2"+
		"\2\2Q\u00da\3\2\2\2S\u00dc\3\2\2\2U\u00de\3\2\2\2W\u00e0\3\2\2\2Y\u00e2"+
		"\3\2\2\2[\u00e4\3\2\2\2]\u00e6\3\2\2\2_\u00e8\3\2\2\2a\u00ea\3\2\2\2c"+
		"\u00ec\3\2\2\2e\u00ee\3\2\2\2g\u00f0\3\2\2\2i\u00f2\3\2\2\2k\u00f8\3\2"+
		"\2\2m\u00fd\3\2\2\2o\u0105\3\2\2\2q\u0109\3\2\2\2s\u010d\3\2\2\2u\u0110"+
		"\3\2\2\2w\u0115\3\2\2\2y\u0118\3\2\2\2{\u011c\3\2\2\2}\u0122\3\2\2\2\177"+
		"\u0153\3\2\2\2\u0081\u0155\3\2\2\2\u0083\u0162\3\2\2\2\u0085\u016a\3\2"+
		"\2\2\u0087\u0088\7*\2\2\u0088\4\3\2\2\2\u0089\u008a\7+\2\2\u008a\6\3\2"+
		"\2\2\u008b\u008c\7}\2\2\u008c\b\3\2\2\2\u008d\u008e\7\177\2\2\u008e\n"+
		"\3\2\2\2\u008f\u0090\7<\2\2\u0090\f\3\2\2\2\u0091\u0092\7?\2\2\u0092\16"+
		"\3\2\2\2\u0093\u0094\7=\2\2\u0094\20\3\2\2\2\u0095\u0096\7/\2\2\u0096"+
		"\22\3\2\2\2\u0097\u0098\7-\2\2\u0098\24\3\2\2\2\u0099\u009a\7\u0080\2"+
		"\2\u009a\26\3\2\2\2\u009b\u009c\7~\2\2\u009c\u009d\7~\2\2\u009d\30\3\2"+
		"\2\2\u009e\u009f\7,\2\2\u009f\32\3\2\2\2\u00a0\u00a1\7\61\2\2\u00a1\34"+
		"\3\2\2\2\u00a2\u00a3\7\'\2\2\u00a3\36\3\2\2\2\u00a4\u00a5\7(\2\2\u00a5"+
		" \3\2\2\2\u00a6\u00a7\7~\2\2\u00a7\"\3\2\2\2\u00a8\u00a9\7>\2\2\u00a9"+
		"$\3\2\2\2\u00aa\u00ab\7>\2\2\u00ab\u00ac\7?\2\2\u00ac&\3\2\2\2\u00ad\u00ae"+
		"\7@\2\2\u00ae(\3\2\2\2\u00af\u00b0\7@\2\2\u00b0\u00b1\7?\2\2\u00b1*\3"+
		"\2\2\2\u00b2\u00b3\7?\2\2\u00b3\u00b4\7?\2\2\u00b4,\3\2\2\2\u00b5\u00b6"+
		"\7#\2\2\u00b6\u00b7\7?\2\2\u00b7.\3\2\2\2\u00b8\u00b9\t\2\2\2\u00b9\60"+
		"\3\2\2\2\u00ba\u00bb\t\3\2\2\u00bb\62\3\2\2\2\u00bc\u00bd\t\4\2\2\u00bd"+
		"\64\3\2\2\2\u00be\u00bf\t\5\2\2\u00bf\66\3\2\2\2\u00c0\u00c1\t\6\2\2\u00c1"+
		"8\3\2\2\2\u00c2\u00c3\t\7\2\2\u00c3:\3\2\2\2\u00c4\u00c5\t\b\2\2\u00c5"+
		"<\3\2\2\2\u00c6\u00c7\t\t\2\2\u00c7>\3\2\2\2\u00c8\u00c9\t\n\2\2\u00c9"+
		"@\3\2\2\2\u00ca\u00cb\t\13\2\2\u00cbB\3\2\2\2\u00cc\u00cd\t\f\2\2\u00cd"+
		"D\3\2\2\2\u00ce\u00cf\t\r\2\2\u00cfF\3\2\2\2\u00d0\u00d1\t\16\2\2\u00d1"+
		"H\3\2\2\2\u00d2\u00d3\t\17\2\2\u00d3J\3\2\2\2\u00d4\u00d5\t\20\2\2\u00d5"+
		"L\3\2\2\2\u00d6\u00d7\t\21\2\2\u00d7N\3\2\2\2\u00d8\u00d9\t\22\2\2\u00d9"+
		"P\3\2\2\2\u00da\u00db\t\23\2\2\u00dbR\3\2\2\2\u00dc\u00dd\t\24\2\2\u00dd"+
		"T\3\2\2\2\u00de\u00df\t\25\2\2\u00dfV\3\2\2\2\u00e0\u00e1\t\26\2\2\u00e1"+
		"X\3\2\2\2\u00e2\u00e3\t\27\2\2\u00e3Z\3\2\2\2\u00e4\u00e5\t\30\2\2\u00e5"+
		"\\\3\2\2\2\u00e6\u00e7\t\31\2\2\u00e7^\3\2\2\2\u00e8\u00e9\t\32\2\2\u00e9"+
		"`\3\2\2\2\u00ea\u00eb\t\33\2\2\u00ebb\3\2\2\2\u00ec\u00ed\7B\2\2\u00ed"+
		"d\3\2\2\2\u00ee\u00ef\t\34\2\2\u00eff\3\2\2\2\u00f0\u00f1\t\35\2\2\u00f1"+
		"h\3\2\2\2\u00f2\u00f3\5c\62\2\u00f3\u00f4\5U+\2\u00f4\u00f5\5\67\34\2"+
		"\u00f5\u00f6\5S*\2\u00f6\u00f7\5U+\2\u00f7j\3\2\2\2\u00f8\u00f9\5c\62"+
		"\2\u00f9\u00fa\59\35\2\u00fa\u00fb\5K&\2\u00fb\u00fc\5Q)\2\u00fcl\3\2"+
		"\2\2\u00fd\u00fe\5c\62\2\u00fe\u00ff\5Q)\2\u00ff\u0100\5\67\34\2\u0100"+
		"\u0101\5S*\2\u0101\u0102\5W,\2\u0102\u0103\5E#\2\u0103\u0104\5U+\2\u0104"+
		"n\3\2\2\2\u0105\u0106\5I%\2\u0106\u0107\5K&\2\u0107\u0108\5U+\2\u0108"+
		"p\3\2\2\2\u0109\u010a\5/\30\2\u010a\u010b\5I%\2\u010b\u010c\5\65\33\2"+
		"\u010cr\3\2\2\2\u010d\u010e\5K&\2\u010e\u010f\5Q)\2\u010ft\3\2\2\2\u0110"+
		"\u0111\5\63\32\2\u0111\u0112\5/\30\2\u0112\u0113\5S*\2\u0113\u0114\5U"+
		"+\2\u0114v\3\2\2\2\u0115\u0116\5/\30\2\u0116\u0117\5S*\2\u0117x\3\2\2"+
		"\2\u0118\u0119\5? \2\u0119\u011a\5I%\2\u011a\u011b\5U+\2\u011bz\3\2\2"+
		"\2\u011c\u011d\59\35\2\u011d\u011e\5E#\2\u011e\u011f\5K&\2\u011f\u0120"+
		"\5/\30\2\u0120\u0121\5U+\2\u0121|\3\2\2\2\u0122\u0123\5S*\2\u0123\u0124"+
		"\5U+\2\u0124\u0125\5Q)\2\u0125\u0126\5? \2\u0126\u0127\5I%\2\u0127\u0128"+
		"\5;\36\2\u0128~\3\2\2\2\u0129\u012b\5e\63\2\u012a\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0135\3\2"+
		"\2\2\u012e\u0132\7\60\2\2\u012f\u0131\5e\63\2\u0130\u012f\3\2\2\2\u0131"+
		"\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0136\3\2"+
		"\2\2\u0134\u0132\3\2\2\2\u0135\u012e\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0140\3\2\2\2\u0137\u0139\5\67\34\2\u0138\u013a\t\36\2\2\u0139\u0138"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u013d\5e\63\2\u013c"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0141\3\2\2\2\u0140\u0137\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0154\3\2\2\2\u0142\u0144\7\60\2\2\u0143\u0145\5e\63\2\u0144\u0143\3"+
		"\2\2\2\u0145\u0146\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0151\3\2\2\2\u0148\u014a\5\67\34\2\u0149\u014b\t\36\2\2\u014a\u0149"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014e\5e\63\2\u014d"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\u0152\3\2\2\2\u0151\u0148\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0154\3\2\2\2\u0153\u012a\3\2\2\2\u0153\u0142\3\2\2\2\u0154\u0080\3\2"+
		"\2\2\u0155\u015d\7$\2\2\u0156\u015c\n\37\2\2\u0157\u0158\7$\2\2\u0158"+
		"\u015c\7$\2\2\u0159\u015a\7^\2\2\u015a\u015c\7$\2\2\u015b\u0156\3\2\2"+
		"\2\u015b\u0157\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b"+
		"\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160"+
		"\u0161\7$\2\2\u0161\u0082\3\2\2\2\u0162\u0163\5c\62\2\u0163\u0167\t \2"+
		"\2\u0164\u0166\t!\2\2\u0165\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165"+
		"\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0084\3\2\2\2\u0169\u0167\3\2\2\2\u016a"+
		"\u016b\t\"\2\2\u016b\u016c\3\2\2\2\u016c\u016d\bC\2\2\u016d\u0086\3\2"+
		"\2\2\21\2\u012c\u0132\u0135\u0139\u013e\u0140\u0146\u014a\u014f\u0151"+
		"\u0153\u015b\u015d\u0167\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}