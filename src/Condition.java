
public class Condition {
	private Bool ifCond;
	private boolean isElse = false, gotElse = true;
	private Instructions instructions;
	private Condition elseCond;
	private int nextMain;
	
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
	
	private int getNextMain() {
		return nextMain;
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
	
	public String toAsm() {
		String s = "";
		if (isElse) {
			s += instructions.toAsm();
			nextMain = Assembly.getNumberOfMains();
			s += "\tjmp _main" + nextMain + "\n\n_main" + nextMain + ":\n";
		} else if(gotElse) {
			s += ifCond.toAsm();
			s += "\tcmp " + ifCond.getReturnVariable() + ",1\n";
			nextMain = Assembly.updateNumberOfMains();

			Assembly.addCondition(instructions.toAsm() + "\tjmp _main" + nextMain + "\n");
			
			s += "\tje _condition" + (Assembly.sizeConditions()-1) + "\n";
			s += elseCond.toAsm();
		} else {
			s += ifCond.toAsm();
			nextMain = Assembly.updateNumberOfMains();
			s += "\tcmp " + ifCond.getReturnVariable() + ",1\n";
			Assembly.addCondition(instructions.toAsm() + "\tjmp _main" + nextMain + "\n");
			s += "\tje condition" + (Assembly.sizeConditions()-1) + "\n";
			s += "\tjmp _main" + nextMain + "\n\n_main" + nextMain + ":";
		}
		return s;
	}
}
