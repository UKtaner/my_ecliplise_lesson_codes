package day01variables;

public class Variable01 {
		
	/*
	  1) Project ==> Package ==> Class ==> Variables + Methods
	  2) How to create "variables" 
	     a)Type data type
	     b)Type a name for the variable
	     c)"="
	     d)Value
		'0'is default value
	  3) Data Types;
	     a) "int" ==> integer: Whole numbers like 2, 132, -54, 0
	     b) "double" ==> decimals: Range is larger
	     c) "float"  ==> decimals: Range is smaller than double's range
	*/
	
	/*
	 	Note: If you create a variable inside a method, you should "initialize" it.
	 	note: variable name should start with a lowerCase....
	 	      "int price1;" means you created a variable
	 	      "= 100" means you initialized the variable
	    Note: If you want to see "default values" create the variables 
	          outside the methods. 
			*if a method is static, everything must be static.
	          
	    Note: If a method is static, everything you used in the method 
	          must be static
	          
	    Note: If you do not assign any value for a variable, Java uses "default values"
	          for them. Default values for 
	          a)int ==> 0 
	            Note: int's are whole numbers from -2,147,483,648 to 2,147,483,647
	          b)double ==> 0.0
	          c)float ==> 0.0 
	            Note:When you assign a value for a float variable use "f" or "F" at the end
	          d)char ==>null or nothing or '\u0000'
	          e)byte ==> as a default value is 0
	            Note: byte's are whole numbers from -128 to 127(holds/occupies very small range)
	          f)short ==> 
	            Note: short's are whole numbers from -32768 to 32767 (holds/occupies the range grater than byte)
	          g)long ==> 0 
	            Note: long's are whole numbers from -9,223,372,036,854,755,808 to 9,223,372,036,854,755,807 (holds/occupies the range very long)
		  	  h) boolean==>
		  	  
 	    Note: true or false
	    Note: Order the number data types in ascending order
	          byte < short < int < long < float < double
	    NOTE: USE THE MEMORY PROPERLY. CHOOSE THE RIGHT TYPE
	 */
		
				
		static int price2; //created a variable, has default value
		static double minSalary;
		static float hourlySalary;
		static char single;
		static boolean isOld;
	
	public static void main(String[] args) {
		//If you create a variable inside a static method Java makes it static automatically
		//int price2;// java puts default value//not yet initialise a variable
		int price1 = 100;
		double salary = 2.34;
		float weeklySalary = 1.234f;
		char initial = 'S'; // only holds one character
		byte age = 53; 
		short populationOfAVillage = 25000;
		boolean isNew = true;
		boolean isRetired = false;
		String name = "?Ali! 12345";
		
		System.out.println(price1);		
		System.out.println(salary);	
		System.out.println(price1 * salary);
		System.out.println(price2);
		System.out.println(minSalary);
		System.out.println(hourlySalary);
		System.out.println(weeklySalary);
		System.out.println(initial);
		System.out.println(single);
		System.out.println(age);
		System.out.println(populationOfAVillage);
		System.out.println(isOld);
		System.out.println(name);
	}	
}
