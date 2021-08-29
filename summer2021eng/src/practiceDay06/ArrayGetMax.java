package practiceDay06;

import java.util.Arrays;

public class ArrayGetMax {
	public static int getmax(int []input) {
		int max=0;

		for(int i=0; i<input.length;i++) {
			
			if(input[i]>max) {
				max=input[i];
				
			}
			
		}
		
		return max;	
		
	}
	public static void main(String[] args) {
		
	System.out.println(getmax(new int[]{5, 9, 18, 2, 10, 21, 17}));
		
		
	
	}
	}
