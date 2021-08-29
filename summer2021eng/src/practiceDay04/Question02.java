package practiceDay04;

import java.util.Scanner;

public class Question02 {

	public Question02() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	/*
	 Ask user to enter a character and print the ASCII value of that character
	 */

	Scanner scan=new Scanner (System.in);
	
	System.out.println("Enter a char.:");
	
	String name=scan.next();
	
	
	char ch1=name.charAt(0);
	
	int scii=ch1;
	System.out.println(scii);
	
	
	
	}

}
