package day19DTarrayList;

import java.util.ArrayList;

public class List02 {

	public static void main(String[] args) {

		//how to update an element
		
		ArrayList<String>Strlist=new ArrayList<>();

		Strlist.add("Ali");
		Strlist.add("Veli");
		Strlist.add("Bahar");
		Strlist.add("Zeki");
		Strlist.add("Umay");
		Strlist.add("Muhammet");
		Strlist.add("Kaan");
		Strlist.add("Leyla");
			
		System.out.println(Strlist);//[Ali, Veli, Bahar, Zeki, Umay, Muhammet, Kaan, Leyla]
	
	// .set()==> remove and add other one
	//  used index of 1
		Strlist.set(1, "Selen");
		System.out.println(Strlist);
		
		Strlist.set(Strlist.indexOf("Ali"), "Kemal");
	//  can also use index of with obj of Ali
		System.out.println(Strlist);
	
	}

}
