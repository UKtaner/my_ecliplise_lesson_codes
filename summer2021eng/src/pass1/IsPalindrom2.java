package pass1;

public class IsPalindrom2 {

	static String reversedString(String input) {
		String reversed="";
		
		for(int i=0; i<input.length(); i++) {
			reversed+=input.charAt(input.length()-1-i);
			
		}
		return reversed;		
	}
	public static void main(String[] args) {
		System.out.println(reversedString("12321"));

	}

}
