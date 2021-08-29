package dayLoops;

public class Regtangle {

	public static void main(String[] args) {
		/*
		    * * * * 
			* * * * 
			* * * * 
			* * * * 
			* * * * 
			* * * *
		 */
		for(int i=0; i<6; i++) {
			for(int j=0;j<4;j++) {// every row completes than move o next line
				System.out.print("* ");	
			}
			
			System.out.println();
		}
	}
}