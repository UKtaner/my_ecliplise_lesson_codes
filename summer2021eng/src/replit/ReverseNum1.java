package replit;

import java.util.Scanner;

public class ReverseNum1 {
/*
 Write a return method to reverse number.

Input  : 12345 

Output : 54321
 */
	
	public static int reverseNum(int num) {
		
		int reversed=0;
		
		while(num!=0) {
			int lastdigit=num%10;
			reversed=reversed*10+lastdigit;
			
			num/=10;
			
		}
		
		return reversed;	
	}
	
	public static void main(String[] args) {
	System.out.println(reverseNum(12345));
		
	}

}
