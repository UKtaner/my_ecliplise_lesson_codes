package day04_concat;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		
	// get a number from user then tell IF the number is even or add
		
//		Scanner scan = new Scanner (System.in);
//		System.out.println("Enter a number");
//		
//		int num = scan.nextInt();
		
//		if(num%2==0) {
//			System.out.println("the number is even");
//			
//		}
//		if(num%2!=0) {
//			System.out.println("the number is odd");
//		}
	
//		if (num<0) {
//			System.out.println("the number is negative");
//			
//		}
//		if(num>0) {
//			System.out.println("the number is positive");
//		}
//		if (num==0) {
//		 System.out.println("the number is neutral");
//			
//		}
		
		//Get the length and the height of a rectangle from user, if they equal to each other		
		//print "Square" on the console, otherwise print "Rectangle" on the console.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("the length and the height of a rectangle");
		
		int lnth = scan.nextInt();
		int hgth = scan.nextInt();
		
		if(lnth<0||hgth<0) {
			System.out.println("error");
		}
		
		if(lnth==hgth) {
			
			System.out.println("It s square");
		}
		if(lnth!=hgth) {
			System.out.println("it s rentangle");
		}
	}
	}


