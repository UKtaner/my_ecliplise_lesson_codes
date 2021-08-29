package day17DTarrays;

import java.util.Arrays;
import java.util.Scanner;


public class Temp {
	/*  1) Create an integer array together with user
		2) Type code to print minimum and maximum elements
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		
		int len = scan.nextInt();
		int arr[] = new int[len];
		
		int max=0;
		int min=0;
		System.out.println("Enter array element");
		
		for(int i=0; i<len;i++) {
			arr[i]=scan.nextInt();
			if(i==i) {
				System.out.println("Wrong entry");
			}else {
				System.out.println(Arrays.toString(arr));
				Arrays.sort(arr);
					System.out.println("min: "+arr[0] );
					System.out.println("max: "+arr[arr.length-1]);
			}
				
		}
		
			
			
		}
		
		}
		
		
	
