package practiceDay06;

import java.util.Arrays;

public class HW {
	/*
	9. Write a method that accepts an Array of integers and returns the max.
	*/	
    public static int firstmax(int[]input) {
    	int max=input[0];
    	Arrays.sort(input);
    	return max=input[input.length-1];
    }

  //10. Write a method that accepts an Array of integers and returns the second max.  
    public static int secondmax(int[]input) {
    	int max=input[0];
    	Arrays.sort(input);
    	return max=input[input.length-2];
    }
 //11. Write a method that accepts an Array of int returns the sorted Array in ascending order.
 //Do not use the sort method. 
    public static int[] array(int input[]) {
  	  int temp=0;
  	  for(int i=0; i<input.length;i++) {	
  		  for(int j=i+1; j<input.length;j++) {  
  		  if(input[i]>input[j]) {		  
  			  temp=input[i];
  			  input[i]=input[j];
  			  input[j]=temp;
  		  }	  
  	  }
  }
  	return input;	
    }   
    
	public static void main(String[] args) {
	    System.out.println(firstmax(new int[] {100,95,8,11,90}));	
	    System.out.println(secondmax(new int[] {100,8,11,95}));
	    System.out.println(Arrays.toString(array(new int[] {9,5,78,2,8})));
 

		
		
	}

}
