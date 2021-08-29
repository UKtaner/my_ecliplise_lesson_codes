package dayInterviewQuestions;

public class IsPalindrom2 {
	static boolean isPalindrome(String str)
    {
        int bChar = 0, eChar = str.length() - 1;
        while (bChar < eChar) {
        	
            if (str.charAt(bChar) != str.charAt(eChar))
                return false;

            bChar++;
            eChar--;
        }
 
        return true;
    }
	public static void main(String[] args) {
		System.out.println(isPalindrome("racecar"));

	}

}
