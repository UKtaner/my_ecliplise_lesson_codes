package replit;

public class Replit07 {
/*
 7.Write a method that accepts an array as parameter and returns sum off all elements in the array 
 then print the result in the main method.
Eg : 
input : {1,2,3,4,5,6,7,8};
output: 36
 */
	static int sumarr(int input[]) {
		int sum=0;
		for(int i=0; i<input.length;i++) {
			sum+=input[i];		
		}
		return sum;
	}	
	public static void main(String[] args) {
		int array[] = new int[]{1,2,3,4,5,6,7,8}; 	
		System.out.println(sumarr(array));
	}

}
