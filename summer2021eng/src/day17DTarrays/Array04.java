package day17DTarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {

  /*
        1)Create a String array by getting the length and the elements from user
        2)Type program to find how many characters are used in array elements
    */
	
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of array");
        int len = scanner.nextInt();
        String arr[]=new String[len];
        System.out.println("Enter string array elements..");
        for(int i =0; i <arr.length;i++){
            arr[i]=scanner.next();
        }
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for(int i=0; i< arr.length;i++){
            sum = sum+ arr[i].length();
        }
        System.out.println(sum);
    }
}