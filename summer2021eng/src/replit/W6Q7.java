package replit;

import java.util.ArrayList;

public class W6Q7 {
	
	String list1[]={"Ali","Veli","Ayse","Fatma","Omer"};
	

static ArrayList<String> deleteA(String list1[]) {
ArrayList<String> newList=new ArrayList<>();
	for (int i = 0; i < list1.length; i++) { 
		newList.add(list1[i]);
		if (newList.get(i).contains("a")||newList.get(i).contains("A")) { newList.remove(list1[i]);
			
		}
	}
	
	return newList;
}
	public static void main(String[] args) {
	

	}

}
