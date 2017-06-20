
public class Bool {
	private boolean value;
	private Operation op1;
	private Operation op2;
	private String operator;
	private Variable variable;
	
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
	
	public String toString(){
		if (op1 != null)
			return this.op1.toString() + " " + this.operator + " " + this.op2.toString();
		else if (variable != null)
			return variable.toString() + " " + operator + " " + op2.toString();
		else
			return this.value ? "True" : "False";
	} 
	
	public String toAsm(){
		//Renvoie la traduction en assembleur
		return null;
	}
        
}
