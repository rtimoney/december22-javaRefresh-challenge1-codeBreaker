package codeBreaker;

import java.util.Arrays;


public class CodeCracker {
	
	/**
	 * 
	 * Convert a number of characters (String) to ASCII and decode an ASCII numerical value
	 * @see http://www.asciitable.com/
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		
		// challenge - codify your own name
		String name = "Ronan Timoney";
		System.out.println("String to be coded as ASCII is ... "+name);
		int[] coded = code(name);
		System.out.println(Arrays.toString(coded));
		
		char[] uncoded = decode(coded);
		System.out.println(Arrays.toString(uncoded));
	}
	
	
	/**
	 * Codes a string array char by char into ASCII numeric value
	 * @param name
	 * @return
	 */
	public static int[] code(String name) {
		int[] coded = new int[name.length()];
		
		for (int loop = 0; loop < name.length(); loop++) {
			coded[loop] = (int) name.charAt(loop);
		}
		return coded; 
	}
	
	
	/**
	 * Decodes ASCII based array to a readable char array
	 * @param coded (ASCII number based array)
	 * 
	 @return (readable char array) 
	 */
	public static char[] decode(int[] coded) {
		char[] uncoded = new char[coded.length];
		
		for (int loop = 0; loop < coded.length; loop++) {
			uncoded[loop] = (char) coded[loop];
		}
		
		return uncoded;
	}
}
