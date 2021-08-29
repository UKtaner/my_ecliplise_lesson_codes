package practiceDay08;

public class IsArmstrong4 {
	/*5. Write a method that collects the all positive Armstrong numbers up to the number that is passed in. 
	Armstrong is a number that is equal to the sum of its own digits and 
	each digit being raised to the power of the number of digits. 
	EX: 371 = 3^3 + 7^3 + 1^3 => 371*/
	public static int armstrong(int num) {
	// test it	
			int sum=0;
			int temp=num;
			int count=(""+num).length();
			int remain=0;
			while(num!=0) {
				remain=num%10;
				sum+=Math.pow(remain, count);
				num=num/10;			
			}
			return sum=temp;
			}
	public static void main(String[] args) {
		System.out.println(armstrong(37454));

	}

}
