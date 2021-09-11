package day35lambdacourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Functional_Programming_String03 {

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
        
        printUppercase01(l);
        System.out.println();
        printUppercase02(l);
        System.out.println();
        printSortedByLength(l);
        System.out.println();
        printDisinctSortedByLastChar(l);
        System.out.println();
        System.out.println();
        printSortedByLengthFirstChar(l);
        System.out.println();
        //removeIfLengthGreaterThanFive(l);
        removeIfElementStaringAndEnding(l);
        System.out.println();
        lengthSquareDistinctReverse(l);
        System.out.println();
        checkLengthToBeLessThan12(l);
        System.out.println();
        checkInitials(l);
        
        
	}

//1) Create a method to print all list elements in uppercase.
	//1. way
	public static void printUppercase01(List<String> l) {
		
		l.stream().map(String::toUpperCase).forEach(Utils::printInTheSameLineWithASpace);
		// ALI, ALI, MARK, AMANDA, CHRISTOPHER, JACKSON, MARIANO, ALBERTO, TUCKER, BENJAMIN
		
	}
	//2.way
	public static void printUppercase02(List<String> l) {
	
	l.replaceAll(String::toUpperCase);
	//replaceAll() accepts method ref. and updated the list as same functionality with map()
	//forEach() and map() are under stream()
	System.out.println(l);//[ALI, ALI, MARK, AMANDA, CHRISTOPHER, JACKSON, MARIANO, ALBERTO, TUCKER, BENJAMIN]
	
	}
	
	//2 Create a method to print the elements after ordering according to their lengths
	
	public static void printSortedByLength(List<String> l) {
	l.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
				// .comparing() is in Comparator class
	
	}
	//3)  Create a method to sort the distinct elements by using their last characters	
	public static void printDisinctSortedByLastChar(List<String> l) {
		
	l.stream().distinct().sorted(Comparator.comparing(t->t.charAt(t.length()-1))).forEach(System.out::println);
	
	}

	//4)  Create a method to sort the elements according to their lengths then according to their first character

	public static void printSortedByLengthFirstChar(List<String> l) {
		// ->sort.by ->comparing ->length
		l.stream().sorted(Comparator.comparing(String::length).thenComparing(t->t.charAt(0))).forEach(System.out::println);
	
		//thenComparing() can be used many times
	} 

	//5) Remove the elements if the length of the element is greater than 5
	
//	public static void removeIfLengthGreaterThanFive(List<String> l) {
//		l.removeIf(t->t.length()>5);
//		System.out.println("The length of all elements is less than 5: " +l);
//		}
	
	//6) remove the elements if the element is starting with 'A','a' or ending with 'N','n'
	
	public static void removeIfElementStaringAndEnding(List<String> l) {
	l.removeIf(t->t.charAt(0)=='A'||t.charAt(0)=='a'||t.charAt(t.length()-1)=='N'||t.charAt(t.length()-1)=='n');
	
	System.out.println("====> "+l);
		
	}	
	//7) create a method which takes the square of the length of every element, print them distinctly in reverse order
	
	public static void lengthSquareDistinctReverse(List<String> l) {
	
	l.stream().map(String::length).map(Utils::getSquare).distinct().sorted(Comparator.reverseOrder()).forEach(Utils::printInTheSameLineWithASpace);

	}

	//8) Create a method to check if the lengths of all elements are less than 12
	
	public static void checkLengthToBeLessThan12(List<String>l) {
		
	boolean result=l.stream().allMatch(t->t.length()<12);//allMatch() is checking all elements one by one, if any element has more then 12 then , will give false
														// all conditions must be fitted to allMatch() 
		System.out.println(result);
			
	}
	
	//9) Create a method to check if the initial of any element is not 'X'
	public static void checkInitials(List<String>l) {
		boolean result=	l.stream().noneMatch(t->t.startsWith("X"));
		 //all conditions must be fitted to noneMatch(), opposite of allMatch()
		System.out.println(result);
		
	}
}
