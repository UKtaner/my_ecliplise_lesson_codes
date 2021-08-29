package dayArryList;

import java.util.ArrayList;
import java.util.List;

public class RemoveRepeted {

	public static void main(String[] args) {
		/*
		 How to remove repeated element from a list
		 
		 */
		
		
		List<Integer>list=new ArrayList<Integer>();
		
		list.add(3);
		list.add(45);
		list.add(12);
		list.add(3); //[  ]
		list.add(6);
		list.add(45);
		list.add(7);
		list.add(8);
		
		List<Integer>list1=new ArrayList<Integer>();
		System.out.println(list);//[3, 45, 12, 3, 6, 45, 7, 8]
		
		for(int i=0; i<list.size();i++) {
			
			for(int k=i+1; k<list.size();k++) {
				
				if(list.get(i).equals(list.get(k))) {
					list.remove(k);
				
				}		
			}

		}	System.out.println( "unique list: "+list);
	
	}
}
/*
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
		} */
