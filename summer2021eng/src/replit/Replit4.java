package replit;

import java.util.Arrays;

public class Replit4 {
/*
 4.Create a custom return type method accepts a name as parameter and prints the name as a char array. 

(do not use toCharArray() method)


Input : John

Output :[J, o, h, n]
	
 */
	public static void main(String[] args) {
		
	String charArray="John";

	String nameArr[] = charArray.replace(" ", "").split("");
	System.out.println(Arrays.toString(nameArr));
		
	}
	
}


