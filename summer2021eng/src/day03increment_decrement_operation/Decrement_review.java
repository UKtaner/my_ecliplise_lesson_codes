package day03increment_decrement_operation;

public class Decrement_review {

	public static void main(String[] args) {
		 
		 // Note:  the value in java is decreasing from top to bottom.
		 
		//Q: Decrease Ali's salary 20% then increase it by 100 dollars.		
//		 Increase Veli's salary 100 dollars then decrease it by 20%.		
//		 Then compare their salaries?
		 //1. way
		 int aliSalary = 600;
		
//		 aliSalary =aliSalary-(aliSalary*20/100);
//		 System.out.println(aliSalary +100);
		 //2. way
		 int b=600;
		 b=(b-(b*20/100)+ 100);
		 System.out.println(b);
	//////////////////////////////////////////////////	 
		 int veli=500;
		 
//		 veli +=100;
//		 veli=veli -(veli*20/100);
//		 
//		 System.out.println(veli);
		 
		 ///////////////////////////////////////////////
		 //3 way
		 aliSalary=aliSalary*80/100;
		 aliSalary+=100;
		 System.out.println(aliSalary);
		 // 4.way
		 veli+=100;
		 veli=veli*80/100;
		 System.out.println(veli);
	}

}
