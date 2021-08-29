package day04_concat;

public class Concatetion01_Review {

	public static void main(String[] args) {

		//Question:By using following variables print 61Study-1 on the console
		int numA = 2;
		int numB = 3;
		String str1 = "Study";
		
		System.out.println((numA*numB)+""+(numB-numA)+str1+(numA-numB));

		String fn1="Ayse";
		String ln1="Cool";
		
		System.out.println(fn1+6+5);
// from left to right in string concat with 6 and again 5
		
		System.out.println(fn1+(6+5));
		System.out.println(5+fn1+(6*5));
		
		
	}

}
