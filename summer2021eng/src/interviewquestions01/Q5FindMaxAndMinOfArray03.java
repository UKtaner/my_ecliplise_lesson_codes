package interviewquestions01;

public class Q5FindMaxAndMinOfArray03 {

	public static void main(String[] args) {
/*
Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array
Input : {3,2,5,4,1,6}
Output : 
min: 1 
max: 6
 */	
		findMaxValue(new int [] {3,2,5,4,1,6});
	
	}
	public static void findMaxValue(int []input) {
		int max=input[0];
		int min=input[0];
		for(int i=0;i<input.length;i++) {
			if(input[i]>max) {
				max=input[i];
			
			}
		}System.out.println("Max :"+max);
		
		for(int i=0;i<input.length;i++) {
			if(input[i]<max) {
				min=input[i];
	}

}System.out.println("Min :"+min);

	}
	}