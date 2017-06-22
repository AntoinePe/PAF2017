
public class Bool {
	private boolean value;
	private Operation op1;
	private Operation op2;
	private String operator;
	private Variable variable;
	private String returnVariable;
	
	public Bool(String bool) {
		this.value = (bool.equals("True"));
	}
	
	public Bool(Operation op1, Operation op2, String operator){
		this.op1 = op1;
		this.op2 = op2;
		this.operator = operator;
	} 

	public Bool(Variable variable, Operation op2, String operator){
		this.variable = variable;
		this.op2 = op2;
		this.operator = operator;
	} 
	
	public String getReturnVariable() {
		return returnVariable;
	}
	
	public String toString(){
		if (op1 != null || variable != null)
			return this.returnVariable;
		else
			return this.value ? "1" : "0";
	} 
	
	private String operatorToAsm() {		
		if (operator != null) {
			if (operator.equals("<"))
				return "jb";
			else if (operator.equals(">"))
				return "ja";
			else if (operator.equals("<="))
				return "jbe";
			else if (operator.equals(">="))
				return "jae";
			else
				return "je";
		}
		return "";
	}
	
	public String toAsm(){
		String s = "";
		int i = 0;
		if (op1 != null) {
			s += op1.toAsm() + op2.toAsm();
			returnVariable = Assembly.getNewVariable("0");
			s += "\tpush " + returnVariable + "\n";
			s += "\tcmp " + op1.toString() + " " + op2.toString() + "\n";
			i = Assembly.updateNumberOfMains();
			Assembly.addNewBoolean("\tmov " + returnVariable + ",1\n\tjmp main" + i + "\n");
			s += "\t" + this.operatorToAsm() + " bool" + (Assembly.sizeBooleans()-1) + "\n";
			s += "\tmov " + returnVariable + ",0\n\tjmp main" + i + "\n\nmain" + i + ":\n";
			s += "\tpop " + op1.toString() + "\n\tpop " + op2.toString()+"\n";
			Assembly.deleteVariable(op1.toString());
			Assembly.deleteVariable(op2.toString());
		} else if (variable != null) {
			s += op2.toAsm();
			returnVariable = Assembly.getNewVariable("0");
			s += "\tpush " + returnVariable + "\n";
			s += "\tcmp " + variable.toString() + " " + op2.toString() + "\n";
			i = Assembly.updateNumberOfMains();
			Assembly.addNewBoolean("\tmov " + returnVariable + ",1\n\tjmp main" + i + "\n");
			s += "\t" + this.operatorToAsm() + " bool" + (Assembly.sizeBooleans()-1) + "\n";
			s += "\tmov " + returnVariable + ",0\n\tjmp main" + i + "\n\nmain" + i + ":\n";
			s += "\tpop " + op2.toString() + "\n";
			Assembly.deleteVariable(op2.toString());
		}
		return s;
	}
        
}
