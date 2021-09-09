package interviewquestions01;

public class Q7isArmstrongNum01 {

	/*
	 	A number is called an Armstrong number if it equals to the sum of the cube of its every digit.
	    For example, 153 is an Armstrong number because of 153= 1 + 125 + 27, which is equal to 1^3+5^3+3^3.
	    You need to write a program to check if the given number is Armstrong number or not.
	*/
	public static void main(String[] args) {
	
		isArmstron(152);

	}
	
	
	public static void lenOfDigit(int input) {
	int len=0;
	
	while(input>0) {
		input=input/10;
		len++;		
	
	}
	public static void isArmstron(int input, int len) {
	int sum=0;
	while(input>0) {
		int digit=input%10;
		sum+=Math.pow(digit, len);
		input=input/10;
	}
		if(sum==input) {
			System.out.println(input+" is Armstrong");
		}else {
			System.out.println(input+" is Armstrong");
		}
	}
	
	


}
