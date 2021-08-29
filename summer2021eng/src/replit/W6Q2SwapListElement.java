package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class W6Q2SwapListElement {
/*
 Create a 10-element list. Swap the 8th element with the 3rd element.
INPUT : 
String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
Output:         
[Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
 */
	public static void main(String[] args) {
	//ArrayList<String> names= new ArrayList<>(Arrays.asList("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
	//Collections.swap(names, 2, 7);
	
	ArrayList<String> names= new ArrayList<>();
	
	names.add("Umit");
	names.add("Emin");
	names.add("Kemal");
	names.add("Kerem");
	names.add("Taylan");
	names.add("Orhan");
	names.add("Sinan");
	names.add("Furkan");
	names.add("Ahmet");
	names.add("Ali");
	names.set(2, names.get(7));
	names.set(7, names.get(2));
	
	for(int i=0;i<names.size();i++) {
	
		
	}
	
	System.out.println(names);
	
	
	
	
	}
}
	
	

