package practiceDay02;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		
		 /*Write a program to print a number entered by user,
		 * which are not divisible by 5 or divisible by 5
		 */
			
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter number");
	 int num=scan.nextInt(); 
/* 1.way	
	String result=num%5==0? num +" is divisible by 5":num%5!=0 ?num +" is not divisible by 5":"number must be positif";
		System.out.println(result);	   

2. way
	String result= num<0 ? "number must be positif":num%5==0? num +" is divisible by 5":num +" is not divisible by 5";
	System.out.println(result);

3. way
	       if(num>0) {
	    	   if (num%5==0) {
	    		   System.out.println(num + " is divisible by 5.");	  
	       }
	    	   else {
	   			System.out.println(num +" is not divisible by 5.");
	}
			
	}else {
		System.out.println("Enter positive number...");
*/	
	}

}
