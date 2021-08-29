package day17NTarray;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {
	//microsoft question
			/*		Get a number less than 10 from the user and create a multiplication table
			 * INPUT : number: 4 OUTPUT : 1 2 3 4
			 *                            2 4 6 8
			 *                            3 6 9 12
			 *                            4 8 12 16
	*/
	
	public static void main(String[] args) {
	
	for(int i=1; i<=4;i++) {
		for(int j=1;j<=4;j++) {
			System.out.print(j*i+" ");
		}System.out.println();
	}
		
		
		
	}
}
