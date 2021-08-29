package day32NTcollections;

import java.util.HashSet;
import java.util.Set;

public class Test01 {

	public static void main(String[] args) {


		HashSet<String>hs1=new HashSet<>();
		hs1.add("Apple");
		hs1.add("Mango");
		hs1.add("Orange");
		hs1.add("Palm");
		hs1.add("Apricot");
		hs1.add("Palm");
		
		System.out.println(hs1);
	
	hs1.retainAll(hs1);
	
	
	
	}

}
