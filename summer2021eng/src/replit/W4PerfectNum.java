package replit;

import java.util.Scanner;

public class W4PerfectNum {
/*
 Write java code checking the number is Perfect number or not. 

* Any number can be a Java Perfect Number if the sum of its positive divisors excluding the number itself is equal to that number.
 */
	public static void main(String[] args) {
	      int n, sum = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter any integer you want to check:");
	        n = s.nextInt();
	        for(int i = 1; i < n; i++)
	        {
	            if(n % i == 0)
	            {
	                sum = sum + i;
	            }
	        }
	        if(sum == n)
	        {
	            System.out.println(n+" is Perfect Number");
	        }
	        else
	        {
	            System.out.println(n+" is not Perfect Number");
	        }    
	    }
	    
	    }
	