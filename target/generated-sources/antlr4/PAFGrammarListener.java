// Generated from PAFGrammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PAFGrammarParser}.
 */
public interface PAFGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(@NotNull PAFGrammarParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(@NotNull PAFGrammarParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull PAFGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull PAFGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#operation2}.
	 * @param ctx the parse tree
	 */
	void enterOperation2(@NotNull PAFGrammarParser.Operation2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#operation2}.
	 * @param ctx the parse tree
	 */
	void exitOperation2(@NotNull PAFGrammarParser.Operation2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#operation1}.
	 * @param ctx the parse tree
	 */
	void enterOperation1(@NotNull PAFGrammarParser.Operation1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#operation1}.
	 * @param ctx the parse tree
	 */
	void exitOperation1(@NotNull PAFGrammarParser.Operation1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(@NotNull PAFGrammarParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(@NotNull PAFGrammarParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(@NotNull PAFGrammarParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(@NotNull PAFGrammarParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull PAFGrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull PAFGrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(@NotNull PAFGrammarParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(@NotNull PAFGrammarParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#else_condition}.
	 * @param ctx the parse tree
	 */
	void enterElse_condition(@NotNull PAFGrammarParser.Else_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#else_condition}.
	 * @param ctx the parse tree
	 */
	void exitElse_condition(@NotNull PAFGrammarParser.Else_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#assigning}.
	 * @param ctx the parse tree
	 */
	void enterAssigning(@NotNull PAFGrammarParser.AssigningContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#assigning}.
	 * @param ctx the parse tree
	 */
	void exitAssigning(@NotNull PAFGrammarParser.AssigningContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void enterIf_condition(@NotNull PAFGrammarParser.If_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void exitIf_condition(@NotNull PAFGrammarParser.If_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#dowhile_loop}.
	 * @param ctx the parse tree
	 */
	void enterDowhile_loop(@NotNull PAFGrammarParser.Dowhile_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#dowhile_loop}.
	 * @param ctx the parse tree
	 */
	void exitDowhile_loop(@NotNull PAFGrammarParser.Dowhile_loopContext ctx);
}