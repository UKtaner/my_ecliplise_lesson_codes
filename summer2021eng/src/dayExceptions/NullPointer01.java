package dayExceptions;

public class NullPointer01 {

	public static void main(String[] args) throws NullPointerException {
		String str=null;
		try {
		 
		System.out.println(str);//null
		System.out.println(str.charAt(0));//NullPointerException
		
	
		}catch(NullPointerException e) {
			System.err.println("NullPointerException..");
		}

	}

}
