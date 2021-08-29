package replit;

public class SumOfDigitInStr3 {
/*
 3.Write a method which accepts a String as parameter and prints the sum of the digits,
 present in the given string.
input : ade1r4d3 
output : 8
         Hint :
         Use Character.isDigit()
         Integer.valueOf()
         
 */
//Float a = Float.valueOf("80"); ==>80.0

	 static int sumOfdigits(String number) {
	     int sum = 0; 
	     for(int i=0; i<number.length(); i++) {
	    	 char ch = number.charAt(i);
	         if(Character.isDigit(ch)) {
	        	int n = Character.getNumericValue(ch);        
	             sum += n;
	          }
	      }
	      return sum;
	  }
	public static void main(String[] args) {	
		System.out.println(sumOfdigits("ade1r4d3 "));
		}	    
	}