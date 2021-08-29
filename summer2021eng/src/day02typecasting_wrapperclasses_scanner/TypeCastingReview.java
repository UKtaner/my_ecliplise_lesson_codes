package day02typecasting_wrapperclasses_scanner;

public class TypeCastingReview {

	public static void main(String[] args) {
		
		byte a=2;
		
		short b=5;
		
		int c=8;
		
		float e=10.2f;
		
		long k = 15;
		
		double z = 20.5d;
		
		System.out.println(c/b);
		
		
		//byte < short < int < long < float < double
		
		double rent=20.00;
		int newRent=(int)rent;
		
		System.out.println("rent "+ rent);
		System.out.println("newRent "+ newRent);
		
		
	}

}
