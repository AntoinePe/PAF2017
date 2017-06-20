

public class Assigning {
	private Variable var;
	private Operation op;
	private Bool bool ;
	
	public Assigning(Variable a, Operation op) {
		this.var = a;
		this.op=op;
	}
	
	public Assigning(Variable a, Bool bool) {
		this.var = a;
		this.bool=bool ;
	}
 
	public String toString() {
		return var.toString() + " = " + ((op!=null) ? op.toString() : bool.toString());
	}
}