package day17NTarray;

import java.util.Arrays;
import java.util.Scanner;

/* 1) Create an integer array together with user
2) Type code to print minimum and maximum elements
*/
public class Practice01 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter lenght");
		
		
		int len=scan.nextInt();
		
		int []input=new int[len];
		int max=0;
		int min=0;
		
		System.out.println("Enter elements");
		
		for(int i=0; i<input.length;i++) {
		input[i]=scan.nextInt();
		if(input[i]>max) {
			max=input[i];
		
			
		}}
		System.out.println(max);
			
		}
		
		
		
		
		
	}
		



