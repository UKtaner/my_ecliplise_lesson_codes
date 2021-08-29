package pass1;

public class SumOf3s {
	/*
	 12. Write a method that accepts an array and returns true if the sum of all 3's in the array is exactly 9. 
	 EX: Input : {2,3,5,3,6,3,7} output :true Input : {2,3,4,5,6,3,7} output :false
	 */
	
	static boolean sumOf3(int[] arr) {
	int count=0;
	for (int num:arr) {
		if(num==3) 
			count++;		
	}
	return count==3;
	}
	
	static boolean validator(int[]input) {
		int sum=0;
		for(int i=0;i<input.length;i++) {
			if(input[i]==3) {
				sum+=3;
			}
			}	return sum==9;	
	}
	
	public static void main(String[] args) {
		
		System.out.println(sumOf3(new int[] {2,3,5,3,6,3,7}));
		System.out.println(validator(new int[] {2,3,4,5,6,3,7}));
	}

}
