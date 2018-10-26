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
		System.out.print(string);
		System.out.println("");
		return;
	}

	static int inputInt (String prompt){
		int line;
		@SuppressWarnings("resource")
		Scanner in_int = new Scanner(System.in);
		System.out.print(prompt);
	line = in_int.nextInt();
		return line;
}
	
	// created by Kevin
	static char inputChar(String prompt) {
        char result = (char) 0;

        try {
            result = input(prompt).charAt(0);
        } catch (Exception e) {
            result = (char) 0;
        }
        return result;} 
	 
	static String inputString (String prompt) {
		return input(prompt);
	}
	

	public static String input(String string) {
		System.out.println(string);
		@SuppressWarnings("resource")
		Scanner in_input = new Scanner (System.in); 
		String statement = in_input.nextLine(); 
		return statement;
	}

}
	
