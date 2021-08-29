package practiceDay03;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		/*
	     * A company decided to give bonus of 5% to employee if his/her year of service is more than or equal 5 years.
	     * Ask user for their salary and year of service and print the net bonus amount.
	     * Example: Input= 4 year service
	     *          salary: 4000
	     *          Output= 0
	     */

		 Scanner scan=new Scanner(System.in);
		 System.out.println("What is your current salary");
		 int salary=scan.nextInt();
		 System.out.println("How long have you been working");
		 int workPeriod=scan.nextInt();
		 if(workPeriod>=5) {
			 System.out.println(" your bonus is "+salary*5/100+"$");
		 }else
			 System.out.println("you need to work"+(5-workPeriod)+"more workPeriod to get bonus");

/*
 		System.out.println("Please enter  salary:");
		   
		long num1 = scan.nextLong();	
	
		System.out.println("Please enter period of your service:");
		long num2 = scan.nextLong();
		
		
		long bonus = num1*5/100;
		
		if(num2>=5) {
			System.out.println("You have bonus of "+ bonus+" and total salary is "+ (num1+bonus));
		}else {
			System.out.println("You do not have bonus and total salary is " +num1);
				
 */
	
	
	}

}
