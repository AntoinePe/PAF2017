
public class CallFunction {
	
	private String name;
	private Parameter param;
	private String operations;

	public CallFunction(String name, Parameter param) {
		this.name = name;
		this.param = param;
	}
	
	public CallFunction(String name) {
		this(name,null);
	}
	
	public String toString() {
		return this.name;
	}
	
	public void addToOperations(String value) {
		operations += value;
	}
	
	public String toAsm(Function function) {
		String s = "";
		String[] d;
		
		if (param !=null) {
			function.resetIndexOfFunctions();
			d = param.toAsm(function,0);
			s += d[0] + d[1];
		}
		s += "\tcall " + this.toString() + "\n";
		
		return s;
	}
	
}
