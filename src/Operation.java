import java.util.ArrayList;

public class Operation {
	
	private Operation term1;
	private Operation term2;
	private String op;
	private Term term;
	private String returnVariable;
	
	public Operation(Operation term1, Operation term2, String op) {
		this.term1 = term1;
		this.term2 = term2;
		this.op = op;
	}
	
	public Operation(Term term, Operation term1, String op) {
		this.term = term;
		this.term1 = term1;
		this.op = op;
	}
	
	public Operation (Term term) {
		this(term,null,null);
	}
	
	public Term getTerm() {
		return term;
	}

	public Operation getTerm1() {
		return term1;
	}

	public Operation getTerm2() {
		return term2;
	}

	public String getOp() {
		return op;
	}
	
	public String getReturnVariable() {
		return returnVariable;
	}

	public String toString() {
		return this.getReturnVariable();
	}
	
	private String opToAsm() {		
		if (op != null) {
			if (op.equals("+"))
				return "add";
			else if (op.equals("-"))
				return "sub";
			else if (op.equals(":"))
				return "idiv";
			else if (op.equals("%"))
				return "%idiv";
			else
				return "imul";
		}
		return "";
	}
	
	public String toAsm(Function function) {
		String s = "" , termAsm = "", c = "";
		if (op == null && term != null) {
			termAsm = term.toAsm(function,true);
			s += (termAsm.isEmpty() ? "" : termAsm + "\n");
			returnVariable = term.getReturnVariable();
		} else {
			termAsm = term.toAsm(function,false);
			s += term1.toAsm(function) + (termAsm.isEmpty() ? "" : termAsm);
			
			if (!term1.getReturnVariable().startsWith("[")){
				returnVariable = term1.getReturnVariable();
				c = Assembly.getNewVariable();
			} else {
				returnVariable = Assembly.getNewVariable();
				s += "\tmov " + returnVariable + "," + term1.getReturnVariable() + "\n";
			}

			if (this.opToAsm().equals("idiv")) {
				s += "\txor edx,edx\n";
				s += "\tmov eax," + returnVariable + "\n";
				s += "\tmov ebx," + term.getReturnVariable() + "\n";
				s += "\tidiv ebx\n";
				s += "\tmov " + returnVariable + ",eax\n";
			} else if (this.opToAsm().equals("%idiv")) {
				s += "\txor edx,edx\n";
				s += "\tmov eax," + returnVariable + "\n";
				s += "\tmov ebx," + term.getReturnVariable() + "\n";
				s += "\tidiv ebx\n";
				s += "\tmov " + returnVariable + ",edx\n";
			} else {
				if (this.opToAsm().equals("imul")  && returnVariable.startsWith("[")) {
					s += "\tmov " + c + "," + returnVariable + "\n";
					s += "\t" + this.opToAsm() + " " + c + "," + term.getReturnVariable() + "\n";
					s += "\tmov " + returnVariable + "," + c + "\n";
				} else
					s += "\t" + this.opToAsm() + " " + returnVariable + "," + term.getReturnVariable() + "\n";
			}
		}
		return s;
	}
	
}
