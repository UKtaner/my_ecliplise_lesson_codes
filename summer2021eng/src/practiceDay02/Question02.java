package practiceDay02;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
//microsoft question
		/*		Get a number less than 10 from the user and create a multiplication table
		 * INPUT : number: 4 OUTPUT : 1 2 3 4
		 *                            2 4 6 8
		 *                            3 6 9 12
		 *                            4 8 12 16
*/
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter  a number");
		 int num=scan.nextInt();
		 
		 for (int i =1; i<=num; i++) {
			 for(int s=1;s<=4;s++) {
				 System.out.print(i*s +" ");
			 }System.out.println();
		 }
		 
		
		
	}

}
