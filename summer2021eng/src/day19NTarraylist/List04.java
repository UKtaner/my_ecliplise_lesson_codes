package day19NTarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List04 {

	public static void main(String[] args) {
/*
 How to remove repeated element from a list
 
 */

		
		List<Character>st1=new ArrayList<>();
	
		st1.add('a');
		st1.add('b');
		st1.add('a');
		st1.add('a');
		st1.add('c');
		st1.add('t');
	
		System.out.println(st1);//[a, b, a, a, c, t]
		
		List<Character>st2=new ArrayList<>();//empty []
		for (int i=0; i<st1.size();i++) {
			if(!st2.contains(st1.get(i))) {
				// created str2 [empty], we will get the element from st1 to st2 while checking if there is repetition   
				st2.add(st1.get(i));
				
				
				
			}
		}
		
		System.out.println(st2);//[a, b, c, t]
		

	}

}
