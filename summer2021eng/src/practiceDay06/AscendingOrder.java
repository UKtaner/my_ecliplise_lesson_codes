package practiceDay06;

import java.util.Arrays;

public class AscendingOrder {
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
	    System.out.println(Arrays.toString(array(new int[] {9,5,78,2,8})));

	}

}
