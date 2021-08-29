package day16NTstaticblock;


import java.util.Scanner;

public class StudentsRunner {

	public static void main(String[] args) {
	
		do {
	// once you have a problem with nextLine after next or nextInt ect, paste Scanner.nextLine()again;		
	// or use only next()
			
	Scanner scan=new Scanner (System.in);
	System.out.println("Enter your firstname");
	String first = scan.next();
	System.out.println("Enter your lastname");
	String last = scan.next();
	String name = first + " " + last;
	System.out.println("Enter your grade");
	int grade = scan.nextInt();
	System.out.println("Enter your registration year");
	int year = scan.nextInt();
	
	Students std1 = new Students(name, grade, year);
	System.out.println("Student Name: " + std1.name);
	System.out.println("Student Grade: " + std1.grade);
	System.out.println("Student Registration Year: " + std1.registrationYear);
	System.out.println("Student id: " + Students.id);// id should be called by class since it is a static variable
	
	System.out.println("To quite press Q, to continue press any button");
	String quite= scan.next().toUpperCase();
	if(quite.equals("Q")) {
		break;
	}
		}while(true);// if you make it true, will create infinite loop
					// the reason is because the user will break the loop	
		System.out.println("See you later...");
		
	}

}
