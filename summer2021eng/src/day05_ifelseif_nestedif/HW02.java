package day05_ifelseif_nestedif;

import java.util.Scanner;

public class HW02 {

	public static void main(String[] args) {
		/*Type java code by using if-else statement.
		A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
		Ask user for quantity and unit price then judge and print total cost for user.
		If the quantity is less than 1000 output will be “No discount.”
		     */

		Scanner scan = new Scanner (System.in);		
		System.out.println("Please enter the item quantity:");
		int x = scan.nextInt();	
		System.out.println("Please enter the unit price:");
		double y = scan.nextDouble();		
		if (y*x>1000) {		
			System.out.println("You get a discount of "+ (.1*x*y)+ "\nTotal cost after discount is "+ ((y*x)-(.1*x*y)));
		}else {
			System.out.println("No discount");		
	}	
		

//		2. way via ternary	
	/*	
	 	Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the quantity");
		int q = scan.nextInt();
		System.out.println("Please enter the unit price");
		double u = scan.nextDouble();
		
		String result= q<=1000 && q>0?"No discount":q>1000? "Total cost is " +(q*(u*0.90)):"";
		System.out.println(result);;
		
*/
	}

}
