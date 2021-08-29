package day19DTarrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Prac {

	public static void main(String[] args) {
	List <Integer>list1=new ArrayList<>();
	
	list1.add(3);
	list1.add(4);
	list1.add(1);
	list1.add(2);
	System.out.println(list1);
	
	Collections.sort(list1);
	System.out.println(list1);
	list1.add(0,99);
	System.out.println(list1);
	list1.add(5,99);
	System.out.println(list1);
	list1.add(6,0);
	System.out.println(list1);

	System.out.println(	list1.get(0));
	Collections.sort(list1,Collections.reverseOrder());
	
	System.out.println(list1.get(0));
	System.out.println(list1.get(list1.size()-1));
	System.out.println(list1.indexOf(0));
	
	list1.set(0, 1);
	System.out.println(list1);
	
	List<String>list2=new ArrayList<>();
	
	list2.add("a");
	list2.add("b");
	list2.add("c");
	list2.add("d");
	
	
	
	Scanner scan= new Scanner (System.in);
	
	System.out.println("Enter a string");
	
	String str=scan.next().toUpperCase().substring(0,1);
	
	if(list2.contains(str)) {
		list2.set(str.indexOf(str), " got it");
		System.out.println(list2);
		
	}else {
		list2.add(str);
		System.out.println(list2);
	}
	
	
	   }
	}
		

