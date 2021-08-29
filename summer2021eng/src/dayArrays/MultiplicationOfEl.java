package dayArrays;

import java.util.Scanner;

public class MultiplicationOfEl {

	public static void main(String[] args) {
/*
1)Create a String array together with user.
2)Find the multiplication of the lengths of the elements.
*///[1,2,3,4,5]
		Scanner scan= new Scanner (System.in);		
		
		System.out.println("Enter the length of the array");
		
		int length=scan.nextInt();
		int s[] = new int[length];
		
		int counter=1;
		for(int i=0; i<length; i++) {		
			s[i] = scan.nextInt();
			
			counter= counter*s[i];
			
		
	}
		System.out.println(counter);
}
}