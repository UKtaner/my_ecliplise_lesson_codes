package day26inheritanceoverriding;

public class Animal {
 String name="Animal";
 int height=33;;
 byte ageOfAnimal=3;
	public Animal() {
		System.out.println("Parent constructor ran");
		
		
	}
	public Animal(String str) {
		System.out.println("Parent constructor with parameters ran");
}
	public void move() {
		System.out.println("Animals move..");
	}

	public void eat() {
		System.out.println("Animals eat...");
		
	}
}
