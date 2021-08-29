package practiceDay03;

import java.util.Scanner;

public class DigitCounter {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter a number to get the digit of it....");
		
		int counter = 0;
		int num=scan.nextInt();
		
		while(num != 0) {
			num = num/10;
			counter++;
		}
		System.out.println(counter);		




	  }
/*
 * 
 *2. way	
    int count = 0, num = 123456;

    for (; num != 0; num /= 10, ++count) {
    }

    System.out.println("Number of digits: " + count);*/
  }


	