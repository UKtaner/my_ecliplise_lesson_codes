package pass1;

public class SumOf5s {
	/*
	 12. Write a method that accepts an array and returns true if the sum of all 5's in the array is exactly 15. 
	 EX: Input : {2,3,5,3,5,3,5} output :true Input : {5,3,4,5,6,3,7} output :false
	 */
	static boolean sumOf5(int[]input) {
		int sum=0;
		
		for(int i=0;i<input.length;i++) {
			if(input[i]==5) {
				sum=sum+5;
			}
		}
		
		return sum==15;
	}
	
	public static void main(String[] args) {
		
		System.out.println(sumOf5(new int[] {5,3,4,5,6,3,7}));
	}

}
