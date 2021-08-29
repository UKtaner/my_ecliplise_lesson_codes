package day24_multithreadsyncencapsulation;

import java.util.Arrays;

public class Varargs01 {

			
			/*
			 1.) Behind the "varargs", Java uses arrays. Because of that, varargs behaves like arrays with some differences 
			 2.) You can not use more than one varargs in a method paranthesis
			 3.) Vararrgs must be last a parameter.(int... a, String b==> false)
			 										BUT: String b, int... a==> runs
			 4.) "..." can be put just after data type(int... a) or just before varargs name(int ...a). Others do not work
	  
	  			Note: If you need same method to use with different number of parameters, use "varargs"										
			 */

			public static void main(String[] args) {
				
				System.out.println((add()));
				
				System.out.println(add(5));
				
				System.out.println(add(5, 7));
				
				System.out.println(add(5, 7, 8, 9, 12));
				
				System.out.println(add(1,2,3,4,5,6,7));

			}
			
//			public static int add() {
//				return 3 + 5;
//			}
	
//			public static int add(int a, int b) {
//				return a + b;
//			}	
//			public static int add(int a, int b, int c) {
//				return a + b + c;
//			}
			
			public static int add(int... a) {
				
				int sum = 0;
				for(int w : a) {
					sum += w;
				}
				return sum;
		}
}