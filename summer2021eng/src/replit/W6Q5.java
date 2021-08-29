package replit;

import java.util.Arrays;
import java.util.Scanner;

public class W6Q5 {
/*
 Write a program that accepts an integer as input and prints first 10 prime numbers greater than input 
Check numbers if they are even or not in a return method.

Input : 5

Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
 */
	
	public static void main(String arg[])	
	{
	int i,count;
               System.out.print("Enter n value : ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
             
	for(int j=7;j<=42;j++)
	{
	count=0;
	for(i=1;i<=j;i++)
	{
	   if(j%i==0)
	   {
	        count++;        
	   }
	}
	if(count==2) {
		
	       System.out.print(Arrays.toString(new int [] {j}));     
	}
	
	}
	
	}


}
