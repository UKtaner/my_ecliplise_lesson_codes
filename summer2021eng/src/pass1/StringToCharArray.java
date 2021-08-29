package pass1;

import java.util.Arrays;

public class StringToCharArray {
// string toCharArray() method converts the string into character array.
	public static void main(String[] args) {
		String s1="hello";  
		
		char[] ch=s1.toCharArray(); 
		
		for(int i=0;i<ch.length;i++){ 
			
		System.out.print(ch[i]); // hello
		}  
		
		System.out.println();
        String s11 = "Welcome to Java";  
        char[] chh = s11.toCharArray();  
        int len = chh.length;  
        System.out.println("Char Array length: " + len);  
        System.out.println("Char Array elements: ");  
        for (int i = 0; i < len; i++) {  
            
         
        }  
  
        System.out.print(Arrays.toString(chh));  
	}  
}  