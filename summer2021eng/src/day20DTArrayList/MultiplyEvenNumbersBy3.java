package day20DTArrayList;

import java.util.ArrayList;
import java.util.List;

public class MultiplyEvenNumbersBy3 {
 /*
Create a method to delete odd elements and multiply even elements by 3 from the list
 */
	
	
	
	public static void main(String[] args) {

	List <Integer> list=new ArrayList<>();
	list.add(1);
	list.add(9);
	list.add(2);
	list.add(8);
	list.add(6);
	list.add(4);
	list.add(11);
	list.add(21);
	
	System.out.println(list);
	
	
	for (int i=0;i<list.size();i++) {
		  if(list.get(i)%2!=0) {
			
			  list.remove(i);
		    i--;
		  }else {
			  list.set(i, list.get(i)*3);
		  }
	}
	System.out.println(list);
	
	}}

	




