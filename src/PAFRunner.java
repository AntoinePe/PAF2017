import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class PAFRunner {

	public static void main( String[] args) throws Exception {
		ANTLRInputStream input = new ANTLRInputStream("for(x=2/x<4/x=x+1)$if(3<4)then$3+4;$else[v=1;];$;");
		PAFGrammarLexer lexer = new PAFGrammarLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		PAFGrammarParser parser = new PAFGrammarParser(tokens);
		ParseTree tree = parser.instructions();
		System.out.println(tree.toStringTree(parser));

	}
	
}