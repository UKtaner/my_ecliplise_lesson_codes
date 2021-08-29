package day03increment_decrement_operation;

import java.util.Scanner;

public class Modulus_Review {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter 4 digits");
		
		int num= scan.nextInt();
		
		int nd1;
		int nd2;
		int nd3;
		int nd4;
		int nd5;
		
		// 12345
		nd5 = num/10000;
		System.out.println(nd5);
		
		nd4 = num/1000;
		nd4 = nd4%10;
		System.out.println(nd4);
		
		nd3 = num/100;
		nd3=nd3%10;
		System.out.println(nd3);
		
		nd2 = num/10;
		nd2 = nd2%10;
		System.out.println(nd2);
		
		nd1 = num%10;
		System.out.println(nd1);
		
		//System.out.println(nd1+nd2+nd3+nd4);
		

	}

}
