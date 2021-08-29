package day06ternary_switch;

import java.util.Scanner;

public class Question01 {
	
	public static void main(String[] args) {
	/*
	 Type java code by using if-else if() statement.
			Write a program to check if a year is leap year or not.
			if the year is divisible by 100 then it must be divisible by 400.
			If a year is not divisible by 100 then it must be divisible by 4.	
	 */
// 1. way.........................................		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year...");
		int year = scanner.nextInt();
		
		if(year<0) {
			
			System.out.println("Year must be positive...");
			
		}else if(year%100==0) {
			
			if(year%400==0) {
				System.out.println(year + " is leap year");
			}else {
				System.out.println(year + " is not leap year");
			}
			
		}else {
			
			if(year%4==0) {
				System.out.println(year + " is leap year");
			}else {
				System.out.println(year + " is not leap year");
			}
/* 2. way..................................
 		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year...");
		int year =scanner.nextInt();
		String result = year<=0? "Year must be positive...":year%100==0 && year%400==0 && year%4==0?"leap year":"not leap year";	
		System.out.println(result);			
 */
		}

	}

}