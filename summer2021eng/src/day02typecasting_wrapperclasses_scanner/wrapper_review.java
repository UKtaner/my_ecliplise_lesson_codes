package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;
 class wrapper_review {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("\nChoose the operation  " +
                "\n1.Addition" +
        	    "\n2.Subtraction" +
        		"\n3.Multiplication" +
        		"\n4.Division" +
        		"\n5.Power" +
        		"\n#Please enter the number of operation \n");
		
		double fnum = input.nextDouble(); // first number
		
		
		 int opt = input.nextInt();
		
		 	double add = 1;
	        double subt = 2;
	        double mult = 3;
	        double div = 4 ;
	        double power = 5;
	
	       double snum = input.nextDouble(); // second number
	        
	        if (opt==add) {
	         
	        System.out.println(fnum +" + "+snum+ " : "+(fnum + snum));
	        }
	        
	        else if (opt==subt) {
	        
	        System.out.println(fnum +" - "+snum+ " : "+(fnum - snum));
	        }
		 
	        else if (opt==mult) {
		        
		        System.out.println(fnum +" * "+snum+ " : "+(fnum * snum));
	        }
	        else if (opt==div) {
		        
		        System.out.println(fnum +" / "+snum+ " : "+(fnum / snum));
	        }
	        else if(opt==power) {
		        
		        System.out.println(snum+"th power of " + fnum +Math.pow(fnum, snum));	        
	        }
	        else {
	        }
	}
}

