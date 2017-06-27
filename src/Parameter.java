
public class Parameter {
	
	private Operation op;
	private Parameter param;
	
	public Parameter(Operation op, Parameter param) {
		this.op = op;
		this.param = param;
	}
	
	public Parameter(Operation op) {
		this(op,null);
	}
	
	public String toAsm(Function function, int iter) {
		String s = "", variableOfOperation = "";
	
		
		int i = function.updateIndexOfFunctions();
		
		s += op.toAsm(function);
		
		variableOfOperation = op.getReturnVariable();

		
		if (function.getRegistersOfParameters()[i].startsWith("[")) {
			String returnVariable = Assembly.getNewVariable();
			s +=  "\tmov "+ returnVariable + "," + variableOfOperation + "\n";
			s += "\tmov " + function.getRegistersOfParameters()[i] + ", " + returnVariable + "\n";
		} else {
			s += "\tmov " + function.getRegistersOfParameters()[i] + ", " + variableOfOperation + "\n";
		}
		
		if (param != null)
			s += param.toAsm(function,iter+1);
		else
			function.resetIndexOfFunctions();
		return s;
	}

}
