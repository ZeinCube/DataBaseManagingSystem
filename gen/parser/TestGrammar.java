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
public class TestGrammar extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMAND=1, ENTER=2, INT=3, K_ERROR=4, K_TEST=5, K_FOR=6, K_IN=7, ID=8, 
		WS=9;
	public static final int
		SPECIAL=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "SPECIAL"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "COMAND", 
			"ENTER", "LETTER", "DIGIT", "INT", "K_ERROR", "K_TEST", "K_FOR", "K_IN", 
			"ID", "WS"
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
			null, "COMAND", "ENTER", "INT", "K_ERROR", "K_TEST", "K_FOR", "K_IN", 
			"ID", "WS"
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


	public TestGrammar(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13\u00b1\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4"+
		"\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4"+
		" \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\35\5\35\u0088\n\35\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \6 \u0091\n \r \16 \u0092\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#"+
		"\3#\3#\3#\3$\3$\3$\3%\3%\7%\u00a9\n%\f%\16%\u00ac\13%\3&\3&\3&\3&\2\2"+
		"\'\4\2\6\2\b\2\n\2\f\2\16\2\20\2\22\2\24\2\26\2\30\2\32\2\34\2\36\2 \2"+
		"\"\2$\2&\2(\2*\2,\2.\2\60\2\62\2\64\2\66\28\3:\4<\2>\2@\5B\6D\7F\bH\t"+
		"J\nL\13\4\2\3 \4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIi"+
		"i\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2"+
		"RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4"+
		"\2[[{{\4\2\\\\||\4\2C\\c|\3\2\62;\5\2\62;C\\c|\5\2\13\13\17\17\"\"\2\u0096"+
		"\28\3\2\2\2\2:\3\2\2\2\2@\3\2\2\2\3B\3\2\2\2\3D\3\2\2\2\3F\3\2\2\2\3H"+
		"\3\2\2\2\3J\3\2\2\2\3L\3\2\2\2\4N\3\2\2\2\6P\3\2\2\2\bR\3\2\2\2\nT\3\2"+
		"\2\2\fV\3\2\2\2\16X\3\2\2\2\20Z\3\2\2\2\22\\\3\2\2\2\24^\3\2\2\2\26`\3"+
		"\2\2\2\30b\3\2\2\2\32d\3\2\2\2\34f\3\2\2\2\36h\3\2\2\2 j\3\2\2\2\"l\3"+
		"\2\2\2$n\3\2\2\2&p\3\2\2\2(r\3\2\2\2*t\3\2\2\2,v\3\2\2\2.x\3\2\2\2\60"+
		"z\3\2\2\2\62|\3\2\2\2\64~\3\2\2\2\66\u0080\3\2\2\28\u0082\3\2\2\2:\u0087"+
		"\3\2\2\2<\u008b\3\2\2\2>\u008d\3\2\2\2@\u0090\3\2\2\2B\u0094\3\2\2\2D"+
		"\u009a\3\2\2\2F\u009f\3\2\2\2H\u00a3\3\2\2\2J\u00a6\3\2\2\2L\u00ad\3\2"+
		"\2\2NO\t\2\2\2O\5\3\2\2\2PQ\t\3\2\2Q\7\3\2\2\2RS\t\4\2\2S\t\3\2\2\2TU"+
		"\t\5\2\2U\13\3\2\2\2VW\t\6\2\2W\r\3\2\2\2XY\t\7\2\2Y\17\3\2\2\2Z[\t\b"+
		"\2\2[\21\3\2\2\2\\]\t\t\2\2]\23\3\2\2\2^_\t\n\2\2_\25\3\2\2\2`a\t\13\2"+
		"\2a\27\3\2\2\2bc\t\f\2\2c\31\3\2\2\2de\t\r\2\2e\33\3\2\2\2fg\t\16\2\2"+
		"g\35\3\2\2\2hi\t\17\2\2i\37\3\2\2\2jk\t\20\2\2k!\3\2\2\2lm\t\21\2\2m#"+
		"\3\2\2\2no\t\22\2\2o%\3\2\2\2pq\t\23\2\2q\'\3\2\2\2rs\t\24\2\2s)\3\2\2"+
		"\2tu\t\25\2\2u+\3\2\2\2vw\t\26\2\2w-\3\2\2\2xy\t\27\2\2y/\3\2\2\2z{\t"+
		"\30\2\2{\61\3\2\2\2|}\t\31\2\2}\63\3\2\2\2~\177\t\32\2\2\177\65\3\2\2"+
		"\2\u0080\u0081\t\33\2\2\u0081\67\3\2\2\2\u0082\u0083\7B\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0085\b\34\2\2\u00859\3\2\2\2\u0086\u0088\7\17\2\2\u0087"+
		"\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7\f"+
		"\2\2\u008a;\3\2\2\2\u008b\u008c\t\34\2\2\u008c=\3\2\2\2\u008d\u008e\t"+
		"\35\2\2\u008e?\3\2\2\2\u008f\u0091\5>\37\2\u0090\u008f\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093A\3\2\2\2\u0094"+
		"\u0095\5\f\6\2\u0095\u0096\5&\23\2\u0096\u0097\5&\23\2\u0097\u0098\5 "+
		"\20\2\u0098\u0099\5&\23\2\u0099C\3\2\2\2\u009a\u009b\5*\25\2\u009b\u009c"+
		"\5\f\6\2\u009c\u009d\5(\24\2\u009d\u009e\5*\25\2\u009eE\3\2\2\2\u009f"+
		"\u00a0\5\16\7\2\u00a0\u00a1\5 \20\2\u00a1\u00a2\5&\23\2\u00a2G\3\2\2\2"+
		"\u00a3\u00a4\5\24\n\2\u00a4\u00a5\5\36\17\2\u00a5I\3\2\2\2\u00a6\u00aa"+
		"\t\34\2\2\u00a7\u00a9\t\36\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2"+
		"\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00abK\3\2\2\2\u00ac\u00aa\3"+
		"\2\2\2\u00ad\u00ae\t\37\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\b&\3\2\u00b0"+
		"M\3\2\2\2\7\2\3\u0087\u0092\u00aa\4\4\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}