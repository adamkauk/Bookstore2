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
		System.out.println("hi");
		return;
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
	
}
