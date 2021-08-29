package practiceDay03;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		
		/*
		 * Ask user to enter two numbers Show them e menu of operation signs and ask
		 * them to choose one. "Addition: 1 , Subtraction : 2 , Multiplication : 3,
		 * Division : 4 Print the result on the console
		 * 
		 * EXAMPLE: INPUT: Num1 : 23 Num2 : 55 OUTPUT : Result : 78
		 */
// 1. way....
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter any number");
		int num1=scan.nextInt();
		System.out.println("Please enter second number");
		int num2=scan.nextInt();
		System.out.println();
		System.out.println("Which operator do your prefer?\n1 for addition\n2 for subtraction\n3 for multiplication\n4 for division");
		int operation=scan.nextInt();
        switch (operation) {
		case 1:
			System.out.println("The result of Addition Operation is"+" "+(num1+num2));
			break;
		case 2:
			System.out.println("The result of Addition Operation is"+" "+(num1-num2));
			break;
		case 3:
			System.out.println("The result of Addition Operation is"+" "+(num1*num2));
			break;
		case 4:
			System.out.println("The result of Addition Operation is"+" "+(num1/num2));
			break;
		default:
			break;
/* 2. way			
	Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter any number :\n");
		int num1 = scan.nextInt();
		System.out.println("Enter your second number :\n");
		int num2 = scan.nextInt();
		
		System.out.println("Choose your operation");
		System.out.println();
		
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
	
		double operation = scan.nextDouble();
        double addition = 1;
        double subtraction = 2;
        double multiplication = 3;
        double division = 4 ;
        
		if (operation==addition) {
			System.out.println("Result : " +(num1+num2));
		}else if (operation==subtraction) {
			System.out.println("Result : " +(num1-num2));
		}else if (operation==multiplication) {
			System.out.println("Result : " +(num1*num2));
		}else if (operation==division) {
			System.out.println("Result : " +(num1/num2));
		}else {
			System.out.println("Check your entry....");
		}	
	
	*/	}
		
	}

}
