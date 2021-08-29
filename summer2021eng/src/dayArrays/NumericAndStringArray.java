package dayArrays;

import java.util.Arrays;

public class NumericAndStringArray {

	public static void main(String[] args) {
//Write a Java program to sort a numeric array and a string array.
		
		/*String a[]= new String[6];
		a[0]="T";
		a[1]="A";
		a[2]="N";
		a[3]="E";
		a[4]="R";*/
	
		String a[]= {"T","A","N","E","R"};
		
		
		System.out.println(Arrays.toString(a));
		
		
		/*int n[]=new int[5];
		n[0]=1;
		n[1]=2;
		n[3]=3;
		n[4]=4;*/
		
		int n[]= {1,2,3,4,5,6,7,8};
		n[4]=9;
		
		System.out.println(n[5]);
		
		System.out.println(Arrays.toString(n));

	}

}
