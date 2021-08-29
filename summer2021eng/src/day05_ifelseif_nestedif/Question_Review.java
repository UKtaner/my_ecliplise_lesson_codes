package day05_ifelseif_nestedif;

import java.util.Scanner;

public class Question_Review {

	public static void main(String[] args) {
		/*
	Ask user to enter a 4 digit integer, then print the sum of the first
		and the last digits of the number on the console.
		For example; if user enters 1234 you will add 1 and 4, then print on the console 5
    */
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a 4 digit number");
		int num =scan.nextInt();
		num = Math.abs(num);
		
		if(num>999 && num<10000) {
		
			int fd = num/1000;
			System.out.println(fd);
			
			int ld = num%10;
			System.out.println(ld);
			System.out.println("The sum of last and first digit : " + (fd+ld));
		}else {
			System.out.println("TRY AGAIN!!!");
		}
		
		
		
	}

}
