import java.util.ArrayList;
import java.util.HashMap;

public class Assembly {
	
	private static ArrayList<String> globalVariables = new ArrayList<>();
	//private static String[] registers = {"eax","ebx","ecx","edx"};
	private static String[] registers = {"eax","ecx","edx","ebx"};
	private static int i = 0, j = 0;
	private static String main = "";
	
	public static int updateNumberOfL() {
		return j++;
	}
	
	public static int getNumberOfL() {
		return j;
	}
	
	private static String update() {
		i++;
		if (i >= registers.length) {
			i = 0;
		}
		return registers[i];
	}
	
	public static String getNewVariable() {
		return Assembly.update();
	}
	
	public static void addGlobalVariable(String variable) {
		if (!globalVariables.contains(variable))
			globalVariables.add(variable);
	}
	
	private static String sectionData() {
		String s = "extern " + (PAFRunner.OS.indexOf("mac") >= 0 ? "_" : "") + "printf\nsection .data\n";
		s += "\tmessage: db \"%i\",10,0\n";
		for (String variable : globalVariables)
			s += "\t" + variable + ": db 0\n";
		return s + "\nsection .text\nglobal start\n\n";
	}
	
	public static void addToMain(String value) {
		main += value;
	}
	
	public static String toAsm() {
		String s = "";
		s += Assembly.sectionData();
		s += main;
		return s;
	}

}
