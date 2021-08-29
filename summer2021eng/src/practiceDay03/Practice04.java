package practiceDay03;

import java.util.Scanner;

public class Practice04 {

	public static void main(String[] args) {
		/*
		 * Write a Java program that accepts name,surname, age, weight, height;
		 * Calculates BMI(Body Mass Index) and prints the user’s status like that;
		 * John CARPENTER is 25 years old, his height is 170.5 cm and his weight is 80.24 kg. He is HEALTHY because his BMI=24.7
		 * formula; bmi = weight / (height * height / 10000);
		 * bmi less than or equal 20 is weak,less than or equal 25 is healty,less than or equal 30 is fat, the other option is obese
		 */
// 1. way		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your Fullname");
		String fName=scan.nextLine().indent(1);
		
		System.out.println("Please enter your age");	
		int age=scan.nextInt();
		
		System.out.println("Please enter your weight");
		double weight=scan.nextDouble();
		
		System.out.println("Please enter your height");
		double height=scan.nextDouble();
		
		double bmi = weight / (height * height / 10000);
		
		if (age<=20) {
			System.out.println("Weak");
		
		}else if (age<=25) {
			System.out.println("Healthy");
		}else if (age<=30) {
			System.out.println("fat");
		}else {
			System.out.println("obese");
		}
// 2. way.........	
//String result = age<=20? "Weak":age<=25?"Healthy":age<=30?"fat":"obese";					
		
// 3. way........		
		
	}

}
