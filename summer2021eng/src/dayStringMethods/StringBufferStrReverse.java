package dayStringMethods;

import java.util.Scanner;

public class StringBufferStrReverse {

	public static void reverse(String str) {
		StringBuffer str1=new StringBuffer(str);
		System.out.println(str1.reverse());
	}

	public static void main(String[] args) {
		
		 Scanner scan=new Scanner(System.in);
			System.out.println("Enter a word");
			String str=scan.nextLine();
		
			reverse(str);

	}

}
