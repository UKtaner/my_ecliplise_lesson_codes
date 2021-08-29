package day20DTArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList06 {

	public static void main(String[] args) {
//please create a method which multiplies all the elements by itself and then call it from the main method	
		
		 List<Integer> num  = new ArrayList<>();	

		 num.add(2);
		 num.add(3);
		 num.add(4);
		 num.add(5);
		 num.add(6);
	
		 multiplySelf(num);
		 
	}

	public static void multiplySelf(List<Integer> num) {

		for(int i=0; i<num.size();i++) {
			num.set(i, num.get(i)*num.get(i));
			
		
			
		}System.out.println(num);
		
		
}

}