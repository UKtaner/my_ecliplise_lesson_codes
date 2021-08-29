package day11loops;

import java.util.Scanner;

public class Forloops02 {

	public static void main(String[] args) {
	/*
	 Ask user to enter starting and ending value,
	  then find the sum of all integers from the starting to the ending value* 	
	 */
	
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a start value");
        int x = scan.nextInt();
        System.out.println("Enter an End value ");
        int y = scan.nextInt();
        
        if(x>y) {
            System.err.println("Invalid Start value...");
        }else {
            int sum = 0;
            for(int i = x;  i<=y ; i++ ) {
                sum = sum+i;
            
        }
        
            System.out.println("the sum is " +sum);
            
        }       
        
    
}

}