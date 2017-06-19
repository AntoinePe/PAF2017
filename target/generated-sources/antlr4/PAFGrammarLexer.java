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
		T__0=1, Dollar=2, Number=3, Boolean=4, Operator=5, LB=6, RB=7, LP=8, RP=9, 
		IF=10, ELSE=11, WHILE=12, DO=13, FOR=14, THEN=15, AND=16, OR=17, NOT=18, 
		END=19, EQ=20, INF=21, SUP=22, PLUS=23, MINUS=24, TIMES=25, Variable=26, 
		WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "Dollar", "Number", "Boolean", "Operator", "LB", "RB", "LP", "RP", 
		"IF", "ELSE", "WHILE", "DO", "FOR", "THEN", "AND", "OR", "NOT", "END", 
		"EQ", "INF", "SUP", "PLUS", "MINUS", "TIMES", "Variable", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'/'", "'$'", null, null, null, "'['", "']'", "'('", "')'", "'if'", 
		"'else'", "'while'", "'do'", "'for'", "'then'", "'&'", "'||'", "'!'", 
		"';'", "'='", "'<'", "'>'", "'+'", "'-'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "Dollar", "Number", "Boolean", "Operator", "LB", "RB", "LP", 
		"RP", "IF", "ELSE", "WHILE", "DO", "FOR", "THEN", "AND", "OR", "NOT", 
		"END", "EQ", "INF", "SUP", "PLUS", "MINUS", "TIMES", "Variable", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00a2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\6\4?\n\4\r\4\16"+
		"\4@\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5L\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\\\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\7\33\u0097\n\33\f\33\16\33\u009a\13\33"+
		"\3\34\6\34\u009d\n\34\r\34\16\34\u009e\3\34\3\34\2\2\35\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\6\3\2\62;\4\2C\\"+
		"c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u00aa\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5;\3\2\2\2\7>\3\2\2\2\tK\3\2\2\2"+
		"\13[\3\2\2\2\r]\3\2\2\2\17_\3\2\2\2\21a\3\2\2\2\23c\3\2\2\2\25e\3\2\2"+
		"\2\27h\3\2\2\2\31m\3\2\2\2\33s\3\2\2\2\35v\3\2\2\2\37z\3\2\2\2!\177\3"+
		"\2\2\2#\u0081\3\2\2\2%\u0084\3\2\2\2\'\u0086\3\2\2\2)\u0088\3\2\2\2+\u008a"+
		"\3\2\2\2-\u008c\3\2\2\2/\u008e\3\2\2\2\61\u0090\3\2\2\2\63\u0092\3\2\2"+
		"\2\65\u0094\3\2\2\2\67\u009c\3\2\2\29:\7\61\2\2:\4\3\2\2\2;<\7&\2\2<\6"+
		"\3\2\2\2=?\t\2\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\b\3\2\2\2"+
		"BC\7V\2\2CD\7t\2\2DE\7w\2\2EL\7g\2\2FG\7H\2\2GH\7c\2\2HI\7n\2\2IJ\7u\2"+
		"\2JL\7g\2\2KB\3\2\2\2KF\3\2\2\2L\n\3\2\2\2MN\5)\25\2NO\5)\25\2O\\\3\2"+
		"\2\2PQ\5%\23\2QR\5)\25\2R\\\3\2\2\2S\\\5+\26\2TU\5+\26\2UV\5)\25\2V\\"+
		"\3\2\2\2W\\\5-\27\2XY\5-\27\2YZ\5)\25\2Z\\\3\2\2\2[M\3\2\2\2[P\3\2\2\2"+
		"[S\3\2\2\2[T\3\2\2\2[W\3\2\2\2[X\3\2\2\2\\\f\3\2\2\2]^\7]\2\2^\16\3\2"+
		"\2\2_`\7_\2\2`\20\3\2\2\2ab\7*\2\2b\22\3\2\2\2cd\7+\2\2d\24\3\2\2\2ef"+
		"\7k\2\2fg\7h\2\2g\26\3\2\2\2hi\7g\2\2ij\7n\2\2jk\7u\2\2kl\7g\2\2l\30\3"+
		"\2\2\2mn\7y\2\2no\7j\2\2op\7k\2\2pq\7n\2\2qr\7g\2\2r\32\3\2\2\2st\7f\2"+
		"\2tu\7q\2\2u\34\3\2\2\2vw\7h\2\2wx\7q\2\2xy\7t\2\2y\36\3\2\2\2z{\7v\2"+
		"\2{|\7j\2\2|}\7g\2\2}~\7p\2\2~ \3\2\2\2\177\u0080\7(\2\2\u0080\"\3\2\2"+
		"\2\u0081\u0082\7~\2\2\u0082\u0083\7~\2\2\u0083$\3\2\2\2\u0084\u0085\7"+
		"#\2\2\u0085&\3\2\2\2\u0086\u0087\7=\2\2\u0087(\3\2\2\2\u0088\u0089\7?"+
		"\2\2\u0089*\3\2\2\2\u008a\u008b\7>\2\2\u008b,\3\2\2\2\u008c\u008d\7@\2"+
		"\2\u008d.\3\2\2\2\u008e\u008f\7-\2\2\u008f\60\3\2\2\2\u0090\u0091\7/\2"+
		"\2\u0091\62\3\2\2\2\u0092\u0093\7,\2\2\u0093\64\3\2\2\2\u0094\u0098\t"+
		"\3\2\2\u0095\u0097\t\4\2\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\66\3\2\2\2\u009a\u0098\3\2\2"+
		"\2\u009b\u009d\t\5\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\b\34\2\2"+
		"\u00a18\3\2\2\2\b\2@K[\u0098\u009e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}