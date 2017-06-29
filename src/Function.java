import java.util.ArrayList;
import java.util.HashMap;

public class Function {
	
	private String name, type, returnVariable;
	private Instructions instructions;
	private ArrayList<String> variables = new ArrayList<>(), lambdaFunctions = new ArrayList<>();
	private HashMap<String,String> variablesString = new HashMap<>();
	private String[] registersOfParameters = {"eax","ebx","ecx","edx","edi","[esp+4]","[esp+8]","[esp+12]","[esp+16]","[esp+20]","[esp+24]","[esp+28]","[esp+32]"};
	private String[] registersOfParameters2 = {"[esp+32]","[esp+28]","[esp+24]","[esp+20]","[esp+16]","[esp+12]","[esp+8]","[esp+4]","edi","esi","edx","ecx","ebx","eax"};
	private int indexOfParameter = -1, indexOfParameter2 = -1, indexOfParameterOfCalledFunctions = -1, numberOfPrint = 0;
	private Parameter2 param;
	private boolean val = false;
	
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
	
	public String getName() {
		return name;
	}

	public void addAString(String name,String value) {
		variablesString.put(name,value);
	}
	
	public boolean isString(String variable) {
		return variablesString.containsKey(variable);
	}
	
	public void addALambdaFunction(String value) {
		lambdaFunctions.add(value);
	}
	
	public void is32(boolean val) {
		this.val = val;
	}
	
	public int updateNumberOfPrint() {
		numberOfPrint++;
		return numberOfPrint;
	}
	
	public int updateIndex() {
		indexOfParameter++;
		if (indexOfParameter >= registersOfParameters.length)
			indexOfParameter = 0;
		return indexOfParameter;
	}
	
	public int updateIndex2() {
		indexOfParameter2++;
		if (indexOfParameter2 >= registersOfParameters2.length)
			indexOfParameter2 = 0;
		return indexOfParameter2;
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
	
	public String[] getRegistersOfParameters2() {
		return registersOfParameters2;
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
		String s = "", c = "", d = "";
		
		int numberToAddToRegister = 16;
		if (val)
			numberToAddToRegister = 32;
		
		
		if (param != null)
			d += param.toAsm(this);
		
		d += instructions.toAsm(this);
		
		if (variables.size()*4 > 16 && variables.size()*4 <= 32)
			numberToAddToRegister = 32;
		
		if (variables.size()*4 > 32 && variables.size()*4 <= 64)
			numberToAddToRegister = 64;
		
		if (variables.size()*4 > 64 && variables.size()*4 <= 128)
			numberToAddToRegister = 128;
		
		if (!name.equals("start"))
			s += name + ":\n";
		else
			s += "start:\n";
		s += "\tpush ebp\n\tmov ebp, esp\n\tsub esp," + numberToAddToRegister + "\n";
		
		s += d;
		
		if (type.isEmpty())
			s += "\tnop\n";
		else if (Character.isDigit(returnVariable.charAt(0)))
			s += "\tmov eax," + returnVariable.charAt(0) + "\n";
		else
			s += "\tmov eax,[ebp-" + this.getIdOfVariable(returnVariable) + "]\n";
			
		s += "\tadd esp," + numberToAddToRegister+ "\n\tpop ebp\n";
		if (name.equals("start"))
			s += "\tmov eax,1\n\tmov ebx,0\n\tint 80h\n";
		else 
			s += "\tret\n";
		
		for (String key : variablesString.keySet()) {
			s += "." + this.name + "." + key + ": " + variablesString.get(key);
		}
		
		for (String x : lambdaFunctions) {
			s += x;
		}
		
		return s;
	}

}
