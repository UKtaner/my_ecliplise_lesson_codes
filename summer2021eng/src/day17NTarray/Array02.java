package day17NTarray;

import java.util.Arrays;

public class Array02 {

	public static void main(String[] args) {
		
		
		String s[] = new String[5];
		s[0] = "Ali Can";
		s[1] = "Veli Han";
		s[2] = "Ayse Tan";
		s[3] = "John Walker";
		s[4] = "John Walker";
		

		//System.out.println(Arrays.toString(s));//[Ali Can, Veli Han, Ayse Tan]
		
		//How to print all elements one by one on the console
				//1.Way: Not recommended
				System.out.println(s[0]);
				System.out.println(s[1]);
				System.out.println(s[2]);
				
				//2.Way: Use loops
				for(int i=0; i<s.length; i++) {
							//as in i<3, number is not recommended.
							//Otherwise, once you increase array your code will not work for exceeded array index	
					System.out.println(s[i]);	
				}
				
				/*
				 	1)Create a double array whose length is 6
				 	2)Type a program to add all elements inside the array
				 	3)Print the sum on the console.
				*/	
		
		//double d[]=new double[6];
		double d[]= {1.2,3.5,6.3,7.8,3.6,9.8};
		double sum=0;
		for(int i=0; i<d.length;i++) {
			sum  = sum + d[i];
			System.out.println(d[i]);		
		}
		System.out.println("Sum of all elements in array d: " + sum);
	}
}