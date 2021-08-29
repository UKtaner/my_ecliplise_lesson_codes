package dayMethods;

public class SwapNumMethod {
	
public static void swapMethod(int a, int b) {
	
	 int c=b;
	 b=a;
	 a=c;
	
	 
	 System.out.println("Before swap:  a:" + a+"\n b:"+b);


	 System.out.println("after swap:  a:" + a+"\n b:"+b);
}

	

	
	
	

	public static void main(String[] args) {

     int a=4;
    int b=6;

   swapMethod(a,b);
	}

}
