package practiceDay04;

import java.util.Scanner;

public class Question07 {

	public Question07() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		/*
		 * ask the user about one side of the square
		 * find the area and perimeter of the square
		 * print on the console
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the length of the side of a square");
		int num = scan.nextInt();
		
		System.out.println("Area :"+ num*num);
		System.out.println("Perimeter :"+ num * 4);
		
		
	}

}