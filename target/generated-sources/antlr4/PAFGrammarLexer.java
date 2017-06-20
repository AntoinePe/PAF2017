// Generated from PAFGrammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PAFGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Dollar=2, Boolean=3, Operator=4, LB=5, RB=6, LP=7, RP=8, IF=9, 
		ELSE=10, WHILE=11, DO=12, FOR=13, THEN=14, AND=15, OR=16, NOT=17, END=18, 
		EQ=19, INF=20, SUP=21, PLUS=22, MINUS=23, TIMES=24, Variable=25, Number=26, 
		WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "Dollar", "Boolean", "Operator", "LB", "RB", "LP", "RP", "IF", 
		"ELSE", "WHILE", "DO", "FOR", "THEN", "AND", "OR", "NOT", "END", "EQ", 
		"INF", "SUP", "PLUS", "MINUS", "TIMES", "Variable", "Number", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'/'", "'$'", null, null, "'['", "']'", "'('", "')'", "'if'", "'else'", 
		"'while'", "'do'", "'for'", "'then'", "'&'", "'||'", "'!'", "';'", "'='", 
		"'<'", "'>'", "'+'", "'-'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "Dollar", "Boolean", "Operator", "LB", "RB", "LP", "RP", "IF", 
		"ELSE", "WHILE", "DO", "FOR", "THEN", "AND", "OR", "NOT", "END", "EQ", 
		"INF", "SUP", "PLUS", "MINUS", "TIMES", "Variable", "Number", "WS"
	};
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


	public PAFGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PAFGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u009f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4G\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5W\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\7\32\u0092\n\32\f\32\16\32\u0095\13\32\3\33\6\33\u0098\n\33"+
		"\r\33\16\33\u0099\3\34\3\34\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\6\4\2C\\c|\5\2\62;C\\c|\3\2\62"+
		";\5\2\13\f\17\17\"\"\2\u00a6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7F\3\2\2\2\tV\3\2\2\2\13X\3\2\2\2\r"+
		"Z\3\2\2\2\17\\\3\2\2\2\21^\3\2\2\2\23`\3\2\2\2\25c\3\2\2\2\27h\3\2\2\2"+
		"\31n\3\2\2\2\33q\3\2\2\2\35u\3\2\2\2\37z\3\2\2\2!|\3\2\2\2#\177\3\2\2"+
		"\2%\u0081\3\2\2\2\'\u0083\3\2\2\2)\u0085\3\2\2\2+\u0087\3\2\2\2-\u0089"+
		"\3\2\2\2/\u008b\3\2\2\2\61\u008d\3\2\2\2\63\u008f\3\2\2\2\65\u0097\3\2"+
		"\2\2\67\u009b\3\2\2\29:\7\61\2\2:\4\3\2\2\2;<\7&\2\2<\6\3\2\2\2=>\7V\2"+
		"\2>?\7t\2\2?@\7w\2\2@G\7g\2\2AB\7H\2\2BC\7c\2\2CD\7n\2\2DE\7u\2\2EG\7"+
		"g\2\2F=\3\2\2\2FA\3\2\2\2G\b\3\2\2\2HI\5\'\24\2IJ\5\'\24\2JW\3\2\2\2K"+
		"L\5#\22\2LM\5\'\24\2MW\3\2\2\2NW\5)\25\2OP\5)\25\2PQ\5\'\24\2QW\3\2\2"+
		"\2RW\5+\26\2ST\5+\26\2TU\5\'\24\2UW\3\2\2\2VH\3\2\2\2VK\3\2\2\2VN\3\2"+
		"\2\2VO\3\2\2\2VR\3\2\2\2VS\3\2\2\2W\n\3\2\2\2XY\7]\2\2Y\f\3\2\2\2Z[\7"+
		"_\2\2[\16\3\2\2\2\\]\7*\2\2]\20\3\2\2\2^_\7+\2\2_\22\3\2\2\2`a\7k\2\2"+
		"ab\7h\2\2b\24\3\2\2\2cd\7g\2\2de\7n\2\2ef\7u\2\2fg\7g\2\2g\26\3\2\2\2"+
		"hi\7y\2\2ij\7j\2\2jk\7k\2\2kl\7n\2\2lm\7g\2\2m\30\3\2\2\2no\7f\2\2op\7"+
		"q\2\2p\32\3\2\2\2qr\7h\2\2rs\7q\2\2st\7t\2\2t\34\3\2\2\2uv\7v\2\2vw\7"+
		"j\2\2wx\7g\2\2xy\7p\2\2y\36\3\2\2\2z{\7(\2\2{ \3\2\2\2|}\7~\2\2}~\7~\2"+
		"\2~\"\3\2\2\2\177\u0080\7#\2\2\u0080$\3\2\2\2\u0081\u0082\7=\2\2\u0082"+
		"&\3\2\2\2\u0083\u0084\7?\2\2\u0084(\3\2\2\2\u0085\u0086\7>\2\2\u0086*"+
		"\3\2\2\2\u0087\u0088\7@\2\2\u0088,\3\2\2\2\u0089\u008a\7-\2\2\u008a.\3"+
		"\2\2\2\u008b\u008c\7/\2\2\u008c\60\3\2\2\2\u008d\u008e\7,\2\2\u008e\62"+
		"\3\2\2\2\u008f\u0093\t\2\2\2\u0090\u0092\t\3\2\2\u0091\u0090\3\2\2\2\u0092"+
		"\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\64\3\2\2"+
		"\2\u0095\u0093\3\2\2\2\u0096\u0098\t\4\2\2\u0097\u0096\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\66\3\2\2\2\u009b"+
		"\u009c\t\5\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\34\2\2\u009e8\3\2\2\2"+
		"\7\2FV\u0093\u0099\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}