package dayExceptions;

public class ArithmeticException01 {

	public static void main(String[] args) {
		
		try {
            int a = 30, b = 0;
            int c = a/b;  // cannot divide by zero
            System.out.println ("Result = " + c);
        }
        catch(ArithmeticException e) {
            System.out.println ("A number can't divide  by 0");
        }
    }
}