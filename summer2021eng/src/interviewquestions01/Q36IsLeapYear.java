package interviewquestions01;

import java.util.Scanner;

public class Q36IsLeapYear {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter year");
		int year=scan.nextInt();
	
	
		System.out.println(java.time.Year.of(year).isLeap());
		
//if( (year%4==0  && year%100!=0) || (year%400==0)){		
//  if( (year%25!=0) || (year%100==0)){	
		
}
}