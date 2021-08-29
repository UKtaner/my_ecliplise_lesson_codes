package day19DTarrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class List03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Character>list1=new ArrayList<Character>();
		
		list1.add('A');
		list1.add('W');
		list1.add('Z');
		list1.add('T');
		list1.add('B');
		System.out.println(list1);//[A, W, Z, T, B]
		
		Collections.sort(list1);
		System.out.println("after sorting "+list1);//[A, B, T, W, Z]
		
		// how to check an arraylist contains a specific element
	
		System.out.println(list1.contains('T'));
		System.out.println(list1.contains('E'));
		
		List<Character>list2=new ArrayList<Character>();
		list1.add('A');
		list1.add('W');
		list1.add('Z');
		list1.add('T');
		list1.add('B');
		
		// how to check two lists equal or not
		
		System.out.println(list2.equals(list1));// false, bcoz there is no element in list2
		
		/*
	 	Ask user to enter a letter
	 	
        If the letter exist in list1 convert it to "I have it!"
        
        otherwise add the element which user entered to the list1
        
		 */
		
	//char ch = scan.next().toUpperCase().charAt(0);
		
		
		


		}
				
			}