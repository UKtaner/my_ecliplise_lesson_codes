package interviewquestions01;

public class Q6IsPalindrom01 {

	public static void main(String[] args) {
		/*
	 	Create a program checks if a String is palindrome or not.
	 	If a word, phrase, or sequence that reads the same backward as forward then it is called "Palindrome", 
	    For example, "madam" or "nurses run".
	 */
		System.out.println(isPalindrom02("racecar"));
		isPalindrom01("racecar");
			}

public static void isPalindrom01(String input) {
	String reversed="";
	
//	for(int i=0; i<input.length();i++) {
//		reversed+=input.charAt(input.length()-1-i);
//	}
//	System.out.println(reversed);
//	System.out.println();

	for(int i=input.length()-1;i>=0;i--) {
		reversed+=input.charAt(i);
	}	
	
	if(reversed.equals(input)) {
		System.out.println(input +" is Palindrom.");
	}else {
		System.out.println(input +" is not Palindrom");
	}

}
public static boolean isPalindrom02(String input) {
	
	String rev="";
	for(int i=input.length()-1;i>=0;i--) {
		rev+=input.charAt(i);
	}
	return rev.equals(input);
	
}
}