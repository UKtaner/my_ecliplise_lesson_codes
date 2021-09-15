package interviewquestions01;

public class Q9GetPairsCount02 {
	// Java implementation of simple method to find count of
	// pairs with given sum.
	public static void main(String[] args) {
		int[] input = { 1, 5, 7, -1, 5 };
        int target = 6;
        getPairsCount(input, target);

	}
	public static void getPairsCount(int[] input, int target) {
		int count=0;		
		for(int i=0;i<input.length;i++) {		
		for(int k=i+1;k<input.length;k++) {
				if(input[i]+input[k]==target) {
					count++;		        	
				}			
			}		
		}
		System.out.printf("Count of pairs is %d", count);		
	}	
}
