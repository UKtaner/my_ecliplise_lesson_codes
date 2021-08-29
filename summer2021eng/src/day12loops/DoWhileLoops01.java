package day12loops;

public class DoWhileLoops01 {

	public static void main(String[] args) {
		
		 /*
        the difference between "While" and Do-While loop is:
         do-while execute the body at least once
         but while loop execution depends on the given condition to execute
        
        */
       
       
       int i = 1;
       
       while(i>1) {
           System.out.println("Hi this is while loop");
           i++;
       }
       
       do {
           System.out.println("Hi this is Do-While loop");
           
           i--;
           
       }while(i>1);
   }
	
		
	}


