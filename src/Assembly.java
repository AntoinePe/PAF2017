import java.util.ArrayList;
import java.util.HashMap;

public class Assembly {
	
	private static ArrayList<String> globalVariables = new ArrayList<>();
	private static HashMap<String,String> variables = new HashMap<>();
	private static String[] registers = {"eax","ebx","ecx","edx"};
	private static int i = 0;
	
	public static void update() {
		if (i >= registers.length)
			i = -1;
		i++;
	}
	
	public static String getNewVariable(String value) {
		if (!variables.containsKey(value)) {
			while (variables.containsValue(registers[i]))
				update();
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
	
	public static String sectionData() {
		String s = "section .data\n";
		s += "message: db \"%i\",10,0\n";
		for (String variable : globalVariables)
			s += variable + ": db 0\n";
		return s + "\n";
	}

}
