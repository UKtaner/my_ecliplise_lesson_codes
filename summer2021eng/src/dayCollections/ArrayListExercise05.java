package dayCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise05 {

	public static void main(String[] args) {
//5. Write a Java program to update specific array element by given element.
		
		List<String>lst=new ArrayList<>();
		lst.add("Ali");
		lst.add("Veli");
		lst.add("Can");
		lst.add("Han");
		
		lst.set(3, "Taner");
		System.out.println(lst);
		
//6. Write a Java program to remove the third element from a array list.	
		
		lst.remove(0);
		System.out.println(lst);
		
//7. Write a Java program to search an element in a array list.
		
		if (lst.contains("Taner")) {
			System.out.println("Found the element in the List");
		}else {
			System.out.println("There is no element in the list....");
		}
		
//8. Write a Java program to sort a given array list.
		Collections.sort(lst);
		System.out.println(lst);
		
//9. Write a Java program to copy one array list into another.


		List<String>lst2=new ArrayList<>();
		lst2.add("A");
		lst2.add("K");
		lst2.add("M");
		lst2.add("O");
		System.out.println(lst2);
		
		List<String>lst1=new ArrayList<>();
		lst1.add("Ahmet");
		lst1.add("Kemal");
		lst1.add("Mehmet");
		lst1.add("Osman");
		System.out.println(lst1);
		
		//Collections.copy(lst1, lst2);
//		System.out.println(lst1);
//		System.out.println(lst1);
		
//Write a Java program to reverse elements in a array list.
		Collections.reverse(lst1);

		System.out.println(lst1);
		
//Write a Java program to extract a portion of a array list.
		
		List<String> extractList=lst1.subList(1, 3);
		System.out.println(extractList);

// Write a Java program of swap two elements in an array list.
		
		   ArrayList<String> c1= new ArrayList<String>();
	          c1.add("Red");
	          c1.add("Green");
	          c1.add("Black");
	          c1.add("White");
	          c1.add("Pink");

	          System.out.println(c1);//[Red, Green, Black, White, Pink]
	          
	          System.out.println("Array list before Swap:");
	          for(String a: c1){
	          System.out.println("       "+a);
	        }
//14. Swapping 1st(index 0) element with the 3rd(index 2) element
	         Collections.swap(c1, 0, 2);
	          System.out.println("Array list after swap:");
	          for(String b: c1){
	          System.out.println("       "+b);
	         }
		
		
		
	}

}
