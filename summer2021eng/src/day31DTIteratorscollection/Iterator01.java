package day31DTIteratorscollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator01 {

	public static void main(String[] args) {
	
		 List<String>list1 = new ArrayList<>();
	        list1.add("Osman");
	        list1.add("Sadik");
	        list1.add("Zeki");
	        
	        System.out.println(list1);
	        
	        //we can not update collections by using for loop or for each loop
	        
	        for(String w:list1) {
	            w=w+"#";
	        }
	        System.out.println("By using for loop: "+list1);
	        
	        // when we want to update our list we can use listIterator or Iterator
	        //They are so similar actually the work flow is same 
	        //But listIteretor has more methods
	        
	        ListIterator<String>list1itr = list1.listIterator();
	        while(list1itr.hasNext()) {
	            String element = list1itr.next();
	            list1itr.set(element+"#");
	        }
	        System.out.println("By using iterator: "+list1);
	        
	        // update all elements and try to print them in reverse order
	        List<String>list2 = new ArrayList<>();
	        list2.add("Java");
	        list2.add("Python");
	        list2.add("JavaScript");
	        
	        ListIterator<String>list2itr = list2.listIterator();
	        
	        while(list2itr.hasNext()) {
	            list2itr.next();
	            
	        }
	        //you will be able to work in reverse order
	        // if we do not use first while it will not print anything
	        while (list2itr.hasPrevious()) {
	            String element = list2itr.previous();
	            //System.out.println(element+"@");
	            list2itr.set(element+"@");
	        }
	        //System.out.println(list2);
	        
	        Collections.reverse(list2);
	        System.out.println(list2);
	        
	        // to remove elements by using listiterator
	        List<String>list3 = new ArrayList<>();
	        list3.add("A");
	        list3.add("L");
	        list3.add("S");
	        
	        System.out.println("before removing: "+list3);
	        
	        ListIterator<String>list3itr = list3.listIterator();
	        while(list3itr.hasNext()) {
	            list3itr.next();
	            list3itr.remove();
	        }
	        
	        System.out.println("after removing: "+list3);
	        
	        
	        List<String>list4 = new ArrayList<>();
	        list4.add("T");
	        list4.add("U");
	        list4.add("V");
	        
	        System.out.println();
	        
	        ListIterator<String>list4itr = list4.listIterator();   
	        
	        list4itr.add("S");System.out.println(list4);//[S, T, U, V] added at the beginning
// By using while loop elements were added at the end	        
	        while(list4itr.hasNext()) {
	        	list4itr.next();
	        }
	        list4itr.add("X");
	        list4itr.add("Y");
	        list4itr.add("Z");
	        System.out.println(list4);//[S, T, U, V, X, Y, Z]
	        
	        
// Differences between iterator and listIterator
	        
	        List<String>list5 = new ArrayList<>();
	        list5.add("T");
	        list5.add("U");
	        list5.add("V");
	        
	        System.out.println();
	        
	       Iterator<String>list5itr = list5.listIterator();  
	        /*
	         * iterator does not have hasPrevious() and previous()
	         * ListIterator can work in 2 ways
	         * but iterator can work only one way
	         * we can use listIterator with list
	         * we can use Iterator with list, set , map  (with collections)
	         */
	        
	        while(list5itr.hasNext()) {
	            list5itr.next();
	            
	            //list5itr.set() iterator does not have set()
	        //  list5itr.remove(); iterator support remove()
	            
	        } 
	        //list5itr.add() iterator does not support add()
	        
	    }
	}