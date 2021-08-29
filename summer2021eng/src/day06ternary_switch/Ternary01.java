package day06ternary_switch;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer..");
		int x = scanner.nextInt();
		
		//              Condition   ?   Code executed for true condition    :   Code executed for false condition
		//String result  =   x<5      ?                  "True"               :            "False";
		
		//String result  = x%2==0 ? (x + " is even...") : (x + " is odd...");
		
		//System.out.println(result);
		
		//If ternary returns different data types, do not create a container put it into System.out.println() directly
		//System.out.println(x++ > 5 ? "true" : x);
		
		//If you have to create a container for the ternary result, you have to make data types same.
		
		String result = x++ > 5 ? "true" : x + "";// (+ "") helped to create string container...
		
//		x++ > 5 ? "true" : x // gives error, either create a container or place it within sysout directly...
		
		System.out.println(result);
// 		in order to create a container, just check the type of code 1 and code 2. 
//		if both are same than create string or int container according to type 
		
	}

}