package day11loops;

import java.util.Scanner;

public class Forloop03 {

	public static void main(String[] args) {
//Type code to find the multiplication of the numbers from 1 to 10		

		int cnt=1;
		
		for(int i=1; i<11; i++) {
			cnt=cnt*i;	
		}
		System.out.print(cnt);
		
		
		/*
		 Type code to find the multiplication of the numbers from 1 to 10
		
		 */
		
		int product = 1;
		
		for(int i=1; i<4 ; i++) {
			
			product = product*i;
			//System.out.println(product);
		}
		
		System.out.println(product);
		
		/*
		 ask user to enter a number to find its factorial .
		 5! = 5*4*3*2*1
		 */
		
		// after 17! we can not valid results beacuse of data type
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find its factorial");
		int num = scan.nextInt();
		
		int a = 1;
		
		if(num<0) {
			System.err.println("Invalid value for factorial");
		}else {
			for(int i = num; i>0; i--) {
			
			a = a*i;
		}
		
		System.out.println( num+ "!  =" + a);
		
		}
		
	}

}
