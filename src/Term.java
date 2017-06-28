
public class Term {
	
	private Operation var;
	private String lp, rp, returnVariable;
	private int number;
	private Variable variable;
	private CallFunction callFunction;
	private Bool cond;
	private Term ifTrue, ifFalse;
	
	public Term(Bool cond, Term ifTrue, Term ifFalse) {
		this.cond = cond;
		this.ifFalse = ifFalse;
		this.ifTrue = ifTrue;
	}
	
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
	
	public String toAsm(Function function, boolean useRegister) {
		String s = "";
		int i = 0;
		
		if (cond != null) {			
			s += ifFalse.toAsm(function, true) + ifTrue.toAsm(function, true) + cond.toAsm(function, false);
			returnVariable = Assembly.getNewVariable();
			s += "\tmov " + returnVariable + "," + ifFalse.getReturnVariable() + "\n";
			s += "\tcmov" + cond.roperatorToAsm().replaceAll("j", "") + " " + returnVariable + "," + ifTrue.getReturnVariable();
		} else if (lp != null && rp != null) {
			s = var.toAsm(function,useRegister);
			returnVariable = var.getReturnVariable();
		} else if (variable != null) {
			if (function.isString(variable.toString()))
				returnVariable = "." + function.getName() + "." + variable.toString();
			else if (Assembly.containsUnassignedVariable(function.getName() + "." + variable.toString()))
				returnVariable = function.getName() + "." + variable.toString();
			else
				returnVariable = "[ebp-" + function.getIdOfVariable(variable.toString()) + "]";
		} else if (callFunction != null) {
			s += callFunction.toAsm(function);
			i = function.updateIndex2();
			if (function.getRegistersOfParameters2()[i].equals("[esp+16]"))
				function.is32(true);
			s += "\tmov " + function.getRegistersOfParameters2()[i] + ",eax\n";
			returnVariable = function.getRegistersOfParameters2()[i];
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
