package replit;

import java.util.Scanner;

public class RepLastIndex {

	public static void main(String[] args) {
/*
 Ask user for a string and print a new string made of 3 copies of the last 2 letters

The strings length will be at least 2.

Sample:

INPUT : Mustafa OUTPUT : fafafa	
 */

Scanner scan=new Scanner (System.in);
System.out.println("Enter a STRING");

String str=scan.next();

for(int i=0;i<3;i++) {
	System.out.print(str.substring(5));	
}
	}

}
