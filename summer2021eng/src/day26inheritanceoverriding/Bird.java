package day26inheritanceoverriding;
/*
 super()
 1. is used to call a specific constructor from parent class
 2. Typing neither "super()" nor "super()" have same meaning
 3. super() must be used in the first line inside the constructor
 4. super() can be just used once inside the constructor.
 5. super() can call constructors just from "parent class" not from grand parent classes
 
 */
public class Bird extends Mammal {
	
		String name="Bird";
		int height=11;
		byte ageOfBird=1;
		public Bird() {
			super(3);
			
			// super works for parents classes
			
			System.out.println(super.ageOfAnimal);
			System.out.println(super.ageOfMammal);
			System.out.println(super.height);
			System.out.println(super.name);
			
			super.move();//Mammals move
			
			System.out.println("Child contructor ran...");
			
		}
		public void move() {
			System.out.println("Birds move...");
		}
		public void fly() {
			System.out.println("Birds fly...");
		}	
}


