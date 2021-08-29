package revise_question;

import java.util.Arrays;
import java.util.Scanner;

public class CreatingArrayByScanner {

	public static void main(String[] args) {
		/*
		1)Create a String array by getting the length and the elements from user
		2)Type program to find how many characters are used in array elements
		*/

		

				Scanner scan= new Scanner (System.in);		
				
				System.out.println("Enter the length of the array");
				
				int length=scan.nextInt();// after creating length, i need to create an array to store elements
				String s[] = new String[length];// created array 

				System.out.println("Enter String array elements...");//user enters multiple elements and this is a loop process
				
				for(int i=0; i<length; i++) {//created a loop		
					s[i] = scan.next();// scanner will get the String data and stores in s[]
				}
				System.out.println(Arrays.toString(s));
				
				int sum = 0;
				for(int i=0; i<length; i++) {
					sum = sum + s[i].length();//s[i] will get the string element, so used with length()
									// s[i] is string, if you remove length(), sum will complain
				}

				System.out.println("The number of characters user entered: " + sum);
			}
		}
