package day35lambdacourse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FunctionalProgramming04DT {
//IntStream is giving integer stream and having starting  and ending value.
//2. Integer s=IntStream.rangeClosed(7, 100).reduce(0, Integer::sum);
//3. Integer s=IntStream.rangeClosed(x, y).filter(t->t%2==0).reduce(0, Integer::sum);
	public static void main(String[] args) {
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
        
        getSumOfAllElements(l);
        getSumOfIntFrom7To100A();
        getSumOfIntFrom7To100B();
        getSumOfIntFromXToY(4,5);
     
			}

    //1. create a method to find the sum of all elements in the list 
		public static void getSumOfAllElements( List<Integer> l) {
		
//lambda expression====>Integer sum=l.stream().reduce(0,(t,u)->t+u);
//						Integer sum= l.stream().reduce(0,Integer::sum);
			Integer sum= l.stream().reduce(0,Math::addExact);
// reduce() is terminal method, after itself can not call any method			
			
			System.out.println(sum);
		}
//2)Create a method to find the sum of integers from 7 to 100	
		//1.way
		public static void getSumOfIntFrom7To100A() {
			
		Integer sum=IntStream.range(7, 101).reduce(0,Math::addExact);
		System.out.println(sum);
		
		}
		//2.way
		public static void getSumOfIntFrom7To100B() {
		
		Integer sum=IntStream.rangeClosed(7, 100).reduce(0,Math::addExact);
		System.out.println(sum);	
	}
	
		//3.way
				public static void getSumOfIntFromXToY(int x, int y) {
//				Integer sum=IntStream.rangeClosed(7, 100).sum();				
				Integer sum=IntStream.rangeClosed(x, y).reduce(0,Math::addExact);
				System.out.println(sum);
		
				}
// 3)Create a method to find the multiplication of the integers from 2(inc) to 11(inc)
				public static void getMultiplicationOfIntFromXToY(int x, int y) {
//				Integer prod= IntStream.rangeClosed(x, y).reduce(1, (t,u)->t*u);	
					
				Integer prod = IntStream.rangeClosed(x, y).reduce(1, Math::multiplyExact);
					
					System.out.println(prod);						
}	


//4)Create a method to calculate the factorial of a given number.(5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)
	public static void calcFactorial(int x) {
//			Integer factorial=IntStream.rangeClosed(1, x).reduce(1, (t,u)->t*u);		
		Integer factorial = IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact);
		
		System.out.println(factorial);
		
}

//5)Create a method to calculate the sum of even integers between given two integers
	public static void getSumOfEvensInTheGivenRange(int x, int y) {
// 		Integer sum= IntStream.rangeClosed(x, y).filter(t->t%2==0).reduce(0, (t,u)->t+u);		
		Integer sum = IntStream.rangeClosed(x, y).filter(Utils::checkToBeEven).reduce(0, Math::addExact);
		
		System.out.println(sum);
		
}

//6)Create a method to calculate the sum of digits of every integers between given two integers
//  23 and 27 ---->  24==>6, 25==>7, 26==>8    ----> 6 + 7 + 8 = 21 
	public static void getSumOfDigitsInTheGivenRange(int x, int y) {
		
		
		IntStream.rangeClosed(x, y).map(Utils::getSumOfDigits).forEach(Utils::printInTheSameLineWithASpace);
		
		System.out.println();
		//Instead of "reduce(0, Math::addExact)" you can use sum()
		Integer sumOfDigits = IntStream.rangeClosed(x, y).map(Utils::getSumOfDigits).sum();
		System.out.println(sumOfDigits);
		System.out.println();
		
		Integer sumOfDigits1 = IntStream.rangeClosed(x, y).map(Utils::getSumOfDigits).reduce(0, Math::addExact);			
		System.out.println(sumOfDigits1);
			
		
	}

}