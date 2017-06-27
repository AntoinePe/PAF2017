import java.util.ArrayList;

public class Function {
	
	private String name, type, returnVariable;
	private Instructions instructions;
	private ArrayList<String> variables = new ArrayList<String>();
	private String[] registersOfParameters = {"eax","ebx","ecx","edx","esi","edi","[esp+4]","[esp+8]","[esp+12]","[esp+16]"};
	private int indexOfParameter = -1;
	private int indexOfParameterOfCalledFunctions = -1;
	private Parameter2 param;
	
	public Function(String name, Instructions instructions, Parameter2 param) {
		this.name = name;
		this.type = "";
		this.instructions = instructions;
		this.returnVariable = "";
		this.param = param;
	}
	
	public Function(String name, String type, Instructions instructions, String returnVariable, Parameter2 param) {
		this.name = name;
		this.type = type;
		this.instructions = instructions;
		this.returnVariable = returnVariable;
		this.param = param;
	}
	
	public Function(String name, Instructions instructions) {
		this(name,instructions,null);
	}
	
	public Function(String name, String type, Instructions instructions, String returnVariable) {
		this(name,type,instructions,returnVariable,null);
	}
	
	public int updateIndex() {
		indexOfParameter++;
		if (indexOfParameter >= registersOfParameters.length)
			indexOfParameter = 0;
		return indexOfParameter;
	}
	
	public int getNumOfParameters() {
		return indexOfParameter;
	}
	
	public int updateIndexOfFunctions() {
		indexOfParameterOfCalledFunctions++;
		if (indexOfParameterOfCalledFunctions >= registersOfParameters.length)
			indexOfParameterOfCalledFunctions = 0;
		return indexOfParameterOfCalledFunctions;
	}
	
	public void resetIndexOfFunctions() {
		indexOfParameterOfCalledFunctions = -1;
	}
	
	public int getNumOfParametersOfFunctions() {
		return indexOfParameterOfCalledFunctions;
	}
	
	public String[] getRegistersOfParameters() {
		return registersOfParameters;
	}

	public void addToVariables(String value) {
		variables.add(value);
	}
	
	public String getNameOfVariable(int i) {
		return variables.get(i);
	}
	
	public int getIdOfVariable(String value) {
		return (variables.indexOf(value)+1)*4;
	}
	
	public boolean containsVariable(String value) {
		return variables.contains(value);
	}
	
	public int getNumOfVariables() {
		return variables.size();
	}
	
	public String toAsm() {
		String s = "", c = "";
		
		if (!name.equals("start"))
			s += name + ":\n";
		else
			s += "start:\n";
		s += "\tpush ebp\n\tmov ebp, esp\n\tsub esp,16\n";
		
		if (param != null)
			s += param.toAsm(this);
		
		s += instructions.toAsm(this);
		
		if (type.isEmpty())
			s += "\tnop\n";
		else if (Character.isDigit(returnVariable.charAt(0)))
			s += "\tmov eax," + returnVariable.charAt(0) + "\n";
		else
			s += "\tmov eax,[ebp-" + this.getIdOfVariable(returnVariable) + "]\n";
			
		s += "\tadd esp,16\n\tpop ebp\n";
		if (name.equals("start"))
			s += "\tmov eax,1\n\tmov ebx,0\n\tint 80h";
		else 
			s += "\tret";
		
		return s;
	}

}
