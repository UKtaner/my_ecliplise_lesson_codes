package day26inheritanceoverriding;

public class TestChild extends TestParent {

	
 // protected void getDetails() {// it is protected child should have same or wider modifier
	public void getDetails() {	
	System.out.println("CHILD");
	}

}
