package interviewquestions01;

public class Q4IsPrime01 {

	public static void main(String[] args) {
		int num=101;
		
		boolean isPrime=true;
		
		for(int i=2; i<num/2;i++) {
			if(num%i==0) {
				
				isPrime =false;
				break;
			}
			}
		if(isPrime) {
			System.out.println("Prime");
		}else {
			System.out.println("Not prime");
		}
		}
	}

	


