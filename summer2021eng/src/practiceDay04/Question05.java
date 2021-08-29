package practiceDay04;

import java.util.Scanner;

public class Question05 {

	public Question05() {

	}

	public static void main(String[] args) {
/*
 ask user to enter 8 primitive data and print on the console
 */
		Scanner scan = new Scanner(System.in);
	System.out.println("Enter integer number");
	int a = scan.nextInt();
	System.out.println("User enter "+ a);
	
	System.out.println("Enter long number");
	long b = scan.nextLong();
	System.out.println("User enter "+ b);	
	
	System.out.println("Enter short number");
	short c = scan.nextShort();
	System.out.println("User enter "+ c);	
	
	System.out.println("Enter double number");
	double d = scan.nextDouble();
	System.out.println("User enter "+ d);
	
	System.out.println("Enter float number");
	float e = scan.nextFloat();
	System.out.println("User enter "+ e);
	
	System.out.println("Enter byte number");
	byte byt = scan.nextByte();
	System.out.println("User enter "+ byt);
	
	System.out.println("Enter Blooean number");
	boolean bln = scan.nextBoolean();
	System.out.println("User enter "+ bln);
	
	System.out.println("Enter char number");
	char h = scan.next().charAt(0);
	System.out.println("User enter "+ h);
	}
}