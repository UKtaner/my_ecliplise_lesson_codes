package dayLoops;

import java.util.Scanner;

public class SQPattern {

	public static void main(String[] args) {
		/*
			* * * * * 
			* * * * * 
			* * * * * 
			* * * * * 
			* * * * * 
		 */
		for(int i=0; i<5; i++) {
			for(int j=0;j<5;j++) {// every row completes than move o next line
				System.out.print("* ");	
			}
			
			System.out.println();
			
		}
		
		 /*
        Ask user to enter the number of rows and the number columns then
       draw rectangle by using *   
       Example: row = 3, column=4
                * * * *
                * * * *
                * * * *
        */
       
   Scanner scan = new Scanner(System.in);
   System.out.println("enter the # of rows");
   int row = scan.nextInt();
   System.out.println("enter the # of columns");
   int col = scan.nextInt();
   
   for(int i = 1; i<row; i++) {

       for(int j = 1; j<col; j++) {
 
           System.out.print("* ");
}
       System.out.println();
                   
       
}
   
}
}