package day24_multithreadsyncencapsulation;

public class AccessModifier01 {
	/*
	1)By using obj1, you cannot access to "profession" because "profession" is 
		 	  using private access modifier and you are in a different class.
		 	2)By using obj1, you cannot access to "school" because "school" is using
		 	  "default" access modifier and you cannot access "default" class members from any other "packages"
		 	3)By using obj1, you cannot access to "address" because "address" is using
		 	  "protected" access modifier and you cannot access "protected" class members 
		 	  from any other "packages" if they are not "child class"
		 	4)By using obj1, you can access to "name" because it is public.
	 */	
	public String name = "Ali Can";
	protected String address = "Miami Florida";
	
	
	String school = "FIU";
	/*
	 	If you want a class member not to be visible from any other class, use "private" access modifier
	*/
	private String profession = "Java Developer";

}
	


