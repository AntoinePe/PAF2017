
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
	
	public String toString() {
		if (cond != null)
			return cond.toString();
		else if (forLoop != null)
			return forLoop.toString();
		else if (whileLoop != null)
			return whileLoop.toString();
		else if (var != null) 
			return var.toString();
		else
			return op.toString();
	}
	
	public String toAsm(Function function) {
		String s = "", c = "";
		if (cond != null)
			s += cond.toAsm(function);
		else if (forLoop != null)
			s += forLoop.toAsm(function);
		else if (whileLoop != null)
			s += whileLoop.toAsm(function);
		else if (doWhileLoop != null)
			s += doWhileLoop.toAsm(function);
		else if (var != null) 
			s += var.toAsm(function);
		else {
			s += op.toAsm(function);
			c = op.getReturnVariable();
			s += "\tpush " + (c.startsWith("[") ? "dword " : "") + c + "\n";
			s += "\tpush dword message\n";
			s += "\tcall " + (PAFRunner.OS.indexOf("mac") >= 0 ? "_" : "") + "printf";
			s += "\n\tadd esp,8\n";
		}
		return s;
	}

}
