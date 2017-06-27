
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
			return ("else BEGIN\n\t" + instructions.toString() + "\nEND");
		} else if(gotElse) {
			return("if (" +  ifCond.toString() +  ") then BEGIN\n\t" + instructions.toString() + "\nEND " + elseCond.toString());
		} else {
			return("if (" +  ifCond.toString() +  ") then BEGIN\n\t" + instructions.toString() + "\nEND");
		}
	}
	
	public String toAsm(Function function) {
		String s = "", c = "";
		int i = 0, j = 0;
		if (isElse) {
			s += instructions.toAsm(function);
		} else if(gotElse) {
			s += ifCond.toAsm(function,false);
			
			i = Assembly.updateNumberOfL();
			j = Assembly.updateNumberOfL();
			
			c = instructions.toAsm(function);
			
			s += "\t" + ifCond.getOperatorToVariable() + " .L" + i + "\n";
			s += instructions.toAsm(function);
			s += "\tjmp .L" + j + "\n";
			s += ".L" + i + ":\n";
			s += elseCond.toAsm(function);
			s += ".L" + j + ":\n";
		} else {
			s += ifCond.toAsm(function,false);
			
			i = Assembly.updateNumberOfL();
			
			s += "\t" + ifCond.getOperatorToVariable() + " .L" + i + "\n";
			s += instructions.toAsm(function);
			s += ".L" + i + ":\n";
		}
		return s;
	}
}
