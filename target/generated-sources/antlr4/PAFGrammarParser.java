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
		SCAN=10, POPERATOR=11, SOPERATOR=12, AOPERATOR=13, QUES=14, IF=15, ELSE=16, 
		ELIF=17, WHILE=18, DO=19, FOR=20, THEN=21, AND=22, OR=23, BAND=24, BOR=25, 
		NOT=26, END=27, COMMA=28, EQ=29, INF=30, SUP=31, PLUS=32, MINUS=33, TIMES=34, 
		DIV=35, REM=36, VOID=37, RETURNTYPES=38, INTEGER=39, STRING=40, DEFINE=41, 
		RETURN=42, AUTO=43, Variable=44, String=45, Number=46, WS=47;
	public static final int
		RULE_functions = 0, RULE_function = 1, RULE_parameters2 = 2, RULE_instructions = 3, 
		RULE_instruction = 4, RULE_operation1 = 5, RULE_operation2 = 6, RULE_term = 7, 
		RULE_call_function = 8, RULE_parameters = 9, RULE_if_condition = 10, RULE_else_condition = 11, 
		RULE_while_loop = 12, RULE_dowhile_loop = 13, RULE_for_loop = 14, RULE_assigning = 15, 
		RULE_bool = 16;
	public static final String[] ruleNames = {
		"functions", "function", "parameters2", "instructions", "instruction", 
		"operation1", "operation2", "term", "call_function", "parameters", "if_condition", 
		"else_condition", "while_loop", "dowhile_loop", "for_loop", "assigning", 
		"bool"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$'", null, null, "'/'", "'['", "']'", "'('", "')'", "'print'", 
		"'scan'", "'<<'", "'>>'", "'<-'", "'?'", "'if'", "'else'", "'elif'", "'while'", 
		"'do'", "'for'", "'then'", "'&&'", "'||'", "'&'", "'|'", "'!'", "';'", 
		"','", "'='", "'<'", "'>'", "'+'", "'-'", "'*'", "':'", "'%'", "'void'", 
		null, "'integer'", "'String'", "'define'", "'return'", "'auto'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Dollar", "Boolean", "Operator", "SLASH", "LB", "RB", "LP", "RP", 
		"PRINT", "SCAN", "POPERATOR", "SOPERATOR", "AOPERATOR", "QUES", "IF", 
		"ELSE", "ELIF", "WHILE", "DO", "FOR", "THEN", "AND", "OR", "BAND", "BOR", 
		"NOT", "END", "COMMA", "EQ", "INF", "SUP", "PLUS", "MINUS", "TIMES", "DIV", 
		"REM", "VOID", "RETURNTYPES", "INTEGER", "STRING", "DEFINE", "RETURN", 
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
		enterRule(_localctx, 4, RULE_parameters2);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				((Parameters2Context)_localctx).a = match(RETURNTYPES);
				setState(97);
				((Parameters2Context)_localctx).b = match(Variable);
				((Parameters2Context)_localctx).param = new Parameter2(new Variable((((Parameters2Context)_localctx).b!=null?((Parameters2Context)_localctx).b.getText():null)),(((Parameters2Context)_localctx).a!=null?((Parameters2Context)_localctx).a.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				((Parameters2Context)_localctx).c = match(RETURNTYPES);
				setState(100);
				((Parameters2Context)_localctx).d = match(Variable);
				setState(101);
				match(COMMA);
				setState(102);
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
		enterRule(_localctx, 6, RULE_instructions);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				((InstructionsContext)_localctx).a = instruction();
				setState(108);
				match(END);
				((InstructionsContext)_localctx).instrs = new Instructions(((InstructionsContext)_localctx).a.instr);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				((InstructionsContext)_localctx).b = instruction();
				setState(112);
				match(END);
				setState(113);
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
		public Token g;
		public Token h;
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
		public TerminalNode SCAN() { return getToken(PAFGrammarParser.SCAN, 0); }
		public List<TerminalNode> SOPERATOR() { return getTokens(PAFGrammarParser.SOPERATOR); }
		public TerminalNode SOPERATOR(int i) {
			return getToken(PAFGrammarParser.SOPERATOR, i);
		}
		public TerminalNode String() { return getToken(PAFGrammarParser.String, 0); }
		public TerminalNode Variable() { return getToken(PAFGrammarParser.Variable, 0); }
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
		enterRule(_localctx, 8, RULE_instruction);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				((InstructionContext)_localctx).a = if_condition();
				((InstructionContext)_localctx).instr = new Instruction(((InstructionContext)_localctx).a.cond);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				((InstructionContext)_localctx).b = for_loop();
				((InstructionContext)_localctx).instr = new Instruction(((InstructionContext)_localctx).b.forLoop);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				((InstructionContext)_localctx).c = while_loop();
				((InstructionContext)_localctx).instr = new Instruction(((InstructionContext)_localctx).c.whileLoop);
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				((InstructionContext)_localctx).d = dowhile_loop();
				((InstructionContext)_localctx).instr = new Instruction(((InstructionContext)_localctx).d.dowhileLoop);
				}
				break;
			case STRING:
			case AUTO:
			case Variable:
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				((InstructionContext)_localctx).e = assigning();
				((InstructionContext)_localctx).instr = new Instruction(((InstructionContext)_localctx).e.var);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 6);
				{
				setState(133);
				match(PRINT);
				setState(134);
				match(POPERATOR);
				setState(135);
				((InstructionContext)_localctx).f = operation1(0);
				((InstructionContext)_localctx).instr = new Instruction(((InstructionContext)_localctx).f.op);
				}
				break;
			case SCAN:
				enterOuterAlt(_localctx, 7);
				{
				setState(138);
				match(SCAN);
				setState(139);
				match(SOPERATOR);
				setState(140);
				((InstructionContext)_localctx).g = match(String);
				setState(141);
				match(SOPERATOR);
				setState(142);
				((InstructionContext)_localctx).h = match(Variable);
				((InstructionContext)_localctx).instr = new Instruction((((InstructionContext)_localctx).g!=null?((InstructionContext)_localctx).g.getText():null),(((InstructionContext)_localctx).h!=null?((InstructionContext)_localctx).h.getText():null));
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
		public Operation2Context a;
		public Token p;
		public TermContext c;
		public Operation2Context operation2() {
			return getRuleContext(Operation2Context.class,0);
		}
		public Operation1Context operation1() {
			return getRuleContext(Operation1Context.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(PAFGrammarParser.PLUS, 0); }
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_operation1, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(147);
			((Operation1Context)_localctx).a = operation2(0);
			((Operation1Context)_localctx).op = ((Operation1Context)_localctx).a.op;
			}
			_ctx.stop = _input.LT(-1);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Operation1Context(_parentctx, _parentState);
					_localctx.b = _prevctx;
					_localctx.b = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_operation1);
					setState(150);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(151);
					((Operation1Context)_localctx).p = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
						((Operation1Context)_localctx).p = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(152);
					((Operation1Context)_localctx).c = term();
					((Operation1Context)_localctx).op = new Operation(((Operation1Context)_localctx).c.tm,((Operation1Context)_localctx).b.op,(((Operation1Context)_localctx).p!=null?((Operation1Context)_localctx).p.getText():null));
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		public TermContext a;
		public Token t;
		public TermContext b;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Operation2Context operation2() {
			return getRuleContext(Operation2Context.class,0);
		}
		public TerminalNode TIMES() { return getToken(PAFGrammarParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(PAFGrammarParser.DIV, 0); }
		public TerminalNode REM() { return getToken(PAFGrammarParser.REM, 0); }
		public TerminalNode POPERATOR() { return getToken(PAFGrammarParser.POPERATOR, 0); }
		public TerminalNode SOPERATOR() { return getToken(PAFGrammarParser.SOPERATOR, 0); }
		public TerminalNode BAND() { return getToken(PAFGrammarParser.BAND, 0); }
		public TerminalNode BOR() { return getToken(PAFGrammarParser.BOR, 0); }
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_operation2, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(161);
			((Operation2Context)_localctx).a = term();
			((Operation2Context)_localctx).op = new Operation(((Operation2Context)_localctx).a.tm);
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Operation2Context(_parentctx, _parentState);
					_localctx.c = _prevctx;
					_localctx.c = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_operation2);
					setState(164);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(165);
					((Operation2Context)_localctx).t = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POPERATOR) | (1L << SOPERATOR) | (1L << BAND) | (1L << BOR) | (1L << TIMES) | (1L << DIV) | (1L << REM))) != 0)) ) {
						((Operation2Context)_localctx).t = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(166);
					((Operation2Context)_localctx).b = term();
					((Operation2Context)_localctx).op = new Operation(((Operation2Context)_localctx).b.tm,((Operation2Context)_localctx).c.op,(((Operation2Context)_localctx).t!=null?((Operation2Context)_localctx).t.getText():null));
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		public BoolContext b;
		public TermContext c;
		public TermContext d;
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
		public TerminalNode LB() { return getToken(PAFGrammarParser.LB, 0); }
		public List<TerminalNode> QUES() { return getTokens(PAFGrammarParser.QUES); }
		public TerminalNode QUES(int i) {
			return getToken(PAFGrammarParser.QUES, i);
		}
		public TerminalNode RB() { return getToken(PAFGrammarParser.RB, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
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
		enterRule(_localctx, 14, RULE_term);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				((TermContext)_localctx).lp = match(LP);
				setState(175);
				((TermContext)_localctx).a = operation1(0);
				setState(176);
				((TermContext)_localctx).rp = match(RP);
				((TermContext)_localctx).tm = new Term(((TermContext)_localctx).a.op,(((TermContext)_localctx).lp!=null?((TermContext)_localctx).lp.getText():null),(((TermContext)_localctx).rp!=null?((TermContext)_localctx).rp.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				((TermContext)_localctx).n = match(Number);
				((TermContext)_localctx).tm = new Term((((TermContext)_localctx).n!=null?((TermContext)_localctx).n.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				((TermContext)_localctx).m = match(MINUS);
				setState(182);
				((TermContext)_localctx).n = match(Number);
				((TermContext)_localctx).tm = new Term((((TermContext)_localctx).n!=null?((TermContext)_localctx).n.getText():null),(((TermContext)_localctx).m!=null?((TermContext)_localctx).m.getText():null));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				((TermContext)_localctx).o = call_function();
				((TermContext)_localctx).tm = new Term(((TermContext)_localctx).o.funcCall);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
				((TermContext)_localctx).v = match(Variable);
				((TermContext)_localctx).tm = new Term(new Variable((((TermContext)_localctx).v!=null?((TermContext)_localctx).v.getText():null)));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(189);
				match(LB);
				setState(190);
				((TermContext)_localctx).b = bool();
				setState(191);
				match(QUES);
				setState(192);
				((TermContext)_localctx).c = term();
				setState(193);
				match(QUES);
				setState(194);
				((TermContext)_localctx).d = term();
				setState(195);
				match(RB);
				((TermContext)_localctx).tm = new Term(((TermContext)_localctx).b.value,((TermContext)_localctx).c.tm,((TermContext)_localctx).d.tm);
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
		enterRule(_localctx, 16, RULE_call_function);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				((Call_functionContext)_localctx).a = match(Variable);
				setState(201);
				match(LP);
				setState(202);
				match(RP);
				((Call_functionContext)_localctx).funcCall = new CallFunction((((Call_functionContext)_localctx).a!=null?((Call_functionContext)_localctx).a.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				((Call_functionContext)_localctx).b = match(Variable);
				setState(205);
				match(LP);
				setState(206);
				((Call_functionContext)_localctx).c = parameters();
				setState(207);
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
		enterRule(_localctx, 18, RULE_parameters);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				((ParametersContext)_localctx).a = operation1(0);
				((ParametersContext)_localctx).param = new Parameter(((ParametersContext)_localctx).a.op);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				((ParametersContext)_localctx).b = operation1(0);
				setState(216);
				match(COMMA);
				setState(217);
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
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(IF);
				setState(223);
				((If_conditionContext)_localctx).a = bool();
				setState(224);
				match(THEN);
				setState(225);
				match(Dollar);
				setState(226);
				((If_conditionContext)_localctx).b = instructions();
				setState(227);
				match(Dollar);
				((If_conditionContext)_localctx).cond = new Condition(((If_conditionContext)_localctx).a.value,((If_conditionContext)_localctx).b.instrs);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(IF);
				setState(231);
				((If_conditionContext)_localctx).c = bool();
				setState(232);
				match(THEN);
				setState(233);
				match(Dollar);
				setState(234);
				((If_conditionContext)_localctx).d = instructions();
				setState(235);
				match(Dollar);
				setState(236);
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
		public BoolContext e;
		public InstructionsContext f;
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
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(ELSE);
				setState(242);
				match(Dollar);
				setState(243);
				((Else_conditionContext)_localctx).a = instructions();
				setState(244);
				match(Dollar);
				((Else_conditionContext)_localctx).cond = new Condition(((Else_conditionContext)_localctx).a.instrs);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(ELIF);
				setState(248);
				((Else_conditionContext)_localctx).b = bool();
				setState(249);
				match(THEN);
				setState(250);
				match(Dollar);
				setState(251);
				((Else_conditionContext)_localctx).c = instructions();
				setState(252);
				match(Dollar);
				setState(253);
				((Else_conditionContext)_localctx).d = else_condition();
				((Else_conditionContext)_localctx).cond = new Condition(((Else_conditionContext)_localctx).b.value,((Else_conditionContext)_localctx).c.instrs,((Else_conditionContext)_localctx).d.cond);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				match(ELIF);
				setState(257);
				((Else_conditionContext)_localctx).e = bool();
				setState(258);
				match(THEN);
				setState(259);
				match(Dollar);
				setState(260);
				((Else_conditionContext)_localctx).f = instructions();
				setState(261);
				match(Dollar);
				((Else_conditionContext)_localctx).cond = new Condition(((Else_conditionContext)_localctx).e.value,((Else_conditionContext)_localctx).f.instrs);
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
			setState(266);
			match(WHILE);
			setState(267);
			((While_loopContext)_localctx).a = bool();
			setState(268);
			match(Dollar);
			setState(269);
			((While_loopContext)_localctx).b = instructions();
			setState(270);
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
			setState(273);
			match(DO);
			setState(274);
			match(Dollar);
			setState(275);
			((Dowhile_loopContext)_localctx).a = instructions();
			setState(276);
			match(Dollar);
			setState(277);
			match(WHILE);
			setState(278);
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
			setState(281);
			match(FOR);
			setState(282);
			match(LP);
			setState(283);
			((For_loopContext)_localctx).a = assigning();
			setState(284);
			match(SLASH);
			setState(285);
			((For_loopContext)_localctx).b = bool();
			setState(286);
			match(SLASH);
			setState(287);
			((For_loopContext)_localctx).c = assigning();
			setState(288);
			match(RP);
			setState(289);
			match(Dollar);
			setState(290);
			((For_loopContext)_localctx).d = instructions();
			setState(291);
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
		public Token n;
		public Token e;
		public InstructionsContext f;
		public Token r;
		public Token m;
		public Token g;
		public Parameters2Context h;
		public InstructionsContext i;
		public Token q;
		public Token k;
		public Token l;
		public Token o;
		public TerminalNode AOPERATOR() { return getToken(PAFGrammarParser.AOPERATOR, 0); }
		public List<TerminalNode> Variable() { return getTokens(PAFGrammarParser.Variable); }
		public TerminalNode Variable(int i) {
			return getToken(PAFGrammarParser.Variable, i);
		}
		public Operation1Context operation1() {
			return getRuleContext(Operation1Context.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode LB() { return getToken(PAFGrammarParser.LB, 0); }
		public TerminalNode RB() { return getToken(PAFGrammarParser.RB, 0); }
		public List<TerminalNode> Dollar() { return getTokens(PAFGrammarParser.Dollar); }
		public TerminalNode Dollar(int i) {
			return getToken(PAFGrammarParser.Dollar, i);
		}
		public TerminalNode RETURN() { return getToken(PAFGrammarParser.RETURN, 0); }
		public TerminalNode END() { return getToken(PAFGrammarParser.END, 0); }
		public TerminalNode AUTO() { return getToken(PAFGrammarParser.AUTO, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode Number() { return getToken(PAFGrammarParser.Number, 0); }
		public TerminalNode LP() { return getToken(PAFGrammarParser.LP, 0); }
		public TerminalNode RP() { return getToken(PAFGrammarParser.RP, 0); }
		public Parameters2Context parameters2() {
			return getRuleContext(Parameters2Context.class,0);
		}
		public TerminalNode STRING() { return getToken(PAFGrammarParser.STRING, 0); }
		public TerminalNode String() { return getToken(PAFGrammarParser.String, 0); }
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
		int _la;
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				((AssigningContext)_localctx).a = match(Variable);
				setState(295);
				match(AOPERATOR);
				setState(296);
				((AssigningContext)_localctx).b = operation1(0);
				((AssigningContext)_localctx).var = new Assigning(new Variable((((AssigningContext)_localctx).a!=null?((AssigningContext)_localctx).a.getText():null)),((AssigningContext)_localctx).b.op);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				((AssigningContext)_localctx).c = match(Variable);
				setState(300);
				match(AOPERATOR);
				setState(301);
				((AssigningContext)_localctx).d = bool();
				((AssigningContext)_localctx).var = new Assigning(new Variable((((AssigningContext)_localctx).c!=null?((AssigningContext)_localctx).c.getText():null)),((AssigningContext)_localctx).d.value);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				((AssigningContext)_localctx).n = match(AUTO);
				setState(305);
				((AssigningContext)_localctx).e = match(Variable);
				setState(306);
				match(AOPERATOR);
				setState(307);
				match(LB);
				setState(308);
				match(RB);
				setState(309);
				match(Dollar);
				setState(310);
				((AssigningContext)_localctx).f = instructions();
				setState(311);
				match(RETURN);
				setState(312);
				((AssigningContext)_localctx).r = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Variable || _la==Number) ) {
					((AssigningContext)_localctx).r = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(313);
				match(END);
				setState(314);
				match(Dollar);
				((AssigningContext)_localctx).var = new Assigning(new Function((((AssigningContext)_localctx).e!=null?((AssigningContext)_localctx).e.getText():null),(((AssigningContext)_localctx).n!=null?((AssigningContext)_localctx).n.getText():null),((AssigningContext)_localctx).f.instrs,(((AssigningContext)_localctx).r!=null?((AssigningContext)_localctx).r.getText():null)));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(317);
				((AssigningContext)_localctx).m = match(AUTO);
				setState(318);
				((AssigningContext)_localctx).g = match(Variable);
				setState(319);
				match(AOPERATOR);
				setState(320);
				match(LB);
				setState(321);
				match(RB);
				setState(322);
				match(LP);
				setState(323);
				((AssigningContext)_localctx).h = parameters2();
				setState(324);
				match(RP);
				setState(325);
				match(Dollar);
				setState(326);
				((AssigningContext)_localctx).i = instructions();
				setState(327);
				match(RETURN);
				setState(328);
				((AssigningContext)_localctx).q = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Variable || _la==Number) ) {
					((AssigningContext)_localctx).q = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(329);
				match(END);
				setState(330);
				match(Dollar);
				((AssigningContext)_localctx).var = new Assigning(new Function((((AssigningContext)_localctx).g!=null?((AssigningContext)_localctx).g.getText():null),(((AssigningContext)_localctx).m!=null?((AssigningContext)_localctx).m.getText():null),((AssigningContext)_localctx).i.instrs,(((AssigningContext)_localctx).q!=null?((AssigningContext)_localctx).q.getText():null),((AssigningContext)_localctx).h.param));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(333);
				match(STRING);
				setState(334);
				((AssigningContext)_localctx).k = match(Variable);
				setState(335);
				match(AOPERATOR);
				setState(336);
				((AssigningContext)_localctx).l = match(String);
				((AssigningContext)_localctx).var = new Assigning(new Variable((((AssigningContext)_localctx).k!=null?((AssigningContext)_localctx).k.getText():null)),(((AssigningContext)_localctx).l!=null?((AssigningContext)_localctx).l.getText():null));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(338);
				match(STRING);
				setState(339);
				((AssigningContext)_localctx).o = match(Variable);
				((AssigningContext)_localctx).var = new Assigning(new Variable((((AssigningContext)_localctx).o!=null?((AssigningContext)_localctx).o.getText():null)));
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
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP) {
					{
					setState(343);
					match(LP);
					}
				}

				setState(346);
				((BoolContext)_localctx).a = match(Boolean);
				setState(348);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(347);
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
				setState(351);
				match(LP);
				setState(352);
				((BoolContext)_localctx).b = operation1(0);
				setState(353);
				((BoolContext)_localctx).c = match(Operator);
				setState(354);
				((BoolContext)_localctx).d = operation1(0);
				setState(355);
				match(RP);
				((BoolContext)_localctx).value = new Bool(((BoolContext)_localctx).b.op,((BoolContext)_localctx).d.op,(((BoolContext)_localctx).c!=null?((BoolContext)_localctx).c.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
				match(LP);
				setState(359);
				((BoolContext)_localctx).e = match(Variable);
				setState(360);
				((BoolContext)_localctx).f = match(Operator);
				setState(361);
				((BoolContext)_localctx).g = operation1(0);
				setState(362);
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
		case 5:
			return operation1_sempred((Operation1Context)_localctx, predIndex);
		case 6:
			return operation2_sempred((Operation2Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean operation1_sempred(Operation1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean operation2_sempred(Operation2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0172\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2/\n\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3a\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4l\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5w\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0093\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\7\7\u009e\n\7\f\7\16\7\u00a1\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\7\b\u00ac\n\b\f\b\16\b\u00af\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u00c9\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00d5\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00df\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f2\n\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u010b\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0158\n\21"+
		"\3\22\5\22\u015b\n\22\3\22\3\22\5\22\u015f\n\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0170\n\22"+
		"\3\22\2\4\f\16\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\5\4\2.."+
		"\60\60\3\2\"#\5\2\r\16\32\33$&\2\u0181\2.\3\2\2\2\4`\3\2\2\2\6k\3\2\2"+
		"\2\bv\3\2\2\2\n\u0092\3\2\2\2\f\u0094\3\2\2\2\16\u00a2\3\2\2\2\20\u00c8"+
		"\3\2\2\2\22\u00d4\3\2\2\2\24\u00de\3\2\2\2\26\u00f1\3\2\2\2\30\u010a\3"+
		"\2\2\2\32\u010c\3\2\2\2\34\u0113\3\2\2\2\36\u011b\3\2\2\2 \u0157\3\2\2"+
		"\2\"\u016f\3\2\2\2$%\5\4\3\2%&\7\35\2\2&\'\b\2\1\2\'/\3\2\2\2()\5\4\3"+
		"\2)*\7\35\2\2*+\5\2\2\2+,\7\2\2\3,-\b\2\1\2-/\3\2\2\2.$\3\2\2\2.(\3\2"+
		"\2\2/\3\3\2\2\2\60\61\7+\2\2\61\62\7\'\2\2\62\63\7.\2\2\63\64\7\t\2\2"+
		"\64\65\7\n\2\2\65\66\7\3\2\2\66\67\5\b\5\2\678\7\3\2\289\b\3\1\29a\3\2"+
		"\2\2:;\7+\2\2;<\7(\2\2<=\7.\2\2=>\7\t\2\2>?\7\n\2\2?@\7\3\2\2@A\5\b\5"+
		"\2AB\7,\2\2BC\t\2\2\2CD\7\35\2\2DE\7\3\2\2EF\b\3\1\2Fa\3\2\2\2GH\7+\2"+
		"\2HI\7\'\2\2IJ\7.\2\2JK\7\t\2\2KL\5\6\4\2LM\7\n\2\2MN\7\3\2\2NO\5\b\5"+
		"\2OP\7\3\2\2PQ\b\3\1\2Qa\3\2\2\2RS\7+\2\2ST\7(\2\2TU\7.\2\2UV\7\t\2\2"+
		"VW\5\6\4\2WX\7\n\2\2XY\7\3\2\2YZ\5\b\5\2Z[\7,\2\2[\\\t\2\2\2\\]\7\35\2"+
		"\2]^\7\3\2\2^_\b\3\1\2_a\3\2\2\2`\60\3\2\2\2`:\3\2\2\2`G\3\2\2\2`R\3\2"+
		"\2\2a\5\3\2\2\2bc\7(\2\2cd\7.\2\2dl\b\4\1\2ef\7(\2\2fg\7.\2\2gh\7\36\2"+
		"\2hi\5\6\4\2ij\b\4\1\2jl\3\2\2\2kb\3\2\2\2ke\3\2\2\2l\7\3\2\2\2mn\5\n"+
		"\6\2no\7\35\2\2op\b\5\1\2pw\3\2\2\2qr\5\n\6\2rs\7\35\2\2st\5\b\5\2tu\b"+
		"\5\1\2uw\3\2\2\2vm\3\2\2\2vq\3\2\2\2w\t\3\2\2\2xy\5\26\f\2yz\b\6\1\2z"+
		"\u0093\3\2\2\2{|\5\36\20\2|}\b\6\1\2}\u0093\3\2\2\2~\177\5\32\16\2\177"+
		"\u0080\b\6\1\2\u0080\u0093\3\2\2\2\u0081\u0082\5\34\17\2\u0082\u0083\b"+
		"\6\1\2\u0083\u0093\3\2\2\2\u0084\u0085\5 \21\2\u0085\u0086\b\6\1\2\u0086"+
		"\u0093\3\2\2\2\u0087\u0088\7\13\2\2\u0088\u0089\7\r\2\2\u0089\u008a\5"+
		"\f\7\2\u008a\u008b\b\6\1\2\u008b\u0093\3\2\2\2\u008c\u008d\7\f\2\2\u008d"+
		"\u008e\7\16\2\2\u008e\u008f\7/\2\2\u008f\u0090\7\16\2\2\u0090\u0091\7"+
		".\2\2\u0091\u0093\b\6\1\2\u0092x\3\2\2\2\u0092{\3\2\2\2\u0092~\3\2\2\2"+
		"\u0092\u0081\3\2\2\2\u0092\u0084\3\2\2\2\u0092\u0087\3\2\2\2\u0092\u008c"+
		"\3\2\2\2\u0093\13\3\2\2\2\u0094\u0095\b\7\1\2\u0095\u0096\5\16\b\2\u0096"+
		"\u0097\b\7\1\2\u0097\u009f\3\2\2\2\u0098\u0099\f\3\2\2\u0099\u009a\t\3"+
		"\2\2\u009a\u009b\5\20\t\2\u009b\u009c\b\7\1\2\u009c\u009e\3\2\2\2\u009d"+
		"\u0098\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\r\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\b\b\1\2\u00a3\u00a4"+
		"\5\20\t\2\u00a4\u00a5\b\b\1\2\u00a5\u00ad\3\2\2\2\u00a6\u00a7\f\3\2\2"+
		"\u00a7\u00a8\t\4\2\2\u00a8\u00a9\5\20\t\2\u00a9\u00aa\b\b\1\2\u00aa\u00ac"+
		"\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\17\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7\t\2"+
		"\2\u00b1\u00b2\5\f\7\2\u00b2\u00b3\7\n\2\2\u00b3\u00b4\b\t\1\2\u00b4\u00c9"+
		"\3\2\2\2\u00b5\u00b6\7\60\2\2\u00b6\u00c9\b\t\1\2\u00b7\u00b8\7#\2\2\u00b8"+
		"\u00b9\7\60\2\2\u00b9\u00c9\b\t\1\2\u00ba\u00bb\5\22\n\2\u00bb\u00bc\b"+
		"\t\1\2\u00bc\u00c9\3\2\2\2\u00bd\u00be\7.\2\2\u00be\u00c9\b\t\1\2\u00bf"+
		"\u00c0\7\7\2\2\u00c0\u00c1\5\"\22\2\u00c1\u00c2\7\20\2\2\u00c2\u00c3\5"+
		"\20\t\2\u00c3\u00c4\7\20\2\2\u00c4\u00c5\5\20\t\2\u00c5\u00c6\7\b\2\2"+
		"\u00c6\u00c7\b\t\1\2\u00c7\u00c9\3\2\2\2\u00c8\u00b0\3\2\2\2\u00c8\u00b5"+
		"\3\2\2\2\u00c8\u00b7\3\2\2\2\u00c8\u00ba\3\2\2\2\u00c8\u00bd\3\2\2\2\u00c8"+
		"\u00bf\3\2\2\2\u00c9\21\3\2\2\2\u00ca\u00cb\7.\2\2\u00cb\u00cc\7\t\2\2"+
		"\u00cc\u00cd\7\n\2\2\u00cd\u00d5\b\n\1\2\u00ce\u00cf\7.\2\2\u00cf\u00d0"+
		"\7\t\2\2\u00d0\u00d1\5\24\13\2\u00d1\u00d2\7\n\2\2\u00d2\u00d3\b\n\1\2"+
		"\u00d3\u00d5\3\2\2\2\u00d4\u00ca\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d5\23"+
		"\3\2\2\2\u00d6\u00d7\5\f\7\2\u00d7\u00d8\b\13\1\2\u00d8\u00df\3\2\2\2"+
		"\u00d9\u00da\5\f\7\2\u00da\u00db\7\36\2\2\u00db\u00dc\5\24\13\2\u00dc"+
		"\u00dd\b\13\1\2\u00dd\u00df\3\2\2\2\u00de\u00d6\3\2\2\2\u00de\u00d9\3"+
		"\2\2\2\u00df\25\3\2\2\2\u00e0\u00e1\7\21\2\2\u00e1\u00e2\5\"\22\2\u00e2"+
		"\u00e3\7\27\2\2\u00e3\u00e4\7\3\2\2\u00e4\u00e5\5\b\5\2\u00e5\u00e6\7"+
		"\3\2\2\u00e6\u00e7\b\f\1\2\u00e7\u00f2\3\2\2\2\u00e8\u00e9\7\21\2\2\u00e9"+
		"\u00ea\5\"\22\2\u00ea\u00eb\7\27\2\2\u00eb\u00ec\7\3\2\2\u00ec\u00ed\5"+
		"\b\5\2\u00ed\u00ee\7\3\2\2\u00ee\u00ef\5\30\r\2\u00ef\u00f0\b\f\1\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00e0\3\2\2\2\u00f1\u00e8\3\2\2\2\u00f2\27\3\2\2"+
		"\2\u00f3\u00f4\7\22\2\2\u00f4\u00f5\7\3\2\2\u00f5\u00f6\5\b\5\2\u00f6"+
		"\u00f7\7\3\2\2\u00f7\u00f8\b\r\1\2\u00f8\u010b\3\2\2\2\u00f9\u00fa\7\23"+
		"\2\2\u00fa\u00fb\5\"\22\2\u00fb\u00fc\7\27\2\2\u00fc\u00fd\7\3\2\2\u00fd"+
		"\u00fe\5\b\5\2\u00fe\u00ff\7\3\2\2\u00ff\u0100\5\30\r\2\u0100\u0101\b"+
		"\r\1\2\u0101\u010b\3\2\2\2\u0102\u0103\7\23\2\2\u0103\u0104\5\"\22\2\u0104"+
		"\u0105\7\27\2\2\u0105\u0106\7\3\2\2\u0106\u0107\5\b\5\2\u0107\u0108\7"+
		"\3\2\2\u0108\u0109\b\r\1\2\u0109\u010b\3\2\2\2\u010a\u00f3\3\2\2\2\u010a"+
		"\u00f9\3\2\2\2\u010a\u0102\3\2\2\2\u010b\31\3\2\2\2\u010c\u010d\7\24\2"+
		"\2\u010d\u010e\5\"\22\2\u010e\u010f\7\3\2\2\u010f\u0110\5\b\5\2\u0110"+
		"\u0111\7\3\2\2\u0111\u0112\b\16\1\2\u0112\33\3\2\2\2\u0113\u0114\7\25"+
		"\2\2\u0114\u0115\7\3\2\2\u0115\u0116\5\b\5\2\u0116\u0117\7\3\2\2\u0117"+
		"\u0118\7\24\2\2\u0118\u0119\5\"\22\2\u0119\u011a\b\17\1\2\u011a\35\3\2"+
		"\2\2\u011b\u011c\7\26\2\2\u011c\u011d\7\t\2\2\u011d\u011e\5 \21\2\u011e"+
		"\u011f\7\6\2\2\u011f\u0120\5\"\22\2\u0120\u0121\7\6\2\2\u0121\u0122\5"+
		" \21\2\u0122\u0123\7\n\2\2\u0123\u0124\7\3\2\2\u0124\u0125\5\b\5\2\u0125"+
		"\u0126\7\3\2\2\u0126\u0127\b\20\1\2\u0127\37\3\2\2\2\u0128\u0129\7.\2"+
		"\2\u0129\u012a\7\17\2\2\u012a\u012b\5\f\7\2\u012b\u012c\b\21\1\2\u012c"+
		"\u0158\3\2\2\2\u012d\u012e\7.\2\2\u012e\u012f\7\17\2\2\u012f\u0130\5\""+
		"\22\2\u0130\u0131\b\21\1\2\u0131\u0158\3\2\2\2\u0132\u0133\7-\2\2\u0133"+
		"\u0134\7.\2\2\u0134\u0135\7\17\2\2\u0135\u0136\7\7\2\2\u0136\u0137\7\b"+
		"\2\2\u0137\u0138\7\3\2\2\u0138\u0139\5\b\5\2\u0139\u013a\7,\2\2\u013a"+
		"\u013b\t\2\2\2\u013b\u013c\7\35\2\2\u013c\u013d\7\3\2\2\u013d\u013e\b"+
		"\21\1\2\u013e\u0158\3\2\2\2\u013f\u0140\7-\2\2\u0140\u0141\7.\2\2\u0141"+
		"\u0142\7\17\2\2\u0142\u0143\7\7\2\2\u0143\u0144\7\b\2\2\u0144\u0145\7"+
		"\t\2\2\u0145\u0146\5\6\4\2\u0146\u0147\7\n\2\2\u0147\u0148\7\3\2\2\u0148"+
		"\u0149\5\b\5\2\u0149\u014a\7,\2\2\u014a\u014b\t\2\2\2\u014b\u014c\7\35"+
		"\2\2\u014c\u014d\7\3\2\2\u014d\u014e\b\21\1\2\u014e\u0158\3\2\2\2\u014f"+
		"\u0150\7*\2\2\u0150\u0151\7.\2\2\u0151\u0152\7\17\2\2\u0152\u0153\7/\2"+
		"\2\u0153\u0158\b\21\1\2\u0154\u0155\7*\2\2\u0155\u0156\7.\2\2\u0156\u0158"+
		"\b\21\1\2\u0157\u0128\3\2\2\2\u0157\u012d\3\2\2\2\u0157\u0132\3\2\2\2"+
		"\u0157\u013f\3\2\2\2\u0157\u014f\3\2\2\2\u0157\u0154\3\2\2\2\u0158!\3"+
		"\2\2\2\u0159\u015b\7\t\2\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\u015e\7\4\2\2\u015d\u015f\7\n\2\2\u015e\u015d\3\2"+
		"\2\2\u015e\u015f\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0170\b\22\1\2\u0161"+
		"\u0162\7\t\2\2\u0162\u0163\5\f\7\2\u0163\u0164\7\5\2\2\u0164\u0165\5\f"+
		"\7\2\u0165\u0166\7\n\2\2\u0166\u0167\b\22\1\2\u0167\u0170\3\2\2\2\u0168"+
		"\u0169\7\t\2\2\u0169\u016a\7.\2\2\u016a\u016b\7\5\2\2\u016b\u016c\5\f"+
		"\7\2\u016c\u016d\7\n\2\2\u016d\u016e\b\22\1\2\u016e\u0170\3\2\2\2\u016f"+
		"\u015a\3\2\2\2\u016f\u0161\3\2\2\2\u016f\u0168\3\2\2\2\u0170#\3\2\2\2"+
		"\22.`kv\u0092\u009f\u00ad\u00c8\u00d4\u00de\u00f1\u010a\u0157\u015a\u015e"+
		"\u016f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}