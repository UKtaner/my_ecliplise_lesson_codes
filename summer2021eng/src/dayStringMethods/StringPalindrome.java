package dayStringMethods;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
	
	/*
	 *	  Write a code that checks if a given string is palindrome or not.
          A palindrome is a word or group of words, when reversed it reads the same.
	      Like 'ey edip adanada pide ye'
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a word or group of words");
		String str=scan.nextLine();
		
		String reversedStr="";
		for(int i=str.length()-1; i>=0; i--) {
			reversedStr=reversedStr + str.charAt(i);
		}
		if(str.equalsIgnoreCase(reversedStr)) {
			System.out.println(str +" is palindrome");
		}else {
			System.out.println(str + " is not palindrome");
		}
}}