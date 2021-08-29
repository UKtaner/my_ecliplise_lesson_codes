package day18arraysmultidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {	//How many 'a' was used in  the String "Mama may I go to Alabama"
		
	/*
	 	{ {2, 3}, {12, 13, 14} }
	 	
	 	Type the code to find the sum of the elements
	 	
	*/
		int sum=0;
	int [][]arr={ {2}, {12, 13, 14, 10}, {3, 7} };
		
		for(int i=0; i<arr.length;i++) {
			for(int k=0;k<arr[i].length;k++) {
				
				sum+=arr[i][k];
				
			}
			
			
		}System.out.println(sum);
		
		
		
		
		
	}
	
}
	
