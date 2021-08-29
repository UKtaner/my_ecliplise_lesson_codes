package day01variables;

public class day01review {

	static int price1;   	// not yet assigned a value, gives default value 0.
	int price2=100; 		// must be static
	static int price3= 45;
	
	//System.out.println(price1); // println must be in main method
	//System.out.println(price2);// println must be in main method and price2 must be static
	
	public static void main(String[] args) {
		System.out.println(price1);// 0
		//System.out.println(price2);// variable must be static
		System.out.println(price3);//45
		
		
	}

}
