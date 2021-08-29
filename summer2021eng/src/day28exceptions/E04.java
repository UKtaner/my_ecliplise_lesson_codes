package day28exceptions;

import java.util.Arrays;

public class E04 {
	/*
 	1)ArrayIndexOutOfBoundsException is thrown if you use non-existing index in Arrays
 	2)ArrayIndexOutOfBoundsException is an un-checked exception
 	
 	3)ClassCastException is thrown if you try to cast a data type to another which is not supported by Java
 	4)ClassCastException is an un-checked exception
 	
 	5)NumberFormatException is thrown if you use non-digit characters in a String and use parseInt()
 	4)NumberFormatException is an un-checked exception
*/
	
	//Array..................................
	// in Arrays,  String can not be used, non-primitives can not be used
	// if you use string, than java gets the references of the string, not itself.
	// we can only use primitives such as char.....		

	public static void main(String[] args) {
		String s[] = {"A", "D", "B", "C"};
	System.out.println(Arrays.toString(s));//[A, D, B, C]
	
		System.out.println(s[2]);//B
		
		try {
		System.out.println(s[4]);//ArrayIndexOutOfBoundsException
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Do not use non-existing index"+ e.getMessage());
		}
		// ClassCastException
		
		Object obj=70;
		String num=(String)obj;//ClassCastException
		
		
	}

}
