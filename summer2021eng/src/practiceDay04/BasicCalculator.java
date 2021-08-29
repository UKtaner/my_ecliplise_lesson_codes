package practiceDay04;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		/*Get a number less than 10 from the user and create a multiplication table
		 * INPUT : number: 4 OUTPUT : 1 2 3 4
		 *                            2 4 6 8
		 *                            3 6 9 12
		 *                            4 8 12 16
		 */

		
		Scanner scan=new Scanner(System.in);
		
		do {
		System.out.println("Please enter first number");
		int num1=scan.nextInt();
		
		System.out.println("Please enter second number");
		int num2=scan.nextInt();
		
		System.out.println("Choose your operation:\n 1-Addition\n 2-Subtration\n 3-Multiplication\n 4-Division");
		
		int operation=scan.nextInt();
		switch(operation){
		
		case 1:System.out.println(num1+num2);
		break;
		case 2:System.out.println(num1-num2);
		break;
		case 3:System.out.println(num1*num2);
		break;
		case 4:System.out.println(num1/num2);
		break;
		}
		System.out.println("If you want to QUIT press 'Q' or to CONTINUE press any key.");
		
		
		char key=scan.next().charAt(0);
		if(key=='Q') {
			break;
		}
		
		}while(true);	
		System.out.println("Thank you");

	}
}


