package dayArryList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExistLetter {

	public static void main(String[] args) {
		/*
	 Ask user to enter a letter
        If the letter exist in list1 convert it to "I have it!"
        otherwise add the element which user entered to the list1
        
		 */
		
	//char ch = scan.next().toUpperCase().charAt(0);
	// using char.............................................	
		
		List<Character>list1=new ArrayList<Character>();
		list1.add('A');
		list1.add('B');
		list1.add('C');
		list1.add('D');
		list1.add('R');
		System.out.println(list1);
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a String");
		
		char cr=scan.next().toUpperCase().charAt(0);
		
		if(list1.contains(cr)) {
			list1.set(list1.indexOf(cr), '$');
			System.out.println(list1);
			
			
		}else {
			list1.add(cr);
			
			System.out.println(list1);
		}
/*using string.................
 		List<String>list1=new ArrayList<String>();
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a String");
		
		String s = scan.next().toUpperCase().substring(0,1);
		
		
		
		
		list1.add("A");
		list1.add("W");
		list1.add("Z");
		list1.add("T");
		list1.add("B");
	
		
		if (list1.contains(s)) {
			list1.set(s.indexOf(s), "$");
			System.out.println(list1);
			
		}else {
			list1.add(s);
			System.out.println(list1);
		}		
 */

		
		
		
		
	}
}
