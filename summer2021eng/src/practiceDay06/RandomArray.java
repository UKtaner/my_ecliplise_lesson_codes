package practiceDay06;

import java.util.Random;

public class RandomArray {
//8. Write a method that generates an single dimensional Array that consists of x numbers random numbers between 1 and 100.
//	Method will accept int x as an argument.	
	static int[] randomArray(int x) {

		int[] numbers = new int[x];
		
		Random r = new Random();
		
		for (int i = 0; i < x; i++) {
			
		int randomInt = r.nextInt(100) + 1;
		
		numbers[i] = randomInt;
	}

	return numbers;
}
	
	

	public static void main(String[] args) {
		System.out.println();
		
		
		
	}


}