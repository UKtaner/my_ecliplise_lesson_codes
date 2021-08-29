package day17DTarrays;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
	
// how to create an array
		int arr[]=new int[5];
		// how to adding an element
		arr[0]=3;
		arr[1]=2;
		arr[2]=4;
		arr[3]=5;
		arr[4]=8;
		
		//how to print an array
		System.out.println(Arrays.toString(arr));

		
		//How to print a specific index
	
		System.out.println(arr[4]);
		//System.out.println(arr[5]);
		// we get indexoutofboundexception, if we puta number greater than the array size.
		
		// how to get number of elements inside an array
		System.out.println("Element number of the array: "+arr.length);
	
	
	
	}

}
