package practiceDay07;

public class SumOf3 {
/*
 12. Write a method that accepts an array and returns true if the sum of all 3's in the array is exactly 9. 
 EX: Input : {2,3,5,3,6,3,7} output :true Input : {2,3,4,5,6,3,7} output :false
 */
	public static boolean sumAll(int... list) {
		int sum = 0;
		for (int w: list) {
			if (w==3) {
			sum+=w;	
			}
		}
		return sum==9;
	}
	
	public static void main(String[] args) {
		System.out.println(sumAll(2,3,4,5,6,3,7));

	}

}