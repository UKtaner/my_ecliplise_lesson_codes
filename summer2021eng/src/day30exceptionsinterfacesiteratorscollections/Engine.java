package day30exceptionsinterfacesiteratorscollections;

public interface Engine {

	int price=8000;
	String name="ECO";
	
	void gasUsage();// abstract method
	
	void speedLimit();// abstract method
	
	
	void eat();// abstract method
	
	
	default void accelerate() {// concrete method
		System.out.println("Accelerate quickly");
	}
	
	
	
}
