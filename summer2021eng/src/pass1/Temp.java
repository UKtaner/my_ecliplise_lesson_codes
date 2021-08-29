package pass1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Temp {
	/*
   	stream()
   	filter(t->t%2==0)
    forEach(t->System.out.print(t+" ")
    map(t->t*t)
    distinct()
    reduce(0, (t,u)->t+u)(there are many elements but selecting only one element)
    	
 */
	public static void printEl(List<Integer> l) {
	    //8)Create a method to find the minimum value from the list elements
	
		 //9)Create a method to find the minimum value which is greater than 7 and even from the list
	    
		 Integer minEl = 	l.stream().distinct().filter(t->t%2==0 && t>7).reduce(Integer.MAX_VALUE,(t,u)->t<u?t:u);	
	        System.out.println("1) The min element is " + minEl);
		
	}	

	
	public static void main(String[] args) {
	     List<Integer> l = new ArrayList<Integer>();
	        l.add(12);
	        l.add(9);
	        l.add(131);
	        l.add(14);
	        l.add(9);
	        l.add(10);
	        l.add(4);
	        l.add(12);
	        l.add(15);
	        
	        printEl(l);
	        
	}

	
	
	
	}
