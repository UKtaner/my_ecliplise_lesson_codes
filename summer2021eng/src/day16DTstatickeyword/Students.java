package day16DTstatickeyword;

public class Students {

	public Students(String name, int grade, int year) {
		super();
		this.name = name;
		this.grade = grade;
		this.year = year;
		setId();
	}

	String name;
	static String id;
	int grade;
	int year;
	static int counter=1000;
	
	public void setId() {
		counter++;
		id=""+year+grade+counter;
		
		
	}
	
	
}
