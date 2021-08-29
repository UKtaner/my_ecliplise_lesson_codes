package day25EncupsulationInterviewQuestions;

public class Encapsulation01 {

	public static void main(String[] args) {
		/*
		 1-What is Encapsulation?
		 --Hiding the implementation while still having an access to read and update the data
		 --to make code block more safe, more usability, flexisibilty
		 
		 
		 2- How do you hide the Data?
		 --By using Private Access Modifiers 
		 
		 3- How do you access hidden data from other classes?
		 -- Use getter to READ
		 -- Use setter to UPDATE
		 
		 4- What is immutable class?
		 --NO SETTERS
		 --Use just getter 
		 
		  /*
     * 1- what is encapsulation?
     * reduce complexity, increase reusability
     * Encapsulation is a process used to protect and hide data.
     * preventing other classes from accessing directly the instance vriable
     * Data Hiding Process is called "Encapsulation"
     * we group related variables and functions that operate on them into objects
     *accessing results while hiding data
     * for ex while riding a bike you know that if you raise the accelerator, you increase the speed but you do not know how does it work
     Getters method is used to read the encapsulated data while setters method is used to update the data
     */
    
    
    /*
     * how do you hide data?
     * using "private" access modifier
     */
    
    /*
     * how do you access hidden data from other classes?
     * create getter and setter
     * to read data---> getter
     * to update data---> setter
     */
    
    /*
     * what is immutable class?
     * the class we can not update
     * we use just getter method
     * no need to create setter
     * our variables should be private but not the class
     */
    
    /*
     * what should be the return types for getter and setter?
     * for setter---> void
     * for getter---> int, String, double,...all but void
     */
    
    /*
     * what are the features of encapsulation?/
     * reusability
     * flexibility
     * maintenance
     * reduction of complexity
     * combine the data of our application and its manipulation at one place
     * 
     */
}		 
		 

	}

	