package replit;

import java.util.Scanner;

public class LeapYear {

	static void leapyear(int input) {
		
		if(input%4==0|| input%400==0 && input%100!=0) {
			System.out.println("Specified year is a leap year");	
			
		}else {
			System.out.println("Specified year is not a leap year");
		}
		
	}
	public static void main(String[] args) {

		leapyear(2001);
        
    }
}
