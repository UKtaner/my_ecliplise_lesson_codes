package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number to calculate it's cube..");
		
		double number = scanner.nextDouble();
		System.out.println(number*number*number);
		//2. way
		System.out.println(Math.pow(number, 3));
		
		
		

	}

}
