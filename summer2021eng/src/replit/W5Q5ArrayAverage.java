package replit;

import java.util.Arrays;

public class W5Q5ArrayAverage {
/*
 Write a java program that calculates the average value of array elements

input[]= {1,2,3,4,5,6,7}

Output : 4
 */
	static int ArrayAverage(int []input) {	
		int sum=input[0];
		for(int i=0;i<input.length;i++) {
			sum+=input[i];	
			
			//for(int each:input) {
				//sum+=each;	
					
		}	
		return sum/input.length;	
	}
	public static void main(String[] args) {
	System.out.println((ArrayAverage(new int [] {1,2,3,4,5,6,7})));
	}
}
