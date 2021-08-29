package replit;

import java.util.Scanner;

public class ReversedStr01 {
	
/*
 2.Write a Java program that reverse a sentence by using Array (with all spaces and special characters).

Input  : Coding is greate.

Output : .etaerg si gnidoC
 */
	static String revesedStr(String str) {	
		String revesed="";	
			//for(int i=str.length()-1; i>=0;i--) {
		    //revesed=revesed+str.charAt(i);
		
			for(int i=0;i<str.length();i++) {	
			revesed=revesed+str.charAt(str.length()-1-i);	

		}
		return revesed;	
	}

	public static void main(String[] args) {
		
		System.out.println(revesedStr("Coding is greate."));
		
	}
}
