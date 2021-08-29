package day20DTArrayList;

import java.util.ArrayList;
import java.util.List;

public class AddStarToAllElements {

	public static void main(String[] args) {
	
	
		
	//1.please write a method which adds * to the all elements
		
		 List<String> str  = new ArrayList<>();
         str.add("aa");
         str.add("bab");
         str.add("ab");
         str.add("ac");
         
         addStar(str);
         
  }
  public static void addStar(List<String> str) {
	  
      for (int i=0;i<str.size(); i++) {
    	  
        str.set(i, str.get(i)+"*");
        
      }System.out.println(str);
  }
}