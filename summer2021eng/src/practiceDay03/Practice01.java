package practiceDay03;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		/*
		 * Write a program and calculate grade of three exams with the given values
		 * A==>90-100 B==>80-89 C==>70-79 D==>60-69 F==>0-59 
		 * EXAMPLE: INPUT : Math=70
		 * Science=60 Chemistry=89 
		 * A==> 90-100 B==>80-89 C==>70-79 D==>60-69 F==>0-59
		 * OUTPUT : Math Grade = C Science Grade = D Chemistry Grade = B
		 */	

		
			Scanner scan=new Scanner(System.in);
			System.out.println("What is your Math grade");
	        int mathGrade=scan.nextInt();
	        System.out.println(mathGrade>=90 && mathGrade<=100 ?"MathGrade = A":mathGrade>=80 && mathGrade<=89 ? "MathGrade = B":
	        	mathGrade>=70 && mathGrade<=79 ? "MathGrade = C ":mathGrade>=60 && mathGrade<=69 ?"MathGrade = D":
	        	mathGrade>=0 && mathGrade<=59 ? "MathGrade = F":"Wrong Grade");
	        /* 1. WAY.....................
    		System.out.println(mG>=90?"Math Grade = A":mG>=80?"Math Grade = B":mG>=70?"Math Grade = C":mG>=60?"Math Grade = D":
			mG>=50?"Math Grade = F":"Wrong Grade");  
	        
	  		2. WAY.................     
	       Scanner scan=new Scanner(System.in);
			System.out.println("What is your Math grade");
	       int mG=scan.nextInt();
	       if (mG>=90) {
	    	   System.out.println("Math Grade : A");
	       }else if (mG>=80) {
	    	   System.out.println("Math Grade : B");   	   
	       }else if (mG>=70 ) {
	    	   System.out.println("Math Grade : C");      
	       }else if (mG>=60 ) {
	 	   System.out.println("Math Grade : D");	   
	       }else {
	 	   System.out.println("Math Grade : F");
	 	   
	 	   3. WAY SWITCH  CASE ?
	 	   */   
	        
	        
	        System.out.println("What is your Science grade");
	        int scienceGrade=scan.nextInt();
	        System.out.println(scienceGrade>=90 && scienceGrade<=100 ?"ScienceGrade = A":scienceGrade>=80 && scienceGrade<=89 ? "ScienceGrade = B":
	        	scienceGrade>=70 && scienceGrade<=79 ? "ScienceGrade = C ":scienceGrade>=60 && scienceGrade<=69 ?"ScienceGrade = D":
	        	scienceGrade>=0 && scienceGrade<=59 ? "ScienceGrade = F":"Wrong Grade");
	        
	        
	        System.out.println("What is your Chemistry grade");
	        int chemistryGrade=scan.nextInt();
	        System.out.println(chemistryGrade>=90 && chemistryGrade<=100 ?"ChemistryGrade = A":chemistryGrade>=80 && chemistryGrade<=89 ? "ChemistryGrade = B":
	        	chemistryGrade>=70 && chemistryGrade<=79 ? "ChemistryGrade = C ":chemistryGrade>=60 && chemistryGrade<=69 ?"ChemistryGrade = D":
	        	chemistryGrade>=0 && chemistryGrade<=59 ? "ChemistryGrade = F":"Wrong Grade");
	
	        
		}
	}
		
		
		
		
	


