import java.util.ArrayList;
import java.util.HashMap;

public class Assembly {
	
	private static ArrayList<String> globalVariables = new ArrayList<>();
	private static ArrayList<String> unassignedVariables = new ArrayList<>();
	//private static String[] registers = {"eax","ebx","ecx","edx"};
	private static String[] registers = {"eax","ecx","edx","ebx"};
	private static int i = 0, j = 0, numberOfScan = 0;
	private static String main = "";
	
	public static int updateNumberOfScan() {
		return numberOfScan++;
	}
	
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
	
	public static void addUnassignedVariable(String variable) {
		if (!unassignedVariables.contains(variable))
			unassignedVariables.add(variable);
	}
	
	public static boolean containsUnassignedVariable(String variable) {
		return unassignedVariables.contains(variable);
	}
	
	private static String sectionData() {
		String s = "extern " + (PAFRunner.OS.indexOf("mac") >= 0 ? "_" : "") + "printf\n";
		if (numberOfScan > 0)
			s += "extern " + (PAFRunner.OS.indexOf("mac") >= 0 ? "_" : "") + "scanf\n";
		s += "section .data\n";
		s += "\tintMessage: db \"%i\",10,0\n";
		s += "\tstringMessage: db \"%s\",10,0\n";
		for (String variable : globalVariables)
			s += variable;
		return s;
	}
	
	private static String sectionBSS() {
		String s = "section .bss\n";
		for (String variable : unassignedVariables)
			s += "\t" + variable + ": resb 20\n";
		return s;
	}
	
	public static void addToMain(String value) {
		main += value;
	}
	
	public static String toAsm() {
		String s = "";
		s += Assembly.sectionData();
		s += Assembly.sectionBSS();
		s += "\nsection .text\nglobal start\n\n" +main;
		return s;
	}

}
