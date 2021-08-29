package practiceDay06;

public class Extracter {
/*
 Write method that accepts a String and extracts letters and numbers. 
 Method should return a String. 
 EX: a1b2c3 --> Letters are abc and numbers are 123.
 */
	static String extracter(String str){

	    String letters, numbers;
	    letters = numbers = "";

	    for(int i = 0; i < str.length(); i++){
	    	
	        char eachLetter = str.charAt(i);
	        
	        if(Character.isLetter(eachLetter))
	            letters += eachLetter;
	        if(Character.isDigit(eachLetter))
	            numbers += eachLetter;
	    }
	    return "Letters are " + letters + " & Numbers are " + numbers;
	}
/*
 	1. way
 		String letters = "";
		String numbers = "";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'z' ) {
				letters += str.charAt(i);
			} else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				numbers += str.charAt(i);
			}
		}

		return "Letters: " + letters + ", && Numbers  " + numbers;
	}
	
 */
	
/*
 2. way
 
 	public static void extracts(String str){
	    	
	System.out.println("Letters are " + str.replaceAll("\\d", "") + " and number are " + str.replaceAll("\\D", ""));
 
	    }
	public static void main(String[] args) {

      extracts("12jj2131hj23bbd7h47u");

	}

}	
 */
	
	public static void main(String[] args) {
	
		System.out.println(extracter("1sk5p7"));
	}

}
