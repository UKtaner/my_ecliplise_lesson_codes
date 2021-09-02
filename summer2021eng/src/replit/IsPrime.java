package replit;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		/*
		
		Write a program that prompts the user to input a positive integer. 
		It should then output a message indicating whether the number is a prime number. 
		==>a number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11).
				 */
				
			Scanner input=new Scanner (System.in);
			
			System.out.println("Enter a number");
			
			int num=Math.abs(input.nextInt());
			
			boolean flag=true;
			int i;
			for (i=2;i<num/2;i++) {
			  
				if(num%i==0) {
				flag=false;
				break;
				}
			}
				
			if(flag && num>1) {
				System.out.println("Number is prime");
			}else {
				System.out.println("Number is not prime");
			}
					}
					
				}
		   