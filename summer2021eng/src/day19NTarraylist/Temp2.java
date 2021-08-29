package day19NTarraylist;

import java.util.ArrayList;
import java.util.List;

public class Temp2 {
	/*
	 How to remove repeated element from a list 
	 */
	public static void main(String[] args) {
		List<String>list1=new ArrayList<>();
		
		list1.add("a");
		list1.add("b");
		list1.add("a");
		
	System.out.println(list1);//[a, b, a]
	
	List<String>list2=new ArrayList<>();
	
		for(int i=0;i<list1.size();i++) {
		if(list2.contains(list1.get(i))) {// why not indexOf(i)
			continue;
			
		}
		list2.add(list1.get(i));
		}
		System.out.println(list2);
	}
}
