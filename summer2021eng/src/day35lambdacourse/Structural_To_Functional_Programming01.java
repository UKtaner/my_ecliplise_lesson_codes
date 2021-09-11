package day35lambdacourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Structural_To_Functional_Programming01 {
/*
 
 There is no method creation, only using existing methods
 1) lambda is functional Programming
 2) Structure programming but after java 8 we are able to use both  functional Programming and structure programming
 3) Structure programming focuses on "How to do " most of the times.Fuctional Programming focuses on "What to do"
 4)F.P. is used only with Collections and Arrays
 
 
 */
	/*
 	1)Lambda is Functional Programming
 	2)Functional Programming was added to Java in Java 8, before Java 8 we were using just
 	  Structured Programming but after Java 8 we are able to use both Functional Programming and
 	  Structured Programming
 	3)Structured Programming focuses on "How to do" most of the times, Functional Programming focuses on
 	  "What to do"
 	4)Functional Programming is used with Collections and Arrays

  A stream() is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
  Streams don't change the original data structure, they only provide the result as per the pipelined methods.
 */
	
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
	        
	        printElStructured(l);
	        System.out.println();
	        printElFunctional(l);
	        System.out.println();
	        printEvensStructured(l);
	        System.out.println();
	        printEvensFunctional(l);
	        System.out.println();
	        printSquareOfOdds(l);
	        System.out.println();
	        printCubeOfDistinctOdds(l);
	        System.out.println();
	        sumOfSquareDistinctEvens(l);
	        System.out.println();
	        productOfCubeDistinctEvens(l);
	        System.out.println();
	        getMaxElement(l);
	        System.out.println();
	        getMinElement(l);
	        System.out.println();
	        getMaxElement2(l);
	        System.out.println();
	        getMinElement2(l);
	        System.out.println();
	        getMinGreaterThanSevenEven1(l);
	        System.out.println();
	        getMinGreaterThanSevenEven2(l);
	        System.out.println();
	        getHalfOfDistinctElReversed(l);
	        
	        //System.out.println(l.stream());
	    }
	    
	    //1)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Structured)
	    public static void printElStructured(List<Integer> l) {
	      /*	       
			        for(int i=0;i<l.size();i++) {
					System.out.print(l.get(i)+" ");						
	       */
	    	    	
	        for(Integer w : l) {
	            System.out.print(w + " ");
	            
	            
	        }
	        
	    }
	    
	    //1)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Functional)
	    
	    public static void printElFunctional(List<Integer> l) {
	        l.stream().forEach(t->System.out.print(t + " "));	//by f.p. access to more method to use.if i do not use stream() than can not use forEch() here. 
	        // forEach() gets the elements one by one than place them in t container.
	   
//			 l.forEach(t->System.out.print(t + " "));	//12 9 131 14 9 10 4 12 15 	
	    
	    }
	    
