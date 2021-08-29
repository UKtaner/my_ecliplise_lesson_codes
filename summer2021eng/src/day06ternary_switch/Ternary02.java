package day06ternary_switch;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
		/*
		Type java code by using ternary and if-else. 
		Ask user to enter two integers
		Write a program to print the minimum one on the console.
*/
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter two integers!");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		// 1. way
		
		if (a<b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
	
		// 2. way
		int result = a<b? a : b;
		System.out.println(result);
// 3. way...............		
// String result = a<b?"a is minimum number ":"b is minimum number";
		
//	System.out.println( (a < b ? a : b) + " is the minimum ");
	
	
	}

}
