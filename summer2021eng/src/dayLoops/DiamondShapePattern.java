package dayLoops;

import java.util.Scanner;

public class DiamondShapePattern {
/*
 
						 	*
						   ***
						  *****
						 *******
						*********
						 *******
						  *****
						   ***
						    *
						 
 
 */
	public static void main(String[] args) {
	       int i,k;
	       
	       for(i=0;i<5;i++) {
	    	   for(k=(5-i);k>=0;k--) {
	    		   System.out.print(" ");
	    	   }  
	    		   for(k=0;k<i;k++) {
	    			   System.out.print("* ");
	    		   }
	    	 System.out.println();
	    	 
	       }
	    	for(i=5;i>=1;i--) {
	    		   for(k=0; k<=(5-i);k++) {
	      		   System.out.print(" ");
	    		
	    		 }
	    	for(k=0;k<i;k++) {
				   System.out.print("* ");
			   }
		 System.out.println();	 
	    		 
	    	 }
	    	  
	    	   }	
		}
		