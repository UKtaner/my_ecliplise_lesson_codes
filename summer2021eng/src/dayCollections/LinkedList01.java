package dayCollections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {

//Write a Java program to append the specified element to the end of a linked list.
		
		LinkedList<String>lls= new LinkedList<>();
		
		lls.add("Red");
		lls.add("Blue");
		lls.add("Black");
		lls.add("Yellow");
		lls.add("white");
		
		System.out.println(lls);
		
		lls.addLast("Pink");

		System.out.println(lls);
				
		System.out.println(lls.subList(1,4));
		
//	Write a Java program to iterate through all elements in a linked list		
		for (String el:lls) {
			System.out.println(el);
		}

// Write a Java program to iterate through all elements in a linked list starting at the specified position.
	
		//LinkedList<String>lls1= new LinkedList<>();
		
		Iterator p=lls.listIterator();		
		
		while(p.hasNext()) {
			
			System.out.print(p.next()+" ");//Red Blue Black Yellow white Pink 			
		
		}

//Write a Java program to iterate a linked list in reverse order.	
		
		Iterator desnd=lls.descendingIterator();
	
		while (desnd.hasNext()) {
	        System.out.println(desnd.next());
     
	     }
		
		
	}

}

