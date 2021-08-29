package day19DTarrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
// resizeable
// can store non primitives
// can not store multi data types

	// how to create ArrayList
	//1 way
 	ArrayList<Integer>list1=new ArrayList<Integer>();
 	// 2 way
 	ArrayList<Integer>list2=new ArrayList<>();	
 	// 3 way
 	List<Integer>list3=new ArrayList<Integer>();	
	
 	System.out.println(list1);//[]
 	
 	// How to add an element
 	
 	list1.add(11);
 	list1.add(16);
 	list1.add(1);
 	list1.add(5);
 	list1.add(55);
 	list1.add(0);
 	list1.add(21);
 	
 	System.out.println("Before sorting: "+list1);//[11, 16, 1, 5, 55, 0, 21]
 	
 	Collections.sort(list1);
 	System.out.println("in ascending sort order: "+list1);//[0, 1, 5, 11, 16, 21, 55]
	
 	
 	
 	//How to add element into specific index
 	
 	list1.add(0, 99);
 	System.out.println("99 is added into index of 0 "+list1);
		
	// how to sort in descending order
 	
 	Collections.sort(list1,Collections.reverseOrder());
 	
 	System.out.println("In descending sort order :"+ list1);
 	
 	//How to get specific element from ArrayList
 	// .get()==> to get specif element
 	System.out.println(list1.get(5));
 	
 	// how to get number elements inside the ArrayList
 	System.out.println("number of elements "+list1.size());
 	
	System.out.println("Min:"+list1.get(0)+"\nMax:"+list1.get(list1.size()-1));
	  
	System.out.println("Another way==> Min: "+list1.indexOf(0));
	

 	
 	
	}

}
