package interviewquestions01;

public class Q1NumberReverse02 {

	public static void main(String[] args) {
		
		System.out.println(reversed(123456789));
		System.out.println(reversed02(123456789));
	}

	public static int reversed(int num) {
	
		int reversed=0;

	
	while(num!=0) {
		reversed=num%10+reversed*10;
		num/=10;			
	}
	return reversed;
}

	public static String reversed02(int num) {
		String updatedNum="";
		int i=1;
		while(num!=0) {
			int lastdigit=num%10;
			 updatedNum=lastdigit+"";
			 num/=10;
			 i++;
		}	
		return updatedNum;	
}
}
