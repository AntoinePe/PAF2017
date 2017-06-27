
public class CallFunction {
	
	private String name;
	private Parameter param;

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
	
	public String toAsm(Function function) {
		String s = "";
		
		if (param !=null)
			s += param.toAsm(function, 1);
		s += "\tcall " + this.toString() + "\n";
		
		return s;
	}
	
}
