package pass1;

public class ReverseNumber {
		
	static void reversenum(String num) {
		String reverseStr="";
		
		for(int i=0; i<num.length();i++) {
			reverseStr+=num.charAt(num.length()-1-i);
		}
		System.out.println(reverseStr);
		
	}
	
	public static void main(String[] args) {
		reversenum("12345");

	}

}
