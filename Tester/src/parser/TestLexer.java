// Generated from C:/Users/�������/Desktop/DataBaseManagingSystem/Tester/src/parser\TestGrammar.g4 by ANTLR 4.7.2
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
public class TestLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMAND=1, INT=2, K_ERROR=3, K_TEST=4, K_FOR=5, K_IN=6, ID=7, WS=8, S_ENTER=9, 
		TEXT=10, B_ENTER=11;
	public static final int
		SPECIAL=1, BLOCK=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "SPECIAL", "BLOCK"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "ENTER", 
			"COMAND", "LEFTBR", "LETTER", "DIGIT", "INT", "K_ERROR", "K_TEST", "K_FOR", 
			"K_IN", "ID", "WS", "S_ENTER", "RIGHTBR", "TEXT", "B_ENTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMAND", "INT", "K_ERROR", "K_TEST", "K_FOR", "K_IN", "ID", "WS", 
			"S_ENTER", "TEXT", "B_ENTER"
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


	public TestLexer(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r\u00d9\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\5\34\u008f\n\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\6!\u00a2"+
		"\n!\r!\16!\u00a3\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"%\3%\3%\3&\3&\7&\u00ba\n&\f&\16&\u00bd\13&\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		"(\3(\3)\3)\3)\3)\3)\3*\7*\u00ce\n*\f*\16*\u00d1\13*\3*\5*\u00d4\n*\3+"+
		"\3+\3+\3+\2\2,\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2"+
		"\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\3=\2?\2A\2"+
		"C\4E\5G\6I\7K\bM\tO\nQ\13S\2U\fW\r\5\2\3\4%\4\2CCcc\4\2DDdd\4\2EEee\4"+
		"\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNn"+
		"n\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2"+
		"WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\3\2\17\17\3\2\f\f\3\2}"+
		"}\4\2C\\c|\3\2\62;\5\2\62;C\\c|\5\2\13\13\17\17\"\"\3\2\177\177\4\2\61"+
		"\61pp\2\u00be\2;\3\2\2\2\2=\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\3G\3\2\2\2\3"+
		"I\3\2\2\2\3K\3\2\2\2\3M\3\2\2\2\3O\3\2\2\2\3Q\3\2\2\2\4S\3\2\2\2\4U\3"+
		"\2\2\2\4W\3\2\2\2\5Y\3\2\2\2\7[\3\2\2\2\t]\3\2\2\2\13_\3\2\2\2\ra\3\2"+
		"\2\2\17c\3\2\2\2\21e\3\2\2\2\23g\3\2\2\2\25i\3\2\2\2\27k\3\2\2\2\31m\3"+
		"\2\2\2\33o\3\2\2\2\35q\3\2\2\2\37s\3\2\2\2!u\3\2\2\2#w\3\2\2\2%y\3\2\2"+
		"\2\'{\3\2\2\2)}\3\2\2\2+\177\3\2\2\2-\u0081\3\2\2\2/\u0083\3\2\2\2\61"+
		"\u0085\3\2\2\2\63\u0087\3\2\2\2\65\u0089\3\2\2\2\67\u008b\3\2\2\29\u008e"+
		"\3\2\2\2;\u0092\3\2\2\2=\u0096\3\2\2\2?\u009c\3\2\2\2A\u009e\3\2\2\2C"+
		"\u00a1\3\2\2\2E\u00a5\3\2\2\2G\u00ab\3\2\2\2I\u00b0\3\2\2\2K\u00b4\3\2"+
		"\2\2M\u00b7\3\2\2\2O\u00be\3\2\2\2Q\u00c2\3\2\2\2S\u00c7\3\2\2\2U\u00cf"+
		"\3\2\2\2W\u00d5\3\2\2\2YZ\t\2\2\2Z\6\3\2\2\2[\\\t\3\2\2\\\b\3\2\2\2]^"+
		"\t\4\2\2^\n\3\2\2\2_`\t\5\2\2`\f\3\2\2\2ab\t\6\2\2b\16\3\2\2\2cd\t\7\2"+
		"\2d\20\3\2\2\2ef\t\b\2\2f\22\3\2\2\2gh\t\t\2\2h\24\3\2\2\2ij\t\n\2\2j"+
		"\26\3\2\2\2kl\t\13\2\2l\30\3\2\2\2mn\t\f\2\2n\32\3\2\2\2op\t\r\2\2p\34"+
		"\3\2\2\2qr\t\16\2\2r\36\3\2\2\2st\t\17\2\2t \3\2\2\2uv\t\20\2\2v\"\3\2"+
		"\2\2wx\t\21\2\2x$\3\2\2\2yz\t\22\2\2z&\3\2\2\2{|\t\23\2\2|(\3\2\2\2}~"+
		"\t\24\2\2~*\3\2\2\2\177\u0080\t\25\2\2\u0080,\3\2\2\2\u0081\u0082\t\26"+
		"\2\2\u0082.\3\2\2\2\u0083\u0084\t\27\2\2\u0084\60\3\2\2\2\u0085\u0086"+
		"\t\30\2\2\u0086\62\3\2\2\2\u0087\u0088\t\31\2\2\u0088\64\3\2\2\2\u0089"+
		"\u008a\t\32\2\2\u008a\66\3\2\2\2\u008b\u008c\t\33\2\2\u008c8\3\2\2\2\u008d"+
		"\u008f\t\34\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3"+
		"\2\2\2\u0090\u0091\t\35\2\2\u0091:\3\2\2\2\u0092\u0093\7B\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\u0095\b\35\2\2\u0095<\3\2\2\2\u0096\u0097\59\34\2\u0097"+
		"\u0098\t\36\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\36\3\2\u009a\u009b\b"+
		"\36\4\2\u009b>\3\2\2\2\u009c\u009d\t\37\2\2\u009d@\3\2\2\2\u009e\u009f"+
		"\t \2\2\u009fB\3\2\2\2\u00a0\u00a2\5A \2\u00a1\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4D\3\2\2\2\u00a5"+
		"\u00a6\5\r\6\2\u00a6\u00a7\5\'\23\2\u00a7\u00a8\5\'\23\2\u00a8\u00a9\5"+
		"!\20\2\u00a9\u00aa\5\'\23\2\u00aaF\3\2\2\2\u00ab\u00ac\5+\25\2\u00ac\u00ad"+
		"\5\r\6\2\u00ad\u00ae\5)\24\2\u00ae\u00af\5+\25\2\u00afH\3\2\2\2\u00b0"+
		"\u00b1\5\17\7\2\u00b1\u00b2\5!\20\2\u00b2\u00b3\5\'\23\2\u00b3J\3\2\2"+
		"\2\u00b4\u00b5\5\25\n\2\u00b5\u00b6\5\37\17\2\u00b6L\3\2\2\2\u00b7\u00bb"+
		"\t\37\2\2\u00b8\u00ba\t!\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bcN\3\2\2\2\u00bd\u00bb\3\2\2\2"+
		"\u00be\u00bf\t\"\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\b\'\5\2\u00c1P\3"+
		"\2\2\2\u00c2\u00c3\59\34\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\b(\5\2\u00c5"+
		"\u00c6\b(\6\2\u00c6R\3\2\2\2\u00c7\u00c8\t#\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00ca\b)\3\2\u00ca\u00cb\b)\6\2\u00cbT\3\2\2\2\u00cc\u00ce\13\2\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d4\t$\2\2\u00d3"+
		"\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4V\3\2\2\2\u00d5\u00d6\59\34\2"+
		"\u00d6\u00d7\3\2\2\2\u00d7\u00d8\b+\5\2\u00d8X\3\2\2\2\n\2\3\4\u008e\u00a3"+
		"\u00bb\u00cf\u00d3\7\4\3\2\5\2\2\4\4\2\b\2\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}