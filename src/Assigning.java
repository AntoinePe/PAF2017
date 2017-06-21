

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
	

	public String toAsm() {
		String s = "";
		String c = "";
		
		Assembly.addGlobalVariable(var.toString());
		
		if (op != null) {
			s += op.toAsm();
			c = (op.getReturnVariable() != null ? op.getReturnVariable() : op.toString());
			if (!("[" + var.toString() + "]").equals(c))
				s += "\tmov [" + var.toString() + "], " + c;
		} else
			s += "\tmov [" + var.toString() + "], " + (bool.toString().equals("True") ? 1 : 0);
		return s;
	}
}