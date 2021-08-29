package day05_ifelseif_nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		/*
        Ask user to enter his/her age and gender(M ==> Male, F==>Female)
        If the age is negative, and gender is different from 'M' and 'F' give error message
        If the age is greater than 65 and gender is male print "Retired" otherwise "Need to work"
        If the age is greater than 60 and gender is female print "Retired" otherwise "Need to work"
     */
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter you age..");
        int age = scan.nextInt();
        System.out.println("Please enter your Gender...(M ==> Male, F==>Female)");
        char gender = scan.next().toUpperCase().charAt(0);// charAt for first index 
        // .toUpperCase==> for (lowerCase problems)male
        
        if(age< 0) {
            System.out.println("invalid age");
            
        }else if(!(gender == 'M' || gender == 'F')) {
            System.out.println("invalid gender");
            
        }else if(gender == 'M') {
            if(age > 65) {
                System.out.println("Retired");
            }else {
                System.out.println("Need to work");
            }
            
        }else if(gender == 'F') {
            if(age >60) {
                System.out.println("Retired");
            }else {
                System.out.println("Need to work");
            }
        }
         scan.close();  // otherwise scanner still will work.     
    }
}


//if(gender=='M'||age>65) {
//	System.out.println("retired");
//
//double