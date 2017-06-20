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
		T__0=1, Dollar=2, Number=3, Boolean=4, Operator=5, LB=6, RB=7, LP=8, RP=9, 
		IF=10, ELSE=11, WHILE=12, DO=13, FOR=14, THEN=15, AND=16, OR=17, NOT=18, 
		END=19, EQ=20, INF=21, SUP=22, PLUS=23, MINUS=24, TIMES=25, Variable=26, 
		WS=27;
	public static final int
		RULE_instructions = 0, RULE_instruction = 1, RULE_operation1 = 2, RULE_operation2 = 3, 
		RULE_term = 4, RULE_if_condition = 5, RULE_else_condition = 6, RULE_while_loop = 7, 
		RULE_dowhile_loop = 8, RULE_for_loop = 9, RULE_assigning = 10, RULE_bool = 11;
	public static final String[] ruleNames = {
		"instructions", "instruction", "operation1", "operation2", "term", "if_condition", 
		"else_condition", "while_loop", "dowhile_loop", "for_loop", "assigning", 
		"bool"
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
		enterRule(_localctx, 0, RULE_instructions);
		try {
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				((InstructionsContext)_localctx).a = instruction();
				setState(25);
				match(END);
				((InstructionsContext)_localctx).instrs = new Instructions(((InstructionsContext)_localctx).a.instr);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				((InstructionsContext)_localctx).b = instruction();
				setState(29);
				match(END);
				setState(30);
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
		enterRule(_localctx, 2, RULE_instruction);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				((InstructionContext)_localctx).a = if_condition();
				((InstructionContext)_localctx).instr = new Instruction(((InstructionContext)_localctx).a.cond);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				((InstructionContext)_localctx).b = for_loop();
				((InstructionContext)_localctx).instr = new Instruction(((InstructionContext)_localctx).b.forLoop);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				((InstructionContext)_localctx).c = while_loop();
				((InstructionContext)_localctx).instr = new Instruction(((InstructionContext)_localctx).c.whileLoop);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				((InstructionContext)_localctx).d = dowhile_loop();
				((InstructionContext)_localctx).instr = new Instruction(((InstructionContext)_localctx).d.dowhileLoop);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				((InstructionContext)_localctx).e = assigning();
				((InstructionContext)_localctx).instr = new Instruction(((InstructionContext)_localctx).e.var);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				((InstructionContext)_localctx).f = operation1();
				((InstructionContext)_localctx).instr = new Instruction(((InstructionContext)_localctx).f.op);
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
		public Operation2Context a;
		public Operation2Context b;
		public Token p;
		public Operation1Context c;
		public Operation2Context d;
		public Token m;
		public Operation1Context e;
		public Operation2Context operation2() {
			return getRuleContext(Operation2Context.class,0);
		}
		public TerminalNode PLUS() { return getToken(PAFGrammarParser.PLUS, 0); }
		public Operation1Context operation1() {
			return getRuleContext(Operation1Context.class,0);
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
		Operation1Context _localctx = new Operation1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_operation1);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				((Operation1Context)_localctx).a = operation2();
				((Operation1Context)_localctx).op = new Operation(((Operation1Context)_localctx).a.op);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				((Operation1Context)_localctx).b = operation2();
				setState(59);
				((Operation1Context)_localctx).p = match(PLUS);
				setState(60);
				((Operation1Context)_localctx).c = operation1();
				((Operation1Context)_localctx).op = new Operation(((Operation1Context)_localctx).b.op,((Operation1Context)_localctx).c.op,(((Operation1Context)_localctx).p!=null?((Operation1Context)_localctx).p.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				((Operation1Context)_localctx).d = operation2();
				setState(64);
				((Operation1Context)_localctx).m = match(MINUS);
				setState(65);
				((Operation1Context)_localctx).e = operation1();
				((Operation1Context)_localctx).op = new Operation(((Operation1Context)_localctx).d.op,((Operation1Context)_localctx).e.op,(((Operation1Context)_localctx).m!=null?((Operation1Context)_localctx).m.getText():null));
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

	public static class Operation2Context extends ParserRuleContext {
		public Operation op;
		public TermContext a;
		public TermContext b;
		public Token t;
		public Operation2Context c;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(PAFGrammarParser.TIMES, 0); }
		public Operation2Context operation2() {
			return getRuleContext(Operation2Context.class,0);
		}
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
		Operation2Context _localctx = new Operation2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_operation2);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				((Operation2Context)_localctx).a = term();
				((Operation2Context)_localctx).op = new Operation(((Operation2Context)_localctx).a.tm);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				((Operation2Context)_localctx).b = term();
				setState(74);
				((Operation2Context)_localctx).t = match(TIMES);
				setState(75);
				((Operation2Context)_localctx).c = operation2();
				((Operation2Context)_localctx).op = new Operation(((Operation2Context)_localctx).b.tm,((Operation2Context)_localctx).c.op,(((Operation2Context)_localctx).t!=null?((Operation2Context)_localctx).t.getText():null));
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

	public static class TermContext extends ParserRuleContext {
		public Term tm;
		public Token lp;
		public Operation1Context a;
		public Token rp;
		public Token n;
		public Token m;
		public Token v;
		public TerminalNode LP() { return getToken(PAFGrammarParser.LP, 0); }
		public Operation1Context operation1() {
			return getRuleContext(Operation1Context.class,0);
		}
		public TerminalNode RP() { return getToken(PAFGrammarParser.RP, 0); }
		public TerminalNode Number() { return getToken(PAFGrammarParser.Number, 0); }
		public TerminalNode MINUS() { return getToken(PAFGrammarParser.MINUS, 0); }
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
		enterRule(_localctx, 8, RULE_term);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				((TermContext)_localctx).lp = match(LP);
				setState(81);
				((TermContext)_localctx).a = operation1();
				setState(82);
				((TermContext)_localctx).rp = match(RP);
				((TermContext)_localctx).tm = new Term(((TermContext)_localctx).a.op,(((TermContext)_localctx).lp!=null?((TermContext)_localctx).lp.getText():null),(((TermContext)_localctx).rp!=null?((TermContext)_localctx).rp.getText():null));
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				((TermContext)_localctx).n = match(Number);
				((TermContext)_localctx).tm = new Term((((TermContext)_localctx).n!=null?((TermContext)_localctx).n.getText():null));
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				((TermContext)_localctx).m = match(MINUS);
				setState(88);
				((TermContext)_localctx).n = match(Number);
				((TermContext)_localctx).tm = new Term((((TermContext)_localctx).n!=null?((TermContext)_localctx).n.getText():null),(((TermContext)_localctx).m!=null?((TermContext)_localctx).m.getText():null));
				}
				break;
			case Variable:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				((TermContext)_localctx).v = match(Variable);
				((TermContext)_localctx).tm = new Term(new Variable((((TermContext)_localctx).v!=null?((TermContext)_localctx).v.getText():null)));
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

	public static class If_conditionContext extends ParserRuleContext {
		public Condition cond;
		public BoolContext a;
		public InstructionsContext b;
		public BoolContext c;
		public InstructionsContext d;
		public Else_conditionContext e;
		public TerminalNode IF() { return getToken(PAFGrammarParser.IF, 0); }
		public TerminalNode LP() { return getToken(PAFGrammarParser.LP, 0); }
		public TerminalNode RP() { return getToken(PAFGrammarParser.RP, 0); }
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
		enterRule(_localctx, 10, RULE_if_condition);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(IF);
				setState(95);
				match(LP);
				setState(96);
				((If_conditionContext)_localctx).a = bool();
				setState(97);
				match(RP);
				setState(98);
				match(THEN);
				setState(99);
				match(Dollar);
				setState(100);
				((If_conditionContext)_localctx).b = instructions();
				setState(101);
				match(Dollar);
				((If_conditionContext)_localctx).cond = new Condition(((If_conditionContext)_localctx).a.value,((If_conditionContext)_localctx).b.instrs);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(IF);
				setState(105);
				match(LP);
				setState(106);
				((If_conditionContext)_localctx).c = bool();
				setState(107);
				match(RP);
				setState(108);
				match(THEN);
				setState(109);
				match(Dollar);
				setState(110);
				((If_conditionContext)_localctx).d = instructions();
				setState(111);
				match(Dollar);
				setState(112);
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
		public TerminalNode ELSE() { return getToken(PAFGrammarParser.ELSE, 0); }
		public TerminalNode LB() { return getToken(PAFGrammarParser.LB, 0); }
		public TerminalNode RB() { return getToken(PAFGrammarParser.RB, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
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
		enterRule(_localctx, 12, RULE_else_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(ELSE);
			setState(118);
			match(LB);
			setState(119);
			((Else_conditionContext)_localctx).a = instructions();
			setState(120);
			match(RB);
			((Else_conditionContext)_localctx).cond = new Condition(((Else_conditionContext)_localctx).a.instrs);
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
		public TerminalNode LP() { return getToken(PAFGrammarParser.LP, 0); }
		public TerminalNode RP() { return getToken(PAFGrammarParser.RP, 0); }
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
		enterRule(_localctx, 14, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(WHILE);
			setState(124);
			match(LP);
			setState(125);
			((While_loopContext)_localctx).a = bool();
			setState(126);
			match(RP);
			setState(127);
			match(Dollar);
			setState(128);
			((While_loopContext)_localctx).b = instructions();
			setState(129);
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
		public TerminalNode LP() { return getToken(PAFGrammarParser.LP, 0); }
		public TerminalNode RP() { return getToken(PAFGrammarParser.RP, 0); }
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
		enterRule(_localctx, 16, RULE_dowhile_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(DO);
			setState(133);
			match(Dollar);
			setState(134);
			((Dowhile_loopContext)_localctx).a = instructions();
			setState(135);
			match(Dollar);
			setState(136);
			match(WHILE);
			setState(137);
			match(LP);
			setState(138);
			((Dowhile_loopContext)_localctx).b = bool();
			setState(139);
			match(RP);
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
		public Token c;
		public InstructionsContext d;
		public TerminalNode FOR() { return getToken(PAFGrammarParser.FOR, 0); }
		public TerminalNode LP() { return getToken(PAFGrammarParser.LP, 0); }
		public TerminalNode RP() { return getToken(PAFGrammarParser.RP, 0); }
		public List<TerminalNode> Dollar() { return getTokens(PAFGrammarParser.Dollar); }
		public TerminalNode Dollar(int i) {
			return getToken(PAFGrammarParser.Dollar, i);
		}
		public AssigningContext assigning() {
			return getRuleContext(AssigningContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode Number() { return getToken(PAFGrammarParser.Number, 0); }
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
		enterRule(_localctx, 18, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(FOR);
			setState(143);
			match(LP);
			setState(144);
			((For_loopContext)_localctx).a = assigning();
			setState(145);
			match(T__0);
			setState(146);
			((For_loopContext)_localctx).b = bool();
			setState(147);
			match(T__0);
			setState(148);
			((For_loopContext)_localctx).c = match(Number);
			setState(149);
			match(RP);
			setState(150);
			match(Dollar);
			setState(151);
			((For_loopContext)_localctx).d = instructions();
			setState(152);
			match(Dollar);
			((For_loopContext)_localctx).forLoop = new For_loop(((For_loopContext)_localctx).b.value,((For_loopContext)_localctx).a.var,(((For_loopContext)_localctx).c!=null?((For_loopContext)_localctx).c.getText():null),((For_loopContext)_localctx).d.instrs);
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
		public TerminalNode EQ() { return getToken(PAFGrammarParser.EQ, 0); }
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
		enterRule(_localctx, 20, RULE_assigning);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				((AssigningContext)_localctx).a = match(Variable);
				setState(156);
				match(EQ);
				setState(157);
				((AssigningContext)_localctx).b = operation1();
				((AssigningContext)_localctx).var = new Assigning(new Variable((((AssigningContext)_localctx).a!=null?((AssigningContext)_localctx).a.getText():null)),((AssigningContext)_localctx).b.op);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				((AssigningContext)_localctx).c = match(Variable);
				setState(161);
				match(EQ);
				setState(162);
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
		enterRule(_localctx, 22, RULE_bool);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				((BoolContext)_localctx).a = match(Boolean);
				((BoolContext)_localctx).value = new Bool((((BoolContext)_localctx).a!=null?((BoolContext)_localctx).a.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				((BoolContext)_localctx).b = operation1();
				setState(170);
				((BoolContext)_localctx).c = match(Operator);
				setState(171);
				((BoolContext)_localctx).d = operation1();
				((BoolContext)_localctx).value = new Bool(((BoolContext)_localctx).b.op,((BoolContext)_localctx).d.op,(((BoolContext)_localctx).c!=null?((BoolContext)_localctx).c.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				((BoolContext)_localctx).e = match(Variable);
				setState(175);
				((BoolContext)_localctx).f = match(Operator);
				setState(176);
				((BoolContext)_localctx).g = operation1();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00b8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2$\n\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\38\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4G\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Q\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6_\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7v\n\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a8\n\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b6\n\r\3\r\2\2\16\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\2\2\2\u00bb\2#\3\2\2\2\4\67\3\2\2\2\6F\3\2"+
		"\2\2\bP\3\2\2\2\n^\3\2\2\2\fu\3\2\2\2\16w\3\2\2\2\20}\3\2\2\2\22\u0086"+
		"\3\2\2\2\24\u0090\3\2\2\2\26\u00a7\3\2\2\2\30\u00b5\3\2\2\2\32\33\5\4"+
		"\3\2\33\34\7\25\2\2\34\35\b\2\1\2\35$\3\2\2\2\36\37\5\4\3\2\37 \7\25\2"+
		"\2 !\5\2\2\2!\"\b\2\1\2\"$\3\2\2\2#\32\3\2\2\2#\36\3\2\2\2$\3\3\2\2\2"+
		"%&\5\f\7\2&\'\b\3\1\2\'8\3\2\2\2()\5\24\13\2)*\b\3\1\2*8\3\2\2\2+,\5\20"+
		"\t\2,-\b\3\1\2-8\3\2\2\2./\5\22\n\2/\60\b\3\1\2\608\3\2\2\2\61\62\5\26"+
		"\f\2\62\63\b\3\1\2\638\3\2\2\2\64\65\5\6\4\2\65\66\b\3\1\2\668\3\2\2\2"+
		"\67%\3\2\2\2\67(\3\2\2\2\67+\3\2\2\2\67.\3\2\2\2\67\61\3\2\2\2\67\64\3"+
		"\2\2\28\5\3\2\2\29:\5\b\5\2:;\b\4\1\2;G\3\2\2\2<=\5\b\5\2=>\7\31\2\2>"+
		"?\5\6\4\2?@\b\4\1\2@G\3\2\2\2AB\5\b\5\2BC\7\32\2\2CD\5\6\4\2DE\b\4\1\2"+
		"EG\3\2\2\2F9\3\2\2\2F<\3\2\2\2FA\3\2\2\2G\7\3\2\2\2HI\5\n\6\2IJ\b\5\1"+
		"\2JQ\3\2\2\2KL\5\n\6\2LM\7\33\2\2MN\5\b\5\2NO\b\5\1\2OQ\3\2\2\2PH\3\2"+
		"\2\2PK\3\2\2\2Q\t\3\2\2\2RS\7\n\2\2ST\5\6\4\2TU\7\13\2\2UV\b\6\1\2V_\3"+
		"\2\2\2WX\7\5\2\2X_\b\6\1\2YZ\7\32\2\2Z[\7\5\2\2[_\b\6\1\2\\]\7\34\2\2"+
		"]_\b\6\1\2^R\3\2\2\2^W\3\2\2\2^Y\3\2\2\2^\\\3\2\2\2_\13\3\2\2\2`a\7\f"+
		"\2\2ab\7\n\2\2bc\5\30\r\2cd\7\13\2\2de\7\21\2\2ef\7\4\2\2fg\5\2\2\2gh"+
		"\7\4\2\2hi\b\7\1\2iv\3\2\2\2jk\7\f\2\2kl\7\n\2\2lm\5\30\r\2mn\7\13\2\2"+
		"no\7\21\2\2op\7\4\2\2pq\5\2\2\2qr\7\4\2\2rs\5\16\b\2st\b\7\1\2tv\3\2\2"+
		"\2u`\3\2\2\2uj\3\2\2\2v\r\3\2\2\2wx\7\r\2\2xy\7\b\2\2yz\5\2\2\2z{\7\t"+
		"\2\2{|\b\b\1\2|\17\3\2\2\2}~\7\16\2\2~\177\7\n\2\2\177\u0080\5\30\r\2"+
		"\u0080\u0081\7\13\2\2\u0081\u0082\7\4\2\2\u0082\u0083\5\2\2\2\u0083\u0084"+
		"\7\4\2\2\u0084\u0085\b\t\1\2\u0085\21\3\2\2\2\u0086\u0087\7\17\2\2\u0087"+
		"\u0088\7\4\2\2\u0088\u0089\5\2\2\2\u0089\u008a\7\4\2\2\u008a\u008b\7\16"+
		"\2\2\u008b\u008c\7\n\2\2\u008c\u008d\5\30\r\2\u008d\u008e\7\13\2\2\u008e"+
		"\u008f\b\n\1\2\u008f\23\3\2\2\2\u0090\u0091\7\20\2\2\u0091\u0092\7\n\2"+
		"\2\u0092\u0093\5\26\f\2\u0093\u0094\7\3\2\2\u0094\u0095\5\30\r\2\u0095"+
		"\u0096\7\3\2\2\u0096\u0097\7\5\2\2\u0097\u0098\7\13\2\2\u0098\u0099\7"+
		"\4\2\2\u0099\u009a\5\2\2\2\u009a\u009b\7\4\2\2\u009b\u009c\b\13\1\2\u009c"+
		"\25\3\2\2\2\u009d\u009e\7\34\2\2\u009e\u009f\7\26\2\2\u009f\u00a0\5\6"+
		"\4\2\u00a0\u00a1\b\f\1\2\u00a1\u00a8\3\2\2\2\u00a2\u00a3\7\34\2\2\u00a3"+
		"\u00a4\7\26\2\2\u00a4\u00a5\5\30\r\2\u00a5\u00a6\b\f\1\2\u00a6\u00a8\3"+
		"\2\2\2\u00a7\u009d\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a8\27\3\2\2\2\u00a9"+
		"\u00aa\7\6\2\2\u00aa\u00b6\b\r\1\2\u00ab\u00ac\5\6\4\2\u00ac\u00ad\7\7"+
		"\2\2\u00ad\u00ae\5\6\4\2\u00ae\u00af\b\r\1\2\u00af\u00b6\3\2\2\2\u00b0"+
		"\u00b1\7\34\2\2\u00b1\u00b2\7\7\2\2\u00b2\u00b3\5\6\4\2\u00b3\u00b4\b"+
		"\r\1\2\u00b4\u00b6\3\2\2\2\u00b5\u00a9\3\2\2\2\u00b5\u00ab\3\2\2\2\u00b5"+
		"\u00b0\3\2\2\2\u00b6\31\3\2\2\2\n#\67FP^u\u00a7\u00b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}