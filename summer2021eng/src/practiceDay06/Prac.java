package practiceDay06;

public class Prac {

	//number==> 123
	//remainder
	//reverse
	//updated number
	
	static int reverseNum(int num) {
		int reverse=0;
		while(num!=0) {
		
		int lastdigit=num%10;
		
		reverse= reverse*10+lastdigit;
		
		num/=10;	
	}
		
		return reverse;
	}
	
	public static void main(String[] args) {
	
		System.out.println(reverseNum(123456));
			
	}		
}
