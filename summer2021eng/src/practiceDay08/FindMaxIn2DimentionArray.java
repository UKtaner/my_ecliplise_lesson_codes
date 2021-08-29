package practiceDay08;

import java.util.Arrays;
import java.util.Random;

public class FindMaxIn2DimentionArray {
	   //4.Given a 2d array of ints, find the biggest number(int) in the array and print it.

    /**
     * @param arr is the 2 dim array.
     * @return the max number in the array that is passed in.
     */
	
	static int[][] ArrayGenerator(int outerSize, int innerSize){
		int[][] arr = new int[outerSize][innerSize];
		for (int i = 0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j] = new Random().nextInt(150);
			}
		}
		
		return arr;
	}
    static int findMax(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] eachArr : arr){
            for(int num : eachArr){
                if(num > max)
                    max = num;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        return max;
    }
	static int findTheBiggest(int a[][]) {
		int max = Integer.MIN_VALUE;
		for(int[] w:a) {
			for(int z:w) {
				if(z>max) max=z;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		System.out.println(findMax(ArrayGenerator(4,5)));
		//System.out.println(findTheBiggest(3,4));
	}

}
