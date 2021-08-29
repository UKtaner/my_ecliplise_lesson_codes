package day11loops;

public class Forloop01 {

	public static void main(String[] args) {
	      /*
        type a program to find the sum of the integers from 1 to 100
        */
           
       int sum = 0;
       
       for(int i = 1 ; i<5 ; i++) {
           
           sum = sum +i;
       System.out.println("the sum is " + sum); // gives you the sum for every loop
       }
       System.out.println("the sum is " + sum); // gives the final sum

}
}