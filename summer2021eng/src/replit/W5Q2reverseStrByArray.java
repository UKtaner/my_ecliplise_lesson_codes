package replit;

public class W5Q2reverseStrByArray {
/*
 Write a Java program that reverse a sentence by using Array (with all spaces and special characters).

Input : Coding is greate.

Output : .etaerg si gnidoC

 */
	
	
	static String reverseString(String input) {
		
		String reverse="";
		
		//for(int i=0;i<input.length();i++) {
		//reverse+=input.charAt(input.length()-1-i);
		
			for(int i=input.length()-1;i>=0;i--) {
			reverse+=input.charAt(i);			
		}	
		return reverse;	
	}

	static String charReverse(String input) {
		String reverse="";
		
		char[]arr=input.toCharArray();
		
		for(int i=arr.length-1;i>=0;i--) {
			
			reverse+=arr[i];
		}
	
		return reverse;
	}
	
	public static void main(String[] args) {
		
			System.out.println(reverseString("Coding is greate."));
			System.out.println(charReverse("Coding is greate."));
			
			
			

	}
}
