
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
	
	public String toAsm() {
		String s = "", c = "";
		if (cond != null)
			s += cond.toAsm();
		else if (forLoop != null)
			s += forLoop.toAsm();
		else if (whileLoop != null)
			s += whileLoop.toAsm();
		else if (var != null) 
			s += var.toAsm();
		else {
			s += op.toAsm();
			s += "\tmov ebp,esp\n";
			s += "\tand esp,0xFFFFFFF0\n";
			s += "\tsub esp,16\n";
			s += "\tmov dword[esp],message\n";
			
			if (op.getReturnVariable().startsWith("[")) {
				c = Assembly.getNewVariable("forPrint");
				s += "\tmov " + c + "," + op.getReturnVariable() + "\n";
				s += "\tmov dword[esp+4]," + c + "\n";
			} else
				s += "\tmov dword[esp+4]," + op.getReturnVariable() + "\n";
			
			s += "\tcall " + (PAFRunner.OS.equals("MACOS") ? "_" : "") + "printf";
			
			if (!c.isEmpty()) {
				s += "\n\t pop " + c;
				Assembly.deleteVariable(c);
			}
		}
		return s;
	}

}
