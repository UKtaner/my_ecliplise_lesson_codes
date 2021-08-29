package day05_ifelseif_nestedif;

import java.util.Scanner;

public class HW01 {

	public static void main(String[] args) {
		/* 
		Homework
		Type java code by using if-else statement,
		if the password is “JavaLearner”, output will be “The password is true”.
		Otherwise, output will be “The password is false”.
		*/
// 1.way if-else 		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter Your Password");
		
		String pw = scan.next();
	
		if(pw.equals("JavaLearner")) {
			System.out.println("The password is true.");
		}else {
			System.out.println("The password is false.");
		}
		scan.close();		
	}
/*
 2. way ternary
 		Scanner scan = new Scanner (System.in);	
		System.out.println("Enter Your Password");
		String pw = scan.next();
		System.out.println(pw.equals("JavaLearner")?"The password is true.":"The password is false.");
			
		*/
}
