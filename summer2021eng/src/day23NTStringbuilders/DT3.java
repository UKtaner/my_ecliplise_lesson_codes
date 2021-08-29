package day23NTStringbuilders;

public class DT3 {

	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("I love java");
		
		StringBuilder sb2=new StringBuilder("I love java");
		
		System.out.println(sb1.toString().equals(sb2.toString()));//true
		
		System.out.println(sb1.compareTo(sb2));//0(means true) if -1 means false.
		
		
		
		

	}

}
