package day05_ifelseif_nestedif;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		///Get the day name from user, then tell to the user
		//if it is week day or weekend day
		// || ==> OR
		// && ==> AND
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter a day: ");

		String day = scan.next().toLowerCase();
		// WRITE THE DAY LOWERCASE AS BELOW;
		
		if (day.equals("saturday") || day.equals("sunday")) {
			System.out.println("Weekend");
		}else if(day.equals("monday")|| day.equals("tuesday")|| day.equals("wednesday")||day.equals("thursday")||
				day.equals("friday")) {
			System.out.println("WEEKDAY");
		}else {
			System.out.println("check your entry!!!");
		}
/*

String result = day.equals("sunday") || day.equals("saturday")?(day.equals("monday")||day.equals("tuesday")||day.equals("wednesday")||
	day.equals("thursday")||day.equals("friday")?"WEEK DAY":"CHECK YOUR ENTRY"):"WEEKEND";
	System.out.println(result);
 */
	}

}
