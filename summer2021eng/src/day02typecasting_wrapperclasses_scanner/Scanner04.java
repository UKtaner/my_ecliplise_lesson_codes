package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" Please get a side value :");
		
		double area = scanner.nextDouble();
		
		System.out.println("AREA :" + area*area);
		
		// 2. way
		System.out.println(Math.pow(area, 2));
		
		System.out.println("Premiter" + 4*area);

		
		

		
		
	}

}
