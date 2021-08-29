package day03increment_decrement_operation;

public class Increment01 {

	public static void main(String[] args) {
		
		//1. way
		int age = 20;
		age = age+5;
		//2. way
		age+=6; //31
		//java increment runs from top to bottom...
		
		// 3.way ==> increasing by only 1...
		
		age++;
		
		// how to increase the value of a variable by multiplication.
		
		//1. way
		int salary = 1000;
		
		salary=salary*2;
		
		//2.way
		salary*=3;
		
		System.out.println("Final salary is "+ salary);
		
		
		
	}

}
