package replit;

import java.util.ArrayList;

public class W6Q401 {
	/*Write a program that deletes the letters 'a' from the names in the list given as input.

    INPUT : 
    list1={"Ali","Veli","Ayse","Fatma","Omer"}

    OUTPUT : 
    
    [Veli,Omer]
	 * 
	 */
	



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
		String list1[]={"Ali","Veli","Ayse","Fatma","Omer"};
		
		System.out.println(deleteA(list1));
		
		


	}

}
