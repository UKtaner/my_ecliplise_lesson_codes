package day05_ifelseif_nestedif;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/*
	 	Ask user to enter a 4 digit integer, then print the sum of the first
		and the last digits of the number on the console.
		For example; if user enters 1234 you will add 1 and 4, then print on the console 5
	*/
		Scanner scan = new Scanner (System.in);
			
		System.out.println("enter a 4 digit :");
		
		int num = scan.nextInt();
		
		num = Math.abs(num);// .abs ==> if the entry is negative
		
		if(num>999 && num<10000) {
			int fDigit = num/1000;
			int lDigit = num%10;
			System.out.println("The sum is "+(fDigit+lDigit));
			// do not forget parenthesis............
			// from left to right. String + num  would be concat.
			
		}
		else {
			System.out.println("Try again....");
		}
	}

}
