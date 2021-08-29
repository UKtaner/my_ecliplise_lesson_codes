package dayInterviewQuestions;

public class IsArmstrong {
// Create a method to check if a number is armstrong or not
 //153 is an armstromg number
  //1*1*1  +  5*5*5  +  3*3*3 =153
	
	static void isArmstrong(int input) {
	       int number, remainder, sum = 0;
	        number = input;
	        while (number != 0)
	        {
	        	remainder = number % 10;
	            sum +=Math.pow(remainder, 3);
	            number /= 10;
	        }
	        if(sum == input)
	            System.out.println(input + " is an Armstrong number");
	        else
	            System.out.println(input + " is not an Armstrong number");
	    }
	static void isArmstrong2(int input) {
	int number, remainder, sum = 0;
    number = input;
	for( ;number!=0;number /= 10){
		remainder = number % 10;
	    sum +=Math.pow(remainder, 3);
	}
	   if(sum == input)
           System.out.println(input + " is an Armstrong number");
       else
           System.out.println(input + " is not an Armstrong number");
   }
	   public static void main(String[] args) {
		   isArmstrong(370);  
		   isArmstrong2(153);	   }
}

//Java Program to Print Armstrong numbers from 0 to 999
