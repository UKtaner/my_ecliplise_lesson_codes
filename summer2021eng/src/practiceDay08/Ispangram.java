package practiceDay08;

public class Ispangram {
/*
 //Write a function to check whether a string is pangram or not assuming that the string passed in does not have any punctuation.
  *  Pangrams are words or sentences containing every letter of the alphabet at least once.
  *  EX: The quick brown fox jumps over the lazy dog --> true
 */
public static boolean isPangram(String str) {
		
		for(char i = 'a'; i<='z'; i++) {
			if (!str.contains(""+i)) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
