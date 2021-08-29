package dayStringMethods;

import java.util.Arrays;
import java.util.Scanner;

public class Temp {
	
	
	static int sumOfArray(int []input) {
		int sum=0;
		for(int i:input) {
			sum+=i;
		}
		return sum;
		
	}
	
	
	public static void main(String[] args) {
System.out.println(sumOfArray(new int [] {1,2,3,4,5,6,7,8}));
		
	}
}
