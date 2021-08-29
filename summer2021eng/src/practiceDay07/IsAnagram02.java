package practiceDay07;

import java.util.Arrays;

public class IsAnagram02 {
	/*
    7. Write a method that checks to see if the words u pass is Anagram.
     EX: read and dear  --> true
*/
	public static void main(String[] args) {
	
		System.out.println(isAnagram("elbow","below"));
	}

	static boolean isAnagram(String s1, String s2) {
		char arr1[]=s1.toCharArray();
		char arr2[]=s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
		
	}
}
