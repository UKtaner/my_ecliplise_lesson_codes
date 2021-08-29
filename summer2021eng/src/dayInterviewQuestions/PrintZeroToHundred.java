package dayInterviewQuestions;

public class PrintZeroToHundred {
//Interview Question: Print from 1 to 100 without using any numbers in your code
	//Print from 0 to 100 without using any numbers in your code
	
	public static void main(String[] args) {
		
		int one='s'/'s';
		
		
		for (int i=one;i<='d';i++) {
			System.out.println(i);
		}
		
			String ending="..........";
			for(int i=one;i<=ending.length()*ending.length();i++) {
				System.out.println(i);
			}
		
			//Print from 0 to 100 without using any numbers in your code		
			int zero='a'-'a';
			
			String t="..........";
			for(int i=zero;i<=t.length()*t.length();i++) {
				
				System.out.println(i);
				
			}
			for(int i=t.length()-t.length();i<=t.length()*t.length();i++) {
				
				System.out.println(i);	
			
		}
		
			for(int i='a'-'a';i<='d';i++) {
				System.out.println(i);
			}
			
			
		
	}
}

