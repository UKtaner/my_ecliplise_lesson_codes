package interviewquestions01;

import java.util.Scanner;

public class Q3Fibonacci01 {

	public static void main(String[] args) {
	//Fibonacci series: 0(given num1),1(given num2),1(next num1),2(next num2),3,5,8,13,21....
	/*
	 num1 , num2 are given
	 
	 next num1 = given num2
	 next num2 = given num1 + given num2 
		
	 */
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

	