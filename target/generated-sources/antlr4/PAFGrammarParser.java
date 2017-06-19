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
		T__0=1, Dollar=2, Number=3, Variable=4, Boolean=5, Operator=6, LB=7, RB=8, 
		LP=9, RP=10, IF=11, ELSE=12, WHILE=13, DO=14, FOR=15, THEN=16, AND=17, 
		OR=18, NOT=19, END=20, EQ=21, INF=22, SUP=23, PLUS=24, MINUS=25, TIMES=26, 
		NEG=27;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'$'", "Number", "Variable", "Boolean", "Operator", 
		"'['", "']'", "'('", "')'", "'if'", "'else'", "'while'", "'do'", "'for'", 
		"'then'", "'&'", "'||'", "'!'", "';'", "'='", "'<'", "'>'", "'+'", "MINUS", 
		"'*'", "NEG"
	};
	public static final int
		RULE_instructions = 0, RULE_instruction = 1, RULE_operation1 = 2, RULE_operation2 = 3, 
		RULE_term = 4, RULE_if_condition = 5, RULE_else_condition = 6, RULE_while_loop = 7, 
		RULE_dowhile_loop = 8, RULE_for_loop = 9, RULE_assigning = 10, RULE_condition = 11;
	public static final String[] ruleNames = {
		"instructions", "instruction", "operation1", "operation2", "term", "if_condition", 
		"else_condition", "while_loop", "dowhile_loop", "for_loop", "assigning", 
		"condition"
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
	public static class InstructionsContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(PAFGrammarParser.END, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
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
			setState(31);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24); instruction();
				setState(25); match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27); instruction();
				setState(28); match(END);
				setState(29); instructions();
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
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Operation1Context operation1() {
			return getRuleContext(Operation1Context.class,0);
		}
		public AssigningContext assigning() {
			return getRuleContext(AssigningContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public If_conditionContext if_condition() {
			return getRuleContext(If_conditionContext.class,0);
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
			setState(38);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33); if_condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34); while_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(35); for_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(36); assigning();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(37); operation1();
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
		public Operation1Context operation1() {
			return getRuleContext(Operation1Context.class,0);
		}
		public Operation2Context operation2() {
			return getRuleContext(Operation2Context.class,0);
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
		Operation1Context _localctx = new Operation1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_operation1);
		try {
			setState(49);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40); operation2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41); operation2();
				setState(42); match(PLUS);
				setState(43); operation1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45); operation2();
				setState(46); match(MINUS);
				setState(47); operation1();
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
			setState(56);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51); term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52); term();
				setState(53); match(TIMES);
				setState(54); operation2();
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
		public TerminalNode RP() { return getToken(PAFGrammarParser.RP, 0); }
		public Operation1Context operation1() {
			return getRuleContext(Operation1Context.class,0);
		}
		public TerminalNode LP() { return getToken(PAFGrammarParser.LP, 0); }
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
			setState(66);
			switch (_input.LA(1)) {
			case LP:
				enterOuterAlt(_localctx, 1);
				{
				setState(58); match(LP);
				setState(59); operation1();
				setState(60); match(RP);
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(62); match(Number);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(63); match(MINUS);
				setState(64); match(Number);
				}
				break;
			case Variable:
				enterOuterAlt(_localctx, 4);
				{
				setState(65); match(Variable);
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
		public TerminalNode RP() { return getToken(PAFGrammarParser.RP, 0); }
		public TerminalNode IF() { return getToken(PAFGrammarParser.IF, 0); }
		public TerminalNode LP() { return getToken(PAFGrammarParser.LP, 0); }
		public TerminalNode THEN() { return getToken(PAFGrammarParser.THEN, 0); }
		public Else_conditionContext else_condition() {
			return getRuleContext(Else_conditionContext.class,0);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public List<TerminalNode> Dollar() { return getTokens(PAFGrammarParser.Dollar); }
		public TerminalNode Dollar(int i) {
			return getToken(PAFGrammarParser.Dollar, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(IF);
			setState(69); match(LP);
			setState(70); condition();
			setState(71); match(RP);
			setState(72); match(THEN);
			setState(73); match(Dollar);
			setState(74); instructions();
			setState(75); match(Dollar);
			{
			setState(77);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(76); else_condition();
				}
			}

			}
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
		public TerminalNode ELSE() { return getToken(PAFGrammarParser.ELSE, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode RB() { return getToken(PAFGrammarParser.RB, 0); }
		public TerminalNode LB() { return getToken(PAFGrammarParser.LB, 0); }
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
			setState(79); match(ELSE);
			setState(80); match(LB);
			setState(81); instructions();
			setState(82); match(RB);
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
		public TerminalNode RP() { return getToken(PAFGrammarParser.RP, 0); }
		public TerminalNode LP() { return getToken(PAFGrammarParser.LP, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public List<TerminalNode> Dollar() { return getTokens(PAFGrammarParser.Dollar); }
		public TerminalNode WHILE() { return getToken(PAFGrammarParser.WHILE, 0); }
		public TerminalNode Dollar(int i) {
			return getToken(PAFGrammarParser.Dollar, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
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
			setState(84); match(WHILE);
			setState(85); match(LP);
			setState(86); condition();
			setState(87); match(RP);
			setState(88); match(Dollar);
			setState(89); instructions();
			setState(90); match(Dollar);
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
		public TerminalNode RP() { return getToken(PAFGrammarParser.RP, 0); }
		public TerminalNode DO() { return getToken(PAFGrammarParser.DO, 0); }
		public TerminalNode LP() { return getToken(PAFGrammarParser.LP, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public List<TerminalNode> Dollar() { return getTokens(PAFGrammarParser.Dollar); }
		public TerminalNode Dollar(int i) {
			return getToken(PAFGrammarParser.Dollar, i);
		}
		public TerminalNode WHILE() { return getToken(PAFGrammarParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
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
			setState(92); match(DO);
			setState(93); match(Dollar);
			setState(94); instructions();
			setState(95); match(Dollar);
			setState(96); match(WHILE);
			setState(97); match(LP);
			setState(98); condition();
			setState(99); match(RP);
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
		public TerminalNode RP() { return getToken(PAFGrammarParser.RP, 0); }
		public AssigningContext assigning(int i) {
			return getRuleContext(AssigningContext.class,i);
		}
		public TerminalNode LP() { return getToken(PAFGrammarParser.LP, 0); }
		public TerminalNode FOR() { return getToken(PAFGrammarParser.FOR, 0); }
		public List<AssigningContext> assigning() {
			return getRuleContexts(AssigningContext.class);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public List<TerminalNode> Dollar() { return getTokens(PAFGrammarParser.Dollar); }
		public TerminalNode Dollar(int i) {
			return getToken(PAFGrammarParser.Dollar, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
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
			setState(101); match(FOR);
			setState(102); match(LP);
			setState(103); assigning();
			setState(104); match(T__0);
			setState(105); condition();
			setState(106); match(T__0);
			setState(107); assigning();
			setState(108); match(RP);
			setState(109); match(Dollar);
			setState(110); instructions();
			setState(111); match(Dollar);
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
		public Operation1Context operation1() {
			return getRuleContext(Operation1Context.class,0);
		}
		public TerminalNode EQ() { return getToken(PAFGrammarParser.EQ, 0); }
		public TerminalNode Variable() { return getToken(PAFGrammarParser.Variable, 0); }
		public TerminalNode Boolean() { return getToken(PAFGrammarParser.Boolean, 0); }
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
			setState(119);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113); match(Variable);
				setState(114); match(EQ);
				setState(115); operation1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116); match(Variable);
				setState(117); match(EQ);
				setState(118); match(Boolean);
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

	public static class ConditionContext extends ParserRuleContext {
		public List<Operation1Context> operation1() {
			return getRuleContexts(Operation1Context.class);
		}
		public Operation1Context operation1(int i) {
			return getRuleContext(Operation1Context.class,i);
		}
		public TerminalNode Operator() { return getToken(PAFGrammarParser.Operator, 0); }
		public TerminalNode Boolean() { return getToken(PAFGrammarParser.Boolean, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PAFGrammarListener ) ((PAFGrammarListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition);
		try {
			setState(129);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121); operation1();
				setState(122); match(Operator);
				setState(123); operation1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125); operation1();
				setState(126); match(Operator);
				setState(127); match(Boolean);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35\u0086\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\"\n\2\3\3\3\3\3"+
		"\3\3\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\64\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\5\5;\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6E\n\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7P\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\fz\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0084\n\r\3\r\2\2\16"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\2\2\u0087\2!\3\2\2\2\4(\3\2\2\2\6\63\3"+
		"\2\2\2\b:\3\2\2\2\nD\3\2\2\2\fF\3\2\2\2\16Q\3\2\2\2\20V\3\2\2\2\22^\3"+
		"\2\2\2\24g\3\2\2\2\26y\3\2\2\2\30\u0083\3\2\2\2\32\33\5\4\3\2\33\34\7"+
		"\26\2\2\34\"\3\2\2\2\35\36\5\4\3\2\36\37\7\26\2\2\37 \5\2\2\2 \"\3\2\2"+
		"\2!\32\3\2\2\2!\35\3\2\2\2\"\3\3\2\2\2#)\5\f\7\2$)\5\20\t\2%)\5\24\13"+
		"\2&)\5\26\f\2\')\5\6\4\2(#\3\2\2\2($\3\2\2\2(%\3\2\2\2(&\3\2\2\2(\'\3"+
		"\2\2\2)\5\3\2\2\2*\64\5\b\5\2+,\5\b\5\2,-\7\32\2\2-.\5\6\4\2.\64\3\2\2"+
		"\2/\60\5\b\5\2\60\61\7\33\2\2\61\62\5\6\4\2\62\64\3\2\2\2\63*\3\2\2\2"+
		"\63+\3\2\2\2\63/\3\2\2\2\64\7\3\2\2\2\65;\5\n\6\2\66\67\5\n\6\2\678\7"+
		"\34\2\289\5\b\5\29;\3\2\2\2:\65\3\2\2\2:\66\3\2\2\2;\t\3\2\2\2<=\7\13"+
		"\2\2=>\5\6\4\2>?\7\f\2\2?E\3\2\2\2@E\7\5\2\2AB\7\33\2\2BE\7\5\2\2CE\7"+
		"\6\2\2D<\3\2\2\2D@\3\2\2\2DA\3\2\2\2DC\3\2\2\2E\13\3\2\2\2FG\7\r\2\2G"+
		"H\7\13\2\2HI\5\30\r\2IJ\7\f\2\2JK\7\22\2\2KL\7\4\2\2LM\5\2\2\2MO\7\4\2"+
		"\2NP\5\16\b\2ON\3\2\2\2OP\3\2\2\2P\r\3\2\2\2QR\7\16\2\2RS\7\t\2\2ST\5"+
		"\2\2\2TU\7\n\2\2U\17\3\2\2\2VW\7\17\2\2WX\7\13\2\2XY\5\30\r\2YZ\7\f\2"+
		"\2Z[\7\4\2\2[\\\5\2\2\2\\]\7\4\2\2]\21\3\2\2\2^_\7\20\2\2_`\7\4\2\2`a"+
		"\5\2\2\2ab\7\4\2\2bc\7\17\2\2cd\7\13\2\2de\5\30\r\2ef\7\f\2\2f\23\3\2"+
		"\2\2gh\7\21\2\2hi\7\13\2\2ij\5\26\f\2jk\7\3\2\2kl\5\30\r\2lm\7\3\2\2m"+
		"n\5\26\f\2no\7\f\2\2op\7\4\2\2pq\5\2\2\2qr\7\4\2\2r\25\3\2\2\2st\7\6\2"+
		"\2tu\7\27\2\2uz\5\6\4\2vw\7\6\2\2wx\7\27\2\2xz\7\7\2\2ys\3\2\2\2yv\3\2"+
		"\2\2z\27\3\2\2\2{|\5\6\4\2|}\7\b\2\2}~\5\6\4\2~\u0084\3\2\2\2\177\u0080"+
		"\5\6\4\2\u0080\u0081\7\b\2\2\u0081\u0082\7\7\2\2\u0082\u0084\3\2\2\2\u0083"+
		"{\3\2\2\2\u0083\177\3\2\2\2\u0084\31\3\2\2\2\n!(\63:DOy\u0083";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}