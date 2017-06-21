import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class PAFRunner {

	public static void main( String[] args) throws Exception {
		
		String s = "";
	    Scanner scan = new Scanner(new File("in.txt"));
	    while (scan.hasNextLine()) {
	      s += scan.nextLine() + "\n";
	    }
	    scan.close();
	    
		CharStream input = new ANTLRInputStream(s);
		PAFGrammarLexer lexer = new PAFGrammarLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		PAFGrammarParser parser = new PAFGrammarParser(tokens);
	    PAFGrammarParser.InstructionsContext tree = parser.instructions();
	    
	    BufferedWriter out = new BufferedWriter(new FileWriter(new File("out.txt")));
	    String assemb = tree.instrs.toAsm();
	    out.write("extern printf\n" + Assembly.sectionData() + "section .text\nglobal main\n\nmain :\n" + assemb + "\tret");
	    out.close();
	    
	}
	
}