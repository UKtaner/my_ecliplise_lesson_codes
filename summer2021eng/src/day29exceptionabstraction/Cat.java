package day29exceptionabstraction;
// if a method is abstract in parent class, all methods in child class must be "override"  
public class Cat extends Animal {

	@Override
	void eat() {
		System.out.println("Cats like cheese");// Specific implementation
	// we override in order to write specific implementation.	
	// Why is it a must to be overridden? 
	// if it is a must smth to be used in every child class, than make  	
	// if child classes must use a method from parent class, so that it must be overriding in child class.
	
	}

	
	
}
