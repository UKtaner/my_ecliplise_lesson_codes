package practiceDay05;

import java.util.Scanner;                                  //   "123"

														//      "1	2 |	3	4"
public class MidCharMethod {
	/*Write a Java method to display the middle character of a string.	
	Note: 
	a) If the length of the string is even there will be two middle characters.
	b) If the length of the string is odd there will be one middle character */
	
	
	 public static void midChar(String str){  
	
		 int len= str.length();
		 int priorNum;
		 int afterNum;
	// a................................................	  
		 if (str.length()%2==0) {
			 afterNum=str.length()/2;
			 priorNum=afterNum-1;
			 
			System.out.println(String.valueOf(str.charAt(priorNum))+(String.valueOf(str.charAt(afterNum))));	 
		 }
		 else {
			
			 afterNum=str.length()/2; 
			 System.out.println(String.valueOf(str.charAt(afterNum)));
		 }
	 }
	 
	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);  
		 System.out.println("You can enter either string or integer");  
		 String str=scan.next();  
		 midChar(str); 
		 scan.close();  
	}
	 
}



