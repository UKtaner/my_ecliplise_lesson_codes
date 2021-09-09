package interviewquestions01;

import java.util.Arrays;
import java.util.Scanner;

public class Q5FindMaxAndMinOfArray02 {

	public static void main(String[] args) {
/*
 Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array
Input : {3,2,5,4,1,6}
Output : 
min: 1 
max: 6
 */	
		findMaxAndMin(new int [] {3,2,5,4,1,6});		
	}

	static void findMaxAndMin(int input[]) {
	
	Arrays.sort(input);
	
	System.out.println("Max: " +input[input.length-1]+"\nMin: "+ input[0]);
	
	
	
	
	}
	
	
}
