package replit;

import java.util.Arrays;

public class W5Q6ArrayMinMax {
/*
 Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array
Input : {3,2,5,4,1,6}
Output : 
min: 1 
max: 6
 */
	static void minmax(int []input) {
		Arrays.sort(input);
		int min=input[0];
		int max=input[input.length-1];
		System.out.println("min: "+min+"\nmax: "+max);
	}
	static void minmax1(int []input) {
	int min=0;
	int max=0;
	for(int i=0;i<input.length;i++) {
		if(input[i]>max) {
			max=input[i];	
		}
		if(input[i]<min) {
			min=input[i];
	}}	
	System.out.println("min: "+min+"\nmax: "+max);
	}
	public static void main(String[] args) {
		minmax((new int[] {3,2,5,4,1,0,6,6,7,-1}));
		minmax1(new int[] {3,2,5,4,1,0,6,6,7,-1});
	}}
