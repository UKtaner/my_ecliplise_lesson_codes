package practiceDay04;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter one side of rectangle");
		int a = scanner.nextInt();
		System.out.println("enter other side of rectangle");
		int b = scanner.nextInt();
		
		System.out.println("area: "+(a*b)+ "   perimeter: "+2*(a+b));

	}

}
