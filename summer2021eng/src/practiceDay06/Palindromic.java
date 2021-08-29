package practiceDay06;

import java.util.Scanner;

public class Palindromic {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("enter a number");
	   int  n=scan.nextInt();
	 String   str="" + n;
	    String rev="";
	    
	for  ( int i = str.length()-1 ; i>=0 ;i--){
	    	 
	   rev+=str.charAt(i);
	    
	    }
	    
	    if (str.equals(rev)) {
	    	
	    	System.out.println("PALINDROMIC NUMBER");
	    }else 
	    
	    System.out.println("NOT A PALINDROMIC NUMBER");
	}

}
