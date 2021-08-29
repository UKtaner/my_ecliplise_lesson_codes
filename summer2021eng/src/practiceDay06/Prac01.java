package practiceDay06;

import java.util.Arrays;		//  input[2,6,7,9,0 ]

public class Prac01 {
/*
9. Write a method that accepts an Array of integers and returns the max.
*/
	static int mymax(int input[]) {
	
		int max=0;
		int max2=0;
	for(int i=0;i<input.length;i++) {	
		if(input[i]>max) {
			input[i]=max;
			if(max>max2) {
				
				int temp=max;
				max2=max;
				max2=temp;
				
				
			}
		
	
	
	
	
	}
	}
	return max2;}
	
	
	public static void main(String[] args) {
		
		System.out.println(mymax(new int[] {113,95,45,112,8,11,90}));
	}

}
