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
		T__0=1, T__1=2, T__2=3, T__3=4, DISPLAY=5, CREATE=6, POW=7, SQLPAREN=8, 
		SQRPAREN=9, PLUS=10, MINUS=11, MULT=12, DIV=13, EQ=14, BLOCK_COMMENT=15, 
		LINE_COMMENT=16, WS=17, ID=18, INT=19, DOUBLE=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "DISPLAY", "CREATE", "POW", "SQLPAREN", 
			"SQRPAREN", "PLUS", "MINUS", "MULT", "DIV", "EQ", "BLOCK_COMMENT", "LINE_COMMENT", 
			"WS", "ID", "INT", "DOUBLE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'by'", "'matrix where'", "'to'", "','", "'display'", "'create'", 
			"'^'", "'['", "']'", "'+'", "'-'", "'*'", "'/'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "DISPLAY", "CREATE", "POW", "SQLPAREN", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0098\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\7\20d\n"+
		"\20\f\20\16\20g\13\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21"+
		"r\n\21\f\21\16\21u\13\21\3\21\3\21\3\22\6\22z\n\22\r\22\16\22{\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\7\23\u0084\n\23\f\23\16\23\u0087\13\23\3\24\6"+
		"\24\u008a\n\24\r\24\16\24\u008b\3\25\6\25\u008f\n\25\r\25\16\25\u0090"+
		"\3\25\3\25\6\25\u0095\n\25\r\25\16\25\u0096\3e\2\26\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26\3\2\6\4\2\f\f\17\17\5\2\13\f\17\17\"\"\4\2C\\c|\3\2\62;\2\u00a0"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5.\3\2\2\2\7;\3\2\2"+
		"\2\t>\3\2\2\2\13@\3\2\2\2\rH\3\2\2\2\17O\3\2\2\2\21Q\3\2\2\2\23S\3\2\2"+
		"\2\25U\3\2\2\2\27W\3\2\2\2\31Y\3\2\2\2\33[\3\2\2\2\35]\3\2\2\2\37_\3\2"+
		"\2\2!m\3\2\2\2#y\3\2\2\2%\177\3\2\2\2\'\u0089\3\2\2\2)\u008e\3\2\2\2+"+
		",\7d\2\2,-\7{\2\2-\4\3\2\2\2./\7o\2\2/\60\7c\2\2\60\61\7v\2\2\61\62\7"+
		"t\2\2\62\63\7k\2\2\63\64\7z\2\2\64\65\7\"\2\2\65\66\7y\2\2\66\67\7j\2"+
		"\2\678\7g\2\289\7t\2\29:\7g\2\2:\6\3\2\2\2;<\7v\2\2<=\7q\2\2=\b\3\2\2"+
		"\2>?\7.\2\2?\n\3\2\2\2@A\7f\2\2AB\7k\2\2BC\7u\2\2CD\7r\2\2DE\7n\2\2EF"+
		"\7c\2\2FG\7{\2\2G\f\3\2\2\2HI\7e\2\2IJ\7t\2\2JK\7g\2\2KL\7c\2\2LM\7v\2"+
		"\2MN\7g\2\2N\16\3\2\2\2OP\7`\2\2P\20\3\2\2\2QR\7]\2\2R\22\3\2\2\2ST\7"+
		"_\2\2T\24\3\2\2\2UV\7-\2\2V\26\3\2\2\2WX\7/\2\2X\30\3\2\2\2YZ\7,\2\2Z"+
		"\32\3\2\2\2[\\\7\61\2\2\\\34\3\2\2\2]^\7?\2\2^\36\3\2\2\2_`\7\61\2\2`"+
		"a\7&\2\2ae\3\2\2\2bd\13\2\2\2cb\3\2\2\2dg\3\2\2\2ef\3\2\2\2ec\3\2\2\2"+
		"fh\3\2\2\2ge\3\2\2\2hi\7&\2\2ij\7\61\2\2jk\3\2\2\2kl\b\20\2\2l \3\2\2"+
		"\2mn\7&\2\2no\7&\2\2os\3\2\2\2pr\n\2\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2"+
		"st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\b\21\2\2w\"\3\2\2\2xz\t\3\2\2yx\3\2\2"+
		"\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\b\22\2\2~$\3\2\2\2\177\u0085"+
		"\t\4\2\2\u0080\u0084\t\4\2\2\u0081\u0084\5\'\24\2\u0082\u0084\7a\2\2\u0083"+
		"\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086&\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0088\u008a\t\5\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c(\3\2\2\2\u008d\u008f\t\5\2\2"+
		"\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\7\60\2\2\u0093\u0095\t\5\2\2"+
		"\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097*\3\2\2\2\13\2es{\u0083\u0085\u008b\u0090\u0096\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}