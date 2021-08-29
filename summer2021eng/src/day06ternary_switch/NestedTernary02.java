package day06ternary_switch;

import java.util.Scanner;

public class NestedTernary02 {

	public static void main(String[] args) {
		
		//all outputs are string then create string container 
	
				
				/*
				 	Ask user to enter his/her age and gender(M ==> Male, F==>Female)
				 	If the age is greater than 65 and gender is male print "Retired" otherwise "Need to work"
				 	If the age is greater than 60 and gender is female print "Retired" otherwise "Need to work"
				*/
				
		        Scanner scanner = new Scanner(System.in);
				System.out.println("Enter your age...");
				int age = scanner.nextInt();
				System.out.println("Enter your gender...(M/F)");
				char gender = scanner.next().toUpperCase().charAt(0);
				
				String result = gender == 'M' ? (age>65 ? "Retired" : "Need to work"):(age>60 ? "Retired" : "Need to work");
				System.out.println(result);
				
//				String result=age>65 && gender.equals("M")? "Retired":age>60 && gender.equals("F")?"Retired":"Need to work";
	
				
				
/*
  		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age...");
		int age =scan.nextInt();
		System.out.println("Enter your gender...");
		String gender = scan.next().toUpperCase();
		
		if (age>65 && gender.equals("M")) {
			System.out.println("Retired");
		}else if (age>60 && gender.equals("F")) {
			System.out.println("Retired");			
		}else {
			System.out.println("Need to work");
		}				
 */
				
	}
		}
		
		
	


