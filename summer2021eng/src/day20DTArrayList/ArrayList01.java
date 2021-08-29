package day20DTArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		
		 List <Integer> listnum = new ArrayList<>();
	        ArrayList<Integer> list2 = new ArrayList<>();
	        listnum.add(17);
	        listnum.add(23);
	        listnum.add(11);
	        listnum.add(17);
	        listnum.add(3);
	        listnum.add(5);
	        listnum.add(8);
	        listnum.add(-5);
	        listnum.add(-3);
	        
	        
	       System.out.println(listnum.isEmpty());
	       System.out.println(list2.isEmpty());
	       
	       
	       listnum.remove(3);
	       System.out.println(listnum);
	      System.out.println(listnum.remove(listnum.indexOf(5)));
		   
	   }
	}
	