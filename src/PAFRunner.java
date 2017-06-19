import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class PAFRunner {

	public static void main( String[] args) throws Exception {
		ANTLRInputStream input = new ANTLRInputStream("-3+232*1;2+3;2*3;3-1;");
		PAFGrammarLexer lexer = new PAFGrammarLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		PAFGrammarParser parser = new PAFGrammarParser(tokens);
		ParseTree tree = parser.instructions();
		System.out.println(tree.toStringTree(parser));

	}
	
}