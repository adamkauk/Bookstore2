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

	public static void output(String string) {
		// TODO Auto-generated method stub
		System.out.print(string);
		
	}

	static int inputInt (String prompt){
		int line;
		Scanner in = new Scanner(System.in);
		System.out.print(prompt);
	line = in.nextInt();
		return line;
}
	
	
}
