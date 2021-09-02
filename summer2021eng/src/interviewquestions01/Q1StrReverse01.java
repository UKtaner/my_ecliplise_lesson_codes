package interviewquestions01;

import java.util.Scanner;

public class Q1StrReverse01 {
	//Write a Java Program to reverse a string

	public static void main(String[] args) {
	
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter string");
		String input=scan.next();
		
		
		//1.way by using StringBuilder
		StringBuilder strb=new StringBuilder();
		strb.append(input);
		System.out.println(strb.reverse());
//////////////////////////////////////////////////////			
		System.out.println(stringBufferRevrs01(input));
		System.out.println(reverse02(input));
		
	}

	//2.way by using StringBuffer
	public static StringBuffer  stringBufferRevrs01(String input) {
		StringBuffer strB=new StringBuffer();
		strB.append(input);		
		return strB.reverse();			
	}	
	//3.way by using loop
	public static String reverse02(String input) {
		String reverse="";	
		for(int i=input.length()-1;i>=0;i--) {		
			reverse+=input.charAt(i);
		/*
		 for(int i=0; i<str.length();i++) {
				reversed2+=str.charAt(str.length()-i-1);
		 */	
		}		
		return reverse;		
	}	
		

}
