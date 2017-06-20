
public class Bool {
	private int value;
	private Operation op1;
	private Operation op2;
	private String operator;
	
	
	public Bool(String bool){
		if(bool == 'True') this.value = 'True';
		else this.value = 'False';
	}
	
	public Bool(Operation op1, Operation op2, String operator){
		this.op1 = op1;
		this.op2 = op2;
		this.operator = operator;
	}
	
	public String toString(){
		if(this.value != null){
			return this.value;
		}else{
			return this.op1.toString() + this.operator + this.op2.toString();
		}
	}
	
	public String toAsm(){
		//Renvoie la traduction en assembleur
		return null;
	}
	
}
