
public class Term {
	
	private Operation var;
	private String lp, rp, returnVariable;
	private int number;
	private Variable variable;
	private CallFunction callFunction;
	private static String[] registersOfParameters = {"[esp+16]","[esp+12]","[esp+8]","[esp+4]","edi","esi","edx","ecx","ebx","eax"};
	private static int indexOfParameter = -1;
	
	public Term(Operation var, String lp, String rp) {
		this.var = var;
		this.lp = lp;
		this.rp = rp;
	}
	
	public Term(String number){
		this.number = Integer.parseInt(number);
	}
	
	public Term(String number, String minus) {
		this.number = -Integer.parseInt(number);
	}

	public Term(Variable variable) {
		this.variable = variable;
	}
	
	public Term(CallFunction callFunction) {
		this.callFunction = callFunction;
	}
	
	public String getReturnVariable() {
		return this.returnVariable;
	}
	
	public static int updateIndex() {
		indexOfParameter++;
		if (indexOfParameter >= registersOfParameters.length)
			indexOfParameter = 0;
		return indexOfParameter;
	}
	
	public String toAsm(Function function, boolean useRegister) {
		String s = "";
		if (lp != null && rp != null) {
			s = var.toAsm(function);
			returnVariable = var.getReturnVariable();
		} else if (variable != null) {
			returnVariable = "[ebp-" + function.getIdOfVariable(variable.toString()) + "]";
		} else if (callFunction != null) {
			s += callFunction.toAsm(function);
			s += "\tmov " + registersOfParameters[updateIndex()] + ",eax\n";
			returnVariable = registersOfParameters[indexOfParameter];
		} else {
			if (useRegister) {
				returnVariable = Assembly.getNewVariable();
				s =  "\tmov "+ returnVariable + "," + Integer.toString(number) + "\n";
			} else
				returnVariable = Integer.toString(number);
		}
		return s;
	}
}
