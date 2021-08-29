package day16NTstaticblock;

public class Students {
	// variable as below in class
	String name;// obj veriable
	static String id;// class variable
	int grade;//obj
	int registrationYear;//obj
	static int counter = 1000;//class v
	// by adding static, the obj becomes class variable. 
	
	public void setId() {//==> created setId method to create a unique id for every student
		counter++;		//==> for every new student counter will increase by 1 
		id =""+registrationYear+grade+counter;
	}

	public Students(String name, int grade, int registrationYear) {//==> constructor gets only object variable
// to create a student by a constructor using given variable in class 
		this.name = name;
		this.grade = grade;
		this.registrationYear = registrationYear;
		setId();
	}
	

	}
	


