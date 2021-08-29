package replit;

import java.util.Arrays;

public class W5Q4StrToCharArray {
/*
 Create a custom return type method accepts a name as parameter and prints the name as a char array. 

(do not use toCharArray() method)

Input : John

Output :[J, o, h, n]
 */
		// way 1. with return
	static String[] charArray(String str) {
		
		String[] name= str.split("");	
		return name;
		
	}
		// way 2. with void
	static void charArray1(String str) {
		
	String[] name= str.split("");
	System.out.println(Arrays.toString(name));
	}
			// way.3 with toCharArray
	static void charArray2(String str) {
		
		char[]name=str.toCharArray();
		
		System.out.println(Arrays.toString(name));
		
	}
	

	public static void main(String[] args) {
		
	System.out.println(Arrays.toString(charArray("Jonh")));
	
	charArray1("John");
	charArray2("John");
	}

}
