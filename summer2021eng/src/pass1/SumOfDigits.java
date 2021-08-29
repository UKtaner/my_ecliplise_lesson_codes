package pass1;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		/*
		 Type java code by using while loop,
		Write a program that prompts the user to input an integer.
		 It should then find sum of the digits of that number.
		123 ==> 1+2+3 = 6		
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number");
		int num=Math.abs(scan.nextInt());
		int sum;
		for(sum=0; num!=0;num/=10) {
			sum+=num%10;
			
		}
		
		System.out.println(sum);
		}
		
}		
/*
 Scanner scan =new Scanner(System.in);

		System.out.println("Enter a number");
		int num=Math.abs(scan.nextInt());
		
		
		int sum=0;
		
		while(num!=0) {
			sum=sum+num%10;
			num=num/10;
			
		}
		System.out.println(sum);
 */
