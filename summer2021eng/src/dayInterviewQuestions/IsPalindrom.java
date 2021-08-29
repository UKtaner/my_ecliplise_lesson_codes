package dayInterviewQuestions;

import java.util.Scanner;

public class IsPalindrom {

	static void isPalindrom(String str) {
		String reversedStr="";
		for(int i=str.length()-1; i>=0; i--) {
			reversedStr=reversedStr + str.charAt(i);
		}
		if(str.equalsIgnoreCase(reversedStr)) {
			System.out.println(str +" is palindrome");
		}else {
			System.out.println(str + " is not palindrome");
		}	
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a string");
		String str=scan.nextLine();
		isPalindrom(str);
	}

}
