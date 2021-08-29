package dayMethods;

public class Replit {

	public static void main(String[] args) {
/*
 Write a return method that accepts an integer as input and calculates factorial and prints like output.
 Output: 6!=6*5*4*3*2*1=720
 */		
		
		
		System.out.println("="+factorial(6));
	   
	        
	       
	    }
	 public static long factorial(int number) {
	        long result = 1;
	        int i;
	      
	        	 for ( i = number; i > 1; i--) {
	        	
	      


	        	  
	            result *= i;
	            System.out.print(i+"*"+(i-1)); 
	        }
	      
	        return result;
	        
	    }
	

}