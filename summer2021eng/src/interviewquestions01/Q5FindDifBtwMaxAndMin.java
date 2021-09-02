package interviewquestions01;

import java.util.Arrays;
import java.util.Scanner;

public class Q5FindDifBtwMaxAndMin {

	public static void main(String[] args) {
		 /*
	 	Create a function that takes an array and 
	 	returns the difference between the biggest and the smallest numbers.
	    Ask user to enter array elements.
	*/
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter array length");
		int len=scan.nextInt();
		
		int []arr=new int[len];
		System.out.println("Enter array elements");
		
		for(int i=0;i<len;i++) {
		
	 arr [i]=scan.nextInt();
	}
		System.out.print(Arrays.toString(arr));
		System.out.println();
		Arrays.sort(arr);
		System.out.print(Arrays.toString(arr));
		
		int diffOfMaxAndMin=arr[arr.length-1]-arr[0];
		System.out.println();
		System.out.println(diffOfMaxAndMin);
	}
}