package interviewquestions01;

import java.util.Arrays;
import java.util.Scanner;

public class Q13isAnagram02 {

	public static void main(String[] args) {
		/*
		  Ask user to enter 2 Strings.
		  If the characters and the numbers of characters of the Strings are same then print "Anagram" on the console.
		  Otherwise, print "Not Anagram" on the console. 
		  Ignore cases.
		  For example; "Mary" and "army" and "RAMY" are Anagrams.
		*/

//Arrays.equals(a1,a2)==>  the two arrays are equal if they contain the same elements in the same order.		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a string");
		String input1=scan.next().toLowerCase();
		System.out.println("Enter a string");
		String input2=scan.next().toLowerCase();
	
		
		String arr1[]=input1.split("");
		Arrays.sort(arr1);		
		String arr2[]=input2.split("");
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr2,arr1)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not anagram");
		}


	}
	

}