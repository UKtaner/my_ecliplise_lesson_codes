package practiceDay08;

import java.util.Arrays;
import java.util.Random;

public class MultiDimantionalArrayGenerator {
//3.create a two dimensional array of random numbers.
	
	static int[][] ArrayGenerator(int outerSize, int innerSize){
		int[][] arr = new int[outerSize][innerSize];
		for (int i = 0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j] = new Random().nextInt(10);
			}
		}
		
		return arr;
	}
	public static void main(String[] args) {
	System.out.println(Arrays.deepToString(ArrayGenerator(4, 4)));

	}

}
