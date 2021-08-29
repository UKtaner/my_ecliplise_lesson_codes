package day19NTarraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Lists01 {

	public static void main(String[] args) {
/*
ArrayLists are flexible of their size
ArrayList can not store multiple type
ArrayList stores non primitives data type	

 */
		// how to create a list
	//1. way
		ArrayList<Integer>list=new ArrayList<>();
		System.out.println(list);//[]
		
		// how to add an element
		
		list.add(12);
		list.add(5);
		list.add(30);
		list.add(0, 8);// 0,==> index
						//  8 ==> you want place 8 in index of 0.
		
		System.out.println(list);//[8, 12, 5, 30]
		
		Collections.sort(list);// we used collections to sort in ascending order
		
		System.out.println(list);//[5, 8, 12, 30]
		
		// how to get a specific element from list
		System.out.println(list.get(2));//12
		
		//System.out.println(list.get(4));//IndexOutOfBoundsException 
		
		list.add(44);
		list.add(-56);
		list.add(2);
		list.add(11);
		
		System.out.println(list);
/*
 type a code to find and print the min and max elements from list 1		
 */
		Collections.sort(list);
		System.out.println(list);
		System.out.println("Min:"+list.get(0)+"\nMax:"+list.get(list.size()-1));
		// to make more dynamic for last index list.size()-1;  
		
		int max=list.get(list.size()-1);
		
		System.out.println("max value==>"+max);
		System.out.println(list.isEmpty());//false
		
		
		ArrayList<String>list2=new ArrayList<>();
		//how to check if the list  empty or not
		System.out.println(list2.isEmpty());//true
		
		//how to remove elements from a list
		
		//list==>[-56, 2, 5, 8, 11, 12, 30, 44]
		list.remove(5);// 5th index of the list, element 12 is removed
		
		System.out.println(list.remove(5));//[-56, 2, 5, 8, 11, 44]
		System.out.println(list);//[-56, 2, 5, 8, 11, 30, 44]
		
		list.remove(list.indexOf(5));
		//[-56, 2, 5, 8, 11, 30, 44]
		System.out.println(list);//  5 is removed in index 2
	
		list2.add("Ali");
		list2.add("Veli");
		list2.add("Can");
		list2.add("Veli");
		
		System.out.println(list2);//[Ali, Veli, Can, Veli]
		list2.remove(0);// index 0
		System.out.println(list2);//[Veli, Can, Veli]
		list2.remove(list2.remove("Veli"));
		System.out.println(list2);//[Can, Veli]
		
		
	}

}
