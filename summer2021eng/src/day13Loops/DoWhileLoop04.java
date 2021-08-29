package day13Loops;

import java.util.Scanner;

public class DoWhileLoop04 {

	public static void main(String[] args) {
/*Ask user to enter password.
 If the password has more than 6 characters print "Password is valid..."
 Otherwise, print "Make the password longer than 6 characters" and ask user to enter a new password
*/

       
       Scanner scan = new Scanner(System.in);
       
       String passw= "";
       
       do {
           System.out.println("Enter a password");
           
           passw= scan.nextLine();
           
           if(passw.length()<=6) {
               System.out.println("This is not what I want... INVALID password... make it more tha 6 characters");
           }
           
       }while(passw.length()<=6);
       
       System.out.println("VALID password");
       
   }
}