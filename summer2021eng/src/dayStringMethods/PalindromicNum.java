package dayStringMethods;

import java.util.Scanner;

public class PalindromicNum {

	public static void main(String[] args) {
	/* Palindromic number:
	* Write a code that checks if a given number is palindromic or not.
	* 123454321 is a palindromic number.
​
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		String num=scan.next();
		String reversed="";
		
		for(int i=num.length()-1; i>=0;i--) {
			reversed=reversed + num.charAt(i);
		}
		
		if(num.equals(reversed)) {
			System.out.println(num + " is palindromic number");
		}else {
			System.out.println(num + " is not palindromic number");
		}
	}}