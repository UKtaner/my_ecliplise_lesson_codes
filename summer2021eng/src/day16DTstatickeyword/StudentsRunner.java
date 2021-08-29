package day16DTstatickeyword;

import java.util.Scanner;

public class StudentsRunner {

	public static void main(String[] args) {
	
		Scanner scan= new Scanner (System.in);
		
		do {
		System.out.println("Please enter your first name:");
		String firstName=scan.next();
		
		System.out.println("Please enter your last name:");
		String lastName=scan.next();
		
		String name=firstName+" "+lastName;
		
		System.out.println("Please enter your grade:");
		int grade=scan.nextInt();
		
		System.out.println("Please enter your year:");
		int year=scan.nextInt();
		
		
		Students student1=new Students(name,grade,year);	
		//student1.setId();
// we commented out this method to call it from contructor, it will make our code more clear.

		System.out.println("Student1 ID   :"+student1.id);
		System.out.println("Student1 NAME :"+student1.name);
		System.out.println("Student1 GRADE:"+student1.grade);
		System.out.println("Student1 YEAR :"+student1.year);
		
		/*
		Students student2=new Students("name",grade,year);	
		//student2.setId();
		System.out.println("Student2: ID "+student2.id);
		*/
		
		System.out.println("To quit press Q, to CONTINUE press any key...");
		String quit=scan.next().toUpperCase();
		if(quit.equals("Q")) {
			break;
		}
		
		}while(true);
		System.out.println("Thanks for choosing us... See you later...");
		
		}

	}


