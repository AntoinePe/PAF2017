
public class Term {
	
	private Operation var;
	private String lp, rp;
	private int number;
	private Variable variable;
	
	public Term(Operation var, String lp, String rp) {
		this.var = var;
		this.lp = lp;
		this.rp = rp;
	}
	
	public Term(String number){
		this.number = Integer.parseInt(number);
	}
	
	public Term(String number, String minus) {
		this.number = -Integer.parseInt(number);
	}

	public Term(Variable variable) {
		this.variable = variable;
	}
	
	public String toString() {
		if (lp != null && rp != null)
			return lp + var.toString() + rp;
		else if (variable != null)
			return variable.toString();
		else
			return Integer.toString(number);
	}
	
	public String toAsm() {
		return null;
	}
}
