package replit;

public class W4ReverseNum {

	public static void main(String[] args) {
	/*	Write a java program to reverse the number which user entered.

		Input  :1238  
		Output :Reverse Of The Number: 8321

	    int num = 1238 , reversed = 0;

	    for(;num != 0; num /= 10) {
	    int digit = num % 10;
	    
	    reversed = reversed * 10 + digit;
	    
	    }

	    System.out.println("Reversed Number: " + reversed);
	  }*/

     int num = 1234, reversed = 0;

    // run loop until num becomes 0
    while(num != 0) {
    
      // get last digit from num
      int digit = num % 10;
      reversed = reversed * 10 + digit;

      // remove the last digit from num
      num /= 10;
    }

    System.out.println("Reversed Number: " + reversed);
  }
}	

/*
 String updatedNum="";
		int i=1;
		int num=123;
		while(num!=0) {
			int digit=num%10;
			updatedNum=digit+"";
			num=num/10;
			i++;
			System.out.print(updatedNum);
 */

