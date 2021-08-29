package day20NTArrayList;

import java.util.ArrayList;

public class ArrayList03 {

	public static void main(String[] args) {
	
/*
 create a method to delete odd elements and increase even elements by multipling 5
 */
	
	   ArrayList<Integer> list=new ArrayList<Integer>();
		   
		   list.add(1);
		   list.add(19);
		   list.add(67);
		   list.add(11);
		   list.add(10);
		   list.add(6);
		   
	method(list);
	
	
	}

	public static void method(ArrayList<Integer> list) {
	
		for (int i=0; i<list.size();i++) {
			if((list.get(i)%2!=0)) {
				list.remove(i);
				
				i--;
			}else {
				list.set(i, list.get(i)*5);
				
			}	
		}
		System.out.println(list);
}
}