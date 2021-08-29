package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Scanner08 {

	public static void main(String[] args) {

		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your mark...");
		int m = scanner.nextInt();		
		
		if(m<0) {
			System.out.println("Please do not enter negative values");
		}else if(m<50) {
			System.out.println("D");
		}else if(m<60) {
			System.out.println("C");
		}else if(m<80) {
			System.out.println("B");
		}else if(m<101) {
			System.out.println("A");
		}else {
			System.out.println("Please enter 100 at most...");
		}
	}
}
	 
	 
	 
	