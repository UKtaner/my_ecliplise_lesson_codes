package practiceDay07;

public class IsAnagram03 {
//7. Write a method that checks to see if the words u pass is Anagram. 
//EX: read and dear  --> true
	static boolean isAnagram(String s1, String s2) {
		int flag=0;
		for(int i=0;i<s1.length();i++) {
			for (int j = 0; j < s2.length(); j++) {
				if(s1.contains(s2.charAt(j)+"")) {
					flag++;
					break;
					
				}
			}
		}
		
		return flag==0;
		
	}
	
	public static void main(String[] args) {
	

	}

}
