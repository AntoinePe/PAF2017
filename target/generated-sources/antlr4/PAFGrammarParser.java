// Generated from PAFGrammar.g4 by ANTLR 4.7
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Dollar=1, Boolean=2, Operator=3, SLASH=4, LB=5, RB=6, LP=7, RP=8, PRINT=9, 
		POPERATOR=10, AOPERATOR=11, IF=12, ELSE=13, ELIF=14, WHILE=15, DO=16, 
		FOR=17, THEN=18, AND=19, OR=20, NOT=21, END=22, COMMA=23, EQ=24, INF=25, 
		SUP=26, PLUS=27, MINUS=28, TIMES=29, DIV=30, VOID=31, RETURNTYPES=32, 
		DEFINE=33, RETURN=34, Variable=35, Number=36, WS=37;
	public static final int
		RULE_functions = 0, RULE_function = 1, RULE_call_function = 2, RULE_parameters = 3, 
		RULE_parameters2 = 4, RULE_instructions = 5, RULE_instruction = 6, RULE_operation1 = 7, 
		RULE_operation2 = 8, RULE_term = 9, RULE_if_condition = 10, RULE_else_condition = 11, 
		RULE_while_loop = 12, RULE_dowhile_loop = 13, RULE_for_loop = 14, RULE_assigning = 15, 
		RULE_bool = 16;
	public static final String[] ruleNames = {
		"functions", "function", "call_function", "parameters", "parameters2", 
		"instructions", "instruction", "operation1", "operation2", "term", "if_condition", 
		"else_condition", "while_loop", "dowhile_loop", "for_loop", "assigning", 
		"bool"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$'", null, null, "'/'", "'['", "']'", "'('", "')'", "'print'", 
		"'<<'", "'<-'", "'if'", "'else'", "'elif'", "'while'", "'do'", "'for'", 
		"'then'", "'&'", "'||'", "'!'", "';'", "','", "'='", "'<'", "'>'", "'+'", 
		"'-'", "'*'", "':'", "'void'", "'integer'", "'define'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Dollar", "Boolean", "Operator", "SLASH", "LB", "RB", "LP", "RP", 
		"PRINT", "POPERATOR", "AOPERATOR", "IF", "ELSE", "ELIF", "WHILE", "DO", 
		"FOR", "THEN", "AND", "OR", "NOT", "END", "COMMA", "EQ", "INF", "SUP", 
		"PLUS", "MINUS", "TIMES", "DIV", "VOID", "RETURNTYPES", "DEFINE", "RETURN", 
		"Variable", "Number", "WS"
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

	@Override
	public String getGrammarFileName() { return "PAFGrammar.g4"; }

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
	public static class FunctionsContext extends ParserRuleContext {
		public Functions funcs;
		public FunctionContext a;
		public FunctionContext b;
		public FunctionsContext c;
		public TerminalNode END() { return getToken(PAFGrammarParser.END, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PAFGrammarParser.EOF, 0); }
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).exitFunctions(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_functions);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				((FunctionsContext)_localctx).a = function();
				setState(35);
				match(END);
				((FunctionsContext)_localctx).funcs = new Functions(((FunctionsContext)_localctx).a.func);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				((FunctionsContext)_localctx).b = function();
				setState(39);
				match(END);
				setState(40);
				((FunctionsContext)_localctx).c = functions();
				setState(41);
				match(EOF);
				((FunctionsContext)_localctx).funcs = new Functions(((FunctionsContext)_localctx).b.func,((FunctionsContext)_localctx).c.funcs);
				}
				break;
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

	public static class FunctionContext extends ParserRuleContext {
		public Function func;
		public Token a;
		public InstructionsContext b;
		public Token c;
		public Token d;
		public InstructionsContext e;
		public Token f;
		public Parameters2Context g;
		public InstructionsContext h;
		public Token i;
		public Token j;
		public Parameters2Context k;
		public InstructionsContext l;
		public Token m;
		public TerminalNode DEFINE() { return getToken(PAFGrammarParser.DEFINE, 0); }
		public TerminalNode VOID() { return getToken(PAFGrammarParser.VOID, 0); }
		public TerminalNode LP() { return getToken(PAFGrammarParser.LP, 0); }
		public TerminalNode RP() { return getToken(PAFGrammarParser.RP, 0); }
		public List<TerminalNode> Dollar() { return getTokens(PAFGrammarParser.Dollar); }
		public TerminalNode Dollar(int i) {
			return getToken(PAFGrammarParser.Dollar, i);
		}
		public List<TerminalNode> Variable() { return getTokens(PAFGrammarParser.Variable); }
		public TerminalNode Variable(int i) {
			return getToken(PAFGrammarParser.Variable, i);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(PAFGrammarParser.RETURN, 0); }
		public TerminalNode END() { return getToken(PAFGrammarParser.END, 0); }
		public TerminalNode RETURNTYPES() { return getToken(PAFGrammarParser.RETURNTYPES, 0); }
		public TerminalNode Number() { return getToken(PAFGrammarParser.Number, 0); }
		public Parameters2Context parameters2() {
			return getRuleContext(Parameters2Context.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(DEFINE);
				setState(47);
				match(VOID);
				setState(48);
				((FunctionContext)_localctx).a = match(Variable);
				setState(49);
				match(LP);
				setState(50);
				match(RP);
				setState(51);
				match(Dollar);
				setState(52);
				((FunctionContext)_localctx).b = instructions();
				setState(53);
				match(Dollar);
				((FunctionContext)_localctx).func = new Function((((FunctionContext)_localctx).a!=null?((FunctionContext)_localctx).a.getText():null),((FunctionContext)_localctx).b.instrs);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(DEFINE);
				setState(57);
				((FunctionContext)_localctx).c = match(RETURNTYPES);
				setState(58);
				((FunctionContext)_localctx).d = match(Variable);
				setState(59);
				match(LP);
				setState(60);
				match(RP);
				setState(61);
				match(Dollar);
				setState(62);
				((FunctionContext)_localctx).e = instructions();
				setState(63);
				match(RETURN);
				setState(64);
				((FunctionContext)_localctx).f = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Variable || _la==Number) ) {
					((FunctionContext)_localctx).f = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(65);
				match(END);
				setState(66);
				match(Dollar);
				((FunctionContext)_localctx).func = new Function((((FunctionContext)_localctx).d!=null?((FunctionContext)_localctx).d.getText():null),(((FunctionContext)_localctx).c!=null?((FunctionContext)_localctx).c.getText():null),((FunctionContext)_localctx).e.instrs,(((FunctionContext)_localctx).f!=null?((FunctionContext)_localctx).f.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(DEFINE);
				setState(70);
				match(VOID);
				setState(71);
				((FunctionContext)_localctx).f = match(Variable);
				setState(72);
				match(LP);
				setState(73);
				((FunctionContext)_localctx).g = parameters2();
				setState(74);
				match(RP);
				setState(75);
				match(Dollar);
				setState(76);
				((FunctionContext)_localctx).h = instructions();
				setState(77);
				match(Dollar);
				((FunctionContext)_localctx).func = new Function((((FunctionContext)_localctx).f!=null?((FunctionContext)_localctx).f.getText():null),((FunctionContext)_localctx).h.instrs,((FunctionContext)_localctx).g.param);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				match(DEFINE);
				setState(81);
				((FunctionContext)_localctx).i = match(RETURNTYPES);
				setState(82);
				((FunctionContext)_localctx).j = match(Variable);
				setState(83);
				match(LP);
				setState(84);
				((FunctionContext)_localctx).k = parameters2();
				setState(85);
				match(RP);
				setState(86);
				match(Dollar);
				setState(87);
				((FunctionContext)_localctx).l = instructions();
				setState(88);
				match(RETURN);
				setState(89);
				((FunctionContext)_localctx).m = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Variable || _la==Number) ) {
					((FunctionContext)_localctx).m = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(90);
				match(END);
				setState(91);
				match(Dollar);
				((FunctionContext)_localctx).func = new Function((((FunctionContext)_localctx).j!=null?((FunctionContext)_localctx).j.getText():null),(((FunctionContext)_localctx).i!=null?((FunctionContext)_localctx).i.getText():null),((FunctionContext)_localctx).l.instrs,(((FunctionContext)_localctx).m!=null?((FunctionContext)_localctx).m.getText():null),((FunctionContext)_localctx).k.param);
				}
				break;
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

	public static class Call_functionContext extends ParserRuleContext {
		public CallFunction funcCall;
		public Token a;
		public Token b;
		public ParametersContext c;
		public TerminalNode LP() { return getToken(PAFGrammarParser.LP, 0); }
		public TerminalNode RP() { return getToken(PAFGrammarParser.RP, 0); }
		public TerminalNode Variable() { return getToken(PAFGrammarParser.Variable, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Call_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).enterCall_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).exitCall_function(this);
		}
	}

	public final Call_functionContext call_function() throws RecognitionException {
		Call_functionContext _localctx = new Call_functionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_call_function);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				((Call_functionContext)_localctx).a = match(Variable);
				setState(97);
				match(LP);
				setState(98);
				match(RP);
				((Call_functionContext)_localctx).funcCall = new CallFunction((((Call_functionContext)_localctx).a!=null?((Call_functionContext)_localctx).a.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				((Call_functionContext)_localctx).b = match(Variable);
				setState(101);
				match(LP);
				setState(102);
				((Call_functionContext)_localctx).c = parameters();
				setState(103);
				match(RP);
				((Call_functionContext)_localctx).funcCall = new CallFunction((((Call_functionContext)_localctx).b!=null?((Call_functionContext)_localctx).b.getText():null),((Call_functionContext)_localctx).c.param);
				}
				break;
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

	public static class ParametersContext extends ParserRuleContext {
		public Parameter param;
		public Operation1Context a;
		public Operation1Context b;
		public ParametersContext c;
		public Operation1Context operation1() {
			return getRuleContext(Operation1Context.class,0);
		}
		public TerminalNode COMMA() { return getToken(PAFGrammarParser.COMMA, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameters);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				((ParametersContext)_localctx).a = operation1(0);
				((ParametersContext)_localctx).param = new Parameter(((ParametersContext)_localctx).a.op);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				((ParametersContext)_localctx).b = operation1(0);
				setState(112);
				match(COMMA);
				setState(113);
				((ParametersContext)_localctx).c = parameters();
				((ParametersContext)_localctx).param = new Parameter(((ParametersContext)_localctx).b.op,((ParametersContext)_localctx).c.param);
				}
				break;
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

	public static class Parameters2Context extends ParserRuleContext {
		public Parameter2 param;
		public Token a;
		public Token b;
		public Token c;
		public Token d;
		public Parameters2Context e;
		public TerminalNode RETURNTYPES() { return getToken(PAFGrammarParser.RETURNTYPES, 0); }
		public TerminalNode Variable() { return getToken(PAFGrammarParser.Variable, 0); }
		public TerminalNode COMMA() { return getToken(PAFGrammarParser.COMMA, 0); }
		public Parameters2Context parameters2() {
			return getRuleContext(Parameters2Context.class,0);
		}
		public Parameters2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).enterParameters2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).exitParameters2(this);
		}
	}

	public final Parameters2Context parameters2() throws RecognitionException {
		Parameters2Context _localctx = new Parameters2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameters2);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				((Parameters2Context)_localctx).a = match(RETURNTYPES);
				setState(119);
				((Parameters2Context)_localctx).b = match(Variable);
				((Parameters2Context)_localctx).param = new Parameter2(new Variable((((Parameters2Context)_localctx).b!=null?((Parameters2Context)_localctx).b.getText():null)),(((Parameters2Context)_localctx).a!=null?((Parameters2Context)_localctx).a.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				((Parameters2Context)_localctx).c = match(RETURNTYPES);
				setState(122);
				((Parameters2Context)_localctx).d = match(Variable);
				setState(123);
				match(COMMA);
				setState(124);
				((Parameters2Context)_localctx).e = parameters2();
				((Parameters2Context)_localctx).param = new Parameter2(new Variable((((Parameters2Context)_localctx).d!=null?((Parameters2Context)_localctx).d.getText():null)),(((Parameters2Context)_localctx).c!=null?((Parameters2Context)_localctx).c.getText():null),((Parameters2Context)_localctx).e.param);
				}
				break;
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

	public static class InstructionsContext extends ParserRuleContext {
		public Instructions instrs;
		public InstructionContext a;
		public InstructionContext b;
		public InstructionsContext c;
		public TerminalNode END() { return getToken(PAFGrammarParser.END, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).exitInstructions(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instructions);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				((InstructionsContext)_localctx).a = instruction();
				setState(130);
				match(END);
				((InstructionsContext)_localctx).instrs = new Instructions(((InstructionsContext)_localctx).a.instr);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				((InstructionsContext)_localctx).b = instruction();
				setState(134);
				match(END);
				setState(135);
				((InstructionsContext)_localctx).c = instructions();
				((InstructionsContext)_localctx).instrs = new Instructions(((InstructionsContext)_localctx).b.instr,((InstructionsContext)_localctx).c.instrs);
				}
				break;
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

	public static class InstructionContext extends ParserRuleContext {
		public Instruction instr;
		public If_conditionContext a;
		public For_loopContext b;
		public While_loopContext c;
		public Dowhile_loopContext d;
		public AssigningContext e;
		public Operation1Context f;
		public If_conditionContext if_condition() {
			return getRuleContext(If_conditionContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Dowhile_loopContext dowhile_loop() {
			return getRuleContext(Dowhile_loopContext.class,0);
		}
		public AssigningContext assigning() {
			return getRuleContext(AssigningContext.class,0);
		}
		public TerminalNode PRINT() { return getToken(PAFGrammarParser.PRINT, 0); }
		public TerminalNode POPERATOR() { return getToken(PAFGrammarParser.POPERATOR, 0); }
		public Operation1Context operation1() {
			return getRuleContext(Operation1Context.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instruction);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				((InstructionContext)_localctx).a = if_condition();
				((InstructionContext)_localctx).instr = new Instruction(((InstructionContext)_localctx).a.cond);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				((InstructionContext)_localctx).b = for_loop();
				((InstructionContext)_localctx).instr = new Instruction(((InstructionContext)_localctx).b.forLoop);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				((InstructionContext)_localctx).c = while_loop();
				((InstructionContext)_localctx).instr = new Instruction(((InstructionContext)_localctx).c.whileLoop);
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				((InstructionContext)_localctx).d = dowhile_loop();
				((InstructionContext)_localctx).instr = new Instruction(((InstructionContext)_localctx).d.dowhileLoop);
				}
				break;
			case Variable:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				((InstructionContext)_localctx).e = assigning();
				((InstructionContext)_localctx).instr = new Instruction(((InstructionContext)_localctx).e.var);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 6);
				{
				setState(155);
				match(PRINT);
				setState(156);
				match(POPERATOR);
				setState(157);
				((InstructionContext)_localctx).f = operation1(0);
				((InstructionContext)_localctx).instr = new Instruction(((InstructionContext)_localctx).f.op);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Operation1Context extends ParserRuleContext {
		public Operation op;
		public Operation1Context b;
		public Operation1Context d;
		public Operation2Context a;
		public Token p;
		public TermContext c;
		public Token m;
		public TermContext e;
		public Operation2Context operation2() {
			return getRuleContext(Operation2Context.class,0);
		}
		public Operation1Context operation1() {
			return getRuleContext(Operation1Context.class,0);
		}
		public TerminalNode PLUS() { return getToken(PAFGrammarParser.PLUS, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(PAFGrammarParser.MINUS, 0); }
		public Operation1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).enterOperation1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).exitOperation1(this);
		}
	}

	public final Operation1Context operation1() throws RecognitionException {
		return operation1(0);
	}

	private Operation1Context operation1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Operation1Context _localctx = new Operation1Context(_ctx, _parentState);
		Operation1Context _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_operation1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(163);
			((Operation1Context)_localctx).a = operation2(0);
			((Operation1Context)_localctx).op = ((Operation1Context)_localctx).a.op;
			}
			_ctx.stop = _input.LT(-1);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(176);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new Operation1Context(_parentctx, _parentState);
						_localctx.b = _prevctx;
						_localctx.b = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operation1);
						setState(166);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(167);
						((Operation1Context)_localctx).p = match(PLUS);
						setState(168);
						((Operation1Context)_localctx).c = term();
						((Operation1Context)_localctx).op = new Operation(((Operation1Context)_localctx).c.tm,((Operation1Context)_localctx).b.op,(((Operation1Context)_localctx).p!=null?((Operation1Context)_localctx).p.getText():null));
						}
						break;
					case 2:
						{
						_localctx = new Operation1Context(_parentctx, _parentState);
						_localctx.d = _prevctx;
						_localctx.d = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operation1);
						setState(171);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(172);
						((Operation1Context)_localctx).m = match(MINUS);
						setState(173);
						((Operation1Context)_localctx).e = term();
						((Operation1Context)_localctx).op = new Operation(((Operation1Context)_localctx).e.tm,((Operation1Context)_localctx).d.op,(((Operation1Context)_localctx).m!=null?((Operation1Context)_localctx).m.getText():null));
						}
						break;
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Operation2Context extends ParserRuleContext {
		public Operation op;
		public Operation2Context c;
		public Operation2Context f;
		public TermContext a;
		public Token t;
		public TermContext b;
		public Token e;
		public TermContext d;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Operation2Context operation2() {
			return getRuleContext(Operation2Context.class,0);
		}
		public TerminalNode TIMES() { return getToken(PAFGrammarParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(PAFGrammarParser.DIV, 0); }
		public Operation2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).enterOperation2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).exitOperation2(this);
		}
	}

	public final Operation2Context operation2() throws RecognitionException {
		return operation2(0);
	}

	private Operation2Context operation2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Operation2Context _localctx = new Operation2Context(_ctx, _parentState);
		Operation2Context _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_operation2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(182);
			((Operation2Context)_localctx).a = term();
			((Operation2Context)_localctx).op = new Operation(((Operation2Context)_localctx).a.tm);
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(195);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new Operation2Context(_parentctx, _parentState);
						_localctx.c = _prevctx;
						_localctx.c = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operation2);
						setState(185);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(186);
						((Operation2Context)_localctx).t = match(TIMES);
						setState(187);
						((Operation2Context)_localctx).b = term();
						((Operation2Context)_localctx).op = new Operation(((Operation2Context)_localctx).b.tm,((Operation2Context)_localctx).c.op,(((Operation2Context)_localctx).t!=null?((Operation2Context)_localctx).t.getText():null));
						}
						break;
					case 2:
						{
						_localctx = new Operation2Context(_parentctx, _parentState);
						_localctx.f = _prevctx;
						_localctx.f = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operation2);
						setState(190);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(191);
						((Operation2Context)_localctx).e = match(DIV);
						setState(192);
						((Operation2Context)_localctx).d = term();
						((Operation2Context)_localctx).op = new Operation(((Operation2Context)_localctx).d.tm,((Operation2Context)_localctx).f.op,(((Operation2Context)_localctx).e!=null?((Operation2Context)_localctx).e.getText():null));
						}
						break;
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public Term tm;
		public Token lp;
		public Operation1Context a;
		public Token rp;
		public Token n;
		public Token m;
		public Call_functionContext o;
		public Token v;
		public TerminalNode LP() { return getToken(PAFGrammarParser.LP, 0); }
		public Operation1Context operation1() {
			return getRuleContext(Operation1Context.class,0);
		}
		public TerminalNode RP() { return getToken(PAFGrammarParser.RP, 0); }
		public TerminalNode Number() { return getToken(PAFGrammarParser.Number, 0); }
		public TerminalNode MINUS() { return getToken(PAFGrammarParser.MINUS, 0); }
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
		}
		public TerminalNode Variable() { return getToken(PAFGrammarParser.Variable, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				((TermContext)_localctx).lp = match(LP);
				setState(201);
				((TermContext)_localctx).a = operation1(0);
				setState(202);
				((TermContext)_localctx).rp = match(RP);
				((TermContext)_localctx).tm = new Term(((TermContext)_localctx).a.op,(((TermContext)_localctx).lp!=null?((TermContext)_localctx).lp.getText():null),(((TermContext)_localctx).rp!=null?((TermContext)_localctx).rp.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				((TermContext)_localctx).n = match(Number);
				((TermContext)_localctx).tm = new Term((((TermContext)_localctx).n!=null?((TermContext)_localctx).n.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				((TermContext)_localctx).m = match(MINUS);
				setState(208);
				((TermContext)_localctx).n = match(Number);
				((TermContext)_localctx).tm = new Term((((TermContext)_localctx).n!=null?((TermContext)_localctx).n.getText():null),(((TermContext)_localctx).m!=null?((TermContext)_localctx).m.getText():null));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				((TermContext)_localctx).o = call_function();
				((TermContext)_localctx).tm = new Term(((TermContext)_localctx).o.funcCall);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(213);
				((TermContext)_localctx).v = match(Variable);
				((TermContext)_localctx).tm = new Term(new Variable((((TermContext)_localctx).v!=null?((TermContext)_localctx).v.getText():null)));
				}
				break;
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

	public static class If_conditionContext extends ParserRuleContext {
		public Condition cond;
		public BoolContext a;
		public InstructionsContext b;
		public BoolContext c;
		public InstructionsContext d;
		public Else_conditionContext e;
		public TerminalNode IF() { return getToken(PAFGrammarParser.IF, 0); }
		public TerminalNode THEN() { return getToken(PAFGrammarParser.THEN, 0); }
		public List<TerminalNode> Dollar() { return getTokens(PAFGrammarParser.Dollar); }
		public TerminalNode Dollar(int i) {
			return getToken(PAFGrammarParser.Dollar, i);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public Else_conditionContext else_condition() {
			return getRuleContext(Else_conditionContext.class,0);
		}
		public If_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).enterIf_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).exitIf_condition(this);
		}
	}

	public final If_conditionContext if_condition() throws RecognitionException {
		If_conditionContext _localctx = new If_conditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_condition);
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(IF);
				setState(218);
				((If_conditionContext)_localctx).a = bool();
				setState(219);
				match(THEN);
				setState(220);
				match(Dollar);
				setState(221);
				((If_conditionContext)_localctx).b = instructions();
				setState(222);
				match(Dollar);
				((If_conditionContext)_localctx).cond = new Condition(((If_conditionContext)_localctx).a.value,((If_conditionContext)_localctx).b.instrs);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(IF);
				setState(226);
				((If_conditionContext)_localctx).c = bool();
				setState(227);
				match(THEN);
				setState(228);
				match(Dollar);
				setState(229);
				((If_conditionContext)_localctx).d = instructions();
				setState(230);
				match(Dollar);
				setState(231);
				((If_conditionContext)_localctx).e = else_condition();
				((If_conditionContext)_localctx).cond = new Condition(((If_conditionContext)_localctx).c.value,((If_conditionContext)_localctx).d.instrs,((If_conditionContext)_localctx).e.cond);
				}
				break;
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

	public static class Else_conditionContext extends ParserRuleContext {
		public Condition cond;
		public InstructionsContext a;
		public BoolContext b;
		public InstructionsContext c;
		public Else_conditionContext d;
		public TerminalNode ELSE() { return getToken(PAFGrammarParser.ELSE, 0); }
		public List<TerminalNode> Dollar() { return getTokens(PAFGrammarParser.Dollar); }
		public TerminalNode Dollar(int i) {
			return getToken(PAFGrammarParser.Dollar, i);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode ELIF() { return getToken(PAFGrammarParser.ELIF, 0); }
		public TerminalNode THEN() { return getToken(PAFGrammarParser.THEN, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public Else_conditionContext else_condition() {
			return getRuleContext(Else_conditionContext.class,0);
		}
		public Else_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).enterElse_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).exitElse_condition(this);
		}
	}

	public final Else_conditionContext else_condition() throws RecognitionException {
		Else_conditionContext _localctx = new Else_conditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_else_condition);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(ELSE);
				setState(237);
				match(Dollar);
				setState(238);
				((Else_conditionContext)_localctx).a = instructions();
				setState(239);
				match(Dollar);
				((Else_conditionContext)_localctx).cond = new Condition(((Else_conditionContext)_localctx).a.instrs);
				}
				break;
			case ELIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(ELIF);
				setState(243);
				((Else_conditionContext)_localctx).b = bool();
				setState(244);
				match(THEN);
				setState(245);
				match(Dollar);
				setState(246);
				((Else_conditionContext)_localctx).c = instructions();
				setState(247);
				match(Dollar);
				setState(248);
				((Else_conditionContext)_localctx).d = else_condition();
				((Else_conditionContext)_localctx).cond = new Condition(((Else_conditionContext)_localctx).b.value,((Else_conditionContext)_localctx).c.instrs,((Else_conditionContext)_localctx).d.cond);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class While_loopContext extends ParserRuleContext {
		public While_loop whileLoop;
		public BoolContext a;
		public InstructionsContext b;
		public TerminalNode WHILE() { return getToken(PAFGrammarParser.WHILE, 0); }
		public List<TerminalNode> Dollar() { return getTokens(PAFGrammarParser.Dollar); }
		public TerminalNode Dollar(int i) {
			return getToken(PAFGrammarParser.Dollar, i);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).exitWhile_loop(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(WHILE);
			setState(254);
			((While_loopContext)_localctx).a = bool();
			setState(255);
			match(Dollar);
			setState(256);
			((While_loopContext)_localctx).b = instructions();
			setState(257);
			match(Dollar);
			((While_loopContext)_localctx).whileLoop = new While_loop(((While_loopContext)_localctx).a.value,((While_loopContext)_localctx).b.instrs);
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

	public static class Dowhile_loopContext extends ParserRuleContext {
		public Dowhile_loop dowhileLoop;
		public InstructionsContext a;
		public BoolContext b;
		public TerminalNode DO() { return getToken(PAFGrammarParser.DO, 0); }
		public List<TerminalNode> Dollar() { return getTokens(PAFGrammarParser.Dollar); }
		public TerminalNode Dollar(int i) {
			return getToken(PAFGrammarParser.Dollar, i);
		}
		public TerminalNode WHILE() { return getToken(PAFGrammarParser.WHILE, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public Dowhile_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhile_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).enterDowhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).exitDowhile_loop(this);
		}
	}

	public final Dowhile_loopContext dowhile_loop() throws RecognitionException {
		Dowhile_loopContext _localctx = new Dowhile_loopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dowhile_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(DO);
			setState(261);
			match(Dollar);
			setState(262);
			((Dowhile_loopContext)_localctx).a = instructions();
			setState(263);
			match(Dollar);
			setState(264);
			match(WHILE);
			setState(265);
			((Dowhile_loopContext)_localctx).b = bool();
			((Dowhile_loopContext)_localctx).dowhileLoop = new Dowhile_loop(((Dowhile_loopContext)_localctx).b.value,((Dowhile_loopContext)_localctx).a.instrs);
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

	public static class For_loopContext extends ParserRuleContext {
		public For_loop forLoop;
		public AssigningContext a;
		public BoolContext b;
		public AssigningContext c;
		public InstructionsContext d;
		public TerminalNode FOR() { return getToken(PAFGrammarParser.FOR, 0); }
		public TerminalNode LP() { return getToken(PAFGrammarParser.LP, 0); }
		public List<TerminalNode> SLASH() { return getTokens(PAFGrammarParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(PAFGrammarParser.SLASH, i);
		}
		public TerminalNode RP() { return getToken(PAFGrammarParser.RP, 0); }
		public List<TerminalNode> Dollar() { return getTokens(PAFGrammarParser.Dollar); }
		public TerminalNode Dollar(int i) {
			return getToken(PAFGrammarParser.Dollar, i);
		}
		public List<AssigningContext> assigning() {
			return getRuleContexts(AssigningContext.class);
		}
		public AssigningContext assigning(int i) {
			return getRuleContext(AssigningContext.class,i);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).exitFor_loop(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(FOR);
			setState(269);
			match(LP);
			setState(270);
			((For_loopContext)_localctx).a = assigning();
			setState(271);
			match(SLASH);
			setState(272);
			((For_loopContext)_localctx).b = bool();
			setState(273);
			match(SLASH);
			setState(274);
			((For_loopContext)_localctx).c = assigning();
			setState(275);
			match(RP);
			setState(276);
			match(Dollar);
			setState(277);
			((For_loopContext)_localctx).d = instructions();
			setState(278);
			match(Dollar);
			((For_loopContext)_localctx).forLoop = new For_loop(((For_loopContext)_localctx).b.value,((For_loopContext)_localctx).a.var,((For_loopContext)_localctx).c.var,((For_loopContext)_localctx).d.instrs);
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

	public static class AssigningContext extends ParserRuleContext {
		public Assigning var;
		public Token a;
		public Operation1Context b;
		public Token c;
		public BoolContext d;
		public TerminalNode AOPERATOR() { return getToken(PAFGrammarParser.AOPERATOR, 0); }
		public TerminalNode Variable() { return getToken(PAFGrammarParser.Variable, 0); }
		public Operation1Context operation1() {
			return getRuleContext(Operation1Context.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public AssigningContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigning; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).enterAssigning(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).exitAssigning(this);
		}
	}

	public final AssigningContext assigning() throws RecognitionException {
		AssigningContext _localctx = new AssigningContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assigning);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				((AssigningContext)_localctx).a = match(Variable);
				setState(282);
				match(AOPERATOR);
				setState(283);
				((AssigningContext)_localctx).b = operation1(0);
				((AssigningContext)_localctx).var = new Assigning(new Variable((((AssigningContext)_localctx).a!=null?((AssigningContext)_localctx).a.getText():null)),((AssigningContext)_localctx).b.op);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				((AssigningContext)_localctx).c = match(Variable);
				setState(287);
				match(AOPERATOR);
				setState(288);
				((AssigningContext)_localctx).d = bool();
				((AssigningContext)_localctx).var = new Assigning(new Variable((((AssigningContext)_localctx).c!=null?((AssigningContext)_localctx).c.getText():null)),((AssigningContext)_localctx).d.value);
				}
				break;
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

	public static class BoolContext extends ParserRuleContext {
		public Bool value;
		public Token a;
		public Operation1Context b;
		public Token c;
		public Operation1Context d;
		public Token e;
		public Token f;
		public Operation1Context g;
		public TerminalNode Boolean() { return getToken(PAFGrammarParser.Boolean, 0); }
		public TerminalNode LP() { return getToken(PAFGrammarParser.LP, 0); }
		public TerminalNode RP() { return getToken(PAFGrammarParser.RP, 0); }
		public List<Operation1Context> operation1() {
			return getRuleContexts(Operation1Context.class);
		}
		public Operation1Context operation1(int i) {
			return getRuleContext(Operation1Context.class,i);
		}
		public TerminalNode Operator() { return getToken(PAFGrammarParser.Operator, 0); }
		public TerminalNode Variable() { return getToken(PAFGrammarParser.Variable, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bool);
		int _la;
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP) {
					{
					setState(293);
					match(LP);
					}
				}

				setState(296);
				((BoolContext)_localctx).a = match(Boolean);
				setState(298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(297);
					match(RP);
					}
					break;
				}
				((BoolContext)_localctx).value = new Bool((((BoolContext)_localctx).a!=null?((BoolContext)_localctx).a.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(LP);
				setState(302);
				((BoolContext)_localctx).b = operation1(0);
				setState(303);
				((BoolContext)_localctx).c = match(Operator);
				setState(304);
				((BoolContext)_localctx).d = operation1(0);
				setState(305);
				match(RP);
				((BoolContext)_localctx).value = new Bool(((BoolContext)_localctx).b.op,((BoolContext)_localctx).d.op,(((BoolContext)_localctx).c!=null?((BoolContext)_localctx).c.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				match(LP);
				setState(309);
				((BoolContext)_localctx).e = match(Variable);
				setState(310);
				((BoolContext)_localctx).f = match(Operator);
				setState(311);
				((BoolContext)_localctx).g = operation1(0);
				setState(312);
				match(RP);
				((BoolContext)_localctx).value = new Bool(new Variable((((BoolContext)_localctx).e!=null?((BoolContext)_localctx).e.getText():null)),((BoolContext)_localctx).g.op,(((BoolContext)_localctx).f!=null?((BoolContext)_localctx).f.getText():null));
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return operation1_sempred((Operation1Context)_localctx, predIndex);
		case 8:
			return operation2_sempred((Operation2Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean operation1_sempred(Operation1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean operation2_sempred(Operation2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0140\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2/\n\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3a\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4m\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5w\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0082\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u008d\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a3\n\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00b3\n\t\f\t\16\t\u00b6\13\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00c6\n\n\f\n"+
		"\16\n\u00c9\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u00da\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ed\n\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00fe\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0126\n\21\3\22\5\22\u0129\n\22"+
		"\3\22\3\22\5\22\u012d\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u013e\n\22\3\22\2\4\20\22\23\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\3\3\2%&\2\u014a\2.\3\2\2\2\4`\3"+
		"\2\2\2\6l\3\2\2\2\bv\3\2\2\2\n\u0081\3\2\2\2\f\u008c\3\2\2\2\16\u00a2"+
		"\3\2\2\2\20\u00a4\3\2\2\2\22\u00b7\3\2\2\2\24\u00d9\3\2\2\2\26\u00ec\3"+
		"\2\2\2\30\u00fd\3\2\2\2\32\u00ff\3\2\2\2\34\u0106\3\2\2\2\36\u010e\3\2"+
		"\2\2 \u0125\3\2\2\2\"\u013d\3\2\2\2$%\5\4\3\2%&\7\30\2\2&\'\b\2\1\2\'"+
		"/\3\2\2\2()\5\4\3\2)*\7\30\2\2*+\5\2\2\2+,\7\2\2\3,-\b\2\1\2-/\3\2\2\2"+
		".$\3\2\2\2.(\3\2\2\2/\3\3\2\2\2\60\61\7#\2\2\61\62\7!\2\2\62\63\7%\2\2"+
		"\63\64\7\t\2\2\64\65\7\n\2\2\65\66\7\3\2\2\66\67\5\f\7\2\678\7\3\2\28"+
		"9\b\3\1\29a\3\2\2\2:;\7#\2\2;<\7\"\2\2<=\7%\2\2=>\7\t\2\2>?\7\n\2\2?@"+
		"\7\3\2\2@A\5\f\7\2AB\7$\2\2BC\t\2\2\2CD\7\30\2\2DE\7\3\2\2EF\b\3\1\2F"+
		"a\3\2\2\2GH\7#\2\2HI\7!\2\2IJ\7%\2\2JK\7\t\2\2KL\5\n\6\2LM\7\n\2\2MN\7"+
		"\3\2\2NO\5\f\7\2OP\7\3\2\2PQ\b\3\1\2Qa\3\2\2\2RS\7#\2\2ST\7\"\2\2TU\7"+
		"%\2\2UV\7\t\2\2VW\5\n\6\2WX\7\n\2\2XY\7\3\2\2YZ\5\f\7\2Z[\7$\2\2[\\\t"+
		"\2\2\2\\]\7\30\2\2]^\7\3\2\2^_\b\3\1\2_a\3\2\2\2`\60\3\2\2\2`:\3\2\2\2"+
		"`G\3\2\2\2`R\3\2\2\2a\5\3\2\2\2bc\7%\2\2cd\7\t\2\2de\7\n\2\2em\b\4\1\2"+
		"fg\7%\2\2gh\7\t\2\2hi\5\b\5\2ij\7\n\2\2jk\b\4\1\2km\3\2\2\2lb\3\2\2\2"+
		"lf\3\2\2\2m\7\3\2\2\2no\5\20\t\2op\b\5\1\2pw\3\2\2\2qr\5\20\t\2rs\7\31"+
		"\2\2st\5\b\5\2tu\b\5\1\2uw\3\2\2\2vn\3\2\2\2vq\3\2\2\2w\t\3\2\2\2xy\7"+
		"\"\2\2yz\7%\2\2z\u0082\b\6\1\2{|\7\"\2\2|}\7%\2\2}~\7\31\2\2~\177\5\n"+
		"\6\2\177\u0080\b\6\1\2\u0080\u0082\3\2\2\2\u0081x\3\2\2\2\u0081{\3\2\2"+
		"\2\u0082\13\3\2\2\2\u0083\u0084\5\16\b\2\u0084\u0085\7\30\2\2\u0085\u0086"+
		"\b\7\1\2\u0086\u008d\3\2\2\2\u0087\u0088\5\16\b\2\u0088\u0089\7\30\2\2"+
		"\u0089\u008a\5\f\7\2\u008a\u008b\b\7\1\2\u008b\u008d\3\2\2\2\u008c\u0083"+
		"\3\2\2\2\u008c\u0087\3\2\2\2\u008d\r\3\2\2\2\u008e\u008f\5\26\f\2\u008f"+
		"\u0090\b\b\1\2\u0090\u00a3\3\2\2\2\u0091\u0092\5\36\20\2\u0092\u0093\b"+
		"\b\1\2\u0093\u00a3\3\2\2\2\u0094\u0095\5\32\16\2\u0095\u0096\b\b\1\2\u0096"+
		"\u00a3\3\2\2\2\u0097\u0098\5\34\17\2\u0098\u0099\b\b\1\2\u0099\u00a3\3"+
		"\2\2\2\u009a\u009b\5 \21\2\u009b\u009c\b\b\1\2\u009c\u00a3\3\2\2\2\u009d"+
		"\u009e\7\13\2\2\u009e\u009f\7\f\2\2\u009f\u00a0\5\20\t\2\u00a0\u00a1\b"+
		"\b\1\2\u00a1\u00a3\3\2\2\2\u00a2\u008e\3\2\2\2\u00a2\u0091\3\2\2\2\u00a2"+
		"\u0094\3\2\2\2\u00a2\u0097\3\2\2\2\u00a2\u009a\3\2\2\2\u00a2\u009d\3\2"+
		"\2\2\u00a3\17\3\2\2\2\u00a4\u00a5\b\t\1\2\u00a5\u00a6\5\22\n\2\u00a6\u00a7"+
		"\b\t\1\2\u00a7\u00b4\3\2\2\2\u00a8\u00a9\f\4\2\2\u00a9\u00aa\7\35\2\2"+
		"\u00aa\u00ab\5\24\13\2\u00ab\u00ac\b\t\1\2\u00ac\u00b3\3\2\2\2\u00ad\u00ae"+
		"\f\3\2\2\u00ae\u00af\7\36\2\2\u00af\u00b0\5\24\13\2\u00b0\u00b1\b\t\1"+
		"\2\u00b1\u00b3\3\2\2\2\u00b2\u00a8\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b3\u00b6"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\21\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b7\u00b8\b\n\1\2\u00b8\u00b9\5\24\13\2\u00b9\u00ba\b"+
		"\n\1\2\u00ba\u00c7\3\2\2\2\u00bb\u00bc\f\4\2\2\u00bc\u00bd\7\37\2\2\u00bd"+
		"\u00be\5\24\13\2\u00be\u00bf\b\n\1\2\u00bf\u00c6\3\2\2\2\u00c0\u00c1\f"+
		"\3\2\2\u00c1\u00c2\7 \2\2\u00c2\u00c3\5\24\13\2\u00c3\u00c4\b\n\1\2\u00c4"+
		"\u00c6\3\2\2\2\u00c5\u00bb\3\2\2\2\u00c5\u00c0\3\2\2\2\u00c6\u00c9\3\2"+
		"\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\23\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00ca\u00cb\7\t\2\2\u00cb\u00cc\5\20\t\2\u00cc\u00cd\7\n\2\2"+
		"\u00cd\u00ce\b\13\1\2\u00ce\u00da\3\2\2\2\u00cf\u00d0\7&\2\2\u00d0\u00da"+
		"\b\13\1\2\u00d1\u00d2\7\36\2\2\u00d2\u00d3\7&\2\2\u00d3\u00da\b\13\1\2"+
		"\u00d4\u00d5\5\6\4\2\u00d5\u00d6\b\13\1\2\u00d6\u00da\3\2\2\2\u00d7\u00d8"+
		"\7%\2\2\u00d8\u00da\b\13\1\2\u00d9\u00ca\3\2\2\2\u00d9\u00cf\3\2\2\2\u00d9"+
		"\u00d1\3\2\2\2\u00d9\u00d4\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\25\3\2\2"+
		"\2\u00db\u00dc\7\16\2\2\u00dc\u00dd\5\"\22\2\u00dd\u00de\7\24\2\2\u00de"+
		"\u00df\7\3\2\2\u00df\u00e0\5\f\7\2\u00e0\u00e1\7\3\2\2\u00e1\u00e2\b\f"+
		"\1\2\u00e2\u00ed\3\2\2\2\u00e3\u00e4\7\16\2\2\u00e4\u00e5\5\"\22\2\u00e5"+
		"\u00e6\7\24\2\2\u00e6\u00e7\7\3\2\2\u00e7\u00e8\5\f\7\2\u00e8\u00e9\7"+
		"\3\2\2\u00e9\u00ea\5\30\r\2\u00ea\u00eb\b\f\1\2\u00eb\u00ed\3\2\2\2\u00ec"+
		"\u00db\3\2\2\2\u00ec\u00e3\3\2\2\2\u00ed\27\3\2\2\2\u00ee\u00ef\7\17\2"+
		"\2\u00ef\u00f0\7\3\2\2\u00f0\u00f1\5\f\7\2\u00f1\u00f2\7\3\2\2\u00f2\u00f3"+
		"\b\r\1\2\u00f3\u00fe\3\2\2\2\u00f4\u00f5\7\20\2\2\u00f5\u00f6\5\"\22\2"+
		"\u00f6\u00f7\7\24\2\2\u00f7\u00f8\7\3\2\2\u00f8\u00f9\5\f\7\2\u00f9\u00fa"+
		"\7\3\2\2\u00fa\u00fb\5\30\r\2\u00fb\u00fc\b\r\1\2\u00fc\u00fe\3\2\2\2"+
		"\u00fd\u00ee\3\2\2\2\u00fd\u00f4\3\2\2\2\u00fe\31\3\2\2\2\u00ff\u0100"+
		"\7\21\2\2\u0100\u0101\5\"\22\2\u0101\u0102\7\3\2\2\u0102\u0103\5\f\7\2"+
		"\u0103\u0104\7\3\2\2\u0104\u0105\b\16\1\2\u0105\33\3\2\2\2\u0106\u0107"+
		"\7\22\2\2\u0107\u0108\7\3\2\2\u0108\u0109\5\f\7\2\u0109\u010a\7\3\2\2"+
		"\u010a\u010b\7\21\2\2\u010b\u010c\5\"\22\2\u010c\u010d\b\17\1\2\u010d"+
		"\35\3\2\2\2\u010e\u010f\7\23\2\2\u010f\u0110\7\t\2\2\u0110\u0111\5 \21"+
		"\2\u0111\u0112\7\6\2\2\u0112\u0113\5\"\22\2\u0113\u0114\7\6\2\2\u0114"+
		"\u0115\5 \21\2\u0115\u0116\7\n\2\2\u0116\u0117\7\3\2\2\u0117\u0118\5\f"+
		"\7\2\u0118\u0119\7\3\2\2\u0119\u011a\b\20\1\2\u011a\37\3\2\2\2\u011b\u011c"+
		"\7%\2\2\u011c\u011d\7\r\2\2\u011d\u011e\5\20\t\2\u011e\u011f\b\21\1\2"+
		"\u011f\u0126\3\2\2\2\u0120\u0121\7%\2\2\u0121\u0122\7\r\2\2\u0122\u0123"+
		"\5\"\22\2\u0123\u0124\b\21\1\2\u0124\u0126\3\2\2\2\u0125\u011b\3\2\2\2"+
		"\u0125\u0120\3\2\2\2\u0126!\3\2\2\2\u0127\u0129\7\t\2\2\u0128\u0127\3"+
		"\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\7\4\2\2\u012b"+
		"\u012d\7\n\2\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\u013e\b\22\1\2\u012f\u0130\7\t\2\2\u0130\u0131\5\20\t\2\u0131"+
		"\u0132\7\5\2\2\u0132\u0133\5\20\t\2\u0133\u0134\7\n\2\2\u0134\u0135\b"+
		"\22\1\2\u0135\u013e\3\2\2\2\u0136\u0137\7\t\2\2\u0137\u0138\7%\2\2\u0138"+
		"\u0139\7\5\2\2\u0139\u013a\5\20\t\2\u013a\u013b\7\n\2\2\u013b\u013c\b"+
		"\22\1\2\u013c\u013e\3\2\2\2\u013d\u0128\3\2\2\2\u013d\u012f\3\2\2\2\u013d"+
		"\u0136\3\2\2\2\u013e#\3\2\2\2\24.`lv\u0081\u008c\u00a2\u00b2\u00b4\u00c5"+
		"\u00c7\u00d9\u00ec\u00fd\u0125\u0128\u012c\u013d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}