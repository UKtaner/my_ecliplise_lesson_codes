package day06ternary_switch;

import java.util.Scanner;

public class Ternary04 {

	public static void main(String[] args) {
//		Ask user to enter an integer. If the number has 3 digits, output will be  
//		“This number has 3 digits.” Otherwise, output will be “This number has no 3 digits.”		

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter  a three digit number");
		
		int a =scan.nextInt();
		//int a =Math.abs( scan.nextInt());// bug
		
		int b =Math.abs(a);
		
		
		String result = b>99 && b<1000 ? a + " has 3 digits" : a + " has no 3 digits.";
		
		System.out.println(result);
		
		/*
		String result= a>99 && a<999?"it has a three digit.":"It ha not a three digit.";
		
		Math.abs(a);		
		System.out.println(a>99 && a<999?a+" has a three digit.":a+" has not a three digit.");
	*/
	}

}
