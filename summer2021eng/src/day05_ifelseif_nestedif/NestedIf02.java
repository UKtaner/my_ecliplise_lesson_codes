package day05_ifelseif_nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		  /*
        Ask user to enter an integer
        If the integer is less than zero check if it is less than -9. If it is less than -9 
            print "Too small" otherwise print "Small"
        If the integer is greater than zero check if it is greater than 9. If it is gretaer than 9
            print "Too big" otherwise print "Big"
     */
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer..");
        int num = scan.nextInt();
        
        if(num < 0) {
            if(num < -9) {
                System.out.println("Too small");
            }else {
                System.out.println("Small");
            }
            
        }else if(num >0) {
            if(num >9) {
                System.out.println("Too big");
            }else {
                System.out.println("Big");
            }
        }else {
            System.out.println("You smart... Please enter + or  - number");
        }
        scan.close();
        
        /*
         * Homework
         * Type java code by using if-else statement,
if the password is “JavaLearner”, output will be “The password is true”.
Otherwise, output will be “The password is false”.
Type java code by using if-else statement.
A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity and unit price then judge and print total cost for user.
If the quantity is less than 1000 output will be “No discount.”
         */
        
        
        
    }
}