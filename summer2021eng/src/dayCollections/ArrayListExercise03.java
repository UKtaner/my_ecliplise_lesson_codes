package dayCollections;

import java.util.ArrayList;

public class ArrayListExercise03 {

	public static void main(String[] args) {
//Write a Java program to insert an element into the array list at the first position. 

		ArrayList<String>lst=new ArrayList<>();
		
		lst.add("Ali");
		lst.add("Veli");
		lst.add("Can");
		lst.add("Han");
	
		lst.add(1, "John");
	
		System.out.println(lst);
	}

}
