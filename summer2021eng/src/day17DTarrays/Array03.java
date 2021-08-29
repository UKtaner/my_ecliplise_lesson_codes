package day17DTarrays;

public class Array03 {

	public static void main(String[] args) {
/*
 /*
1)Create a double array whose length is 6
 2)Type a program to add all elements inside the array
 3)Print the sum on the console.
        */

		double input[]= {1.4,55.6,23.7,5.1,13.8,3.6};
		
		double sum=0;
		for(int i=0;i<input.length;i++) {
			sum=sum+input[i];
				
		}
		
		System.out.println("Sum of the array: "+sum);
		

	}

}
