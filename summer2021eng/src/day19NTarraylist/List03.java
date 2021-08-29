package day19NTarraylist;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class List03 {

	public static void main(String[] args) {

		List<String>list=new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		List<String>list1=new ArrayList<>();
		
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		list1.add("E");
		
		System.out.println(list.contains("A"));//TRUE
		//.contains() returns boolean
		
		System.out.println(list.equals(list1));//true
		// .equals only checks the object
/*
 Ask user to enter a letter
 if the letter exists in list1 convert it to "Got it"
 otherwise add the element which user entered into the list		
 */
System.out.println(list1);		
Scanner scan = new Scanner (System.in);


	System.out.println("Enter a char");// t is not exist so else part will work
	String s=scan.next().toUpperCase().substring(0,1);
	
	if(list1.contains(s)) {
		list1.set(s.indexOf(s),"Got it");
		System.out.println(list1);
		
		
		
	}else {
		list1.add(s);
			System.out.println(list1);	//[A, B, C, D, E, T]
	}


}
		
	}


