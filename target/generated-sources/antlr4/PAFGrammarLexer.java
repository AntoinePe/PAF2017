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
		Dollar=1, Boolean=2, Operator=3, SLASH=4, LB=5, RB=6, LP=7, RP=8, PRINT=9, 
		SCAN=10, NEWLINE=11, POPERATOR=12, SOPERATOR=13, AOPERATOR=14, QUES=15, 
		IF=16, ELSE=17, ELIF=18, WHILE=19, DO=20, FOR=21, THEN=22, AND=23, OR=24, 
		BAND=25, BOR=26, NOT=27, END=28, COMMA=29, EQ=30, INF=31, SUP=32, PLUS=33, 
		MINUS=34, TIMES=35, DIV=36, REM=37, VOID=38, RETURNTYPES=39, INTEGER=40, 
		STRING=41, DEFINE=42, RETURN=43, AUTO=44, Variable=45, String=46, Number=47, 
		WS=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Dollar", "Boolean", "Operator", "SLASH", "LB", "RB", "LP", "RP", "PRINT", 
		"SCAN", "NEWLINE", "POPERATOR", "SOPERATOR", "AOPERATOR", "QUES", "IF", 
		"ELSE", "ELIF", "WHILE", "DO", "FOR", "THEN", "AND", "OR", "BAND", "BOR", 
		"NOT", "END", "COMMA", "EQ", "INF", "SUP", "PLUS", "MINUS", "TIMES", "DIV", 
		"REM", "VOID", "RETURNTYPES", "INTEGER", "STRING", "DEFINE", "RETURN", 
		"AUTO", "Variable", "String", "Number", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$'", null, null, "'/'", "'['", "']'", "'('", "')'", "'print'", 
		"'scan'", "'newline'", "'<<'", "'>>'", "'<-'", "'?'", "'if'", "'else'", 
		"'elif'", "'while'", "'do'", "'for'", "'then'", "'&&'", "'||'", "'&'", 
		"'|'", "'!'", "';'", "','", "'='", "'<'", "'>'", "'+'", "'-'", "'*'", 
		"':'", "'%'", "'void'", null, "'integer'", "'String'", "'define'", "'return'", 
		"'auto'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Dollar", "Boolean", "Operator", "SLASH", "LB", "RB", "LP", "RP", 
		"PRINT", "SCAN", "NEWLINE", "POPERATOR", "SOPERATOR", "AOPERATOR", "QUES", 
		"IF", "ELSE", "ELIF", "WHILE", "DO", "FOR", "THEN", "AND", "OR", "BAND", 
		"BOR", "NOT", "END", "COMMA", "EQ", "INF", "SUP", "PLUS", "MINUS", "TIMES", 
		"DIV", "REM", "VOID", "RETURNTYPES", "INTEGER", "STRING", "DEFINE", "RETURN", 
		"AUTO", "Variable", "String", "Number", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0129\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3o\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4\177\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&"+
		"\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3"+
		"*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\7"+
		".\u0113\n.\f.\16.\u0116\13.\3/\3/\7/\u011a\n/\f/\16/\u011d\13/\3/\3/\3"+
		"\60\6\60\u0122\n\60\r\60\16\60\u0123\3\61\3\61\3\61\3\61\2\2\62\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62\3\2\7\4\2C\\c|\5\2\62;C\\c"+
		"|\13\2\"#\'\'./\62=AAC\\aac|\u00ea\u00eb\3\2\62;\5\2\13\f\17\17\"\"\2"+
		"\u0131\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\3c\3\2\2\2\5n\3\2\2\2\7~\3\2\2\2\t\u0080\3\2\2\2\13\u0082"+
		"\3\2\2\2\r\u0084\3\2\2\2\17\u0086\3\2\2\2\21\u0088\3\2\2\2\23\u008a\3"+
		"\2\2\2\25\u0090\3\2\2\2\27\u0095\3\2\2\2\31\u009d\3\2\2\2\33\u00a0\3\2"+
		"\2\2\35\u00a3\3\2\2\2\37\u00a6\3\2\2\2!\u00a8\3\2\2\2#\u00ab\3\2\2\2%"+
		"\u00b0\3\2\2\2\'\u00b5\3\2\2\2)\u00bb\3\2\2\2+\u00be\3\2\2\2-\u00c2\3"+
		"\2\2\2/\u00c7\3\2\2\2\61\u00ca\3\2\2\2\63\u00cd\3\2\2\2\65\u00cf\3\2\2"+
		"\2\67\u00d1\3\2\2\29\u00d3\3\2\2\2;\u00d5\3\2\2\2=\u00d7\3\2\2\2?\u00d9"+
		"\3\2\2\2A\u00db\3\2\2\2C\u00dd\3\2\2\2E\u00df\3\2\2\2G\u00e1\3\2\2\2I"+
		"\u00e3\3\2\2\2K\u00e5\3\2\2\2M\u00e7\3\2\2\2O\u00ec\3\2\2\2Q\u00ee\3\2"+
		"\2\2S\u00f6\3\2\2\2U\u00fd\3\2\2\2W\u0104\3\2\2\2Y\u010b\3\2\2\2[\u0110"+
		"\3\2\2\2]\u0117\3\2\2\2_\u0121\3\2\2\2a\u0125\3\2\2\2cd\7&\2\2d\4\3\2"+
		"\2\2ef\7V\2\2fg\7t\2\2gh\7w\2\2ho\7g\2\2ij\7H\2\2jk\7c\2\2kl\7n\2\2lm"+
		"\7u\2\2mo\7g\2\2ne\3\2\2\2ni\3\2\2\2o\6\3\2\2\2pq\5=\37\2qr\5=\37\2r\177"+
		"\3\2\2\2st\5\67\34\2tu\5=\37\2u\177\3\2\2\2v\177\5? \2wx\5? \2xy\5=\37"+
		"\2y\177\3\2\2\2z\177\5A!\2{|\5A!\2|}\5=\37\2}\177\3\2\2\2~p\3\2\2\2~s"+
		"\3\2\2\2~v\3\2\2\2~w\3\2\2\2~z\3\2\2\2~{\3\2\2\2\177\b\3\2\2\2\u0080\u0081"+
		"\7\61\2\2\u0081\n\3\2\2\2\u0082\u0083\7]\2\2\u0083\f\3\2\2\2\u0084\u0085"+
		"\7_\2\2\u0085\16\3\2\2\2\u0086\u0087\7*\2\2\u0087\20\3\2\2\2\u0088\u0089"+
		"\7+\2\2\u0089\22\3\2\2\2\u008a\u008b\7r\2\2\u008b\u008c\7t\2\2\u008c\u008d"+
		"\7k\2\2\u008d\u008e\7p\2\2\u008e\u008f\7v\2\2\u008f\24\3\2\2\2\u0090\u0091"+
		"\7u\2\2\u0091\u0092\7e\2\2\u0092\u0093\7c\2\2\u0093\u0094\7p\2\2\u0094"+
		"\26\3\2\2\2\u0095\u0096\7p\2\2\u0096\u0097\7g\2\2\u0097\u0098\7y\2\2\u0098"+
		"\u0099\7n\2\2\u0099\u009a\7k\2\2\u009a\u009b\7p\2\2\u009b\u009c\7g\2\2"+
		"\u009c\30\3\2\2\2\u009d\u009e\7>\2\2\u009e\u009f\7>\2\2\u009f\32\3\2\2"+
		"\2\u00a0\u00a1\7@\2\2\u00a1\u00a2\7@\2\2\u00a2\34\3\2\2\2\u00a3\u00a4"+
		"\7>\2\2\u00a4\u00a5\7/\2\2\u00a5\36\3\2\2\2\u00a6\u00a7\7A\2\2\u00a7 "+
		"\3\2\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7h\2\2\u00aa\"\3\2\2\2\u00ab\u00ac"+
		"\7g\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7g\2\2\u00af"+
		"$\3\2\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7k\2\2\u00b3"+
		"\u00b4\7h\2\2\u00b4&\3\2\2\2\u00b5\u00b6\7y\2\2\u00b6\u00b7\7j\2\2\u00b7"+
		"\u00b8\7k\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7g\2\2\u00ba(\3\2\2\2\u00bb"+
		"\u00bc\7f\2\2\u00bc\u00bd\7q\2\2\u00bd*\3\2\2\2\u00be\u00bf\7h\2\2\u00bf"+
		"\u00c0\7q\2\2\u00c0\u00c1\7t\2\2\u00c1,\3\2\2\2\u00c2\u00c3\7v\2\2\u00c3"+
		"\u00c4\7j\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7p\2\2\u00c6.\3\2\2\2\u00c7"+
		"\u00c8\7(\2\2\u00c8\u00c9\7(\2\2\u00c9\60\3\2\2\2\u00ca\u00cb\7~\2\2\u00cb"+
		"\u00cc\7~\2\2\u00cc\62\3\2\2\2\u00cd\u00ce\7(\2\2\u00ce\64\3\2\2\2\u00cf"+
		"\u00d0\7~\2\2\u00d0\66\3\2\2\2\u00d1\u00d2\7#\2\2\u00d28\3\2\2\2\u00d3"+
		"\u00d4\7=\2\2\u00d4:\3\2\2\2\u00d5\u00d6\7.\2\2\u00d6<\3\2\2\2\u00d7\u00d8"+
		"\7?\2\2\u00d8>\3\2\2\2\u00d9\u00da\7>\2\2\u00da@\3\2\2\2\u00db\u00dc\7"+
		"@\2\2\u00dcB\3\2\2\2\u00dd\u00de\7-\2\2\u00deD\3\2\2\2\u00df\u00e0\7/"+
		"\2\2\u00e0F\3\2\2\2\u00e1\u00e2\7,\2\2\u00e2H\3\2\2\2\u00e3\u00e4\7<\2"+
		"\2\u00e4J\3\2\2\2\u00e5\u00e6\7\'\2\2\u00e6L\3\2\2\2\u00e7\u00e8\7x\2"+
		"\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7f\2\2\u00ebN\3\2"+
		"\2\2\u00ec\u00ed\5Q)\2\u00edP\3\2\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7"+
		"p\2\2\u00f0\u00f1\7v\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7i\2\2\u00f3\u00f4"+
		"\7g\2\2\u00f4\u00f5\7t\2\2\u00f5R\3\2\2\2\u00f6\u00f7\7U\2\2\u00f7\u00f8"+
		"\7v\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7p\2\2\u00fb"+
		"\u00fc\7i\2\2\u00fcT\3\2\2\2\u00fd\u00fe\7f\2\2\u00fe\u00ff\7g\2\2\u00ff"+
		"\u0100\7h\2\2\u0100\u0101\7k\2\2\u0101\u0102\7p\2\2\u0102\u0103\7g\2\2"+
		"\u0103V\3\2\2\2\u0104\u0105\7t\2\2\u0105\u0106\7g\2\2\u0106\u0107\7v\2"+
		"\2\u0107\u0108\7w\2\2\u0108\u0109\7t\2\2\u0109\u010a\7p\2\2\u010aX\3\2"+
		"\2\2\u010b\u010c\7c\2\2\u010c\u010d\7w\2\2\u010d\u010e\7v\2\2\u010e\u010f"+
		"\7q\2\2\u010fZ\3\2\2\2\u0110\u0114\t\2\2\2\u0111\u0113\t\3\2\2\u0112\u0111"+
		"\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\\\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u011b\7$\2\2\u0118\u011a\t\4\2\2"+
		"\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\7$\2\2\u011f"+
		"^\3\2\2\2\u0120\u0122\t\5\2\2\u0121\u0120\3\2\2\2\u0122\u0123\3\2\2\2"+
		"\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124`\3\2\2\2\u0125\u0126\t"+
		"\6\2\2\u0126\u0127\3\2\2\2\u0127\u0128\b\61\2\2\u0128b\3\2\2\2\t\2n~\u0114"+
		"\u0119\u011b\u0123\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}