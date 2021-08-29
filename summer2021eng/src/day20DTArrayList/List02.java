package day20DTArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List02 {

	public static void main(String[] args) {
		
		 List<Integer> list1 = new ArrayList<>();
	        list1.add(27);
	        list1.add(15);
	        list1.add(312);
	        list1.add(28);
	        list1.add(14);
	        list1.add(162);
	        list1.add(61);
	        list1.add(39);
	        list1.add(121);
	        list1.add(16);
	        list1.add(18);
	        
	        
	     
			   ArrayList<Integer> list2=new ArrayList<Integer>();
			   
			   for(int i=0;i<list1.size();i++) {
				   for(int k=i+1;k<list1.size();k++) {
				 list2.add(Math.abs(list1.get(i)-list1.get(k)));

				   	}
			   }
				Collections.sort(list2);
				
				 System.out.println(list2.get(0));
	
	}
	}