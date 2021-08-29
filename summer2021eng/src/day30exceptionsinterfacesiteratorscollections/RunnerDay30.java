package day30exceptionsinterfacesiteratorscollections;

public class RunnerDay30 {

	public static void main(String[] args) {
		System.out.println(I01.x);
// we accessed the x value from different class without creating obj.
// Bcoz in interface all variables are automatically static. 
		System.out.println(I01.s);
		
		I01.subtract(12, 2);
		
		HondaCivic hc1=new HondaCivic();// hondaciciv is a class, able to create obj
		//Engine e= new Engine();// Engine complians bcoz it is a interface, we can not create obj from
		
		hc1.accelerate();
		hc1.climate();
		
		
		//There is a difference in usage, static methods in a classs and static methods in an interface?
		//To call a static method from an interface use "interface name"
		Music.volume();
		
		
		System.out.println(hc1.name);
		System.out.println(hc1.system);
		
		//If you parent interfaces have variables with same name and 
		//you use object to call them, Java confuses and gives CTE
		//System.out.println(hc1.price);
		
		//In interfaces, to call variables using interface names are the best option
		System.out.println(Engine.price);
		
		//Having abstract methods with the same name in parent interfaces is not problem.
		//But if the methods whose names are same have different return types gives Compile Time Error
		//If you need to use different return type make the method names different
		
		
		hc1.eat();
	}

}