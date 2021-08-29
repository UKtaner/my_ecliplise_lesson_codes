package day29exceptionabstraction;

import java.util.Scanner;

public class E01 {
//IllegalArgumentException==> unchecked exception.
	// When we have a method, we should handle it....
/*Difference between throws and throw
 1. location
 throws is after method paranthesis	
 throw is inside the method body
 2. syntax
 throws can be used only ones
 throw is can be used more than ones
 3. usage
 throws FOR DECLERATION
 throw new FOR HANDLING  	
 	
 */
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter your age...");
		
		int age=scan.nextInt();
		try {
		
			
		setAge(age);// problem is here, when we use this method, error will occur.so lets handle it by using try-catch
	}catch(IllegalArgumentException e) {
		System.out.println("Do not use negative values for ages...");
	}
}
	
	public static void setAge(int age) throws IllegalArgumentException{
		if(age<0) {
			throw new IllegalArgumentException();// prog first stoped at this line	
		}
		System.out.println("Your age is "+age);	
	}
}
