package replit;

public class W6Q3 {
	/*
	Get a sentence from the user. Accept the sentence received from the user as a parameter, 
	Invert sentence using Array and write a Method that returns the result as a String to the main method.
	Note: Upper and lower case letters, spaces and special characters will not be changed.

	Input : 

	It is very nice to write code.

	Output : 

	.edoc etirw ot ecin yrev si tI
	 */

	static String reversedInput(String input) {
		
		String reversed="";
		char []array=input.toCharArray();
		for(int i=0;i<input.length();i++) {
			reversed+=array[input.length()-1-i];
		}
		return reversed;
	}
	public static void main(String[] args) {
	System.out.println(reversedInput("It is very nice to write code."));
	}
}
