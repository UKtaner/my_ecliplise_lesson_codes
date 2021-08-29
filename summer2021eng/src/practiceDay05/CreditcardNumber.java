package practiceDay05;

import java.util.Scanner;

public class CreditcardNumber {

	public static void main(String args[]) {
		/*Ask user Name, Surname and credit card numbers than convert it to special form. 
		 * (Initials for name and surname should be uppercase)
		(Check credit card number, if there aren’t 16 digit print “Invalid credit card number”

		Input :

		John White 1234234534561478

		Output :

		Name : J* W**

		CCN : ** ** **** 1478*/
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter Name, Surname and credit card numbers:");
		
		String fName= scan.next();
		String sName= scan.next();
		String creditCard=scan.next();
		
		String formattedFname=fName.substring(0, 1).toUpperCase()+fName.replaceAll(fName.substring(0), "***");
		String formattedSname=sName.substring(0, 1).toUpperCase()+sName.replaceAll(sName.substring(0), "****");
		
		String name = formattedFname+" "+formattedSname;
		System.out.println("Name : "+name);
		
		if (creditCard.length()==16) {
			
			String crd=creditCard.replaceAll(creditCard.substring(0, 12),"************")+creditCard.substring(16);
			System.out.println("CCN : "+crd);
		}else {
			System.out.println("Invalid credit card number");
		}
				
	}
	
}			
	
		 
	
		
		 
		 
		 
	        	
	
	
		
	
	
		



