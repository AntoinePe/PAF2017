
public class For_loop extends Loop {
	
	private Bool bool;
	private Assigning value;
	private int number;
	private Instructions instructions;
	
	
	public For_loop(Bool bool, Assigning value, String number, Instructions instructions) {
		this.bool = bool;
		this.value = value;
		this.number = Integer.parseInt(number);
		this.instructions = instructions;
	}
	
	public String toString() {
		return "for (" + value.toString() + " / " + bool.toString()
		+ " / " + number + ") BEGIN\n\t" + instructions.toString()
		+ "\nEND";
	}
	
	@Override
	public String toAsm() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
