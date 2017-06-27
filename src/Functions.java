
public class Functions {
	
	private Function func;
	private Functions funcs;
	
	public Functions(Function func, Functions funcs) {
		this.func = func;
		this.funcs = funcs;
	}
	
	public Functions(Function func) {
		this(func,null);
	}
	
	public String toAsm() {
		if (funcs == null)
			return func.toAsm();
		else
			return func.toAsm() + "\n"+ funcs.toAsm();
	}

}
