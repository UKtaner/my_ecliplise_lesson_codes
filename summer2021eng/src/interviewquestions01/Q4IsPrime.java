package interviewquestions01;

import java.util.Scanner;

public class Q4IsPrime {

	public static void main(String[] args) {
	/*we will print the prime numbers 1 to 100	
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter starting number:");
	int num1=scan.nextInt();
	System.out.println("Enter ending number:");
	int num2=scan.nextInt();
	for(int i=num1; i<=num2;i++) {
	*/	
		for(int i=1; i<=100;i++) {// user gives a range 1 to 100.
								  //we can also get starting and ending number by scanner class.
			boolean isPrime=true;
			for(int j=2; j<i;j++) {//
				if(i%j==0) {
					isPrime =false;
					break;
				}
			}if(isPrime) {
			System.out.println(i+" ");
			
			}	
		}

	}
}
