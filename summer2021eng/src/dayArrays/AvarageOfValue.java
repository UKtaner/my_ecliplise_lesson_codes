package dayArrays;

public class AvarageOfValue {
//Write a Java program to calculate the average value of array elements.
	
	static int averageOfArray(int []input) {
		int sum=0;
		
		for(int i=0;i<input.length;i++) {
			sum+=input[i];
		}
		
		
		return sum/input.length;	
	}
	public static void main(String[] args) {
			System.out.println((averageOfArray(new int [] {20, 30, 25, 35, -16, 60, -100})));
		
	}

}
