package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class W6Q4 {
/*
 Write a program that deletes the letters 'a' from the names in the list given as input.
         INPUT : 
         list1={"Ali","Veli","Ayse","Fatma","Omer"}
         OUTPUT :          
         [Veli,Omer]
 */
	public static void main(String[] args) {
	
String list1[]={"Ali","Veli","Ayse","Fatma","Omer"};
		
		System.out.println(deleteA(list1));

	}

	static ArrayList<String> deleteA(String list1[]) {
		ArrayList<String> newList=new ArrayList<>();
		for (String s:list1) { 
			
			if (!s.contains("a")&&!s.contains("A")) 
			{newList.add(s);
				
			}
		}
		
		return newList;
	}}