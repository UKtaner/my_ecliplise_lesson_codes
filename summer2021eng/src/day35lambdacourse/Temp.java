package day35lambdacourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Temp {
	
public static void main(String[] args) {
        
    List<Integer> l = new ArrayList<Integer>();
    l.add(12);
    l.add(9);
    l.add(131);
    l.add(14);
    l.add(9);
    l.add(10);
    l.add(4);
    l.add(12);
    l.add(15);
  
   
    
    element(l);
     
			}
			

//2)Create a method to print the even list elements on the console in the same line with a space between two consecutive elements.(Structured)	
public static void element( List<Integer> l ) {
//3)Create a method to print the square of odd list elements on the console in the same line with a space between two consecutive elements.
//4)Create a method to print the cube of distinct odd list elements on the console in the same line with a space between two consecutive elementAAs.
//5)Create a method to calculate the sum of the squares of distinct even elements	
//6)Create a method to calculate the product of the cubes of distinct even elements
//7)Create a method to find the maximum value from the list elements
    //1.Way:
//8)Create a method to find the minimum value from the list elements
    //1.Way:
	
	//9)Create a method to find the minimum value which is greater than 7 and even from the list
    
System.out.println( l.stream().distinct().filter(t->t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
    
    		
		}
		
	}
	
		
		
		
			
			
		









	
	
