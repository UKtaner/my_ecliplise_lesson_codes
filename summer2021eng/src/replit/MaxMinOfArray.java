package replit;

import java.util.Arrays;
/*
 Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array

Input : {3,2,5,4,1,6}

Output : 

min: 1 

max: 6
 */
public class MaxMinOfArray {
    public static int max(int[]input) {
    	int max=0;
    	Arrays.sort(input);
    	return max=input[input.length-1];
    } 
    public static int min(int[]input) {
    	int min=0;
    	Arrays.sort(input);
    	
    	
    	return min=input[0];
    }	
	

	public static void main(String[] args) {
		
		System.out.println("min: "+min(new int[] {3,2,5,4,1,6}));
		System.out.println("max: "+max(new int[] {3,2,5,6,4,1,6}));	
	    

	}

}
