package interviewquestions01;

public class Q4IsPrime02 {

	public static void main(String[] args) {
		int num=10;
		boolean isPrime=true;
		int i=2;
		while(i<num/2) {
			if(num%i==0) {
				isPrime=false;
				break;
				
			}
		}i++;
		
		if(isPrime) {
	System.out.println("Prime");
	
}else {
	System.out.println("not prime");
}
	}

}
