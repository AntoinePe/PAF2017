
public class Instructions {
	
	private Instruction instr;
	private Instructions instrs;
	
	public Instructions(Instruction instr, Instructions instrs) {
		this.instr = instr;
		this.instrs = instrs;
	}
	
	public Instructions(Instruction instr) {
		this(instr,null);
	}
	
	public String toString() {
		if (instrs == null)
			return instr.toString() + ";";
		else
			return instr.toString() + ";\n" + instrs.toString();
	}
	
	public String toAsm(Function function) {
		if (instrs == null)
			return instr.toAsm(function);
		else
			return instr.toAsm(function) + instrs.toAsm(function);
	}

}
