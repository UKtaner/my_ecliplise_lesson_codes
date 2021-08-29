package day26inheritanceoverriding;

public class Runner {
/*    
        If you use variables whose names are different in inheritance, to understand which variables will be able to see
        by using objects, remember the following rules;
        1)Look at the data type which you used in object creation, you will be able to see all variables whose names 
          are different in the class which you used as data type and in all parents.
        2)It is not possible to see variables whose names are different from the child classes of 
          the class which you used as data type. 
 */
	public static void main(String[] args) {
		//Bird b1=new Bird();
		// Bird is data type
		//Mammal b1=new Bird();// also possible
		// Mammal is data type
		
		//data type(Mammal) - obj name(b1) = new key word(new)- contructor(Bird());
		
		// If you use this. then you will be able to see all variables whose names are diffrenet from the class
		// it self and from all parent classes
		// If you want to see variables whose names are same from parent classes do not use this. because 
		// you cannot see same named variables by using this.	
		//Mammal b1=new Mammal(3);// Mammal and Animal contructor will run
		Mammal b1=new Bird();// Mammal animal and bird contructor will run
	}

}
