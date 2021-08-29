package day29exceptionabstraction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class E02 {

	public static void main(String[] args) {
		//StringIndexOutOfBoundsException
				//String s = "Java is easy";		
				//System.out.println(s.charAt(2));//v		
				//System.out.println(s.charAt(12));//StringIndexOutOfBoundsException		
				//System.out.println(s.charAt(-3));//StringIndexOutOfBoundsException
				
				//IllegalStateException
				//If you use a method at an inappropriate time, you will get IllegalStateException 
				List<Integer> list = new ArrayList<>();
				list.add(21);
				list.add(22);
				list.add(23);
				
				Iterator<Integer> listItr = list.iterator();//[->21,22,23]
				listItr.next();// iterator is skipped first element,and stopped in front of second element
				listItr.remove();// can not remove first element bcoz iterator is in front of the first element. 
				//we need to use next() to go to in front of second element, than can be able to remove fist element.

			}

		}