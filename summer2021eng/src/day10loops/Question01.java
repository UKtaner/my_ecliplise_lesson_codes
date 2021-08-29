package day10loops;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
	 	Ask use to enter firstname and lastname under given conditions;
	 	
	 	1)If user uses space characters at the beginning or at the end remove them.
	 	2)If user enters nothing or just space character, give a message like
	 	  "Just space characters or nothing is not valid"
	    3)If user does not use space character between first and last name 
	      give a message like "One of the lastname and first name is not entered 
	      or space is not used between firstname and lastname"
	    4)If user uses multiple space characters between firstname and lastname 
	      make it single  
	    5)Initials of firstname and lastname should be uppercase, 
	      other characters should be lowercases.
	      If user does not enter the name in this format fix it.
   */
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter your firstname and lastname...");
	String name = scanner.nextLine();
	
	//System.out.println("Before:" + name);
	/*
	 Note: Just by using String methods, you cannot change the original String.
	       Because of that Strings are called "Immutable"
	       If you want to change the original String, you have to do assignment like below
	*/
	
	//1.Step:
	name = name.trim();
	//System.out.println("After:" + name);
	
	//2.Step:
	if(name.isBlank()) {
		System.out.println("Just space characters or nothing is not valid");
	}
	
	//3.Step:
	if(!name.contains(" ")) {
		System.out.println("One of the lastname and firstname is not entered or space is not used between firstname and lastname");
	}
	
	//4.Step:
	if(name.indexOf(" ")!=name.lastIndexOf(" ")) {
		
		int firstIdx = name.indexOf(" ");
		int lastIdx = name.lastIndexOf(" ");
		name = name.substring(0, firstIdx) + " " + name.substring(lastIdx+1);
		System.out.println(name);
	}

	//5.Step:
	if(!(name.charAt(0)>='A' && name.charAt(0)<='Z')) {
		
		String firstNameFormatted = name.substring(0, 1).toUpperCase() + name.substring(1, name.indexOf(" ")).toLowerCase();
		
		System.out.println(firstNameFormatted);
	}
	
	if(!(name.charAt(name.indexOf(" ") + 1)>='A' && name.charAt(name.indexOf(" ")+1)<='Z')) {
		
String lastNameFormatted = name.substring(name.indexOf(" ") + 1, name.indexOf(" ") + 2).toUpperCase() + name.substring(name.indexOf(" ") + 2).toLowerCase();
		
		System.out.println(lastNameFormatted);
	}
	}
}