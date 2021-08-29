package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

	public class Scanner02 {

	public static void main(String[] args) {
	
		//Create Scanner Object
		Scanner scanner = new Scanner(System.in);
		
//		//Give message to user
//		System.out.println("Hey user, enter your firstname...");		
//		//Create a container to store data coming from user
//		String firstname = scanner.nextLine();
//		// firstname is  container
//		
//		System.out.println("Hey user, enter your lastname...");
//		String lastname = scanner.nextLine();
//		
//		System.out.println("Hey user, enter your address...");
//		String address = scanner.nextLine();
//		
//		System.out.println("You are retired. true or false?");
//		boolean isRetired= scanner.nextBoolean();
//		// note : to get string data
		
		//System.out.println("Hey user, enter your name...");
		//String name = scanner.next();// "next" only prints first string 
		
		System.out.println("Hey user, enter your fullName...");
		String fullName= scanner.nextLine(); // "nextLine" prints all strings
		
//		//Print the name on the console
//		System.out.println(firstname);
//		System.out.println(lastname);
//		System.out.println(address);
//		System.out.println("Your name is " +name);
		System.out.println(" your fullName is "+ fullName);
	}

}