package day03increment_decrement_operation;

import java.util.Scanner;

public class ModulusOperator01 {

	public static void main(String[] args) {
		

		//To find the remainder when you divide a number
		// in java denotes as % (modulus)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a 3-digit number");
		int number = scan.nextInt();

		int lastDigit = 0;
		int midDigit = 0;
		int firstDigit = 0;
		int middle = 0;
// 256
		lastDigit = number%10;
		middle = number/10; //25.6
		midDigit = middle%10;
		firstDigit = number/100; // 256/100 = 2.56
		System.out.println(firstDigit + midDigit + lastDigit);


		}}
