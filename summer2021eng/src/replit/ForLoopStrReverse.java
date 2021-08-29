package replit;

public class ForLoopStrReverse {

	static void revese(String str) {
		
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(str.length()-1-i));	
		}	
	}
	public static void main(String[] args) {
		
		revese("Taner Cakin");
		
		}
	}
