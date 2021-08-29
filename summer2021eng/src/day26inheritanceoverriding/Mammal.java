package day26inheritanceoverriding;

public class Mammal extends Animal {
// java does not support multiple inheritance(no multiple extends)

	String name="Mammal";
	int height=22;
	byte ageOfMammal=2;
	
	public Mammal (int height) {
	System.out.println(height+" cm.");	
	}
	public void move() {
		System.out.println("Mammal move...");
	}

	public void eat() {
		System.out.println("Mammal eat...");
		
	}
	public void feed() {
		System.out.println("Mammal feed babies with milk...");
	}

	
}
