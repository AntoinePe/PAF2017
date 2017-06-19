// Generated from PAFGrammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PAFGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Dollar=1, Number=2, Variable=3, Boolean=4, Operator=5, LB=6, RB=7, LP=8, 
		RP=9, IF=10, ELSE=11, WHILE=12, DO=13, FOR=14, THEN=15, AND=16, OR=17, 
		NOT=18, END=19, EQ=20, INF=21, SUP=22, Instructions=23, Instruction=24, 
		Operation1=25, Operation2=26, Term=27, If_condition=28, Else_condition=29, 
		While_loop=30, Dowhile_loop=31, For_loop=32, Assigning=33, Condition=34;
	public static final String[] tokenNames = {
		"<INVALID>", "'$'", "Number", "Variable", "Boolean", "Operator", "'['", 
		"']'", "'('", "')'", "'if'", "'else'", "'while'", "'do'", "'for'", "'then'", 
		"'&'", "'||'", "'!'", "';'", "'='", "'<'", "'>'", "Instructions", "Instruction", 
		"Operation1", "Operation2", "Term", "If_condition", "Else_condition", 
		"While_loop", "Dowhile_loop", "For_loop", "Assigning", "Condition"
	};
	public static final int
		RULE_s = 0;
	public static final String[] ruleNames = {
		"s"
	};

	@Override
	public String getGrammarFileName() { return "PAFGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PAFGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SContext extends ParserRuleContext {
		public TerminalNode Instructions() { return getToken(PAFGrammarParser.Instructions, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2); match(Instructions);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\7\4\2\t\2\3\2\3"+
		"\2\3\2\2\2\3\2\2\2\5\2\4\3\2\2\2\4\5\7\31\2\2\5\3\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}