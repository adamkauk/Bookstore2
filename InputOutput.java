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
    //The methods used here can be found in:
    //The IB Computer Science subject guide (first examination in 2010)
    //Appendix A: Core Computer Science for the IB Diploma Program (International Baccalaureate). Published by Express Publishing.
	private static Scanner my_reader;
	
	public static void output(String str) 
	{
		System.out.println(str);
	}

	public static char inputChar(String string) {
		output(string);
		//BufferedReader input = new BufferedReader(input_reader);

		if (InputOutput.my_reader == null) {
			my_reader = new Scanner(System.in);
		}
			
		char c = my_reader.next().charAt(0);
		//reader.close();
		return c;
	}

	public static String input(String string) {
		output(string);
		//Scanner reader = new Scanner(System.in);
		if (InputOutput.my_reader == null) {
			my_reader = new Scanner(System.in);
		}

		String c = my_reader.next();
		//reader.forEachRemaining(arg0);
		//reader.close();
		return c;
	}

	public static int inputInt(String string) {
		output(string);
		//Scanner reader = new Scanner(System.in);
		if (InputOutput.my_reader == null) {
			my_reader = new Scanner(System.in);
		}

		String c = my_reader.next();
		int i = Integer.parseInt(c);
		//reader.close();
		return i;
	}

	public static String inputString(String string) {
		output(string);
		//Scanner reader = new Scanner(System.in);
		if (InputOutput.my_reader == null) {
			my_reader = new Scanner(System.in);
		}
		String c = my_reader.next();
		//reader.close();
		return c;
	}
}
