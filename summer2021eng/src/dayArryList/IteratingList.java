package dayArryList;

import java.util.ArrayList;

public class IteratingList {

	public static void main(String[] args) {
		ArrayList<String> alist=new ArrayList<String>();  
	     alist.add("Gregor Clegane");  
	     alist.add("Khal Drogo");  
	     alist.add("Cersei Lannister");  
	     alist.add("Sandor sds"); 
	     alist.add("Tyrion bff");
	  
	     //iterating ArrayList
	     for(String str:alist)  
	        System.out.println(str); 
	    /*
	 Gregor Clegane
	Khal Drogo
	Cersei Lannister
	Sandor sds
	Tyrion bff
	     */
	     
	}
}