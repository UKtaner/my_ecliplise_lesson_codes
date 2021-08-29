package day26inheritanceoverriding;
/*
1)When you override a method, you can use same 
 access modifiers
2)When you override a method,
 Access modifier in child class cannot have 
 narrower access modifier
3)private methods cannot be overridden, because overriding means
 you want to use the method in another class but private class members
 cannot be used in other classes
 
 final method cannot be overriden,becoz final mothod's body cannot be 
 updated but in overriding, we update the method body.

Static methods cannot be overridden, because static methods are 
common methods for all child classes. If any child updates it, 
the other classes will be affected, it can create problems
because of that Java does not let overriding for static methods.
 	 
4)@Override annotation checks the overriding rules, if there is any
 missed or used wrongly overriding rule, it will give CTE.
5) in overrinding, return type of "overidden" and "overiding" methods can be same
7)In overriding, if the return type is “primitive”
 	 return types of “overridden” and “overriding” methods must be same

8)In overriding, if the return type is “void”
 	 return types of “overridden” and “overriding” methods must be “void”
 	 Note: If there is “IS-A” relationship between return types, 
 	 return types are called “Covariant Return Types”
 ==>overridden for parent -overriding  for child
*/

public class Honda extends Car {
// child class should be wider....
//public > default > protected > private
	
	@Override
	public void move() {
		System.out.println("Honda moves fast..");
		
	}

}
