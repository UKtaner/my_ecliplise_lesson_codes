package day28exceptions;

public class E03 {

	public static void main(String[] args) {
		
		String s1="";
		System.out.println(s1.length());//0
		
		String s2=null;
		try {
			
		
		
		
		System.out.println(12/0);//ArithmeticException is executed
		
		System.out.println(s2.length());//NullPointerException is skipped
		
		}catch(NullPointerException e){
			System.out.println("Do not use length() for null"+ e.getStackTrace());// skipped
		}catch(ArithmeticException e) {
			System.out.println("Do not use divide by zero..."+ e.getMessage());// executed
		}finally{
			System.out.println("Finally part will be executed in every condition...if code has either exception or not, finally block will run all the time...");
		
			
		}
		System.out.println("Will that code be executed?");// executed	
	}

}