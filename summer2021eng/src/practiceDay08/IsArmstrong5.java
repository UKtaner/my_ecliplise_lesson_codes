package practiceDay08;

import java.util.ArrayList;
import java.util.List;

public class IsArmstrong5 {
	static List<Integer> findTheArmstrongNumbers(int a){
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<=a; i++) {
			if(isArmstrong(i)) {
				list.add(i);
			}	
		}
		return list;
	}
	
	static boolean isArmstrong(int a) {
		int sum=0;
		int num=a;
		do {
			sum = sum + (int)Math.pow(a%10, 3);	
			a=a/10;	
		}while(a!=0);		
		return sum==num; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
