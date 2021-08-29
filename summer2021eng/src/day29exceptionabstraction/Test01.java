package day29exceptionabstraction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
/*
 Write a code that returns the duplicate chars in a String array.(interview Question)

Input : 
	 
String str=“Javaisalsoeasy” 

Output: [a, s]
 */

		String str="Javaisalsoeasy";
		
		String  dups="";
		
		for(int i=0; i<str.length();i++) {
			
			for(int j=i+1; j<str.length();j++) {
				if(str.charAt(i)== str.charAt(j)) {
					if(!dups.contains(String.valueOf(str.charAt(j)))) {
						
					}
				}
			}
			
		
		}
	}
}

