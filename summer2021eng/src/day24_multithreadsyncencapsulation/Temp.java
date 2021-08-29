package day24_multithreadsyncencapsulation;

import java.util.Arrays;

public class Temp {

	
//	public static int add(int a, int b) {
//		return 3+5;
//			
//	}
//	public static int add() {
//		
//		return 4;
//	}
//	public static int add(int a, int b, int c) {
//		
//		return a+b+c;
//	}
	public static int add(int... a) {
		
		int sum=0;
		for(int w:a) {
			sum+=w;
			
		}
	return sum;
	}
	
		public static void main(String[] args) {
		
		System.out.println((add(5)));// if not type Arrays.toString, it will hash code
		System.out.println((add(5, 6,7)));
		
		
		
		
		
		

	}

}
