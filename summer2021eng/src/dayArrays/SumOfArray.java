package dayArrays;

public class SumOfArray {

	public static void main(String[] args) {
// Write a Java program to sum values of an array
	
		int n[]= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		for(int i=0;i<n.length;i++) {
			sum=sum+n[i];
			
		}
		System.out.println("The sum of the array: "+sum);
	}

}
