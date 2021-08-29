package replit;

import java.util.Scanner;

public class UniqueChar {


	public static void main(String[] args) {
		/*	Ask user to type a name, 

		the length of name should be 3.

		Then check if the name has same characters.

		If the String has same characters 

		Print “String has duplicate characters”
		Else

		Print “String has unique characters” 

		Please use ternary.


		Input : 

		ala

		OutPut:

		String has duplicate characters*/
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Enter a name:");
		String name=scan.next();	
		
		if(name.length()==3) {
			
			if(name.indexOf(name.charAt(0))!=(name.lastIndexOf(name.charAt(0)))) {
				System.out.println("String has duplicate characters");	
				
			}else {
				System.out.println("String has unique characters");
			}
		}
	}

}