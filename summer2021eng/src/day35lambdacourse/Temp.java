package day35lambdacourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Temp {
	
public static void main(String[] args) {
        
	List<String> l = new ArrayList<>();
    l.add("Ali");
    l.add("Ali");
    l.add("Mark");
    l.add("Amanda");
    l.add("Christopher");
    l.add("Jackson");
    l.add("Mariano");
    l.add("Alberto");
    l.add("Tucker");
    l.add("Benjamin");
    
  System.out.println(l);
 
  printUppercase01(l);

}

//5) Remove the elements if the length of the element is greater than 5

		public static void printUppercase01(List<String> l) {
	
			System.out.println(l.removeIf(t->t.length()>5));
			

		
		}






}


		
			
			
		









	
	
