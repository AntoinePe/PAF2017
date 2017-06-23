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
	
	public Operation(Term term, Operation term2, String op) {
		this.term = term;
		this.term2 = term2;
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
		if (term == null)
			return term1.getReturnVariable();
		else if (op == null)
			return term.toString();
		else
			return term.toString();
	}
	
	private String opToAsm() {		
		if (op != null) {
			if (op.equals("+"))
				return "ADD";
			else if (op.equals("-"))
				return "SUB";
			else
				return "IMUL";
		}
		return "";
	}
	
	public String toAsm() {
		String s = "" , termAsm = "";
		if (term == null) {
			s += term1.toAsm() + term2.toAsm();
			
			if (!term1.toString().startsWith("["))
				returnVariable = term1.getReturnVariable();
			else {
				returnVariable = Assembly.getNewVariable("0");
				s += "\tpush " + returnVariable + "\n\tmov " + returnVariable + ", " + term1.toString() + "\n";
				Assembly.deleteVariable(returnVariable);
			}
			
			s += "\t" + this.opToAsm() + " " + returnVariable + "," + term2.toString()+ "\n";
			Assembly.deleteVariable(term1.toString());
		} else if (op == null) {
			termAsm = term.toAsm();
			s += (termAsm.isEmpty() ? "" : "\n" + termAsm + "\n");
			returnVariable = term.toString();
		} else {
			termAsm = term.toAsm();
			s += (termAsm.isEmpty() ? "" : termAsm) + term2.toAsm() + "\n";
			
			if (!term.toString().startsWith("["))
				returnVariable = term.toString();
			else {
				returnVariable = Assembly.getNewVariable("0");
				s += "\tpush " + returnVariable + "\n\tmov " + returnVariable + "," + term.toString() + "\n";
				Assembly.deleteVariable(returnVariable);
			}

			s += "\t" + this.opToAsm() + " " + returnVariable + "," + term2.toString()+ "\n";
			Assembly.deleteVariable(term.toString());
		}
		return s;
	}
	
}
