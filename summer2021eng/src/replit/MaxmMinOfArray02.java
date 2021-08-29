package replit;
/*
Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array

Input : {3,2,5,4,1,6}

Output : 

min: 1 

max: 6
*/
public class MaxmMinOfArray02 {


	static int getmax(int[]input) {
		
		int max=0;
		
		for(int i=1;i<input.length;i++) {
			if (input[i]>max) {
				max=input[i];
		}}
		return max;	
	}
	static int getmin(int[]input) {
		int min=input[0];
		for(int i=1;i<input.length;i++) {
			if (input[i]<input[0]) {
				min=input[i];
				
		}}

		return min;
	}
	public static void main(String[] args) {
	System.out.println(getmax(new int[] {1,2,34,34,5,6}));
	System.out.println(getmin(new int[] {-1,0,0,1,2,34,5,6}));

	}

}
