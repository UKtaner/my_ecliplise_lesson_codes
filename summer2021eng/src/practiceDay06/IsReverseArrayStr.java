package practiceDay06;

import java.util.Scanner;

public class IsReverseArrayStr {
	/*
	 * Write a Java program that reverse a sentence by using Array
	        * (with all spaces and special characters)
	        *
	        * Input : Coding is greate.
	        * Output : .etaerg si gnidoC
	        *
	        *
	 */

	
	

	    public static void main(String[] args) {
	       
	    	String s = "JAVA";
			String[] reverse = s.split("");
			String result = "";
			for (int i = reverse.length - 1; i >= 0; i--) {
			  result += (reverse[i] + " ");
			}
			System.out.println(result.trim());
	    }
	}