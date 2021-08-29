package day17DTarrays;

import java.util.Arrays;

public class Array02 {

	public static void main(String[] args) {
		
		String arr[]=new String[5];
		
		arr[0]="Can";
		arr[1]="Halil";
		arr[2]="Nur";
		arr[3]="Selen";
		arr[4]="Tan";
	
		System.out.print(Arrays.toString(arr));//we printed all
		// lets print one by one
		// 1. way
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		// 2.way
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
