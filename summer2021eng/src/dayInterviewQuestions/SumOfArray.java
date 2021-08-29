package dayInterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);

		System.out.println("Enter array lenght");
		
		int len=scan.nextInt();
		int arr[]=new int[len];
		
		System.out.println("Enter elemnents");
		
		for(int i=0;i<len;i++) {
		arr[i]=scan.nextInt();
		}System.out.println(Arrays.toString(arr));
		int sum=0;
		for(int i=0;i<len;i++) {
			sum+=arr[i];
		}
		System.out.println("sum is "+sum);
	
	}
}
