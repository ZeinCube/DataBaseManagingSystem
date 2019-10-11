// Generated from /home/botinok/Documents/DataBaseManagingSystem/Console/src/antlr/Hello.g4 by ANTLR 4.7.2
package com.antr;
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
		T__0=1, T__1=2, T__2=3, T__3=4, K_CREATE=5, K_DROP=6, K_TABLE=7, SPACE=8, 
		K_PRIMARY_KEY=9, K_UNIQUE=10, DIGIT=11, NUMERIC_LITERAL=12, K_SELECT=13, 
		IDENTIFIER=14, K_FROM=15, UNEXPECTED=16, OPEN_S=17, CLOSE_S=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "K_CREATE", "K_DROP", "K_TABLE", "SPACE", 
			"K_PRIMARY_KEY", "K_UNIQUE", "DIGIT", "NUMERIC_LITERAL", "K_SELECT", 
			"IDENTIFIER", "K_FROM", "UNEXPECTED", "A", "B", "C", "D", "E", "F", "G", 
			"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", 
			"V", "W", "X", "Y", "Z", "OPEN_S", "CLOSE_S", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "','", null, null, null, null, null, null, 
			null, null, null, null, null, "'.'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "K_CREATE", "K_DROP", "K_TABLE", "SPACE", 
			"K_PRIMARY_KEY", "K_UNIQUE", "DIGIT", "NUMERIC_LITERAL", "K_SELECT", 
			"IDENTIFIER", "K_FROM", "UNEXPECTED", "OPEN_S", "CLOSE_S", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u00fe\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\6\ty\n\t\r"+
		"\t\16\tz\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\r\6\r\u0092\n\r\r\r\16\r\u0093\3\r\3\r\7"+
		"\r\u0098\n\r\f\r\16\r\u009b\13\r\5\r\u009d\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00aa\n\17\f\17\16\17\u00ad\13\17"+
		"\3\17\3\17\3\17\7\17\u00b2\n\17\f\17\16\17\u00b5\13\17\5\17\u00b7\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\6.\u00f9\n."+
		"\r.\16.\u00fa\3.\3.\2\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2"+
		"\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\23Y\24[\25\3\2\"\4"+
		"\2\13\f\17\17\3\2\62;\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\4\2CCcc\4\2DDdd"+
		"\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2M"+
		"Mmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4"+
		"\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\5\2\13\f\17\17"+
		"\"\"\2\u00ec\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5_\3\2\2\2\7a\3\2\2\2"+
		"\tc\3\2\2\2\13e\3\2\2\2\rl\3\2\2\2\17q\3\2\2\2\21x\3\2\2\2\23|\3\2\2\2"+
		"\25\u0087\3\2\2\2\27\u008e\3\2\2\2\31\u0091\3\2\2\2\33\u009e\3\2\2\2\35"+
		"\u00b6\3\2\2\2\37\u00b8\3\2\2\2!\u00bd\3\2\2\2#\u00bf\3\2\2\2%\u00c1\3"+
		"\2\2\2\'\u00c3\3\2\2\2)\u00c5\3\2\2\2+\u00c7\3\2\2\2-\u00c9\3\2\2\2/\u00cb"+
		"\3\2\2\2\61\u00cd\3\2\2\2\63\u00cf\3\2\2\2\65\u00d1\3\2\2\2\67\u00d3\3"+
		"\2\2\29\u00d5\3\2\2\2;\u00d7\3\2\2\2=\u00d9\3\2\2\2?\u00db\3\2\2\2A\u00dd"+
		"\3\2\2\2C\u00df\3\2\2\2E\u00e1\3\2\2\2G\u00e3\3\2\2\2I\u00e5\3\2\2\2K"+
		"\u00e7\3\2\2\2M\u00e9\3\2\2\2O\u00eb\3\2\2\2Q\u00ed\3\2\2\2S\u00ef\3\2"+
		"\2\2U\u00f1\3\2\2\2W\u00f3\3\2\2\2Y\u00f5\3\2\2\2[\u00f8\3\2\2\2]^\7-"+
		"\2\2^\4\3\2\2\2_`\7/\2\2`\6\3\2\2\2ab\7,\2\2b\b\3\2\2\2cd\7.\2\2d\n\3"+
		"\2\2\2ef\5\'\24\2fg\5E#\2gh\5+\26\2hi\5#\22\2ij\5I%\2jk\5+\26\2k\f\3\2"+
		"\2\2lm\5)\25\2mn\5E#\2no\5? \2op\5A!\2p\16\3\2\2\2qr\5I%\2rs\5#\22\2s"+
		"t\5%\23\2tu\59\35\2uv\5+\26\2v\20\3\2\2\2wy\t\2\2\2xw\3\2\2\2yz\3\2\2"+
		"\2zx\3\2\2\2z{\3\2\2\2{\22\3\2\2\2|}\5A!\2}~\5E#\2~\177\5\63\32\2\177"+
		"\u0080\5;\36\2\u0080\u0081\5#\22\2\u0081\u0082\5E#\2\u0082\u0083\5S*\2"+
		"\u0083\u0084\5\67\34\2\u0084\u0085\5+\26\2\u0085\u0086\5S*\2\u0086\24"+
		"\3\2\2\2\u0087\u0088\5K&\2\u0088\u0089\5=\37\2\u0089\u008a\5\63\32\2\u008a"+
		"\u008b\5C\"\2\u008b\u008c\5K&\2\u008c\u008d\5+\26\2\u008d\26\3\2\2\2\u008e"+
		"\u008f\t\3\2\2\u008f\30\3\2\2\2\u0090\u0092\5\27\f\2\u0091\u0090\3\2\2"+
		"\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u009c"+
		"\3\2\2\2\u0095\u0099\7\60\2\2\u0096\u0098\5\27\f\2\u0097\u0096\3\2\2\2"+
		"\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009d"+
		"\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u0095\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\32\3\2\2\2\u009e\u009f\5G$\2\u009f\u00a0\5+\26\2\u00a0\u00a1\59\35\2"+
		"\u00a1\u00a2\5+\26\2\u00a2\u00a3\5\'\24\2\u00a3\u00a4\5I%\2\u00a4\34\3"+
		"\2\2\2\u00a5\u00ab\7$\2\2\u00a6\u00aa\n\4\2\2\u00a7\u00a8\7$\2\2\u00a8"+
		"\u00aa\7$\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00b7\7$\2\2\u00af\u00b3\t\5\2\2\u00b0\u00b2\t\6"+
		"\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00a5\3\2"+
		"\2\2\u00b6\u00af\3\2\2\2\u00b7\36\3\2\2\2\u00b8\u00b9\5-\27\2\u00b9\u00ba"+
		"\5E#\2\u00ba\u00bb\5? \2\u00bb\u00bc\5;\36\2\u00bc \3\2\2\2\u00bd\u00be"+
		"\7\60\2\2\u00be\"\3\2\2\2\u00bf\u00c0\t\7\2\2\u00c0$\3\2\2\2\u00c1\u00c2"+
		"\t\b\2\2\u00c2&\3\2\2\2\u00c3\u00c4\t\t\2\2\u00c4(\3\2\2\2\u00c5\u00c6"+
		"\t\n\2\2\u00c6*\3\2\2\2\u00c7\u00c8\t\13\2\2\u00c8,\3\2\2\2\u00c9\u00ca"+
		"\t\f\2\2\u00ca.\3\2\2\2\u00cb\u00cc\t\r\2\2\u00cc\60\3\2\2\2\u00cd\u00ce"+
		"\t\16\2\2\u00ce\62\3\2\2\2\u00cf\u00d0\t\17\2\2\u00d0\64\3\2\2\2\u00d1"+
		"\u00d2\t\20\2\2\u00d2\66\3\2\2\2\u00d3\u00d4\t\21\2\2\u00d48\3\2\2\2\u00d5"+
		"\u00d6\t\22\2\2\u00d6:\3\2\2\2\u00d7\u00d8\t\23\2\2\u00d8<\3\2\2\2\u00d9"+
		"\u00da\t\24\2\2\u00da>\3\2\2\2\u00db\u00dc\t\25\2\2\u00dc@\3\2\2\2\u00dd"+
		"\u00de\t\26\2\2\u00deB\3\2\2\2\u00df\u00e0\t\27\2\2\u00e0D\3\2\2\2\u00e1"+
		"\u00e2\t\30\2\2\u00e2F\3\2\2\2\u00e3\u00e4\t\31\2\2\u00e4H\3\2\2\2\u00e5"+
		"\u00e6\t\32\2\2\u00e6J\3\2\2\2\u00e7\u00e8\t\33\2\2\u00e8L\3\2\2\2\u00e9"+
		"\u00ea\t\34\2\2\u00eaN\3\2\2\2\u00eb\u00ec\t\35\2\2\u00ecP\3\2\2\2\u00ed"+
		"\u00ee\t\36\2\2\u00eeR\3\2\2\2\u00ef\u00f0\t\37\2\2\u00f0T\3\2\2\2\u00f1"+
		"\u00f2\t \2\2\u00f2V\3\2\2\2\u00f3\u00f4\7*\2\2\u00f4X\3\2\2\2\u00f5\u00f6"+
		"\7+\2\2\u00f6Z\3\2\2\2\u00f7\u00f9\t!\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fd\b.\2\2\u00fd\\\3\2\2\2\f\2z\u0093\u0099\u009c\u00a9\u00ab\u00b3"+
		"\u00b6\u00fa\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}