package day05_ifelseif_nestedif;

import java.util.Scanner;

public class IfElse_Review01 {

	public static void main(String[] args) {
		/*
        Ask user to enter his/her age and gender(M ==> Male, F==>Female)
        If the age is negative, and gender is different from 'M' and 'F' give error message
        If the age is greater than 65 and gender is male print "Retired" otherwise "Need to work"
        If the age is greater than 60 and gender is female print "Retired" otherwise "Need to work"
     */
       
// equals()==> not invokes with char. So you can use "=="
// char ==> ' '

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age :");
		int age = scan.nextInt();
		System.out.println("Enter your gender : ");
		char gender = scan.next().toUpperCase().charAt(0);  
		// QUESTION TO MENTOR : IF USED UPPRECASE, DO WE HAVE TYPRE UPPERCASE 'M' AND 'F'
		
		if (age<0) {
			System.out.println("your entry in invalid");
		}else if (!(gender=='M' || gender=='F')) {
			System.out.println("your entry in invalid");
			
		}else if(gender=='M') {    //QUESTION TO MENTOR : WHY DO WE INSERT THE GENDER FIRST WHY NOT AGE 
			if (age>65) {
				System.out.println("retired");
			}else {
				System.out.println("need to work");
			}
		}else if (gender=='F') {
			if(age>60) {
				System.out.println("retired");
			}else {
				System.out.println("need to work");
			}
		scan.close();
		}
				
		
	}
	}


