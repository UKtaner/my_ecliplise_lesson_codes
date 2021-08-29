package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class day02scanner_review {

	public static void main(String[] args) {
		
//		1. Scanner scan = new Scanner(System.in);
//		2. System.out.println(“Enter an integer less than 30”);
//		3. int num1 = scan.nextInt();
//		4. System.out.println(num1);
//
//		nextBoolean()….. Reads a boolean value from the user
//		nextByte()………. Reads a byte value from the user
//		nextShort()……….. Reads a short value from the user
//		nextDouble()……….. Reads a double value from the user
//		nextFloat()………. Reads a float value from the user
//		nextInt() ………..Reads a int value from the user
//		nextLine()…………. Reads a String value from the user( prints all strings like Ali Can)
//		next()…………………….Reads a String value from the user(only prints Ali and skips Can) 
//		nextLong()………….. Reads a long value from the user
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ENTER SHORT VALUE:\n");
		short shortValue= scanner.nextShort();
		System.out.println("YOUR BYTE VALUE IS "+ shortValue);
		
		
		
	}

}
