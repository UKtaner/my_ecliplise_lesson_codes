package day24Practice;

public class Student {
	
	private String name="Mark";
	private int age=23;
	private boolean isSuccessful=false;
// private can work in same class
	public Student() {
		
	}
	public Student(String name, int age, boolean isSuccessful) {
	
		this.name = name;
		this.age = age;
		this.isSuccessful = isSuccessful;
	}
	public static void main(String[] args) {
		
		Student std1=new Student();//==> without parameter sdt1 obj
		
		Student std2=new Student("Taner Cakin", 12, false);//==>
		
		System.out.println(std1);//day24Practice.Student@182decdb
		
		System.out.println(std2);//day24Practice.Student@7637f22
		
	
	}
	@Override
	public String toString() {//BY USING toString METHOD it prints object details as desired format
		return "Student name=" + name + ", Age=" + age + ", isSuccessful=" + isSuccessful;
	}

} 
