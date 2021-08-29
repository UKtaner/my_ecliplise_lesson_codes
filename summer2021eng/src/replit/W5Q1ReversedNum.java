package replit;

public class W5Q1ReversedNum {
/*
 Write a return method to reverse number.
Input  : 12345 
Output : 54321

 */
	
	static void reversedNum(int input) {
	int reversed=0;
	
	while(input>0) {
		
		reversed=input%10+reversed*10;
		input/=10;
		
	}
	
	System.out.println(reversed);	
		
	}
	static int reversedNum2(int input) {
		int reversed=0;		
		for(;input > 0; input /= 10) {
			int digit = input % 10;
		    reversed =reversed*10 + digit;		    
		}	
		return reversed;	
	}
	public static void main(String[] args) {	
		reversedNum(12345);
		System.out.println(reversedNum2(12345));
	}

}
