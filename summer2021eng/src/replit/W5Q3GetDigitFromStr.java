package replit;

public class W5Q3GetDigitFromStr {
/*
 Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.

input : ade1r4d3 

output : 8

         Hint :
         Use Character.isDigit()
         Integer.valueOf()
 */
	static int sumOfDigit(String str) {
		int num=0;
		int sum=0;
		for(int i =0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(Character.isDigit(ch)) {
				num=Character.getNumericValue(ch);
				sum+=num;
			}
			
		}
		return sum;
	}
	
	static int sumofdigit(String input) {
		
		int sum=0;
		
		int num=0;
		
		for(int i=0;  i<input.length();i++) {
			
		char ch=input.charAt(i);
		
		if(Character.isDigit(ch)) {
		
			sum+=Integer.valueOf(""+ch);
	
		}		
		}
		return sum;		
	}	
	public static void main(String[] args) {
		
		System.out.println(sumOfDigit("ade1r4d3"));
		System.out.println(sumofdigit("ade1r4d3"));

}}
