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
		SCAN=10, ENDLINE=11, POPERATOR=12, SOPERATOR=13, AOPERATOR=14, QUES=15, 
		IF=16, ELSE=17, ELIF=18, WHILE=19, DO=20, FOR=21, THEN=22, AND=23, OR=24, 
		NOT=25, END=26, COMMA=27, EQ=28, INF=29, SUP=30, PLUS=31, MINUS=32, TIMES=33, 
		DIV=34, REM=35, VOID=36, RETURNTYPES=37, INTEGER=38, STRING=39, DEFINE=40, 
		RETURN=41, AUTO=42, Variable=43, String=44, Number=45, WS=46;
	public static final int
		RULE_functions = 0, RULE_function = 1, RULE_parameters2 = 2, RULE_instructions = 3, 
		RULE_instruction = 4, RULE_printInstr = 5, RULE_operation1 = 6, RULE_operation2 = 7, 
		RULE_term = 8, RULE_call_function = 9, RULE_parameters = 10, RULE_if_condition = 11, 
		RULE_else_condition = 12, RULE_while_loop = 13, RULE_dowhile_loop = 14, 
		RULE_for_loop = 15, RULE_assigning = 16, RULE_bool = 17;
	public static final String[] ruleNames = {
		"functions", "function", "parameters2", "instructions", "instruction", 
		"printInstr", "operation1", "operation2", "term", "call_function", "parameters", 
		"if_condition", "else_condition", "while_loop", "dowhile_loop", "for_loop", 
		"assigning", "bool"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$'", null, null, "'/'", "'['", "']'", "'('", "')'", "'print'", 
		"'scan'", "'endline'", "'<<'", "'>>'", "'<-'", "'?'", "'if'", "'else'", 
		"'elif'", "'while'", "'do'", "'for'", "'then'", "'&&'", "'||'", "'!'", 
		"';'", "','", "'='", "'<'", "'>'", "'+'", "'-'", "'*'", "':'", "'%'", 
		"'void'", null, "'integer'", "'String'", "'define'", "'return'", "'auto'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Dollar", "Boolean", "Operator", "SLASH", "LB", "RB", "LP", "RP", 
		"PRINT", "SCAN", "ENDLINE", "POPERATOR", "SOPERATOR", "AOPERATOR", "QUES", 
		"IF", "ELSE", "ELIF", "WHILE", "DO", "FOR", "THEN", "AND", "OR", "NOT", 
		"END", "COMMA", "EQ", "INF", "SUP", "PLUS", "MINUS", "TIMES", "DIV", "REM", 
		"VOID", "RETURNTYPES", "INTEGER", "STRING", "DEFINE", "RETURN", "AUTO", 
		"Variable", "String", "Number", "WS"
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
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				((FunctionsContext)_localctx).a = function();
				setState(37);
				match(END);
				((FunctionsContext)_localctx).funcs = new Functions(((FunctionsContext)_localctx).a.func);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				((FunctionsContext)_localctx).b = function();
				setState(41);
				match(END);
				setState(42);
				((FunctionsContext)_localctx).c = functions();
				setState(43);
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
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(DEFINE);
				setState(49);
				match(VOID);
				setState(50);
				((FunctionContext)_localctx).a = match(Variable);
				setState(51);
				match(LP);
				setState(52);
				match(RP);
				setState(53);
				match(Dollar);
				setState(54);
				((FunctionContext)_localctx).b = instructions();
				setState(55);
				match(Dollar);
				((FunctionContext)_localctx).func = new Function((((FunctionContext)_localctx).a!=null?((FunctionContext)_localctx).a.getText():null),((FunctionContext)_localctx).b.instrs);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(DEFINE);
				setState(59);
				((FunctionContext)_localctx).c = match(RETURNTYPES);
				setState(60);
				((FunctionContext)_localctx).d = match(Variable);
				setState(61);
				match(LP);
				setState(62);
				match(RP);
				setState(63);
				match(Dollar);
				setState(64);
				((FunctionContext)_localctx).e = instructions();
				setState(65);
				match(RETURN);
				setState(66);
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
				setState(67);
				match(END);
				setState(68);
				match(Dollar);
				((FunctionContext)_localctx).func = new Function((((FunctionContext)_localctx).d!=null?((FunctionContext)_localctx).d.getText():null),(((FunctionContext)_localctx).c!=null?((FunctionContext)_localctx).c.getText():null),((FunctionContext)_localctx).e.instrs,(((FunctionContext)_localctx).f!=null?((FunctionContext)_localctx).f.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(DEFINE);
				setState(72);
				match(VOID);
				setState(73);
				((FunctionContext)_localctx).f = match(Variable);
				setState(74);
				match(LP);
				setState(75);
				((FunctionContext)_localctx).g = parameters2();
				setState(76);
				match(RP);
				setState(77);
				match(Dollar);
				setState(78);
				((FunctionContext)_localctx).h = instructions();
				setState(79);
				match(Dollar);
				((FunctionContext)_localctx).func = new Function((((FunctionContext)_localctx).f!=null?((FunctionContext)_localctx).f.getText():null),((FunctionContext)_localctx).h.instrs,((FunctionContext)_localctx).g.param);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				match(DEFINE);
				setState(83);
				((FunctionContext)_localctx).i = match(RETURNTYPES);
				setState(84);
				((FunctionContext)_localctx).j = match(Variable);
				setState(85);
				match(LP);
				setState(86);
				((FunctionContext)_localctx).k = parameters2();
				setState(87);
				match(RP);
				setState(88);
				match(Dollar);
				setState(89);
				((FunctionContext)_localctx).l = instructions();
				setState(90);
				match(RETURN);
				setState(91);
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
				setState(92);
				match(END);
				setState(93);
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
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				((Parameters2Context)_localctx).a = match(RETURNTYPES);
				setState(99);
				((Parameters2Context)_localctx).b = match(Variable);
				((Parameters2Context)_localctx).param = new Parameter2(new Variable((((Parameters2Context)_localctx).b!=null?((Parameters2Context)_localctx).b.getText():null)),(((Parameters2Context)_localctx).a!=null?((Parameters2Context)_localctx).a.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				((Parameters2Context)_localctx).c = match(RETURNTYPES);
				setState(102);
				((Parameters2Context)_localctx).d = match(Variable);
				setState(103);
				match(COMMA);
				setState(104);
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
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				((InstructionsContext)_localctx).a = instruction();
				setState(110);
				match(END);
				((InstructionsContext)_localctx).instrs = new Instructions(((InstructionsContext)_localctx).a.instr);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				((InstructionsContext)_localctx).b = instruction();
				setState(114);
				match(END);
				setState(115);
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
		public PrintInstrContext f;
		public Token g;
		public Token h;
		public Call_functionContext o;
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
		public PrintInstrContext printInstr() {
			return getRuleContext(PrintInstrContext.class,0);
		}
		public TerminalNode SCAN() { return getToken(PAFGrammarParser.SCAN, 0); }
		public List<TerminalNode> SOPERATOR() { return getTokens(PAFGrammarParser.SOPERATOR); }
		public TerminalNode SOPERATOR(int i) {
			return getToken(PAFGrammarParser.SOPERATOR, i);
		}
		public TerminalNode String() { return getToken(PAFGrammarParser.String, 0); }
		public TerminalNode Variable() { return getToken(PAFGrammarParser.Variable, 0); }
		public Call_functionContext call_function() {
			return getRuleContext(Call_functionContext.class,0);
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
		enterRule(_localctx, 8, RULE_instruction);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				((InstructionContext)_localctx).a = if_condition();
				((InstructionContext)_localctx).instr = new Instruction(((InstructionContext)_localctx).a.cond);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				((InstructionContext)_localctx).b = for_loop();
				((InstructionContext)_localctx).instr = new Instruction(((InstructionContext)_localctx).b.forLoop);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				((InstructionContext)_localctx).c = while_loop();
				((InstructionContext)_localctx).instr = new Instruction(((InstructionContext)_localctx).c.whileLoop);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				((InstructionContext)_localctx).d = dowhile_loop();
				((InstructionContext)_localctx).instr = new Instruction(((InstructionContext)_localctx).d.dowhileLoop);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				((InstructionContext)_localctx).e = assigning();
				((InstructionContext)_localctx).instr = new Instruction(((InstructionContext)_localctx).e.var);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				((InstructionContext)_localctx).f = printInstr();
				((InstructionContext)_localctx).instr = new Instruction(((InstructionContext)_localctx).f.msg);
				}
				break;
			case 7:
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
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(144);
				((InstructionContext)_localctx).o = call_function();
				((InstructionContext)_localctx).instr = new Instruction(((InstructionContext)_localctx).o.funcCall);
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

	public static class PrintInstrContext extends ParserRuleContext {
		public Print msg;
		public Token c;
		public TermContext d;
		public TermContext a;
		public TermContext b;
		public TerminalNode PRINT() { return getToken(PAFGrammarParser.PRINT, 0); }
		public List<TerminalNode> POPERATOR() { return getTokens(PAFGrammarParser.POPERATOR); }
		public TerminalNode POPERATOR(int i) {
			return getToken(PAFGrammarParser.POPERATOR, i);
		}
		public TerminalNode String() { return getToken(PAFGrammarParser.String, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode ENDLINE() { return getToken(PAFGrammarParser.ENDLINE, 0); }
		public PrintInstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printInstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).enterPrintInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).exitPrintInstr(this);
		}
	}

	public final PrintInstrContext printInstr() throws RecognitionException {
		PrintInstrContext _localctx = new PrintInstrContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_printInstr);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(PRINT);
				setState(150);
				match(POPERATOR);
				setState(151);
				((PrintInstrContext)_localctx).c = match(String);
				setState(152);
				match(POPERATOR);
				setState(153);
				((PrintInstrContext)_localctx).d = term();
				((PrintInstrContext)_localctx).msg = new Print((((PrintInstrContext)_localctx).c!=null?((PrintInstrContext)_localctx).c.getText():null),((PrintInstrContext)_localctx).d.tm,0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(PRINT);
				setState(157);
				match(POPERATOR);
				setState(158);
				((PrintInstrContext)_localctx).c = match(String);
				setState(159);
				match(POPERATOR);
				setState(160);
				((PrintInstrContext)_localctx).d = term();
				setState(161);
				match(POPERATOR);
				setState(162);
				match(ENDLINE);
				((PrintInstrContext)_localctx).msg = new Print((((PrintInstrContext)_localctx).c!=null?((PrintInstrContext)_localctx).c.getText():null),((PrintInstrContext)_localctx).d.tm,1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				match(PRINT);
				setState(166);
				match(POPERATOR);
				setState(167);
				((PrintInstrContext)_localctx).a = term();
				((PrintInstrContext)_localctx).msg = new Print(((PrintInstrContext)_localctx).a.tm,0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				match(PRINT);
				setState(171);
				match(POPERATOR);
				setState(172);
				((PrintInstrContext)_localctx).b = term();
				setState(173);
				match(POPERATOR);
				setState(174);
				match(ENDLINE);
				((PrintInstrContext)_localctx).msg = new Print(((PrintInstrContext)_localctx).b.tm,1);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_operation1, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(180);
			((Operation1Context)_localctx).a = operation2(0);
			((Operation1Context)_localctx).op = ((Operation1Context)_localctx).a.op;
			}
			_ctx.stop = _input.LT(-1);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
					setState(183);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(184);
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
					setState(185);
					((Operation1Context)_localctx).c = term();
					((Operation1Context)_localctx).op = new Operation(((Operation1Context)_localctx).c.tm,((Operation1Context)_localctx).b.op,(((Operation1Context)_localctx).p!=null?((Operation1Context)_localctx).p.getText():null));
					}
					} 
				}
				setState(192);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_operation2, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(194);
			((Operation2Context)_localctx).a = term();
			((Operation2Context)_localctx).op = new Operation(((Operation2Context)_localctx).a.tm);
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
					setState(197);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(198);
					((Operation2Context)_localctx).t = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIV) | (1L << REM))) != 0)) ) {
						((Operation2Context)_localctx).t = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(199);
					((Operation2Context)_localctx).b = term();
					((Operation2Context)_localctx).op = new Operation(((Operation2Context)_localctx).b.tm,((Operation2Context)_localctx).c.op,(((Operation2Context)_localctx).t!=null?((Operation2Context)_localctx).t.getText():null));
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		public TerminalNode Boolean() { return getToken(PAFGrammarParser.Boolean, 0); }
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
		enterRule(_localctx, 16, RULE_term);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				((TermContext)_localctx).lp = match(LP);
				setState(208);
				((TermContext)_localctx).a = operation1(0);
				setState(209);
				((TermContext)_localctx).rp = match(RP);
				((TermContext)_localctx).tm = new Term(((TermContext)_localctx).a.op,(((TermContext)_localctx).lp!=null?((TermContext)_localctx).lp.getText():null),(((TermContext)_localctx).rp!=null?((TermContext)_localctx).rp.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				((TermContext)_localctx).n = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Boolean || _la==Number) ) {
					((TermContext)_localctx).n = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((TermContext)_localctx).tm = new Term((((TermContext)_localctx).n!=null?((TermContext)_localctx).n.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				((TermContext)_localctx).m = match(MINUS);
				setState(215);
				((TermContext)_localctx).n = match(Number);
				((TermContext)_localctx).tm = new Term((((TermContext)_localctx).n!=null?((TermContext)_localctx).n.getText():null),(((TermContext)_localctx).m!=null?((TermContext)_localctx).m.getText():null));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				((TermContext)_localctx).o = call_function();
				((TermContext)_localctx).tm = new Term(((TermContext)_localctx).o.funcCall);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(220);
				((TermContext)_localctx).v = match(Variable);
				((TermContext)_localctx).tm = new Term(new Variable((((TermContext)_localctx).v!=null?((TermContext)_localctx).v.getText():null)));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(222);
				match(LB);
				setState(223);
				((TermContext)_localctx).b = bool();
				setState(224);
				match(QUES);
				setState(225);
				((TermContext)_localctx).c = term();
				setState(226);
				match(QUES);
				setState(227);
				((TermContext)_localctx).d = term();
				setState(228);
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
		enterRule(_localctx, 18, RULE_call_function);
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				((Call_functionContext)_localctx).a = match(Variable);
				setState(234);
				match(LP);
				setState(235);
				match(RP);
				((Call_functionContext)_localctx).funcCall = new CallFunction((((Call_functionContext)_localctx).a!=null?((Call_functionContext)_localctx).a.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				((Call_functionContext)_localctx).b = match(Variable);
				setState(238);
				match(LP);
				setState(239);
				((Call_functionContext)_localctx).c = parameters();
				setState(240);
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
		enterRule(_localctx, 20, RULE_parameters);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				((ParametersContext)_localctx).a = operation1(0);
				((ParametersContext)_localctx).param = new Parameter(((ParametersContext)_localctx).a.op);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				((ParametersContext)_localctx).b = operation1(0);
				setState(249);
				match(COMMA);
				setState(250);
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
		enterRule(_localctx, 22, RULE_if_condition);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(IF);
				setState(256);
				((If_conditionContext)_localctx).a = bool();
				setState(257);
				match(THEN);
				setState(258);
				match(Dollar);
				setState(259);
				((If_conditionContext)_localctx).b = instructions();
				setState(260);
				match(Dollar);
				((If_conditionContext)_localctx).cond = new Condition(((If_conditionContext)_localctx).a.value,((If_conditionContext)_localctx).b.instrs);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(IF);
				setState(264);
				((If_conditionContext)_localctx).c = bool();
				setState(265);
				match(THEN);
				setState(266);
				match(Dollar);
				setState(267);
				((If_conditionContext)_localctx).d = instructions();
				setState(268);
				match(Dollar);
				setState(269);
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
		enterRule(_localctx, 24, RULE_else_condition);
		try {
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(ELSE);
				setState(275);
				match(Dollar);
				setState(276);
				((Else_conditionContext)_localctx).a = instructions();
				setState(277);
				match(Dollar);
				((Else_conditionContext)_localctx).cond = new Condition(((Else_conditionContext)_localctx).a.instrs);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				match(ELIF);
				setState(281);
				((Else_conditionContext)_localctx).b = bool();
				setState(282);
				match(THEN);
				setState(283);
				match(Dollar);
				setState(284);
				((Else_conditionContext)_localctx).c = instructions();
				setState(285);
				match(Dollar);
				setState(286);
				((Else_conditionContext)_localctx).d = else_condition();
				((Else_conditionContext)_localctx).cond = new Condition(((Else_conditionContext)_localctx).b.value,((Else_conditionContext)_localctx).c.instrs,((Else_conditionContext)_localctx).d.cond);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				match(ELIF);
				setState(290);
				((Else_conditionContext)_localctx).e = bool();
				setState(291);
				match(THEN);
				setState(292);
				match(Dollar);
				setState(293);
				((Else_conditionContext)_localctx).f = instructions();
				setState(294);
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
		enterRule(_localctx, 26, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(WHILE);
			setState(300);
			((While_loopContext)_localctx).a = bool();
			setState(301);
			match(Dollar);
			setState(302);
			((While_loopContext)_localctx).b = instructions();
			setState(303);
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
		enterRule(_localctx, 28, RULE_dowhile_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(DO);
			setState(307);
			match(Dollar);
			setState(308);
			((Dowhile_loopContext)_localctx).a = instructions();
			setState(309);
			match(Dollar);
			setState(310);
			match(WHILE);
			setState(311);
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
		enterRule(_localctx, 30, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(FOR);
			setState(315);
			match(LP);
			setState(316);
			((For_loopContext)_localctx).a = assigning();
			setState(317);
			match(SLASH);
			setState(318);
			((For_loopContext)_localctx).b = bool();
			setState(319);
			match(SLASH);
			setState(320);
			((For_loopContext)_localctx).c = assigning();
			setState(321);
			match(RP);
			setState(322);
			match(Dollar);
			setState(323);
			((For_loopContext)_localctx).d = instructions();
			setState(324);
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
		enterRule(_localctx, 32, RULE_assigning);
		int _la;
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				((AssigningContext)_localctx).a = match(Variable);
				setState(328);
				match(AOPERATOR);
				setState(329);
				((AssigningContext)_localctx).b = operation1(0);
				((AssigningContext)_localctx).var = new Assigning(new Variable((((AssigningContext)_localctx).a!=null?((AssigningContext)_localctx).a.getText():null)),((AssigningContext)_localctx).b.op);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				((AssigningContext)_localctx).c = match(Variable);
				setState(333);
				match(AOPERATOR);
				setState(334);
				((AssigningContext)_localctx).d = bool();
				((AssigningContext)_localctx).var = new Assigning(new Variable((((AssigningContext)_localctx).c!=null?((AssigningContext)_localctx).c.getText():null)),((AssigningContext)_localctx).d.value);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(337);
				((AssigningContext)_localctx).n = match(AUTO);
				setState(338);
				((AssigningContext)_localctx).e = match(Variable);
				setState(339);
				match(AOPERATOR);
				setState(340);
				match(LB);
				setState(341);
				match(RB);
				setState(342);
				match(Dollar);
				setState(343);
				((AssigningContext)_localctx).f = instructions();
				setState(344);
				match(RETURN);
				setState(345);
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
				setState(346);
				match(END);
				setState(347);
				match(Dollar);
				((AssigningContext)_localctx).var = new Assigning(new Function((((AssigningContext)_localctx).e!=null?((AssigningContext)_localctx).e.getText():null),(((AssigningContext)_localctx).n!=null?((AssigningContext)_localctx).n.getText():null),((AssigningContext)_localctx).f.instrs,(((AssigningContext)_localctx).r!=null?((AssigningContext)_localctx).r.getText():null)));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(350);
				((AssigningContext)_localctx).m = match(AUTO);
				setState(351);
				((AssigningContext)_localctx).g = match(Variable);
				setState(352);
				match(AOPERATOR);
				setState(353);
				match(LB);
				setState(354);
				match(RB);
				setState(355);
				match(LP);
				setState(356);
				((AssigningContext)_localctx).h = parameters2();
				setState(357);
				match(RP);
				setState(358);
				match(Dollar);
				setState(359);
				((AssigningContext)_localctx).i = instructions();
				setState(360);
				match(RETURN);
				setState(361);
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
				setState(362);
				match(END);
				setState(363);
				match(Dollar);
				((AssigningContext)_localctx).var = new Assigning(new Function((((AssigningContext)_localctx).g!=null?((AssigningContext)_localctx).g.getText():null),(((AssigningContext)_localctx).m!=null?((AssigningContext)_localctx).m.getText():null),((AssigningContext)_localctx).i.instrs,(((AssigningContext)_localctx).q!=null?((AssigningContext)_localctx).q.getText():null),((AssigningContext)_localctx).h.param));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(366);
				match(STRING);
				setState(367);
				((AssigningContext)_localctx).k = match(Variable);
				setState(368);
				match(AOPERATOR);
				setState(369);
				((AssigningContext)_localctx).l = match(String);
				((AssigningContext)_localctx).var = new Assigning(new Variable((((AssigningContext)_localctx).k!=null?((AssigningContext)_localctx).k.getText():null)),(((AssigningContext)_localctx).l!=null?((AssigningContext)_localctx).l.getText():null));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(371);
				match(STRING);
				setState(372);
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
		public BoolContext h;
		public Token i;
		public BoolContext j;
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
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public TerminalNode AND() { return getToken(PAFGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(PAFGrammarParser.OR, 0); }
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
		enterRule(_localctx, 34, RULE_bool);
		int _la;
		try {
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP) {
					{
					setState(376);
					match(LP);
					}
				}

				setState(379);
				((BoolContext)_localctx).a = match(Boolean);
				setState(381);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(380);
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
				setState(384);
				match(LP);
				setState(385);
				((BoolContext)_localctx).b = operation1(0);
				setState(386);
				((BoolContext)_localctx).c = match(Operator);
				setState(387);
				((BoolContext)_localctx).d = operation1(0);
				setState(388);
				match(RP);
				((BoolContext)_localctx).value = new Bool(((BoolContext)_localctx).b.op,((BoolContext)_localctx).d.op,(((BoolContext)_localctx).c!=null?((BoolContext)_localctx).c.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				match(LP);
				setState(392);
				((BoolContext)_localctx).e = match(Variable);
				setState(393);
				((BoolContext)_localctx).f = match(Operator);
				setState(394);
				((BoolContext)_localctx).g = operation1(0);
				setState(395);
				match(RP);
				((BoolContext)_localctx).value = new Bool(new Variable((((BoolContext)_localctx).e!=null?((BoolContext)_localctx).e.getText():null)),((BoolContext)_localctx).g.op,(((BoolContext)_localctx).f!=null?((BoolContext)_localctx).f.getText():null));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(398);
				match(LP);
				setState(399);
				((BoolContext)_localctx).h = bool();
				setState(400);
				((BoolContext)_localctx).i = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
					((BoolContext)_localctx).i = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(401);
				((BoolContext)_localctx).j = bool();
				setState(402);
				match(RP);
				((BoolContext)_localctx).value = new Bool(((BoolContext)_localctx).h.value,((BoolContext)_localctx).j.value,(((BoolContext)_localctx).i!=null?((BoolContext)_localctx).i.getText():null));
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
		case 6:
			return operation1_sempred((Operation1Context)_localctx, predIndex);
		case 7:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u019a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\61\n\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3c\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4n\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"y\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0096\n\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00b4\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\7\b\u00bf\n\b\f\b\16\b\u00c2\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\7\t\u00cd\n\t\f\t\16\t\u00d0\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u00ea\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00f6\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0100\n\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0113\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u012c\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u0179\n\22\3\23\5\23\u017c\n\23\3\23\3\23\5\23\u0180"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0198\n\23\3\23\2\4"+
		"\16\20\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\7\4\2--//\3\2!"+
		"\"\3\2#%\4\2\4\4//\3\2\31\32\2\u01ad\2\60\3\2\2\2\4b\3\2\2\2\6m\3\2\2"+
		"\2\bx\3\2\2\2\n\u0095\3\2\2\2\f\u00b3\3\2\2\2\16\u00b5\3\2\2\2\20\u00c3"+
		"\3\2\2\2\22\u00e9\3\2\2\2\24\u00f5\3\2\2\2\26\u00ff\3\2\2\2\30\u0112\3"+
		"\2\2\2\32\u012b\3\2\2\2\34\u012d\3\2\2\2\36\u0134\3\2\2\2 \u013c\3\2\2"+
		"\2\"\u0178\3\2\2\2$\u0197\3\2\2\2&\'\5\4\3\2\'(\7\34\2\2()\b\2\1\2)\61"+
		"\3\2\2\2*+\5\4\3\2+,\7\34\2\2,-\5\2\2\2-.\7\2\2\3./\b\2\1\2/\61\3\2\2"+
		"\2\60&\3\2\2\2\60*\3\2\2\2\61\3\3\2\2\2\62\63\7*\2\2\63\64\7&\2\2\64\65"+
		"\7-\2\2\65\66\7\t\2\2\66\67\7\n\2\2\678\7\3\2\289\5\b\5\29:\7\3\2\2:;"+
		"\b\3\1\2;c\3\2\2\2<=\7*\2\2=>\7\'\2\2>?\7-\2\2?@\7\t\2\2@A\7\n\2\2AB\7"+
		"\3\2\2BC\5\b\5\2CD\7+\2\2DE\t\2\2\2EF\7\34\2\2FG\7\3\2\2GH\b\3\1\2Hc\3"+
		"\2\2\2IJ\7*\2\2JK\7&\2\2KL\7-\2\2LM\7\t\2\2MN\5\6\4\2NO\7\n\2\2OP\7\3"+
		"\2\2PQ\5\b\5\2QR\7\3\2\2RS\b\3\1\2Sc\3\2\2\2TU\7*\2\2UV\7\'\2\2VW\7-\2"+
		"\2WX\7\t\2\2XY\5\6\4\2YZ\7\n\2\2Z[\7\3\2\2[\\\5\b\5\2\\]\7+\2\2]^\t\2"+
		"\2\2^_\7\34\2\2_`\7\3\2\2`a\b\3\1\2ac\3\2\2\2b\62\3\2\2\2b<\3\2\2\2bI"+
		"\3\2\2\2bT\3\2\2\2c\5\3\2\2\2de\7\'\2\2ef\7-\2\2fn\b\4\1\2gh\7\'\2\2h"+
		"i\7-\2\2ij\7\35\2\2jk\5\6\4\2kl\b\4\1\2ln\3\2\2\2md\3\2\2\2mg\3\2\2\2"+
		"n\7\3\2\2\2op\5\n\6\2pq\7\34\2\2qr\b\5\1\2ry\3\2\2\2st\5\n\6\2tu\7\34"+
		"\2\2uv\5\b\5\2vw\b\5\1\2wy\3\2\2\2xo\3\2\2\2xs\3\2\2\2y\t\3\2\2\2z{\5"+
		"\30\r\2{|\b\6\1\2|\u0096\3\2\2\2}~\5 \21\2~\177\b\6\1\2\177\u0096\3\2"+
		"\2\2\u0080\u0081\5\34\17\2\u0081\u0082\b\6\1\2\u0082\u0096\3\2\2\2\u0083"+
		"\u0084\5\36\20\2\u0084\u0085\b\6\1\2\u0085\u0096\3\2\2\2\u0086\u0087\5"+
		"\"\22\2\u0087\u0088\b\6\1\2\u0088\u0096\3\2\2\2\u0089\u008a\5\f\7\2\u008a"+
		"\u008b\b\6\1\2\u008b\u0096\3\2\2\2\u008c\u008d\7\f\2\2\u008d\u008e\7\17"+
		"\2\2\u008e\u008f\7.\2\2\u008f\u0090\7\17\2\2\u0090\u0091\7-\2\2\u0091"+
		"\u0096\b\6\1\2\u0092\u0093\5\24\13\2\u0093\u0094\b\6\1\2\u0094\u0096\3"+
		"\2\2\2\u0095z\3\2\2\2\u0095}\3\2\2\2\u0095\u0080\3\2\2\2\u0095\u0083\3"+
		"\2\2\2\u0095\u0086\3\2\2\2\u0095\u0089\3\2\2\2\u0095\u008c\3\2\2\2\u0095"+
		"\u0092\3\2\2\2\u0096\13\3\2\2\2\u0097\u0098\7\13\2\2\u0098\u0099\7\16"+
		"\2\2\u0099\u009a\7.\2\2\u009a\u009b\7\16\2\2\u009b\u009c\5\22\n\2\u009c"+
		"\u009d\b\7\1\2\u009d\u00b4\3\2\2\2\u009e\u009f\7\13\2\2\u009f\u00a0\7"+
		"\16\2\2\u00a0\u00a1\7.\2\2\u00a1\u00a2\7\16\2\2\u00a2\u00a3\5\22\n\2\u00a3"+
		"\u00a4\7\16\2\2\u00a4\u00a5\7\r\2\2\u00a5\u00a6\b\7\1\2\u00a6\u00b4\3"+
		"\2\2\2\u00a7\u00a8\7\13\2\2\u00a8\u00a9\7\16\2\2\u00a9\u00aa\5\22\n\2"+
		"\u00aa\u00ab\b\7\1\2\u00ab\u00b4\3\2\2\2\u00ac\u00ad\7\13\2\2\u00ad\u00ae"+
		"\7\16\2\2\u00ae\u00af\5\22\n\2\u00af\u00b0\7\16\2\2\u00b0\u00b1\7\r\2"+
		"\2\u00b1\u00b2\b\7\1\2\u00b2\u00b4\3\2\2\2\u00b3\u0097\3\2\2\2\u00b3\u009e"+
		"\3\2\2\2\u00b3\u00a7\3\2\2\2\u00b3\u00ac\3\2\2\2\u00b4\r\3\2\2\2\u00b5"+
		"\u00b6\b\b\1\2\u00b6\u00b7\5\20\t\2\u00b7\u00b8\b\b\1\2\u00b8\u00c0\3"+
		"\2\2\2\u00b9\u00ba\f\3\2\2\u00ba\u00bb\t\3\2\2\u00bb\u00bc\5\22\n\2\u00bc"+
		"\u00bd\b\b\1\2\u00bd\u00bf\3\2\2\2\u00be\u00b9\3\2\2\2\u00bf\u00c2\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\17\3\2\2\2\u00c2\u00c0"+
		"\3\2\2\2\u00c3\u00c4\b\t\1\2\u00c4\u00c5\5\22\n\2\u00c5\u00c6\b\t\1\2"+
		"\u00c6\u00ce\3\2\2\2\u00c7\u00c8\f\3\2\2\u00c8\u00c9\t\4\2\2\u00c9\u00ca"+
		"\5\22\n\2\u00ca\u00cb\b\t\1\2\u00cb\u00cd\3\2\2\2\u00cc\u00c7\3\2\2\2"+
		"\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\21"+
		"\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7\t\2\2\u00d2\u00d3\5\16\b\2"+
		"\u00d3\u00d4\7\n\2\2\u00d4\u00d5\b\n\1\2\u00d5\u00ea\3\2\2\2\u00d6\u00d7"+
		"\t\5\2\2\u00d7\u00ea\b\n\1\2\u00d8\u00d9\7\"\2\2\u00d9\u00da\7/\2\2\u00da"+
		"\u00ea\b\n\1\2\u00db\u00dc\5\24\13\2\u00dc\u00dd\b\n\1\2\u00dd\u00ea\3"+
		"\2\2\2\u00de\u00df\7-\2\2\u00df\u00ea\b\n\1\2\u00e0\u00e1\7\7\2\2\u00e1"+
		"\u00e2\5$\23\2\u00e2\u00e3\7\21\2\2\u00e3\u00e4\5\22\n\2\u00e4\u00e5\7"+
		"\21\2\2\u00e5\u00e6\5\22\n\2\u00e6\u00e7\7\b\2\2\u00e7\u00e8\b\n\1\2\u00e8"+
		"\u00ea\3\2\2\2\u00e9\u00d1\3\2\2\2\u00e9\u00d6\3\2\2\2\u00e9\u00d8\3\2"+
		"\2\2\u00e9\u00db\3\2\2\2\u00e9\u00de\3\2\2\2\u00e9\u00e0\3\2\2\2\u00ea"+
		"\23\3\2\2\2\u00eb\u00ec\7-\2\2\u00ec\u00ed\7\t\2\2\u00ed\u00ee\7\n\2\2"+
		"\u00ee\u00f6\b\13\1\2\u00ef\u00f0\7-\2\2\u00f0\u00f1\7\t\2\2\u00f1\u00f2"+
		"\5\26\f\2\u00f2\u00f3\7\n\2\2\u00f3\u00f4\b\13\1\2\u00f4\u00f6\3\2\2\2"+
		"\u00f5\u00eb\3\2\2\2\u00f5\u00ef\3\2\2\2\u00f6\25\3\2\2\2\u00f7\u00f8"+
		"\5\16\b\2\u00f8\u00f9\b\f\1\2\u00f9\u0100\3\2\2\2\u00fa\u00fb\5\16\b\2"+
		"\u00fb\u00fc\7\35\2\2\u00fc\u00fd\5\26\f\2\u00fd\u00fe\b\f\1\2\u00fe\u0100"+
		"\3\2\2\2\u00ff\u00f7\3\2\2\2\u00ff\u00fa\3\2\2\2\u0100\27\3\2\2\2\u0101"+
		"\u0102\7\22\2\2\u0102\u0103\5$\23\2\u0103\u0104\7\30\2\2\u0104\u0105\7"+
		"\3\2\2\u0105\u0106\5\b\5\2\u0106\u0107\7\3\2\2\u0107\u0108\b\r\1\2\u0108"+
		"\u0113\3\2\2\2\u0109\u010a\7\22\2\2\u010a\u010b\5$\23\2\u010b\u010c\7"+
		"\30\2\2\u010c\u010d\7\3\2\2\u010d\u010e\5\b\5\2\u010e\u010f\7\3\2\2\u010f"+
		"\u0110\5\32\16\2\u0110\u0111\b\r\1\2\u0111\u0113\3\2\2\2\u0112\u0101\3"+
		"\2\2\2\u0112\u0109\3\2\2\2\u0113\31\3\2\2\2\u0114\u0115\7\23\2\2\u0115"+
		"\u0116\7\3\2\2\u0116\u0117\5\b\5\2\u0117\u0118\7\3\2\2\u0118\u0119\b\16"+
		"\1\2\u0119\u012c\3\2\2\2\u011a\u011b\7\24\2\2\u011b\u011c\5$\23\2\u011c"+
		"\u011d\7\30\2\2\u011d\u011e\7\3\2\2\u011e\u011f\5\b\5\2\u011f\u0120\7"+
		"\3\2\2\u0120\u0121\5\32\16\2\u0121\u0122\b\16\1\2\u0122\u012c\3\2\2\2"+
		"\u0123\u0124\7\24\2\2\u0124\u0125\5$\23\2\u0125\u0126\7\30\2\2\u0126\u0127"+
		"\7\3\2\2\u0127\u0128\5\b\5\2\u0128\u0129\7\3\2\2\u0129\u012a\b\16\1\2"+
		"\u012a\u012c\3\2\2\2\u012b\u0114\3\2\2\2\u012b\u011a\3\2\2\2\u012b\u0123"+
		"\3\2\2\2\u012c\33\3\2\2\2\u012d\u012e\7\25\2\2\u012e\u012f\5$\23\2\u012f"+
		"\u0130\7\3\2\2\u0130\u0131\5\b\5\2\u0131\u0132\7\3\2\2\u0132\u0133\b\17"+
		"\1\2\u0133\35\3\2\2\2\u0134\u0135\7\26\2\2\u0135\u0136\7\3\2\2\u0136\u0137"+
		"\5\b\5\2\u0137\u0138\7\3\2\2\u0138\u0139\7\25\2\2\u0139\u013a\5$\23\2"+
		"\u013a\u013b\b\20\1\2\u013b\37\3\2\2\2\u013c\u013d\7\27\2\2\u013d\u013e"+
		"\7\t\2\2\u013e\u013f\5\"\22\2\u013f\u0140\7\6\2\2\u0140\u0141\5$\23\2"+
		"\u0141\u0142\7\6\2\2\u0142\u0143\5\"\22\2\u0143\u0144\7\n\2\2\u0144\u0145"+
		"\7\3\2\2\u0145\u0146\5\b\5\2\u0146\u0147\7\3\2\2\u0147\u0148\b\21\1\2"+
		"\u0148!\3\2\2\2\u0149\u014a\7-\2\2\u014a\u014b\7\20\2\2\u014b\u014c\5"+
		"\16\b\2\u014c\u014d\b\22\1\2\u014d\u0179\3\2\2\2\u014e\u014f\7-\2\2\u014f"+
		"\u0150\7\20\2\2\u0150\u0151\5$\23\2\u0151\u0152\b\22\1\2\u0152\u0179\3"+
		"\2\2\2\u0153\u0154\7,\2\2\u0154\u0155\7-\2\2\u0155\u0156\7\20\2\2\u0156"+
		"\u0157\7\7\2\2\u0157\u0158\7\b\2\2\u0158\u0159\7\3\2\2\u0159\u015a\5\b"+
		"\5\2\u015a\u015b\7+\2\2\u015b\u015c\t\2\2\2\u015c\u015d\7\34\2\2\u015d"+
		"\u015e\7\3\2\2\u015e\u015f\b\22\1\2\u015f\u0179\3\2\2\2\u0160\u0161\7"+
		",\2\2\u0161\u0162\7-\2\2\u0162\u0163\7\20\2\2\u0163\u0164\7\7\2\2\u0164"+
		"\u0165\7\b\2\2\u0165\u0166\7\t\2\2\u0166\u0167\5\6\4\2\u0167\u0168\7\n"+
		"\2\2\u0168\u0169\7\3\2\2\u0169\u016a\5\b\5\2\u016a\u016b\7+\2\2\u016b"+
		"\u016c\t\2\2\2\u016c\u016d\7\34\2\2\u016d\u016e\7\3\2\2\u016e\u016f\b"+
		"\22\1\2\u016f\u0179\3\2\2\2\u0170\u0171\7)\2\2\u0171\u0172\7-\2\2\u0172"+
		"\u0173\7\20\2\2\u0173\u0174\7.\2\2\u0174\u0179\b\22\1\2\u0175\u0176\7"+
		")\2\2\u0176\u0177\7-\2\2\u0177\u0179\b\22\1\2\u0178\u0149\3\2\2\2\u0178"+
		"\u014e\3\2\2\2\u0178\u0153\3\2\2\2\u0178\u0160\3\2\2\2\u0178\u0170\3\2"+
		"\2\2\u0178\u0175\3\2\2\2\u0179#\3\2\2\2\u017a\u017c\7\t\2\2\u017b\u017a"+
		"\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\7\4\2\2\u017e"+
		"\u0180\7\n\2\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181\u0198\b\23\1\2\u0182\u0183\7\t\2\2\u0183\u0184\5\16\b\2\u0184"+
		"\u0185\7\5\2\2\u0185\u0186\5\16\b\2\u0186\u0187\7\n\2\2\u0187\u0188\b"+
		"\23\1\2\u0188\u0198\3\2\2\2\u0189\u018a\7\t\2\2\u018a\u018b\7-\2\2\u018b"+
		"\u018c\7\5\2\2\u018c\u018d\5\16\b\2\u018d\u018e\7\n\2\2\u018e\u018f\b"+
		"\23\1\2\u018f\u0198\3\2\2\2\u0190\u0191\7\t\2\2\u0191\u0192\5$\23\2\u0192"+
		"\u0193\t\6\2\2\u0193\u0194\5$\23\2\u0194\u0195\7\n\2\2\u0195\u0196\b\23"+
		"\1\2\u0196\u0198\3\2\2\2\u0197\u017b\3\2\2\2\u0197\u0182\3\2\2\2\u0197"+
		"\u0189\3\2\2\2\u0197\u0190\3\2\2\2\u0198%\3\2\2\2\23\60bmx\u0095\u00b3"+
		"\u00c0\u00ce\u00e9\u00f5\u00ff\u0112\u012b\u0178\u017b\u017f\u0197";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}