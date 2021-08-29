package day20NTArrayList;

import java.util.ArrayList;

public class ArrayList02 {

	public static void main(String[] args) {
		
// create a method increase each element by 1		
	   ArrayList<Integer> list=new ArrayList<Integer>();
		   
		   list.add(1);
		   list.add(19);
		   list.add(67);
		   list.add(11);
		   list.add(10);
		   list.add(6);
		   System.out.println(list);//[1, 19, 67, 11, 10, 6]
		   
		   incEl(list);//[4, 22, 70, 14, 13, 9]
		   

	}

	public static void incEl(ArrayList<Integer> list) {
	
		for (int i=0; i<list.size();i++) {
			list.set(i, list.get(i)+3);
		}
		
		System.out.println(list);
	}
	
	
	
}
