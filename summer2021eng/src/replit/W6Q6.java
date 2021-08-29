package replit;

import java.util.ArrayList;
import java.util.List;

public class W6Q6 {

	public static void main(String[] args) {
		/*
Write a program to find the common elements between two String Arrays (without case sensitivity)
 
Input1 : {John,Brad,Ange,Sofia,Emily}
 
Input2 : {sofia,brad,grace,emily,hazel}


Output : [sofia,brad,emily]
		 */
   List<String>input1=new ArrayList<String>(); 
		input1.add("John");
		input1.add("Brad");
		input1.add("Ange");
		input1.add("Sofia");
		input1.add("Emily");
		System.out.println(input1);
		
		List<String>input2=new ArrayList<String>(); 
		input2.add("sofia");
		input2.add("brad");
		input2.add("grace");
		input2.add("emily");
		input2.add("hazel");
		System.out.println(input2);
		List<String>input3=new ArrayList<String>(); 
		for(int i=0; i<input1.size();i++) {
			for(int j=0; j<input2.size();j++) {
				if(input1.get(i).toLowerCase().equals(input2.get(j).toLowerCase())) {
					
					input3.add(input1.get(i).toLowerCase());
					System.out.println(input3);
				}
			
				
				
				}
			
			}
		
		
	}

}
