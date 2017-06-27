
public class For_loop extends Loop {
	
	private Bool bool;
	private Assigning value;
	private Assigning assign;
	private Instructions instructions;
	
	
	public For_loop(Bool bool, Assigning value, Assigning assign, Instructions instructions) {
		this.bool = bool;
		this.value = value;
		this.assign = assign;
		this.instructions = instructions;
	}
	
	public String toString() {
		return "for (" + value.toString() + " / " + bool.toString()
		+ " / " + assign.toString() + ") BEGIN\n\t" + instructions.toString()
		+ "\nEND";
	}
	
	@Override
	public String toAsm(Function function) {
		String s = "";
		
		s += value.toAsm(function);
		
		int i = Assembly.updateNumberOfL(), j = Assembly.updateNumberOfL();
		
		s += ".L" + i + ":\n";
		s += bool.toAsm(function,false);
		s += "\t" + bool.getOperatorToVariable() + " .L" + j + "\n";
		s += instructions.toAsm(function);
		s += assign.toAsm(function);
		s += "\tjmp .L" + i + "\n";
		s += ".L" + j + ":\n";
		
		return s;
	}
	
	
	

}
