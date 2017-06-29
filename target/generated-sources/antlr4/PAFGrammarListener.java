// Generated from PAFGrammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PAFGrammarParser}.
 */
public interface PAFGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(PAFGrammarParser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(PAFGrammarParser.FunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(PAFGrammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(PAFGrammarParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#parameters2}.
	 * @param ctx the parse tree
	 */
	void enterParameters2(PAFGrammarParser.Parameters2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#parameters2}.
	 * @param ctx the parse tree
	 */
	void exitParameters2(PAFGrammarParser.Parameters2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(PAFGrammarParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(PAFGrammarParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(PAFGrammarParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(PAFGrammarParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#printInstr}.
	 * @param ctx the parse tree
	 */
	void enterPrintInstr(PAFGrammarParser.PrintInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#printInstr}.
	 * @param ctx the parse tree
	 */
	void exitPrintInstr(PAFGrammarParser.PrintInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#operation1}.
	 * @param ctx the parse tree
	 */
	void enterOperation1(PAFGrammarParser.Operation1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#operation1}.
	 * @param ctx the parse tree
	 */
	void exitOperation1(PAFGrammarParser.Operation1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#operation2}.
	 * @param ctx the parse tree
	 */
	void enterOperation2(PAFGrammarParser.Operation2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#operation2}.
	 * @param ctx the parse tree
	 */
	void exitOperation2(PAFGrammarParser.Operation2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PAFGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PAFGrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#call_function}.
	 * @param ctx the parse tree
	 */
	void enterCall_function(PAFGrammarParser.Call_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#call_function}.
	 * @param ctx the parse tree
	 */
	void exitCall_function(PAFGrammarParser.Call_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(PAFGrammarParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(PAFGrammarParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void enterIf_condition(PAFGrammarParser.If_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void exitIf_condition(PAFGrammarParser.If_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#else_condition}.
	 * @param ctx the parse tree
	 */
	void enterElse_condition(PAFGrammarParser.Else_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#else_condition}.
	 * @param ctx the parse tree
	 */
	void exitElse_condition(PAFGrammarParser.Else_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(PAFGrammarParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(PAFGrammarParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#dowhile_loop}.
	 * @param ctx the parse tree
	 */
	void enterDowhile_loop(PAFGrammarParser.Dowhile_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#dowhile_loop}.
	 * @param ctx the parse tree
	 */
	void exitDowhile_loop(PAFGrammarParser.Dowhile_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(PAFGrammarParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(PAFGrammarParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#assigning}.
	 * @param ctx the parse tree
	 */
	void enterAssigning(PAFGrammarParser.AssigningContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#assigning}.
	 * @param ctx the parse tree
	 */
	void exitAssigning(PAFGrammarParser.AssigningContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(PAFGrammarParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(PAFGrammarParser.BoolContext ctx);
}