package pass1;

import java.util.Scanner;

public class SSNconvertion {
	/*
    Ask user to enter SSN (9 digits) 
    Print the SSN on the console after converting first 5 digits to *
    Ex: 123456789 ==> *****6789
    */
	public static void main(String[] args) {
	
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter your SSN:");

		String ssn=scan.next();
		
		//System.out.println("*****"+ssn.substring(5));
		
		System.out.println(ssn.replace(ssn.substring(0,5), "*****"));
	}

}
