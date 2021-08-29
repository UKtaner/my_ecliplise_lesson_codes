package practiceDay04;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		
		
		  long count,sum=0,digits;
		    Scanner scan=new Scanner(System.in);
		//create a scanner object for input
		//get input from the user for rows
		System.out.print("Enter the number for num: ");
		long num=scan.nextInt();
		 count=num;
		while(num>0)
		{
		    digits=num%10;
		    sum=sum+digits;
		    num/=10;
		    
		}
		System.out.print("Given number is: "  + count);
		System.out.print("\nSum of the digits: "  + sum);
		}
		}