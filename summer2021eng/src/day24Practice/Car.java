package day24Practice;

public class Car {

	private String name="Renault";
	private double engine=2.1;
	private String colour="Black";
	private int year=2000;
	private boolean isBoolean=false;
	

	public Car(String name, double engine, String colour, int year) {
		
		this.name = name;
		this.engine = engine;
		this.colour = colour;
		this.year = year;
	}

	public Car() {
		
	}

	public String getName() {// only to read name , we can use getter
		return name;
	}

	public String getColour() {
		return colour;
	}

	public boolean isBoolean() {
		return isBoolean;
	}

	public void setColour(String colour) {// only to update colour, use setter
		this.colour = colour;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setBoolean(boolean isBoolean) {
		this.isBoolean = isBoolean;
	}


}
