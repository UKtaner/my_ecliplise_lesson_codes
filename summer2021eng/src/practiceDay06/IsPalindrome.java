package practiceDay06;

public class IsPalindrome {  //1234321

	public static boolean isPalindrome(String str) {
	
		for(int i=0, j=1; i<str.length();i++, j++) {
			
			if (str.charAt(i)!=str.charAt(str.length()-j)) 

		return false;
		}
	
	return true;
	
		}

	public static void main(String[] args) {
	
		System.out.println(isPalindrome("racecar"));
	}

}
