package practiceDay04;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
/* ask the user for an edge and height of an equilateral triangle
find the area and perimeter of the triangle
print on the console	*/

		Scanner scan=new Scanner (System.in);

		System.out.println("Enter height");
	
		int h=scan.nextInt();
		
		System.out.println("Enter a side");
		int a=scan.nextInt();
		
		int prm=3*a;
		
		int area=h*a/2;
		
		System.out.println("Area:" +area+"\nPerimeter: "+prm);
		
		
	}

}
