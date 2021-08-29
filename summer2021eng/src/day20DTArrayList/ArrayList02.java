package day20DTArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		 List<Integer> list = new ArrayList<>();
	        list.add(3);
	        list.add(5);
	        list.add(7);
	        list.add(9);
	        list.add(11);	
	        
	        System.out.println(list);   
	        
	        inc(list);

	}
	public static void inc( List<Integer> list) {
		
		for (int i=0; i<list.size();i++) {
			list.set(i, list.get(i)+2);
		}
		
		System.out.println(list);
	}
/*
List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(11);
        
        
        List<Integer> list2=new ArrayList<>();
        for(int i=0;i<list.size();i++) {
        list2.add(list.get(i)+2);
            
        }
System.out.println(list2);	
 */
/*
	public static ArrayList<Integer> increaseTwo(ArrayList<Integer> list) {		
		for(int i = 0; i<list.size(); i++) {
			list.set(i, list.get(i) + 2);
		}
		return list;
	}



 */
	
	
	
	
}
	
		
		
