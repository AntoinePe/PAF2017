
public class Operation {
	
	private Operation term1;
	private Operation term2;
	private String op;
	private Term term;
	
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
	
	public String toString() {
		if (term == null)
			return term1.toString() + op + term2.toString();
		else if (op == null)
			return term.toString();
		else
			return term.toString() + op + term2.toString();
	}
	
	public String toAsm() {
		return null;
	}
	
}
