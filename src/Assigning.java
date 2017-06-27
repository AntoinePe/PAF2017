

public class Assigning {
	private Variable var;
	private Operation op;
	private Bool bool ;
	private Function lambdaFunction;
	
	public Assigning(Function lambdaFunction) {
		this.lambdaFunction = lambdaFunction;
		this.var = null;
		this.op = null;
	}
	
	public Assigning(Variable a, Operation op) {
		this.var = a;
		this.op=op;
		this.lambdaFunction = null;
	}
	
	public Assigning(Variable a, Bool bool) {
		this.var = a;
		this.bool = bool;
		this.lambdaFunction = null;
	}
 
	public String toString() {
		return var.toString() + " = " + ((op!=null) ? op.toString() : bool.toString());
	}
	
	public String toAsm(Function function) {
		String s = "", c = "" , d = "", e = "";

		if (lambdaFunction != null)
			function.addALambdaFunction(lambdaFunction.toAsm());
		else {
			if (!function.containsVariable(var.toString()))
				function.addToVariables(var.toString());
			
			if (op != null) {
				s += op.toAsm(function);
				
				c = op.getReturnVariable();
				d = "[ebp-" + function.getIdOfVariable(var.toString()) + "]";
				
				if (!d.equals(c)) {
					if (c.startsWith("[")) {
						e = Assembly.getNewVariable();
						s += "\tmov " + e + "," + c + "\n";
						s += "\tmov " + d + "," + e + "\n";
					} else 
						s += "\tmov " + d +", " + c;
				}
			} else {
				s += bool.toAsm(function,true);
				s += "\tmov [ebp-" + function.getIdOfVariable(var.toString()) + "], " + bool.getReturnVariable();
			}
			s += "\n";
		}
		return s;
	}
}