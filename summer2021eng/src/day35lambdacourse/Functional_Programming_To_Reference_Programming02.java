package day35lambdacourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Functional_Programming_To_Reference_Programming02 {

	public static void main(String[] args) {
		
		/*
	 	Method Reference: Class Name  :: Method Name without method parenthesis 
	 	Example ==>        String     :: length
	 	                   ArrayList  :: size
	 */

		
		List<Integer> l = new ArrayList<Integer>();
        l.add(12);
        l.add(9);
        l.add(13);
        l.add(4);
        l.add(9);
        l.add(2);
        l.add(4);
        l.add(12);
        l.add(15);
//in functional programming same method are final such as reduce(), can not use any another method. They are called terminal method.       
        printElFunctional(l);
        System.out.println();
        printEvensFunctional(l);
        System.out.println();
        printSquareOfOdds(l);


	}
    //1)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Method Reference)
	//If Java has any method we prefer to use it, if Java does not have it we create the method inside Utils class and use it
	public static void printElFunctional(List<Integer> l) {
		l.stream().forEach(Utils :: printInTheSameLineWithASpace);
	}
	
	//2)Create a method to print the even list elements on the console in the same line with a space between two consecutive elements.(Method Reference) 
	public static void printEvensFunctional(List<Integer> l) {	
		l.stream().filter(Utils::checkToBeEven).forEach(Utils::printInTheSameLineWithASpace);		
	}
	
    //3)Create a method to print the square of odd list elements on the console in the same line with a space between two consecutive elements.
	public static void printSquareOfOdds(List<Integer> l) {		
		l.stream().filter(Utils::checkToBeOdd).map(Utils::getSquare).forEach(Utils::printInTheSameLineWithASpace);		
	}
	
	//4)Create a method to print the cube of distinct odd list elements on the console in the same line with a space between two consecutive elements.
	public static void printCubeOfDistinctOdds(List<Integer> l) {
		
		 l.stream().
		 distinct().
		 filter(Utils::checkToBeOdd).
		 map(Utils::getCube).
		 forEach(Utils::printInTheSameLineWithASpace);	
		
	}
	 //5)Create a method to calculate the sum of the squares of distinct even elements
		public static void sumOfSquareDistinctEvens(List<Integer> l) {			
			Integer sum = l.
							stream().
							distinct().
							filter(Utils::checkToBeEven).
							map(Utils::getSquare).
							reduce(0, Math::addExact);			
			System.out.println("The sum of the squares of even distinct elements is " + sum);			
		}
		
		//6)Create a method to calculate the product of the cubes of distinct even elements
		public static void productOfCubeDistinctEvens(List<Integer> l) {		
			Integer prod = l.
					        stream().
					        distinct().
					        filter(Utils::checkToBeEven).
					        map(Utils::getCube).
					        reduce(1, Math::multiplyExact);		
			System.out.println("The multiplication of the cubes of even distinct elements is " + prod);		
		}
		
		//7)Create a method to find the maximum value from the list elements
		public static void getMaxElement(List<Integer> l) {
			Integer maxEl = l.
							  stream().
							  reduce(Integer.MIN_VALUE, Math::max);
			System.out.println("The max element is " + maxEl);	
		}
		
		//8)Create a method to find the minimum value from the list elements
		public static void getMinElement(List<Integer> l) {		
			Integer minEl = l.
							  stream().
							  reduce(Integer.MAX_VALUE, Math::min);
			System.out.println("The min element is " + minEl);		
		}
		
		//9)Create a method to find the minimum value which is greater than 7 and even from the list
		public static void getMinGreaterThanSevenEven1(List<Integer> l) {		
			Integer minEl = l.
							  stream().
							  distinct().
							  filter(t->t>7).filter(Utils::checkToBeEven).//(t->t>7) is specific condition, so that no need to create a method.
							  											  //In a method reference and lambda ex can not be used.
							  reduce(Integer.MAX_VALUE, Math::min);		
			System.out.println("1) The min element is " + minEl);
		}
		
		//10)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list.
		public static void getHalfOfDistinctElReversed(List<Integer> l) {
			List<Double> resutList = l.
					                  stream().
					                  distinct().
					                  filter(t->t>5).//(t->t>5) is specific condition, so that no need to create a method.
					                  map(Utils::getHalf).
					                  sorted(Comparator.reverseOrder()).
					                  collect(Collectors.toList());	
			System.out.println("Half of the elements list: " + resutList);
		}

	}
