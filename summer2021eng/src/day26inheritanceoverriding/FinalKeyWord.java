 package day26inheritanceoverriding;

public class FinalKeyWord {
/*
 "final" keyword can be used for;
 a- Variables: means you have to initialise the variable
 				means you cannot update the value after initialising
 b- Methods:	means you can not change the body of the method
 c- Class: 		final classes can not have child class, means you can not "extends" to final classes 
 				Note: final class can be child class but can not be parent class
 				i- all wrapper classes are final classes.
 				ii- all immutable classes are final class.
 				iii- String class is a final class.String class has not any child class.
 				
 				
 */
	public final String name="Ali Can";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalKeyWord obj=new FinalKeyWord();
	
		//obj.name="Veli Han";//name will give error.
		//Bcoz already initialised above, can not update again.it is final
		//
		
		
	}

}
