package dayLoopAlphabetPattern;

public class H_pattern {

	// https://www.javatpoint.com/how-to-print-pattern-in-java
	// https://www.javainterviewpoint.com/alphabet-pattern-program/	
		

			
			
			/*
			 
	 			*       *
				*       *
				*       *
				*       *
				*********
				*       *
				*       *
				*       *
				*       *
	 */


		    public static void main(String[] args) {
		  
		    	int i,j;
		    	
		      for(i=1; i<=9;i++) {
		    	  for(j=1;j<=9;j++) {
		    		  
		    		  if(j==1||j==9||i==5) 
		    			  System.out.print("*");
		    		  else 
		    			  System.out.print(" "); 
		    		  }
		    	  System.out.println();
		    	  }
		    	  
		    	  
		      }
	 	
		    	
		    }
		
			
