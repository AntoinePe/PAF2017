
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
	public String toAsm() {
		return null;
	}

}
