package day28exceptions;

public class E05 {

	public static void main(String[] args) {
		//ArrayIndexOutOfBoundsException	
//		String s[] = {"A", "D", "B", "C"};		
//		System.out.println(s[2]);//B		
//		try {			
//			System.out.println(s[4]);//ArrayIndexOutOfBoundsException			
//		}catch(ArrayIndexOutOfBoundsException e) {			
//			System.out.println("Do not use non-existing index " + e.getMessage());			
//		}
		
		//ClassCastException
//		Object obj = 70;		
//		String num = (String)obj;
		
		//NumberFormatException
		String s1 = "123";
		int num1 = Integer.parseInt(s1);
		System.out.println(num1 + 5);//128
		
		String s2 = "1a2b3c";
		try {
			int num2 = Integer.parseInt(s2);//NumberFormatException
			System.out.println(num2 + 5);
		}catch(NumberFormatException e) {
			System.out.println("You used non-digit characters in the String");
		}
	}}