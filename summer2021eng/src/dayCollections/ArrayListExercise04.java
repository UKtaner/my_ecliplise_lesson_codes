package dayCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExercise04 {

	public static void main(String[] args) {
//Write a Java program to retrieve an element (at a specified index) from a given array list.
		
List<String>lst=new ArrayList<>();
		
		lst.add("Ali");
		lst.add("Veli");
		lst.add("Can");
		lst.add("Han");
		
		String element=lst.get(3);
		
		System.out.println(element);
		
		

	}

}
