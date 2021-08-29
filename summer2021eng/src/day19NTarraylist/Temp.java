package day19NTarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Temp {
	/*
	 Ask user to enter a letter
	 if the letter exists in list1 convert it to "Got it"
	 otherwise add the element which user entered into the list			
	 */
	public static void main(String[] args) {
		
		List<String>list1=new ArrayList<>();

		list1.add("A");
		list1.add("B");
		list1.add("C");
		System.out.println(list1);//[A, B, C]
		
		//1. scanner
		//2. if, contains, .set()
	    ///3. else
		
		Scanner scan=new Scanner (System.in);
		System.out.println(" Enter a char");
		
		String str=scan.next().toUpperCase().substring(0,1);// TANER 
		
		if (list1.contains(str)) {
			list1.set(str.indexOf(str), "Got it");
			System.out.println(list1);
			
		}else {	
			list1.add(str);
			System.out.println("New list is "+list1);
		}
	}

}
