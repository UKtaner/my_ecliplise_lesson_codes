package day04_concat;

import java.util.Scanner;

public class ifElsestatement_review01 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
// note: ask to instructor if you type "sdhjsd" what will be the result.bcoz we use ignoreCase	
		System.out.println("Type a day");
		
		String day = scan.next();
		
		if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
		System.out.println("Weekend");	
		}
		else {
			System.out.println("Weekday");
		}		
	}

	}


