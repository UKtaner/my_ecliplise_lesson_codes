package interviewquestions01;

import java.util.Scanner;

public class Q7isArmstrong02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check if it is Armstrong number or not");
		int n = scan.nextInt();
		
		int sumOfCubes = 0;
		int temp = n;
		int digit= 0; 
		
		while(n>0) {
			digit = n%10;
			sumOfCubes += Math.pow(digit,3);
			n = n/10;
		}
		
		if(temp==sumOfCubes) {
			System.out.println(temp + " is Armstrong number");
		}else {
			System.out.println(temp + " is not Armstrong number");
		}
		
		scan.close();

	}

}
