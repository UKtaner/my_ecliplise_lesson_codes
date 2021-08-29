package practiceDay05;

import java.util.Scanner;

public class StrToIntConvert {

	public static void main(String[] args) {


                Scanner sc = new Scanner(System.in);
        System.out.println("Input two integers:");
        String s1 = new String();
		String s2 = new String();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        
        int num1 = Integer.parseInt(s1);
       
        int num2 = Integer.parseInt(s2);
        
        int sum=num1+num2;

        System.out.println("Sum of the numbers: "+ sum);
     
          }    
	 
}

			


