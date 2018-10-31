//import java.io.BufferedReader;
import java.util.Scanner;


/**
 * class InputOutput
 * 
 * Contains input/output methods provided by the IBO for primitive data types and Strings
 * 
 * @authors Kostas Dimitriou & Markos Hatzitaskos 
 * @version 1.0
 */

public abstract class InputOutput
{
	
	static Scanner my_scanner;

	public static void output(String string) {
		// TODO Auto-generated method stub
		System.out.print(string);
		System.out.println("hi");
		return;
	}

	public static String inputString(String string) {
		if (InputOutput.my_scanner == null) {
			my_scanner = new Scanner(System.in);
		}
		String s = my_scanner.next();
		return s;
	}

	public static int inputInt(String string) {
		String s = inputString(string);
		int n = Integer.parseInt(s);
		return n;
	}

	public static char inputChar(String string) {
		String s = inputString(string);
		return s.charAt(0);
	}

	public static String input(String string) {
		return inputString(string);
	}
	
}
