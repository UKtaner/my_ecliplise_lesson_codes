package day10loops;

import java.util.Scanner;

public class forLoops01 {

	public static void main(String[] args) {
	
	
		
		//Print "Hello world!" on the console 10 times...
		
		//1.Way:
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");
//		System.out.println("Hello world!");
		
		System.out.println("==================");
		
		//2.Way: Use for-loop
		//for(Starting ; Condition; Increment or Decrement){ }
		for(int i = 1;i<=10;i++) {
			System.out.println("Hello world!");	
		}
		
		//Print integers from 13 to 15 on the console in the same line with a space between them
		for(int i = 13; i<16; i++) {
			System.out.print(i + " ");
	
		}
		
		System.out.println();
		
		//Print integers from 16 to 14 on the console in the same line with a space between them
		// ">=14" is same with the ">13"
		for(int i = 16; i > 13;         i--) {			
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//Print the even integers from 15 to 100 on the console
		
		//1.Way:
//		for(int i = 15; i < 19; i++) {
//			if(i%2==0) {
//				System.out.print(i + " ");
//			}			
//		}
		
		System.out.println();
		
		//Print the odd integers from 120 to 65 on the console
				//1.Way:
				for(int i=120; i>64; i--) {
					
					if(i%2!=0) {
						System.out.print(i + " ");
					}
					
				}
				
				System.out.println();
				
				//2.Way:
				// i=i-2 and i-=2 are same
				for(int i=119; i>64; i-=2) {
					System.out.print(i + " ");
				}


				
			
	///Print the integers divisible by 4 and 6 from 13 to 130
	
	for (int i=13; i<131; i++) {
		if (i%4==0 && i%6==0) {
			System.out.print(i+" ");

		}
				
	
		}
	System.out.println();
	
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter your name");
	
	String name =scan.next();
	
	for (int i=0; i<name.length(); i++) {
		System.out.print(name.charAt(i)+" ");
	}
	
	}
	}			
		