import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class PAFRunner {

	@SuppressWarnings("deprecation")
	public static void main( String[] args) throws Exception {
		ANTLRInputStream input = new ANTLRInputStream("if(5==5)then$5*3$;");
		PAFGrammarLexer lexer = new PAFGrammarLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		PAFGrammarParser parser = new PAFGrammarParser(tokens);
		ParseTree tree = parser.instructions();
		System.out.println(tree.toStringTree(parser));

	}
	
}