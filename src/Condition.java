
public class Condition {
	private Bool ifCond;
	private boolean isElse = false, gotElse = true;
	private Instructions instructions;
	private Condition elseCond;
	
	public Condition(Bool ifCond, Instructions instructions, Condition elseCond) {
		this.ifCond = ifCond;
		this.instructions = instructions;
		this.elseCond = elseCond;		
	}
	
	public Condition(Bool ifCond, Instructions instructions) {
		this(ifCond, instructions, null);
		gotElse = false;
	}
	
	public Condition(Instructions instructions) {
		this(null, instructions, null);
		this.isElse = true;
		this.gotElse = false;
	}
	
	
	public String toString() {
		if (isElse) {
			return ("else [\n\t" + instructions.toString() + "\n]");
		} else if(gotElse) {
			return("if (" +  ifCond.toString() +  ") then $\n\t" + instructions.toString() + "\n$ " + elseCond.toString());
		} else {
			return("if (" +  ifCond.toString() +  ") then $\n\t" + instructions.toString() + "\n$");
		}
	}
	
	public String toAsm() {
		return null;
	}
}
