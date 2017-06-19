// Generated from PAFGrammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PAFGrammarParser}.
 */
public interface PAFGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PAFGrammarParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(@NotNull PAFGrammarParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link PAFGrammarParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(@NotNull PAFGrammarParser.SContext ctx);
}