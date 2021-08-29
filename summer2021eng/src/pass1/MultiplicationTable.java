package pass1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		
		
		
		for(int i=0;i<=10;i++) {
			
			System.out.println(num+" x "+i+" = "+(num*i));
			
		}
		System.out.println();

	}

}
