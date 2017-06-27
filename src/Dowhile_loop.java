
public class Dowhile_loop extends Loop {
	
	private Bool bool;
	private Instructions instructions;
	
	public Dowhile_loop(Bool bool, Instructions instructions) {
		this.bool = bool;
		this.instructions = instructions;
	}
	
	public String toString() {
		return "do $\n\t" + instructions.toString()
		+ "\n$ while (" + bool.toString() + ")";
	}

	@Override
	public String toAsm(Function function) {
		String s = "", c = "";
		
		int i = Assembly.updateNumberOfL(), j = Assembly.updateNumberOfL();
		
		s += ".L" + i + ":\n";
		s += instructions.toAsm(function);
		s += "\tjmp .L" + j + "\n";
		s += ".L" + j + ":\n";
		s += bool.toAsm(function,false);
		s += "\t" + bool.roperatorToAsm() + " .L" + i + "\n";
		
		return s;
	}

}
