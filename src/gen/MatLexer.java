package gen;

// Generated from c:\Users\Main PC\Documents\Mat\src\Mat.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MatLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, DISPLAY=5, CREATE=6, READ=7, POW=8, SQLPAREN=9, 
		SQRPAREN=10, PLUS=11, MINUS=12, MULT=13, DIV=14, EQ=15, BLOCK_COMMENT=16, 
		LINE_COMMENT=17, WS=18, ID=19, INT=20, DOUBLE=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "DISPLAY", "CREATE", "READ", "POW", "SQLPAREN", 
			"SQRPAREN", "PLUS", "MINUS", "MULT", "DIV", "EQ", "BLOCK_COMMENT", "LINE_COMMENT", 
			"WS", "ID", "INT", "DOUBLE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'by'", "'matrix where'", "'to'", "','", "'display'", "'create'", 
			"'read'", "'^'", "'['", "']'", "'+'", "'-'", "'*'", "'/'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "DISPLAY", "CREATE", "READ", "POW", "SQLPAREN", 
			"SQRPAREN", "PLUS", "MINUS", "MULT", "DIV", "EQ", "BLOCK_COMMENT", "LINE_COMMENT", 
			"WS", "ID", "INT", "DOUBLE"
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


	public MatLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mat.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u009f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\7\21k\n\21\f\21\16\21n\13\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\7\22y\n\22\f\22\16\22|\13\22\3\22\3\22\3"+
		"\23\6\23\u0081\n\23\r\23\16\23\u0082\3\23\3\23\3\24\3\24\3\24\3\24\7\24"+
		"\u008b\n\24\f\24\16\24\u008e\13\24\3\25\6\25\u0091\n\25\r\25\16\25\u0092"+
		"\3\26\6\26\u0096\n\26\r\26\16\26\u0097\3\26\3\26\6\26\u009c\n\26\r\26"+
		"\16\26\u009d\3l\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\6\4\2\f\f\17\17"+
		"\5\2\13\f\17\17\"\"\4\2C\\c|\3\2\62;\2\u00a7\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5\60\3\2\2\2\7=\3\2\2\2\t@\3\2\2\2"+
		"\13B\3\2\2\2\rJ\3\2\2\2\17Q\3\2\2\2\21V\3\2\2\2\23X\3\2\2\2\25Z\3\2\2"+
		"\2\27\\\3\2\2\2\31^\3\2\2\2\33`\3\2\2\2\35b\3\2\2\2\37d\3\2\2\2!f\3\2"+
		"\2\2#t\3\2\2\2%\u0080\3\2\2\2\'\u0086\3\2\2\2)\u0090\3\2\2\2+\u0095\3"+
		"\2\2\2-.\7d\2\2./\7{\2\2/\4\3\2\2\2\60\61\7o\2\2\61\62\7c\2\2\62\63\7"+
		"v\2\2\63\64\7t\2\2\64\65\7k\2\2\65\66\7z\2\2\66\67\7\"\2\2\678\7y\2\2"+
		"89\7j\2\29:\7g\2\2:;\7t\2\2;<\7g\2\2<\6\3\2\2\2=>\7v\2\2>?\7q\2\2?\b\3"+
		"\2\2\2@A\7.\2\2A\n\3\2\2\2BC\7f\2\2CD\7k\2\2DE\7u\2\2EF\7r\2\2FG\7n\2"+
		"\2GH\7c\2\2HI\7{\2\2I\f\3\2\2\2JK\7e\2\2KL\7t\2\2LM\7g\2\2MN\7c\2\2NO"+
		"\7v\2\2OP\7g\2\2P\16\3\2\2\2QR\7t\2\2RS\7g\2\2ST\7c\2\2TU\7f\2\2U\20\3"+
		"\2\2\2VW\7`\2\2W\22\3\2\2\2XY\7]\2\2Y\24\3\2\2\2Z[\7_\2\2[\26\3\2\2\2"+
		"\\]\7-\2\2]\30\3\2\2\2^_\7/\2\2_\32\3\2\2\2`a\7,\2\2a\34\3\2\2\2bc\7\61"+
		"\2\2c\36\3\2\2\2de\7?\2\2e \3\2\2\2fg\7\61\2\2gh\7&\2\2hl\3\2\2\2ik\13"+
		"\2\2\2ji\3\2\2\2kn\3\2\2\2lm\3\2\2\2lj\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7"+
		"&\2\2pq\7\61\2\2qr\3\2\2\2rs\b\21\2\2s\"\3\2\2\2tu\7&\2\2uv\7&\2\2vz\3"+
		"\2\2\2wy\n\2\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3"+
		"\2\2\2}~\b\22\2\2~$\3\2\2\2\177\u0081\t\3\2\2\u0080\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0085\b\23\2\2\u0085&\3\2\2\2\u0086\u008c\t\4\2\2\u0087\u008b"+
		"\t\4\2\2\u0088\u008b\5)\25\2\u0089\u008b\7a\2\2\u008a\u0087\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d(\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0091"+
		"\t\5\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093*\3\2\2\2\u0094\u0096\t\5\2\2\u0095\u0094\3\2\2\2"+
		"\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\u009b\7\60\2\2\u009a\u009c\t\5\2\2\u009b\u009a\3\2\2\2"+
		"\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e,\3"+
		"\2\2\2\13\2lz\u0082\u008a\u008c\u0092\u0097\u009d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}