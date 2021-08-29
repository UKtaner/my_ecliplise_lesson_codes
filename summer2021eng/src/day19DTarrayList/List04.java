package day19DTarrayList;

import java.util.ArrayList;
import java.util.List;

public class List04 {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		
		list.add(3);
		list.add(45);
		list.add(12);
		list.add(3);
		list.add(6);
		list.add(45);
		list.add(7);
		list.add(8);
		
		List<Integer>list1=new ArrayList<Integer>();
		System.out.println(list);
		
		for(int i=0; i<list.size();i++) {
			
			if(!list1.contains(list.get(i))) {
				list1.add(list.get(i));
			}
		}
		
			System.out.println("Unique list "+list1);
		}
		
/*
 	ArrayList<Integer> myArray = new ArrayList<>();
​
		myArray.add(3);
		myArray.add(45);
		myArray.add(12);
		myArray.add(3);
		myArray.add(6);
		myArray.add(45);
		myArray.add(7);
		myArray.add(8);
​
		System.out.println("First: " + myArray);
​
		for (int i = 0; i < myArray.size(); i++) {
			for (int j = i + 1; j < myArray.size(); j++) {
				if(myArray.get(i) == myArray.get(j)) {
					myArray.remove(j);
				}
			}
		}
		
		System.out.println("Unique list: " + myArray);		
 */

	}


