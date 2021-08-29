package day03increment_decrement_operation;

public class SwapQuestion {

	public static void main(String[] args) {
		

		// Swap the value
		
		//a=12; b=5 ==> a=5; b=12;
		
		int a=12;
		int b=5;
		System.out.println( "before the swap a is " +a);
		System.out.println("before the swap b is "+ b);
		
		int temp;// temprorary container
		
		temp= b;
		b=a;
		a=temp;
		System.out.println("after the swap a is " + a);
		System.out.println("after the swap b is " + b);
		
		
		
	}

}
