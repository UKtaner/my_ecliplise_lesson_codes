package day04_concat;

import java.util.Scanner;

public class ifElseStatement02 {

	public static void main(String[] args) {
		
		//Get the day name from user, then tell 
		//to the user if it is week day or weekend day
		
		// STRING CASE SENSITIVE ALI  and ALi is not same
		// so wee need to use equalsIgnoreCare
		// if we use equal, it will give problem for letter differences
		//== checks the value and address  
		//String day = scan.next().toLowerCase()//important

		 /*
        //Get the day name from user, then tell to the user if it is week day or weekend day 
        */
       
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a day name");
       String day = scan.next().toLowerCase();
       
       // == , ==> check the value and addresses if both are same it returns true otherwise, false
       // equal() ==> checks just the value by not ignoring cases
       //equalsIgnoreCase() checks the value by ignoring cases
       
       
//     if(day.equalsIgnoreCase("saturday")  || day.equalsIgnoreCase("sunday")) {
//         System.out.println("weekend");
//     }else {
//         System.out.println("Weekday");
//     }
       
   
   if(day.equals("saturday")  || day.equals("sunday")) {
       System.out.println("weekend");
   }else {
       System.out.println("Weekday");
   }
}
}

	