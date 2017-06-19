
public class Operation {
	
	private Operation term1;
	private Operation term2;
	private String op;
	
	public Operation(Operation term1, Operation term2, String op) {
		this.term1 = term1;
		this.term2 = term2;
		this.op = op;
	}
	
	public Operation(Operation operation) {
		this(operation.getTerm1(),operation.getTerm2(),operation.getOp());
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
	
}
