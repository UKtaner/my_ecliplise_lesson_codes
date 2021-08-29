package day23NTStringbuilders;

public class DT2 {

	public static void main(String[] args) {
		 StringBuilder sb1 = new StringBuilder("I love Java");
	        StringBuilder sb2 = new StringBuilder("I love Java");
	        
	        //how to compare 
	        /*
	         * in string builder equals() method works like "==" sign
	         * it checks the value and references 
	         */
	        System.out.println(sb1.equals(sb2));
	        System.out.println(sb1.equals(sb1));
	        
	        
	        //to get the index of a specific character
	        System.out.println(sb1.indexOf("e"));//5
	        System.out.println(sb1.indexOf("a"));//8
	        System.out.println(sb1.indexOf("s"));
	        
	        //insert  (offset, String)
	        System.out.println(sb1.insert(7, "the "));
	        
	        //insert (to add part of a string into the specific index 
	        sb1.insert(1, "and , Asyalar",3 ,10 );
	        System.out.println(sb1);
	        
	        //reverse
	        sb1.reverse();
	        System.out.println(sb1);
	        sb1.reverse();
	        
	        //replace
	        
	        sb1.replace(2, 8, "*");
	        System.out.println(sb1);
	        sb1.replace(8, 13, "");
	        System.out.println(sb1);
	        
	        //set char
	        sb1.setCharAt(7, ' ' );
	        System.out.println(sb1);
	        
	        System.out.println("before trim: "+sb1.capacity());
	        
	        //trim
	        //
	        sb1.trimToSize();
	        System.out.println("after trim :"+sb1.capacity());
	        sb1.append(" and Selenium");
	        System.out.println(sb1.capacity());
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	    }
	}