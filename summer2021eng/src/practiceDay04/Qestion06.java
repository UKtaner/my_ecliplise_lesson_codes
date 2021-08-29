package practiceDay04;

import java.util.Scanner;

public class Qestion06 {

	public Qestion06() {

	}

	public static void main(String[] args) {
/*
 ask user to enter a integer number
             * find the sum of digit number
             * example 345=12
 */

Scanner scan=new Scanner (System.in);

System.out.println("Enter digit");
	int num=scan.nextInt();

	int f=num/100;
	int s=num/10%10;
	int l=num%10;
	//System.out.println(f+l+s);
	
	int fivnum=num/10000;
	int frtnum=num/1000%10;
	int thrnum=num/100%10;
	int secnum=num/10%10;
	int firtnum=num%10;
	
	System.out.println(fivnum+frtnum+thrnum+secnum+firtnum);
	
	
	
	}
/*
 Scanner scan = new Scanner(System.in);
		System.out.println("Enter a multi-digit integer");
		int sd= scan.nextInt();
		
		int sum=0;
		while(sd>0) {
			sum=sum+sd%10;
			sd=sd/10;
			
		}
		System.out.println(sum);
		scan.close();
 */
	
/*
 Scanner scan = new Scanner(System.in);
        System.out.println("enter a number to sum the digits...");
        int num = scan.nextInt();
        int sum = 0;
        do {
            sum= sum + num%10;
            num=num/10;
            
        } while (num!=0); 
        
        System.out.println("sum of digits "+sum);	
 */
	
	}


