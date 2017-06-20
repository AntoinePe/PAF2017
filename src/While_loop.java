
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
	public String toAsm() {
		// TODO Auto-generated method stub
		return null;
	}

}
