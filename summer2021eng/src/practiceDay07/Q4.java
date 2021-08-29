package practiceDay07;

public class Q4 {
	/*
	 Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.

	input : ade1r4d3 

	output : 8

	         Hint :
	         Use Character.isDigit()
	         Integer.valueOf()
	 */
	
	static int sumOfDigit(String str) {
		int sum=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				
				sum+=ch;
				sum=Character.getNumericValue(sum);
			}
			
		}
		return sum;
	}
	public static void main(String[] args) {
		
		System.out.println(sumOfDigit("ade1r4d3"));
		
		}
		}