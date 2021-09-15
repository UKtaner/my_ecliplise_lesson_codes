package interviewquestions01;

import java.util.Scanner;

public class Q2SwapNum {
	//Write a Java Program to swap two numbers
	
public static void main(String[] args) {
		
	Scanner scan=new Scanner (System.in);
	System.out.println("Enter first number");
	int num1=scan.nextInt();
	System.out.println("Enter second number");
	int num2=scan.nextInt();
	System.out.println("Before swap : "+num1+" to "+num2);
	int temp;
	
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After swap : "+num1+" to "+num2);	
}

}
