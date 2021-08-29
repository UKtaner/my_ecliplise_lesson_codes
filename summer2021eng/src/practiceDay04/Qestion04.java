package practiceDay04;

import java.util.Scanner;

public class Qestion04 {

	public Qestion04() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	/*
0)Ask user to enter two integers
               1)Swap the integers
               2)EXAMPLE:
                INPUT: a= 3
                       b= 5
                OUTPUT: a= 5
                        b= 3
	 */

	Scanner scan=new Scanner (System.in);
	
	
	System.out.println("enter a number");
	int n1=scan.nextInt();
	
	System.out.println("Enter a number");
	
	int n2=scan.nextInt();
	
	System.out.println("a="+n1+"\nb="+n2);
//	int temp;
//	temp=n1;
//	n1=n2;
//	n2=temp;
			
		

		int temp=n2;
		n2=n1;
		n1=temp;
		System.out.println("a="+n1+"\nb="+n2);
	
	}

}
