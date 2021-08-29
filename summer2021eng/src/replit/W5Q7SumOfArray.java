package replit;

public class W5Q7SumOfArray {
/*
 Write a method that accepts an array as parameter and returns sum off all elements in the array 
 then print the result in the main method.
Eg :
input : {1,2,3,4,5,6,7,8};
output: 36
 */
	
	static void sumOfArray(int[]input) {
		
		int sum=0;
		
		for(int i=0; i<input.length;i++) {//for(int i:input)
			
			sum+=input[i];				 //sum+=i;
		}
		System.out.println(sum);

	}

	public static void main(String[] args) {

		sumOfArray(new int [] {1,2,3,4,5,6,7,8});
		
	}

}
