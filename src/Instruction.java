
public class Instruction {
	
	private Condition cond = null;
	private For_loop  forLoop = null;
	private While_loop whileLoop = null;
	private Dowhile_loop doWhileLoop = null;
	private Assigning var = null;
	private Operation op = null;
	private String result, variable;
	private int newLine;
	private CallFunction callFunction;
	
	public Instruction(CallFunction callFunction) {
		this.callFunction = callFunction;
	}

	public Instruction(String result, String variable) {
		this.result = result;
		this.variable = variable;
	}
	
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

	public Instruction(Operation op, int newLine) {
		this.op = op;
		this.newLine = newLine;
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
		int i = 0;
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
		else if (callFunction != null)
			s += callFunction.toAsm(function);
		else if (result != null && variable != null) {
			i = Assembly.updateNumberOfScan();
			Assembly.addGlobalVariable("result" + i + ": db " + result + ",0\n");
			Assembly.addGlobalVariable("input: times 4 db 0\n");
			
			if (result.contains("%s")) {
				s += "\tpush dword " + function.getName() + "." + variable + "\n";
			} else {
				s += "\tpush dword input\n";
			}
			s += "\tpush dword result" + i + "\n";
			s += "\tcall " + (PAFRunner.OS.indexOf("mac") >= 0 ? "_" : "") + "scanf";
			s += "\n\tadd esp,8\n";
			
			c =  Assembly.getNewVariable();
			if (!result.contains("%s")) {
				s += "\tmov " + c + ",[input]\n";
				s += "\tmov [ebp-" + function.getIdOfVariable(variable) + "], " + c + "\n";
			}
			
		} else {
			s += op.toAsm(function,true);
			c = op.getReturnVariable();
			s += "\tpush " + (c.startsWith("[") ? "dword " : "") + c + "\n";
			s += "\tpush dword " + ((c.startsWith(".") || c.startsWith(function.getName())) ? "stringMessage" : "intMessage") + (newLine == 1 ? "L" : "") + "\n";
			s += "\tcall " + (PAFRunner.OS.indexOf("mac") >= 0 ? "_" : "") + "printf";
			s += "\n\tadd esp,8\n";
		}
		return s;
	}

}
