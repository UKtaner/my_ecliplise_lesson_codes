package day31NTIteratorscollections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test01 {

	public static void main(String[] args) {
	
		List<String>l1=new ArrayList<>();
		
		l1.add("Ali");
		l1.add("Can");
		l1.add("Veli");
		l1.add("Han");
		
		System.out.println(l1);
		
		for(String w:l1) {
		w = w+"!";

	
		}

		System.out.println(l1);
		
		ListIterator<String>l1l=l1.listIterator();

		while(l1l.hasNext()) {
			String element=l1l.next();
			
			l1l.set(element+"!");
		}
		
		System.out.println(l1);
		
	}


}