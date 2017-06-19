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
		T__0=1, Dollar=2, Boolean=3, Operator=4, LB=5, RB=6, LP=7, RP=8, IF=9, 
		ELSE=10, WHILE=11, DO=12, FOR=13, THEN=14, AND=15, OR=16, NOT=17, END=18, 
		EQ=19, INF=20, SUP=21, PLUS=22, MINUS=23, TIMES=24, NEG=25, Number=26, 
		Variable=27;
	public static final int
		RULE_instructions = 0, RULE_instruction = 1, RULE_operation1 = 2, RULE_operation2 = 3, 
		RULE_term = 4, RULE_if_condition = 5, RULE_else_condition = 6, RULE_while_loop = 7, 
		RULE_dowhile_loop = 8, RULE_for_loop = 9, RULE_assigning = 10, RULE_condition = 11;
	public static final String[] ruleNames = {
		"instructions", "instruction", "operation1", "operation2", "term", "if_condition", 
		"else_condition", "while_loop", "dowhile_loop", "for_loop", "assigning", 
		"condition"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'/'", "'$'", null, null, "'['", "']'", "'('", "')'", "'if'", "'else'", 
		"'while'", "'do'", "'for'", "'then'", "'&'", "'||'", "'!'", "';'", "'='", 
		"'<'", "'>'", "'+'", null, "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "Dollar", "Boolean", "Operator", "LB", "RB", "LP", "RP", "IF", 
		"ELSE", "WHILE", "DO", "FOR", "THEN", "AND", "OR", "NOT", "END", "EQ", 
		"INF", "SUP", "PLUS", "MINUS", "TIMES", "NEG", "Number", "Variable"
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
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public TerminalNode END() { return getToken(PAFGrammarParser.END, 0); }
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
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				instruction();
				setState(25);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				instruction();
				setState(28);
				match(END);
				setState(29);
				instructions();
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
		public If_conditionContext if_condition() {
			return getRuleContext(If_conditionContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public AssigningContext assigning() {
			return getRuleContext(AssigningContext.class,0);
		}
		public Dowhile_loopContext dowhile_loop() {
			return getRuleContext(Dowhile_loopContext.class,0);
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
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				if_condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				while_loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				for_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				assigning();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
				dowhile_loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(38);
				operation1();
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
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				operation2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				operation2();
				setState(43);
				match(PLUS);
				setState(44);
				operation1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				operation2();
				setState(47);
				match(MINUS);
				setState(48);
				operation1();
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
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				term();
				setState(54);
				match(TIMES);
				setState(55);
				operation2();
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
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(LP);
				setState(60);
				operation1();
				setState(61);
				match(RP);
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(Number);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(MINUS);
				setState(65);
				match(Number);
				}
				break;
			case Variable:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				match(Variable);
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
		public TerminalNode IF() { return getToken(PAFGrammarParser.IF, 0); }
		public TerminalNode LP() { return getToken(PAFGrammarParser.LP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RP() { return getToken(PAFGrammarParser.RP, 0); }
		public TerminalNode THEN() { return getToken(PAFGrammarParser.THEN, 0); }
		public List<TerminalNode> Dollar() { return getTokens(PAFGrammarParser.Dollar); }
		public TerminalNode Dollar(int i) {
			return getToken(PAFGrammarParser.Dollar, i);
		}
		public Operation1Context operation1() {
			return getRuleContext(Operation1Context.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(IF);
			setState(70);
			match(LP);
			setState(71);
			condition();
			setState(72);
			match(RP);
			setState(73);
			match(THEN);
			setState(74);
			match(Dollar);
			setState(75);
			operation1();
			setState(76);
			match(Dollar);
			{
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(77);
				else_condition();
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
		public TerminalNode LB() { return getToken(PAFGrammarParser.LB, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode RB() { return getToken(PAFGrammarParser.RB, 0); }
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
			setState(80);
			match(ELSE);
			setState(81);
			match(LB);
			setState(82);
			instructions();
			setState(83);
			match(RB);
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
		public TerminalNode WHILE() { return getToken(PAFGrammarParser.WHILE, 0); }
		public TerminalNode LP() { return getToken(PAFGrammarParser.LP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RP() { return getToken(PAFGrammarParser.RP, 0); }
		public List<TerminalNode> Dollar() { return getTokens(PAFGrammarParser.Dollar); }
		public TerminalNode Dollar(int i) {
			return getToken(PAFGrammarParser.Dollar, i);
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
			setState(85);
			match(WHILE);
			setState(86);
			match(LP);
			setState(87);
			condition();
			setState(88);
			match(RP);
			setState(89);
			match(Dollar);
			setState(90);
			instructions();
			setState(91);
			match(Dollar);
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
		public TerminalNode DO() { return getToken(PAFGrammarParser.DO, 0); }
		public List<TerminalNode> Dollar() { return getTokens(PAFGrammarParser.Dollar); }
		public TerminalNode Dollar(int i) {
			return getToken(PAFGrammarParser.Dollar, i);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(PAFGrammarParser.WHILE, 0); }
		public TerminalNode LP() { return getToken(PAFGrammarParser.LP, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RP() { return getToken(PAFGrammarParser.RP, 0); }
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
			setState(93);
			match(DO);
			setState(94);
			match(Dollar);
			setState(95);
			instructions();
			setState(96);
			match(Dollar);
			setState(97);
			match(WHILE);
			setState(98);
			match(LP);
			setState(99);
			condition();
			setState(100);
			match(RP);
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
		public TerminalNode FOR() { return getToken(PAFGrammarParser.FOR, 0); }
		public TerminalNode LP() { return getToken(PAFGrammarParser.LP, 0); }
		public List<AssigningContext> assigning() {
			return getRuleContexts(AssigningContext.class);
		}
		public AssigningContext assigning(int i) {
			return getRuleContext(AssigningContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RP() { return getToken(PAFGrammarParser.RP, 0); }
		public List<TerminalNode> Dollar() { return getTokens(PAFGrammarParser.Dollar); }
		public TerminalNode Dollar(int i) {
			return getToken(PAFGrammarParser.Dollar, i);
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
		enterRule(_localctx, 18, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(FOR);
			setState(103);
			match(LP);
			setState(104);
			assigning();
			setState(105);
			match(T__0);
			setState(106);
			condition();
			setState(107);
			match(T__0);
			setState(108);
			assigning();
			setState(109);
			match(RP);
			setState(110);
			match(Dollar);
			setState(111);
			instructions();
			setState(112);
			match(Dollar);
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
		public TerminalNode Variable() { return getToken(PAFGrammarParser.Variable, 0); }
		public TerminalNode EQ() { return getToken(PAFGrammarParser.EQ, 0); }
		public Operation1Context operation1() {
			return getRuleContext(Operation1Context.class,0);
		}
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
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(Variable);
				setState(115);
				match(EQ);
				setState(116);
				operation1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(Variable);
				setState(118);
				match(EQ);
				setState(119);
				match(Boolean);
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
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				operation1();
				setState(123);
				match(Operator);
				setState(124);
				operation1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				operation1();
				setState(127);
				match(Operator);
				setState(128);
				match(Boolean);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u0087\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\"\n\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\65\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\5\5<\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6F\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7Q\n\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f{\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0085\n\r\3\r"+
		"\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2\u0089\2!\3\2\2\2\4)\3\2\2"+
		"\2\6\64\3\2\2\2\b;\3\2\2\2\nE\3\2\2\2\fG\3\2\2\2\16R\3\2\2\2\20W\3\2\2"+
		"\2\22_\3\2\2\2\24h\3\2\2\2\26z\3\2\2\2\30\u0084\3\2\2\2\32\33\5\4\3\2"+
		"\33\34\7\24\2\2\34\"\3\2\2\2\35\36\5\4\3\2\36\37\7\24\2\2\37 \5\2\2\2"+
		" \"\3\2\2\2!\32\3\2\2\2!\35\3\2\2\2\"\3\3\2\2\2#*\5\f\7\2$*\5\20\t\2%"+
		"*\5\24\13\2&*\5\26\f\2\'*\5\22\n\2(*\5\6\4\2)#\3\2\2\2)$\3\2\2\2)%\3\2"+
		"\2\2)&\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*\5\3\2\2\2+\65\5\b\5\2,-\5\b\5\2-"+
		".\7\30\2\2./\5\6\4\2/\65\3\2\2\2\60\61\5\b\5\2\61\62\7\31\2\2\62\63\5"+
		"\6\4\2\63\65\3\2\2\2\64+\3\2\2\2\64,\3\2\2\2\64\60\3\2\2\2\65\7\3\2\2"+
		"\2\66<\5\n\6\2\678\5\n\6\289\7\32\2\29:\5\b\5\2:<\3\2\2\2;\66\3\2\2\2"+
		";\67\3\2\2\2<\t\3\2\2\2=>\7\t\2\2>?\5\6\4\2?@\7\n\2\2@F\3\2\2\2AF\7\34"+
		"\2\2BC\7\31\2\2CF\7\34\2\2DF\7\35\2\2E=\3\2\2\2EA\3\2\2\2EB\3\2\2\2ED"+
		"\3\2\2\2F\13\3\2\2\2GH\7\13\2\2HI\7\t\2\2IJ\5\30\r\2JK\7\n\2\2KL\7\20"+
		"\2\2LM\7\4\2\2MN\5\6\4\2NP\7\4\2\2OQ\5\16\b\2PO\3\2\2\2PQ\3\2\2\2Q\r\3"+
		"\2\2\2RS\7\f\2\2ST\7\7\2\2TU\5\2\2\2UV\7\b\2\2V\17\3\2\2\2WX\7\r\2\2X"+
		"Y\7\t\2\2YZ\5\30\r\2Z[\7\n\2\2[\\\7\4\2\2\\]\5\2\2\2]^\7\4\2\2^\21\3\2"+
		"\2\2_`\7\16\2\2`a\7\4\2\2ab\5\2\2\2bc\7\4\2\2cd\7\r\2\2de\7\t\2\2ef\5"+
		"\30\r\2fg\7\n\2\2g\23\3\2\2\2hi\7\17\2\2ij\7\t\2\2jk\5\26\f\2kl\7\3\2"+
		"\2lm\5\30\r\2mn\7\3\2\2no\5\26\f\2op\7\n\2\2pq\7\4\2\2qr\5\2\2\2rs\7\4"+
		"\2\2s\25\3\2\2\2tu\7\35\2\2uv\7\25\2\2v{\5\6\4\2wx\7\35\2\2xy\7\25\2\2"+
		"y{\7\5\2\2zt\3\2\2\2zw\3\2\2\2{\27\3\2\2\2|}\5\6\4\2}~\7\6\2\2~\177\5"+
		"\6\4\2\177\u0085\3\2\2\2\u0080\u0081\5\6\4\2\u0081\u0082\7\6\2\2\u0082"+
		"\u0083\7\5\2\2\u0083\u0085\3\2\2\2\u0084|\3\2\2\2\u0084\u0080\3\2\2\2"+
		"\u0085\31\3\2\2\2\n!)\64;EPz\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}