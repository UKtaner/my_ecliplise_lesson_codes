package dayArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveIndex {

	public static void main(String[] args) {
		
		System.out.println("Enter a String:");// [aassddfghghh]
		ArrayList<Character>list1=new ArrayList<>();
		 ArrayList<Character>list2=new ArrayList<>();
	    Scanner scan=new Scanner(System.in);  
	    String str=scan.nextLine(); 
	    //str=list1.add(scan.next());

	      for(int i=0;i<str.length();i++) {
	    	  
	    	for(int k=i+1; k<str.length();k++) {
	    		if(str.charAt(i)==str.charAt(k)) {
	    			list2.add(str.charAt(i));
	    			
	    			
	    		}
	    	}
	    	  
	      }
	      for(char i:list1) {
	    	  if(!list2.contains(i)) {
	    		  list2.add(i);
	    	  }
	    	  
	      }
	      	System.out.println(list2);
	}  
	}  

		 
		
		
