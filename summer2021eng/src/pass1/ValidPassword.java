package pass1;

import java.util.Scanner;

public class ValidPassword {
	/*11. Write a Java method to check whether a string is a valid password.
	 *  Go to the editor
		Password rules:
		A password must have at least ten characters.
		A password consists of only letters and digits.
		A password must contain at least two digits.

		Expected Output:
		1. A password must have at least eight characters.                                             
		2. A password consists of only letters and digits.                                         
		3. A password must contain at least two digits                                        
		Input a password (You are agreeing to the above Terms and Conditions.): abcd1234           
		Password is valid: abcd1234 
*/
	 static boolean isValid(String password) {
		if(password.length()<8) {
		return false;
	}else {
		int numCounter=0;
		int charCounter=0;
		for(int i=0; i<password.length()-1;i++) {
			char ch=password.charAt(i);
			if (isNumber(ch)) 
				 numCounter++;
            else if (isLetter(ch)) 
            	 charCounter++;
            else 
            	return false;
        }
        return (charCounter >= 2 && numCounter >= 2);
    }
		}
     static boolean isLetter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }
     static boolean isNumber(char ch) {
        return (ch >= '0' && ch <= '9');
    }
     static boolean isRegression(String password) {
   
		return password.contains("[a-zA-Z0-9]");
    	 
     }
     public static void main(String[] args) {
	Scanner input=new Scanner (System.in);
	System.out.print("Please enter a Password: ");
	String password=input.next().replaceAll("", null);
	System.out.println(isValid(password)?"Password is valid: "+password:"Password is not valid: "+password);
	
	}
		}

