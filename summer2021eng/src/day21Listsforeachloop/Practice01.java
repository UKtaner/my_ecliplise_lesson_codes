package day21Listsforeachloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice01 {

	public static void main(String[] args) {
		List<Character> list1 = new ArrayList<>();
		list1.add('x');
		list1.add('z');
		list1.add('a');
		list1.add('m');
		System.out.println(list1);
		
		//Use for-loop
		
		for(int i=0; i<list1.size(); i++) {
			System.out.print(list1.get(i) + "! ");//x! z! a! m!
		}
		
		System.out.println();
		//Use for-each loop
		
		for(Character w:list1) {
			
	if ((w=='a' || w=='e' || w=='i' || w=='o' || w=='u')) {
		
		continue;
	}
	System.out.print(w+"!");
		}
}}