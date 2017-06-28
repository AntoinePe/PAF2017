
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
	
	public String[] toAsm(Function function, int iter) {
		String[] s = {"",""}, d;
		String variableOfOperation = "";
		int i = 0;
	
		
		i = iter;
		
		s[0] += op.toAsm(function,false);
		
		variableOfOperation = op.getReturnVariable();
				
		if (function.getRegistersOfParameters()[i].startsWith("[")) {
			String returnVariable = Assembly.getNewVariable();
			s[1] +=  "\tmov "+ returnVariable + "," + variableOfOperation + "\n";
			s[1] += "\tmov " + function.getRegistersOfParameters()[i] + ", " + returnVariable + "\n";
		} else {
			s[1] += "\tmov " + function.getRegistersOfParameters()[i] + ", " + variableOfOperation + "\n";
		}
		
		if (param != null)  {
			d = param.toAsm(function,iter+1);
			s[0] += d[0]; 
			s[1] += d[1];
		}
					
		return s;
	}

}
