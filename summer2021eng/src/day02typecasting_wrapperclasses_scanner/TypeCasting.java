package day02typecasting_wrapperclasses_scanner;

public class TypeCasting {

	public static void main(String[] args) {
		
		// DATE TYPE CASTING/CONVERTING
		// ASSIGN NEW TYPE TO SAME VARIABLE NAME
		//...BECAREFUL FOR DECIMALS...
				
				
				//a. AUTO WIDENNING / FROM SMALLER TO BIGGER TYPE
				//byte < short < int < long < float < double
				byte age = 65;
				short newAge = age;
				System.out.println(age);
				System.out.println(newAge);
				
				//b. NARROWING CASTING/ FROM BIGGER TO SMALLER TYPE
				//byte < short < int < long < float < double
				long profit = 2335;
				int newProfit = (int)profit;
				
				// FOR DECIMALS WE SHOULD BE CAREFUL.......................
				float price = 1.23f;
				short newPrice = (short) price;
				System.out.println(price);
				System.out.println(newPrice);
				
				
				int a = 5;
				double b= 4;
				float e = 4.0f;
				int c = 2;
				
				int d = 3;
				
				System.out.println(e/d);
				
	}

}
