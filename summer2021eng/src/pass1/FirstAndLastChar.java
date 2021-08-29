package pass1;

import java.util.Scanner;
/*
Ask user to enter a String
Print the first and the last character of the String on the console.
*/
public class FirstAndLastChar {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a string");
	String str=scan.next();
	
	System.out.println("first index: "+str.substring(0,1));
	System.out.println("last index: "+str.substring(str.length()-1));

	}

}
