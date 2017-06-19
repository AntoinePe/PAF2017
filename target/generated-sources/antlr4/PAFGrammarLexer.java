// Generated from PAFGrammar.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Dollar=2, Number=3, Variable=4, Boolean=5, Operator=6, LB=7, RB=8, 
		LP=9, RP=10, IF=11, ELSE=12, WHILE=13, DO=14, FOR=15, THEN=16, AND=17, 
		OR=18, NOT=19, END=20, EQ=21, INF=22, SUP=23, PLUS=24, MINUS=25, TIMES=26, 
		NEG=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'"
	};
	public static final String[] ruleNames = {
		"T__0", "Dollar", "Number", "String", "Variable", "Boolean", "Operator", 
		"LB", "RB", "LP", "RP", "IF", "ELSE", "WHILE", "DO", "FOR", "THEN", "AND", 
		"OR", "NOT", "END", "EQ", "INF", "SUP", "PLUS", "MINUS", "TIMES", "NEG"
	};


	public PAFGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PAFGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\6\4"+
		"A\n\4\r\4\16\4B\3\5\7\5F\n\5\f\5\16\5I\13\5\3\6\3\6\7\6M\n\6\f\6\16\6"+
		"P\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7[\n\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bk\n\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\2\2\36\3\3\5\4\7\5\t\2\13"+
		"\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'"+
		"\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35\3\2\5\3\2\62;\5\2\62;"+
		"C\\c|\4\2C\\c|\u00ac\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\3;\3\2\2\2\5=\3\2\2\2\7@\3\2\2\2\tG\3\2\2\2\13J\3\2\2\2\rZ\3\2\2"+
		"\2\17j\3\2\2\2\21l\3\2\2\2\23n\3\2\2\2\25p\3\2\2\2\27r\3\2\2\2\31t\3\2"+
		"\2\2\33w\3\2\2\2\35|\3\2\2\2\37\u0082\3\2\2\2!\u0085\3\2\2\2#\u0089\3"+
		"\2\2\2%\u008e\3\2\2\2\'\u0090\3\2\2\2)\u0093\3\2\2\2+\u0095\3\2\2\2-\u0097"+
		"\3\2\2\2/\u0099\3\2\2\2\61\u009b\3\2\2\2\63\u009d\3\2\2\2\65\u009f\3\2"+
		"\2\2\67\u00a1\3\2\2\29\u00a3\3\2\2\2;<\7\61\2\2<\4\3\2\2\2=>\7&\2\2>\6"+
		"\3\2\2\2?A\t\2\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\b\3\2\2\2"+
		"DF\t\3\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\n\3\2\2\2IG\3\2\2"+
		"\2JN\t\4\2\2KM\t\3\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\f\3\2"+
		"\2\2PN\3\2\2\2QR\7V\2\2RS\7t\2\2ST\7w\2\2T[\7g\2\2UV\7H\2\2VW\7c\2\2W"+
		"X\7n\2\2XY\7u\2\2Y[\7g\2\2ZQ\3\2\2\2ZU\3\2\2\2[\16\3\2\2\2\\]\5-\27\2"+
		"]^\5-\27\2^k\3\2\2\2_`\5)\25\2`a\5-\27\2ak\3\2\2\2bk\5/\30\2cd\5/\30\2"+
		"de\5-\27\2ek\3\2\2\2fk\5\61\31\2gh\5\61\31\2hi\5-\27\2ik\3\2\2\2j\\\3"+
		"\2\2\2j_\3\2\2\2jb\3\2\2\2jc\3\2\2\2jf\3\2\2\2jg\3\2\2\2k\20\3\2\2\2l"+
		"m\7]\2\2m\22\3\2\2\2no\7_\2\2o\24\3\2\2\2pq\7*\2\2q\26\3\2\2\2rs\7+\2"+
		"\2s\30\3\2\2\2tu\7k\2\2uv\7h\2\2v\32\3\2\2\2wx\7g\2\2xy\7n\2\2yz\7u\2"+
		"\2z{\7g\2\2{\34\3\2\2\2|}\7y\2\2}~\7j\2\2~\177\7k\2\2\177\u0080\7n\2\2"+
		"\u0080\u0081\7g\2\2\u0081\36\3\2\2\2\u0082\u0083\7f\2\2\u0083\u0084\7"+
		"q\2\2\u0084 \3\2\2\2\u0085\u0086\7h\2\2\u0086\u0087\7q\2\2\u0087\u0088"+
		"\7t\2\2\u0088\"\3\2\2\2\u0089\u008a\7v\2\2\u008a\u008b\7j\2\2\u008b\u008c"+
		"\7g\2\2\u008c\u008d\7p\2\2\u008d$\3\2\2\2\u008e\u008f\7(\2\2\u008f&\3"+
		"\2\2\2\u0090\u0091\7~\2\2\u0091\u0092\7~\2\2\u0092(\3\2\2\2\u0093\u0094"+
		"\7#\2\2\u0094*\3\2\2\2\u0095\u0096\7=\2\2\u0096,\3\2\2\2\u0097\u0098\7"+
		"?\2\2\u0098.\3\2\2\2\u0099\u009a\7>\2\2\u009a\60\3\2\2\2\u009b\u009c\7"+
		"@\2\2\u009c\62\3\2\2\2\u009d\u009e\7-\2\2\u009e\64\3\2\2\2\u009f\u00a0"+
		"\7/\2\2\u00a0\66\3\2\2\2\u00a1\u00a2\7,\2\2\u00a28\3\2\2\2\u00a3\u00a4"+
		"\7/\2\2\u00a4:\3\2\2\2\b\2BGNZj\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}