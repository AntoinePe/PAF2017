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
			s += term1.toAsm() + term2.toAsm() + "\t" + this.opToAsm() + " " + term1.toString() + "," + term2.toString()+ "\n";
			returnVariable = term1.getReturnVariable();
		} else if (op == null) {
			termAsm = term.toAsm();
			s += (termAsm.isEmpty() ? "" : "\t" + termAsm + "\n");
			returnVariable = term.toString();
		} else {
			termAsm = term.toAsm();
			s += (termAsm.isEmpty() ? "" : termAsm) + term2.toAsm() + "\t" + this.opToAsm() + " " + term.toString() + "," + term2.toString()+ "\n";
			returnVariable = term.toString();
		}
		return s;
	}
	
}
