package day03increment_decrement_operation;

public class Decrement01 {

	public static void main(String[] args) {
	
		int num =100;
		// 1. way how to decrease the value by subsraction
		 num=num-5;
		 System.out.println("first decrement " +num);
		  
		 // 2. way
		 
		 num-=5;
		 
		 System.out.println("second decrement" + num);
		 
		 // 3 way
		 
		 num--; // decreamnet only by 1...
		 System.out.println("third secrement"+ num);
		 
		 // How to decrease the value of variable by division
		 
		 // 1. way
		 int salary = 5000;
		 
		 salary = salary/5;// 1000
		 
		 //2. way
		 
		 salary/=5;// 200
		 
		 // Note:  the value in java is decreasing from top to bottom.
		 
		//Q: Decrease Ali's salary 20% then increase it by 100 dollars.		
//		 Increase Veli's salary 100 dollars then decrease it by 20%.		
//		 Then compare their salaries?
		 
		 int aliSalary = 600;
		 
		 int veliSalary = 500;
		 
		 aliSalary = (int) (aliSalary*0.8);
		 
		 aliSalary += 100;
		 
		 System.out.println("Final Alis's salary is "+ aliSalary);
		 
		 
		 veliSalary+=100;
		 veliSalary = (int)(veliSalary*0.8);
		 
		 System.out.println("Final Veli's salary  is " + veliSalary);
		 
		 
		 
		 
		 
		 
	}

}
