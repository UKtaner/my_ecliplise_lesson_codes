package practiceDay06;

public class SumOfNum {
//1. Write a method that returns the sum of numbers starting with 1 to the number passed into the method.
// once you have return type in a created method , you have to call it by using syso...	
	
public static long SumOfNum(int n) {
// 2. way	return n*(n+1)/2;	
// 1. way
	int sum=0;
	for(int i=1;i<n+1;i++) {
		
		sum+=i;	
	}
	System.out.println(sum);
	return sum;

	
	
}
	public static void main(String[] args) {
		SumOfNum(15);
		SumOfNum(5);
		
		
	}
}

/*
int a=1212;
int b=44654;
System.out.println(Integer.sum(a, b));
*/

/*3. way - for each loop
 * 
System.out.println(SumOfNum(2,34,5));
	}
	 public static int SumOfNum(int... n) { 
		 
		    int sum = 0; 
		    
		    for(int i : n) { 
		        sum += i; 
		    }
		    
		    return sum; 
		}	
	}
*/
