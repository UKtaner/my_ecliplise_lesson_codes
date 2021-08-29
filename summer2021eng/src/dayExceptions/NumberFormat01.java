package dayExceptions;

public class NumberFormat01 {

	public static void main(String[] args) {
		String s="123";
		int n=Integer.parseInt(s); 
		System.out.println(n);//123
		
		try {
		String s1="a123";
		int n1=Integer.parseInt(s1); 
		System.out.println(n1);//NumberFormatException
		
		 } catch(NumberFormatException e) {
	     System.out.println("Number format exception");
			
		}
	}

}
