package pass1;

import java.util.Scanner;

public class WhileLoopFactorial {

	public static void main(String[] args) {
/*
 Type java code by using while loop,
Write a program to count the factors of an integer which is entered by user.
 Factors of 12 = 1, 2, 3, 4, 6, 12
Factors of 8  = 1, 2, 4, 8
 */
		Scanner scan =new Scanner(System.in);

		System.out.println("Enter a number");
		int n=Math.abs(scan.nextInt());
		
		int i=1;
		int count =0;//flag
		while(i<=n) {
			if(n%i==0) {
			count++;
			System.out.print(i+" ");
			
		}
		i++;
		
	}
		System.out.println();
		System.out.println("The total of factors: "+count);
	}
}
