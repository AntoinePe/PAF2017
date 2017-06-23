import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class PAFRunner {
	
	public static String OS = "MACOS";


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
	    
	    File file = new File("PAF.asm");
	    BufferedWriter out = new BufferedWriter(new FileWriter(file));
	    String assemb = tree.instrs.toAsm();
	    Assembly.addToMain(assemb);
	    out.write(Assembly.toAsm());
	    out.close();
	    
	    String makeFile = "";
	    if (OS.equals("MACOS"))
	    	makeFile = "all:\n\tnasm -f macho -o PAF.o PAF.asm && ld -o PAF PAF.o -arch i386 -lc -macosx_version_min 10.6";
	    else
	    	makeFile = "all:\n\tnasm -g -felf32 PAF.asm && ld -melf_i386 -I/lib/ld-linux.so.2 -lc --entry start PAF.o";
	    
	    File file2 = new File("makefile");
	    BufferedWriter out2 = new BufferedWriter(new FileWriter(file2));
	    out2.write(makeFile);
	    out2.close();
	    

	    
	}
	
}