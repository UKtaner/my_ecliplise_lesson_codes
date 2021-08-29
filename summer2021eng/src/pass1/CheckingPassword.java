package pass1;

import java.util.Scanner;
/* Write a Java method to check whether a string is a valid password. Go to the editor
Password rules:
	A password must have at least ten characters.
	A password consists of only letters and digits.
	A password must contain at least two digits.
​
	Expected Output:
                              
	Input a password (You are agreeing to the above Terms and Conditions.): abcd1234           
	Password is valid: abcd123456 
*/
public class CheckingPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a Password: ");
        String password = input.next();
        if (isValid(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
    public static boolean isValid(String password) {
        if (password.length() < 8) { 
            return false;
        } else {    
            char c;
            int count = 0; 
            for (int i = 0; i < password.length(); i++) {
                c = password.charAt(i);
                if (!Character.isLetterOrDigit(c)) {        
                    return false;
                } else if (Character.isDigit(c)) {
                    count++;
                }}
               if (count < 2)   {   
                        return false;
                    } return true;  
                
    }}}
 