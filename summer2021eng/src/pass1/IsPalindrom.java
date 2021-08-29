package pass1;

public class IsPalindrom {
///////////////////////////way 1/////////////////////////////////////////////////////
	static void isPalindrom(String str) {
		String reversed="";
		for(int i=0;i<str.length();i++) {
			
			reversed+=str.charAt(str.length()-1-i);
		}
			if(reversed.equals(str)) {
				System.out.println(str+" is palindrom");
			}else {
				System.out.println(str+" is not Palindrom");
			}
/////////////////////////way 2///////////////////////////////////////////////////////		
	}
	static boolean isPalindrom2(String str) {
		boolean result = false;
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		if (str.equals(reverse)) {
			result = true;
		}
		return result;
	}
////////////////////////////way 3////////////////////////////////////////////////////	
	 public static boolean isPalindrom3(String str) {
			String rts="";
			for(int i=str.length()-1;i>=0;i--) {
				rts+=str.charAt(i);
			}
			return rts.equals(str);
		}
	public static void main(String[] args) {
		isPalindrom("racecar");
		System.out.println(isPalindrom2("racecar"));
		System.out.println(isPalindrom3("racecar"));
	}

}
