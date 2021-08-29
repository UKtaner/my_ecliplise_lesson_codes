package day04_concat;

public class Concatenation01 {

	public static void main(String[] args) {

		// to join the strings which are separate
		
		
		String fn1="Ayse";
		String ln1="Cool";
		
		System.out.println(fn1+6+5);//Ayse65
// from left to right in string concat with 6 and again 5
		
		System.out.println(fn1+(6+5));//Ayse11//parantheses
		System.out.println(5+fn1+(6*5));//5Ayse30
		
//		
//		 * Homework
//		 *
//		
//		
		//Question:By using following variables print 61Study-1 on the console
				int numA = 2;
				int numB = 3;
				String str1 = "Study";
		 
	
	 System.out.println((numA*numB)+""+(numB-numA)+str1+(numA-numB));
	
	}
	

}
