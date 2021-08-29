package day29exceptionabstraction;

public class Dog extends Animal {
	
	@Override
	void eat() {
	System.out.println("Dogs eat meat");// Specific	implementation
	
	}
	public void drink() {// concrete/normal method
		System.out.println("They drink...");
		

}
	
}