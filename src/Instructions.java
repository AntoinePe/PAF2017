
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

}
