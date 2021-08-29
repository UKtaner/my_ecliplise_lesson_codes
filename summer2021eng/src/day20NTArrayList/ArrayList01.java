package day20NTArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList01 {

	public static void main(String[] args) {
		
		// find the min difference
		// find the max difference
		   ArrayList<Integer> list=new ArrayList<Integer>();
		   
		   list.add(1);
		   list.add(19);
		   list.add(67);
		   list.add(11);
		   list.add(10);
		   list.add(6);
		   System.out.println(list);
		   ArrayList<Integer> list1=new ArrayList<Integer>();
		   
		   for(int i=0;i<list.size();i++) {
			   for(int k=i+1;k<list.size();k++) {
				   list1.add(Math.abs(list.get(i)-list.get(k)));
				   
			   }
		  
		   }
		
		   System.out.println(list1);// [18, 66, 10, 9, 5, 48, 8, 9, 13, 56, 57, 61, 1, 5, 4] 
		Collections.sort(list1);
		 System.out.println(list1);
		 //[1, 4, 5, 5, 8, 9, 9, 10, 13, 18, 48, 56, 57, 61, 66]
		 System.out.println(list1.get(0));
		   
		 System.out.println(list1.get(list1.size()-1));
		   
	   }
	}
	