//	2)Create a method to print the even list elements on the console in the same line with a space between two consecutive elements.(Structured)
	    
	    public static void printEvensStructured(List<Integer> l) {
	        
	        for(Integer w : l) {
	            
	            if(w%2==0) {
	                System.out.print(w + " ");
	            }
	            
	        } 
	        
	    }
	    //2)Create a method to print the even list elements on the console in the same line with a space between two consecutive elements.(Functional)
	    public static void printEvensFunctional(List<Integer> l) {
	        
	        l.stream().filter(t->t%2==0).forEach(t->System.out.print(t + " "));//t->t%2==0 the name of that structure is called "Lambda Expression"
	        
	    }
	    
	    //3)Create a method to print the square of odd list elements on the console in the same line with a space between two consecutive elements.
	    public static void printSquareOfOdds(List<Integer> l) {
	        
	        l.stream().filter(t->t%2!=0).map(t->t*t).forEach(t->System.out.print(t + " "));//map() is used to change the value of elements
	        // map() gets the elements from stream() than change them to new structure
	    }
	    
	    //4)Create a method to print the cube of distinct odd list elements on the console in the same line with a space between two consecutive elementAAs.
	    public static void printCubeOfDistinctOdds(List<Integer> l) {
	        
	        l.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t->System.out.print(t + " "));//distinct() removes repeated ones
	        
	    }
	    
	    //5)Create a method to calculate the sum of the squares of distinct even elements
	    public static void sumOfSquareDistinctEvens(List<Integer> l) {
	        
	        Integer sum = l.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0, (t,u)->t+u);//For sum, make the first parameter zero
	        System.out.println("The sum of the squares of even distinct elements is " + sum);// t gets first value as 0 and u get its value from stream. 
	 // since reduce() is terminal operation, after itself we can not use any method. we assigned sum container.         
	    }
	    
	     //6)Create a method to calculate the product of the cubes of distinct even elements
	    public static void productOfCubeDistinctEvens(List<Integer> l) {
	        
	        Integer prod = l.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1, (t,u)->t*u);//reduce is accumulator from stream, terminal operator
	        System.out.println("The multiplication of the cubes of even distinct elements is " + prod);
	        
	    }
	    
	    //7)Create a method to find the maximum value from the list elements
	    //1.Way:
	    public static void getMaxElement(List<Integer> l) {
	        
	        Integer maxEl = l.stream().reduce(Integer.MIN_VALUE, (t, u)-> t>u ? t : u);//reduce()==>(there are many elements but selecting only one element)
	        								//the purpose of using "Integer.MIN_VALUE" is to direct to work on on stream.
	        System.out.println("The max element is " + maxEl);
	        
	    }
	    
	    //2.Way:
	    public static void getMaxElement2(List<Integer> l) {
	        //sorted() ==> Returns a stream consisting of the elements of this stream, sorted according to natural order.
	        Integer maxEl =  l.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t,u)->u);
	        System.out.println("The max element is " + maxEl);
// without sorted(), code checks the params one by one and the last param is 15, will be printed.  	    
	    }
	    //8)Create a method to find the minimum value from the list elements
	    //1.Way:
	    public static void getMinElement(List<Integer> l) {
	        
	        Integer minEl = l.stream().reduce(Integer.MAX_VALUE, (t, u)-> t<u ? t : u);
	        System.out.println("The min element is " + minEl);
	        
	    }
	    
	    //2.Way:
	    public static void getMinElement2(List<Integer> l) {
	        
	        Integer minEl = l.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t,u)->u);
	        
	        System.out.println("The min element is " + minEl);
	        
	    }
	    
	    
	    //9)Create a method to find the minimum value which is greater than 7 and even from the list
	    
	    //1.Way:
	    public static void getMinGreaterThanSevenEven1(List<Integer> l) {
	        
	        Integer minEl = l.stream().distinct().filter(t->t>7 && t%2==0).reduce(Integer.MAX_VALUE, (t,u)->t<u ? t : u);
	        
	        System.out.println("1) The min element is " + minEl);
	    }
	    
	    //2.Way:
	    public static void getMinGreaterThanSevenEven2(List<Integer> l) {
	        
	        //Use findFirst() together with get() to get Integer return type
	        Integer minEl = l.stream().distinct().filter(t->t>7 && t%2==0).sorted().findFirst().get();
	        System.out.println("2) The min element is " + minEl);
	        
//Integer result=l.stream().filter(t->t>7 && t%2==0).sorted(Comparator.reverseOrder()).reduce(Integer.MIN_VALUE,(t,u)->u);	        
	    }
	    
	    //10)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list.
	    public static void getHalfOfDistinctElReversed(List<Integer> l) {
	        
	        List<Double> resutList = l.stream().distinct().filter(t->t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	        
	        
	        System.out.println("Half of the elements list: " + resutList);//[65, 7, 7, 6, 5, 4]
	    }
	}