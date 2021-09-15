package practiceDay07;

import java.util.Arrays;

public class IsAnagram {
/*
      7. Write a method that checks to see if the words u pass is Anagram.
       EX: read and dear  --> true
 */
	 //7. Write a method that checks to see if the words u pass is Anagram. EX: read and dear  --> true
    static boolean isAnagram(String str1, String str2){
        //toCharArray
        //split()
        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    public static boolean isAnagram2(String str1,String str2) {
		char[]a=str1.toCharArray();
		char []b=str2.toCharArray();
		boolean result=true;
		for(char c:a) {
			if(Arrays.binarySearch(b, c)<0) {
				result =false;
			}
		}return result;
	}
	
	public static void main(String[] args) {
	System.out.println(isAnagram("Mother In Law","Hitler Woman"));
	System.out.println(isAnagram2("Mother In Law","Hitler Woman"));
	}

}
