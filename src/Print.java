
public class Print {
	private String str;
	private Term op;
	private boolean addNewLine;
	
	public Print(String str, Term op, int newLine) {
		this.str = str;
		this.op = op;
		this.addNewLine = (newLine == 1);
	}
	
	public Print(Term op, int newLine) {
		this(null,op,newLine);
	}
	
	public String toAsm(Function function) {
		String s = "", c = "";
		int i = 0;
		
		s += op.toAsm(function,true);
		c = op.getReturnVariable();
		s += "\tpush " + (c.startsWith("[") ? "dword " : "") + c + "\n";
		
		if (str != null) {
			i = function.updateNumberOfPrint();
			function.addAString("string" + i,"db " + str + "," + (addNewLine ? "10," : "") + "0\n");
			s += "\tpush dword ." + function.getName() + ".string" + i + "\n";
		} else {
			s += "\tpush dword " + ((c.startsWith(".") || c.startsWith(function.getName())) ? "stringMessage" : "intMessage") + (addNewLine ? "L" : "") + "\n";
		}
		
		s += "\tcall " + (PAFRunner.OS.indexOf("mac") >= 0 ? "_" : "") + "printf";
		s += "\n\tadd esp,8\n";
		
		return s;
	}

}