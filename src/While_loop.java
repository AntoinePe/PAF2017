
public class While_loop extends Loop {
	
	private Bool bool;
	private Instructions instructions;
	
	public While_loop(Bool bool, Instructions instructions) {
		this.bool = bool;
		this.instructions = instructions;
	}

	public String toString() {
		return "while (" + bool.toString() + ") $\n\t"
				+ instructions.toString()
				+ "\n$";
	}

	@Override
	public String toAsm(Function function) {
		String s = "";
		
		int i = Assembly.updateNumberOfL(), j = Assembly.updateNumberOfL();
		
		s += ".L" + i + ":\n";
		s += bool.toAsm(function,false);
		s += "\t" + bool.getOperatorToVariable() + " .L" + j + "\n";
		s += instructions.toAsm(function);
		s += "\tjmp .L" + i + "\n";
		s += ".L" + j + ":\n";
		
		return s;
	}

}
