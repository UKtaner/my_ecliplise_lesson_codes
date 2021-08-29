package practiceDay02;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
/*Explanation about primeNumber,Prime numbers are numbers that have only 2 factors:
* 1 and themselves. For example, the first 5 prime numbers are 2, 3, 5, 7, and 11.
*  By contrast, numbers with more than 2 factors are call composite number.
*/	
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter  a number");
		 int num=scan.nextInt();
		 boolean numprime = true;
		 
		 
		 if (num<=0) {
			System.out.println("0 is not prime"); 
		 }else if (num==1) {
			 System.out.println("1 is not either prime or composite number");
		 }else {			
				 for(int divisor=2; divisor<=num/2; divisor++) { 
					 if (num%divisor==0) 	
						 numprime=false;
							break;
					 }
				 }
			
	
		if(numprime) {
			System.out.println("Prime number");
		}else {
			System.out.println("Composite number");
		}
		
		}
		
	}


