

public class Assigning {
	private Variable var;
	private Operation op;
	private Bool bool ;
	private Function lambdaFunction;
	private String valueOfString;
	
	public Assigning(Variable a) {
		this.var = a;
		this.valueOfString = null;
		this.op = null;
		this.bool = null;
		this.lambdaFunction = null;
	}
	
	public Assigning(Variable a, String valueOfString) {
		this.var = a;
		this.valueOfString = valueOfString;
	}
	
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
		else if (lambdaFunction == null && op == null && bool == null && valueOfString == null) {
			Assembly.addUnassignedVariable(function.getName() + "." + var.toString());
		}
		else {
			if (!function.containsVariable(var.toString()))
				function.addToVariables(var.toString());
			
			if (valueOfString != null) {
				function.addAString(var.toString(),"db " + valueOfString + ",0\n");
			} else if (op != null) {
				s += op.toAsm(function,true);
				
				c = op.getReturnVariable();
				d = "[ebp-" + function.getIdOfVariable(var.toString()) + "]";
				
				if (!d.equals(c)) {
					if (c.startsWith("[")) {
						e = Assembly.getNewVariable();
						s += "\tmov " + e + "," + c + "\n";
						s += "\tmov dword " + d + "," + e + "\n";
					} else 
						s += "\tmov dword " + d +", " + c;
				}
			} else {
				s += bool.toAsm(function,true);
				s += "\tmov dword [ebp-" + function.getIdOfVariable(var.toString()) + "], " + bool.getReturnVariable();
			}
			s += "\n";
		}
		return s;
	}
}