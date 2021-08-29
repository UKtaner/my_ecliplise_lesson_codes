package practiceDay03;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		/*
		 * Ask user to choose one of these letters : A , B , C
		 * If they choose A, print: Java is easy
		 * If they choose B, print: Java is fun
		 * If they choose C, print: I need to study :)
		 *
		 * EXAMPLE: INPUT : A OUTPUT :Java is easy
		 */

/*
 1. way...
		Scanner scan=new Scanner (System.in);
		System.out.println("Choose your character");
		char ch = scan.next().toLowerCase().charAt(0);

		if (ch=='a') {
			System.out.println("Java is easy");
		}else if (ch=='b') {
			System.out.println("Java is fun");
		}else {
			System.out.println("I need to study :)");
		}
	scan.close();	
.............................................................
2. way...
		Scanner scan=new Scanner (System.in);
		System.out.println("Choose your character");
		char ch = scan.next().toUpperCase().charAt(0);
		
		String result=ch=='A'? "Java is easy":ch=='B'?"Java is fun":ch=='C'?"I need to study :)":"Check your entry";
		System.out.println(result);
	}	
....................................................................		
 */
// 3. way....
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter either \n A \n B \n C");
		
		char ch = scan.next().toUpperCase().charAt(0);
		 
		switch(ch) {
			case 'A':
				System.out.println("Java is easy");
				break;
					
			case 'B':
				System.out.println("Java is fun");
				break;
			case 'C':
				System.out.println("I need to study :)");
				break;
				default:
					System.out.println("check your entry!!!");
		}	
	}
}
