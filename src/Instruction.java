
public class Instruction {
	
	private Condition cond = null;
	private For_loop  forLoop = null;
	private While_loop whileLoop = null;
	private Dowhile_loop doWhileLoop = null;
	private Assigning var = null;
	private Operation op = null;
	
	public Instruction(Condition cond) {
		this.cond = cond;
	}

	public Instruction(For_loop forLoop) {
		this.forLoop = forLoop;
	}

	public Instruction(While_loop whileLoop) {
		this.whileLoop = whileLoop;
	}

	public Instruction(Dowhile_loop doWhileLoop) {
		this.doWhileLoop = doWhileLoop;
	}

	public Instruction(Assigning var) {
		this.var = var;
	}

	public Instruction(Operation op) {
		this.op = op;
	}

}
