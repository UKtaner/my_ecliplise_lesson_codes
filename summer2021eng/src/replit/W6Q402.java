package replit;

import java.util.ArrayList;

public class W6Q402 {
	static ArrayList<String> deleteA(String list1[]) {
		//mehmet'soln.
		ArrayList<String> newList=new ArrayList<>();
		for (String s:list1) { 
			newList.add(s);
			if (s.contains("a")||s.contains("A")) {newList.remove(s);
				
			}
		}
		
		return newList;
	}
	public static void main(String[] args) {
String list1[]={"Ali","Veli","Ayse","Fatma","Omer"};
		
		System.out.println(deleteA(list1));

	}

}
