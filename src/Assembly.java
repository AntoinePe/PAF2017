import java.util.ArrayList;
import java.util.HashMap;

public class Assembly {
	
	private static ArrayList<String> globalVariables = new ArrayList<>();
	private static HashMap<String,String> variables = new HashMap<>();
	private static ArrayList<String> conditions = new ArrayList<>();
	private static ArrayList<String> whileLoops = new ArrayList<>();
	private static ArrayList<String> forLoops = new ArrayList<>();
	private static ArrayList<String> dowhileLoops = new ArrayList<>();
	private static ArrayList<String> booleans = new ArrayList<>();
	private static String main = "start:\n";
	private static String[] registers = {"eax","ebx","ecx","edx"};
	private static int i = 0, j = 0;
	
	public static int updateNumberOfMains() {
		return j++;
	}
	
	public static int getNumberOfMains() {
		return j;
	}
	
	public static void update() {
		i++;
		if (i >= registers.length) {
			i = 0;
		}
	}
	
	public static String getNewVariable(String value) {
		if (!variables.containsKey(value)) {
			deleteVariable(registers[i]);
			variables.put(value, registers[i]);
			update();
			return variables.get(value);
		}
		return "";
	}
	
	public static void deleteVariable(String variable) {
		if (variables.containsValue(variable)) {
			for (String key : variables.keySet()) {
				if (variables.get(key).equals(variable)) {
					variables.remove(key);
					break;
				}
			}
		}
	}
	
	public static String getVariable(String value) {
		return variables.get(value);
	}
	
	public static void addGlobalVariable(String variable) {
		if (!globalVariables.contains(variable))
			globalVariables.add(variable);
	}

	public static void addCondition(String instructions) {
		conditions.add(instructions);
	}
	
	public static void addNewWhileLoop(String instructions) {
		whileLoops.add(instructions);
	}
	
	public static void addNewForLoop(String instructions) {
		forLoops.add(instructions);
	}
	
	public static void addNewdowhileLoop(String instructions) {
		dowhileLoops.add(instructions);
	}
	
	public static void addNewBoolean(String instructions) {
		booleans.add(instructions);
	}
	
	public static int sizeConditions() {
		return conditions.size();
	}
	
	public static int sizeWhileLoops() {
		return whileLoops.size();
	}
	
	public static int sizeForLoops() {
		return forLoops.size();
	}
	
	public static int sizeDowhileLoops() {
		return dowhileLoops.size();
	}
	
	public static int sizeBooleans() {
		return booleans.size();
	}
	
	public static void addToMain(String instructions) {
		main += instructions;
	}
	
	private static String sectionData() {
		String s = "extern " + (PAFRunner.OS.equals("MACOS") ? "_" : "") + "printf\nsection .data\n";
		s += "message: db \"%i\",10,0\n";
		for (String variable : globalVariables)
			s += variable + ": db 0\n";
		return s + "\nsection .text\nglobal start\n\n";
	}
	
	private static String sectionBooleans() {
		String s = "";
		for (int i = 0; i < booleans.size(); i++)
			s += "_bool" + i + ":\n" + booleans.get(i);
		return s + "\n";
	}
	
	private static String sectionConditions() {
		String s = "";
		for (int i = 0; i < conditions.size(); i++)
			s += "_condition" + i + ":\n" + conditions.get(i);
		return s + "\n";
	}
	
	public static String toAsm() {
		String s = "";
		s += Assembly.sectionData();
		s += Assembly.sectionBooleans();
		s += Assembly.sectionConditions();
		s += main;
		for (String values : variables.values()) {
			s += "\tpop " + values + "\n";
		}
		s += "\tret";
		return s;
	}

}
