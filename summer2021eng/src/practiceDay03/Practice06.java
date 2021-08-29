package practiceDay03;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		   /* 
	       * Type java code by using if-else statement,
	       * Write a program to print absolute value of a number entered by user.
	       */
// 1. way		 
		Scanner scan=new Scanner(System.in);
		  System.out.println("Please enter any number");
		  int num=scan.nextInt();
		  if(num>=0) {
			  System.out.println(num+" is absolute");
		  }else
			  System.out.println(-1*num+" is absolute");
//	2. way		
/*	
		String result = num<0? "absolute of "+ num+ " is " + (-1*num):num>=0 ? ("absolute of "+num+ " is " + num):"Try again!!!";
		
		  System.out.println(result);  		   		  
 */
	
 //  Math.abs(num)==> can also use		 
		}
	}