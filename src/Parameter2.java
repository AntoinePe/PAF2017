
public class Parameter2 {
	
	private Variable var;
	private String type;
	private Parameter2 param;
	
	public Parameter2(Variable var, String type, Parameter2 param) {
		this.var = var;
		this.type = type;
		this.param = param;
	}
	
	public Parameter2(Variable var, String type) {
		this(var,type,null);
	}
	
	public String toAsm(Function function) {
		String s = "", variableOfOperation = "";
				
		variableOfOperation = var.toString();
				
		if (!function.containsVariable(variableOfOperation))
			function.addToVariables(variableOfOperation);
		
		int i = function.updateIndex();
		
		
		if (function.getRegistersOfParameters()[i].startsWith("[")) {
			String returnVariable = Assembly.getNewVariable();
			s +=  "\tmov "+ returnVariable + "," + function.getRegistersOfParameters()[i] + "\n";
			s += "\tmov [ebp-" + function.getIdOfVariable(variableOfOperation) + "], " + returnVariable + "\n";
		} else {
			s += "\tmov [ebp-" + function.getIdOfVariable(var.toString()) + "], " + function.getRegistersOfParameters()[i]+ "\n";
		}
				
		if (param != null)
			s += param.toAsm(function);
		return s;
	}

}
