


/**
 * class InputOutput
 *
 * Contains input/output methods provided by the IBO for primitive data types and Strings
 *
 * @authors Kostas Dimitriou & Markos Hatzitaskos
 * @version 1.0
 */
public abstract class InputOutput {

    //The methods used here can be found in:
    //The IB Computer Science subject guide (first examination in 2010)
    //Appendix A: Core Computer Science for the IB Diploma Program (International Baccalaureate). Published by Express Publishing.
    
    //1
    static void output(String info) {
        System.out.println(info);
    }

    static void output(char info) {
        System.out.println(info);
    }

    static void output(byte info) {
        System.out.println(info);
    }

    static void output(int info) {
        System.out.println(info);
    }

    static void output(long info) {
        System.out.println(info);
    }

    static void output(double info) {
        System.out.println(info);
    }

    static void output(boolean info) {
        System.out.println(info);
    }
    

    static String input(String prompt) {
        String inputLine = "";
        System.out.print(prompt);
        try {
            inputLine = (new java.io.BufferedReader(
                    new java.io.InputStreamReader(System.in))).readLine();
        } catch (Exception e) {
            String err = e.toString();
            System.out.println(err);
            inputLine = "";
        }
        return inputLine;
    }

    static String inputString(String prompt) {
        return input(prompt);
    }

    static String input() {
        return input("");
    }
    
    static int inputInt() {
        
        return inputInt("");
    }

    static double inputDouble() {
        return inputDouble("");
    }

    static char inputChar(String prompt) {
        char result = (char) 0;

        try {
            result = input(prompt).charAt(0);
        } catch (Exception e) {
            result = (char) 0;
        }
        return result;}
        //3
    static byte inputByte(String prompt) {
        byte result = 0;
        try {
            result = Byte.parseByte(input(prompt).trim());
        } catch (Exception e) {
            result = 0;
        }
        return result;
    }

    static int inputlnt(String prompt) {
        int result = 0;
        try {
            result = Integer.valueOf(
                    input(prompt).trim()
            ).intValue();
        } catch (Exception e) {
            result = 0;
        }
        return result;
    }

    static long inputLong(String prompt) {
        long result = 0;
        try {
            result = Long.valueOf(input(prompt).trim()).longValue();
        } catch (Exception e) {
            result = 0;
        }
        return result;
    }

    static double inputDouble(String prompt) {
        double result = 0;
        try {
            result = Double.valueOf(input(prompt).trim()).doubleValue();
        } catch (Exception e) {
            result = 0;
        }

        return result;
    }

    static boolean inputBoolean(String prompt) {
        boolean result = false;
        try {
            result = Boolean.valueOf(input(prompt).trim()).booleanValue();
        } catch (Exception e) {
            result = false;
        }

        return result;
    }

    static int inputInt(String id_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

