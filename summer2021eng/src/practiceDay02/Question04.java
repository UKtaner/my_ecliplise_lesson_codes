package practiceDay02;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		// ask user to enter an e-mail address
        // then if it contains "hotmail" replace it with "gmail"
        // e.g: johnbrown@hotmail.com ==> johnbrown@gmail.com

		 /*Scanner scan=new Scanner(System.in);
		 System.out.println("Enter your email address");
		 String email =scan.next();
		
		String s=email.replace("hotmail","gmail");
		 System.out.println(s);*/
	// 2. way	
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Please enter a hotmail address");
		 String email=scan.nextLine();
		 if(email.contains("@hotmail")) {
			 System.out.println(email.replace("@hotmail.com","@gmail.com"));
		 }else {
			 System.out.println("Please enter correct hotmail address");
		 }
/*3. my way
 	Scanner scan=new Scanner(System.in);
		 System.out.println("Enter your email address");
		 String mail =scan.next();
		 
		
		 if(mail.contains("hotmail")) {
			 System.out.println(mail.replace("hotmail", "gmail"));
			 }
		 else {
			 System.out.println("Entry is OK!!!");
		 }		 
 */
		 
		 
		 
		 
		}
	
	
	
	}


