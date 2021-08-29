package dayCollections;

import java.util.LinkedList;

public class LinkedList02 {

	public static void main(String[] args) {

LinkedList<String>lls= new LinkedList<>();
		
		lls.add("Red");
		lls.add("Blue");
		lls.add("Black");
		lls.add("Yellow");
		lls.add("white");
		System.out.println(lls);//[Red, Blue, Black, Yellow, white]
		
		lls.add(1, "Pink");
		System.out.println(lls);//[Red, Pink, Blue, Black, Yellow, white]
		
		for (String el:lls) {
			System.out.print(el+" ");//Red Pink Blue Black Yellow white 
		}
		

	}

}
