package replit;

public class AverageOfArray {
	/*
	 Write a java program that calculates the average value of array elements

	input[]= {1,2,3,4,5,6,7}

	Output : 4	
	 */

	public static void main(String[] args) {
		int sum=0;
	int arr[]=	{1,2,3,4,5,6,7};
	for (int i=0; i<arr.length;i++) {
		sum+=arr[i];	
	}	
		System.out.println(sum/arr.length);
	}
}

//avarage(new int[] {1,2,3,4,5,6,7});