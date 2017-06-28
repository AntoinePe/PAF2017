
public class Bool {
	private boolean value;
	private Operation op1, op2;
	private Variable variable;
	private String operator, returnVariable, operatorToVariable = "";
	private Bool bool1, bool2;
	
	public Bool(Bool bool1, Bool bool2, String operator) {
		this.bool1 = bool1;
		this.bool2 = bool2;
		this.operator = operator;
	}
	
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
	
	public String roperatorToAsm() {		
		if (operator != null) {
			if (operator.equals("<"))
				operatorToVariable = "jl";
			else if (operator.equals(">"))
				operatorToVariable = "jg";
			else if (operator.equals("<="))
				operatorToVariable = "jle";
			else if (operator.equals(">="))
				operatorToVariable = "jge";
			else if (operator.equals("!="))
				operatorToVariable = "jne";
			else if (operator.equals("&&"))
				operatorToVariable = "and";
			else if (operator.equals("||"))
				operatorToVariable = "or";
			else
				operatorToVariable = "je";
		}
		return operatorToVariable;
	}
	
	private String operatorToAsm() {		
		if (operator != null) {
			if (operator.equals("<"))
				operatorToVariable = "jge";
			else if (operator.equals(">"))
				operatorToVariable = "jle";
			else if (operator.equals("<="))
				operatorToVariable = "jg";
			else if (operator.equals(">="))
				operatorToVariable = "jl";
			else if (operator.equals("!="))
				operatorToVariable = "je";
			else if (operator.equals("&&"))
				operatorToVariable = "or";
			else if (operator.equals("||"))
				operatorToVariable = "and";
			else
				operatorToVariable = "jne";
		}
		return operatorToVariable;
	}
	
	public String getOperatorToVariable() {
		return operatorToVariable;
	}

	public String toAsm(Function function,boolean usedInAssigning){
		String s = "", c = "", returnVariable1 = "", returnVariable2 = "", d = "";
		int i = 0, j = 0;
		
		d = this.operatorToAsm();
		
		if (bool1 != null && bool2 != null) {
			s += bool1.toAsm(function,usedInAssigning) + bool2.toAsm(function,usedInAssigning);
			
			returnVariable = Assembly.getNewVariable();
			
			returnVariable1 = bool1.getReturnVariable();
			returnVariable2 = bool2.getReturnVariable();
			
			if (returnVariable1.startsWith("[") && returnVariable2.startsWith("[")) {
				c = Assembly.getNewVariable();
				s += "\tmov " + c + ", " + returnVariable2 + "\n";
			} else {
				c = returnVariable2;
			}
			
			s += "\tmov " + returnVariable + "," + returnVariable1 + "\n";
			s += "\t" + this.operatorToAsm() + " " + returnVariable + ", " + c + "\n";
					
			if (!usedInAssigning) {
				s += "\tcmp " + returnVariable + ",1\n";
			}
		} else if (op1 != null) {
			s += op1.toAsm(function,true) + op2.toAsm(function,true);
			
			returnVariable = Assembly.getNewVariable();
			
			returnVariable1 = op1.getReturnVariable();
			returnVariable2 = op2.getReturnVariable();
			
			if (returnVariable1.startsWith("[") && returnVariable2.startsWith("[")) {
				c = Assembly.getNewVariable();
				s += "\tmov " + c + ", " + returnVariable2 + "\n";
			} else {
				c = returnVariable2;
			}
			
			s += "\tcmp " + returnVariable1 + ", " + c + "\n";
			if (usedInAssigning) {
				i = Assembly.updateNumberOfL();
				j = Assembly.updateNumberOfL();
				s += "\t" + d + " .L" + i + "\n";
				s += "\tmov " + returnVariable + ",1\n\tjmp .L" + j;
				s += "\n.L" + i + ":\n\tmov " + returnVariable + ",0\n";
				s += ".L" + j + ":\n";
			}
		} else if (variable != null) {
			s += op2.toAsm(function,true);
						
			returnVariable = Assembly.getNewVariable();
			
			returnVariable2 = op2.getReturnVariable();
			
			if (returnVariable2.startsWith("[")) {
				c = Assembly.getNewVariable();
				s += "\tmov " + c + ", " + returnVariable2 + "\n";
			} else {
				c = returnVariable2;
			}
			
			s += "\tcmp [ebp-" + function.getIdOfVariable(variable.toString()) + "], " + c + "\n";
			
			if (usedInAssigning) {
				i = Assembly.updateNumberOfL();
				j = Assembly.updateNumberOfL();
				s += "\t" + d + " .L" + i + "\n";
				s += "\tmov " + returnVariable + ",1\n\tjmp .L" + j;
				s += "\n.L" + i + ":\n\tmov " + returnVariable + ",0\n";
				s += ".L" + j + ":\n";
			}
			
		} else 
			returnVariable =  this.value ? "1" : "0";
		return s;
	}
        
}
