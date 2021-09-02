package day35lambdacourse;

import java.util.List;

public class Utils {
// ctrl+space for methods to be shown up
    public static void printInTheSameLineWithASpace(Object o) {
	        System.out.print(o + " ");
	}
	
	public static boolean checkToBeEven(int x) {
	    return x%2==0;
	}
	
	public static boolean checkToBeOdd(int x) {
	    return x%2!=0;
	}
	public static Integer getSquare(int x){
	    return x*x;
	}
	public static Integer getCube(int x){
	    return x*x*x;
	}
	public static Double getHalf(int x){
	    return x/2.0;
	}

	public static Integer getSumOfDigits(int x) {
	int sum=0;
	while(x!=0) {
		sum+=x%10;
		x=x/10;
		}
		return sum;
	}
	
	
}
