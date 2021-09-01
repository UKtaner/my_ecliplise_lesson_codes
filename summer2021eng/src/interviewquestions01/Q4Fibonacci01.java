package interviewquestions01;

import java.util.Scanner;

public class Q4Fibonacci01 {

	public static void main(String[] args) {
	//Fibonacci series: 0,1,1,2,3,5,8,13,21....
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("ENTER A NUMBER");
		
		int input=scan.nextInt();
		
		int num1=0;
		int num2=1;
		int sum;
		
		for(int i=0; i<=input; i++) {	
			System.out.print(num1+" ");
			sum=num1+num2;		
			num1=num2;
			num2=sum;
			
			
			//System.out.print(num1+" ");
		}

	}}

	