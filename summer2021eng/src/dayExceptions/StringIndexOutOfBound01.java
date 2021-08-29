package dayExceptions;

public class StringIndexOutOfBound01 {

	public static void main(String[] args) {
		
		try {
		String s="Ali Can went to school"; 
		
		System.out.println(s.length());//length is 22
	
		char c=s.charAt(23);
		
		System.out.println(c);
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException");	
			
		}
	}

}
