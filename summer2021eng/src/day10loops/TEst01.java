package day10loops;

import java.util.Scanner;

public class TEst01 {

	public static void main(String[] args) {
		/*
Write a do-while loop that asks the user to enter two numbers. 
The numbers should be added and the sum displayed. 
The loop should ask the user whether he or she wishes to perform the operation again. 
If so, the loop should repeat; otherwise it should terminate.
		 */
		
Scanner scan=new Scanner(System.in);
char choice;

do {
System.out.println("Enter Number1");
int num1=scan.nextInt();

System.out.println("Enter Number2");
int num2=scan.nextInt();
int sum=num1+num2;
System.out.println(sum);
System.out.println("Do you want to continue y/n?");

choice=scan.next().toLowerCase().charAt(0);
System.out.println();
}while(choice=='y');
	

		
		
	}}
			

			
		
   
	

		
		
	    
	    


