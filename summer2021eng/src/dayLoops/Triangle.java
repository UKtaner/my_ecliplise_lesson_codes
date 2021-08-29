package dayLoops;

public class Triangle {

	public static void main(String[] args) {
		/*
	  * 
     * * 
    * * * 
   * * * * 
  * * * * *
		
		 */

		int i,k;
		
		for(i=0;i<5;i++) {
			for(k=(5-i);k>=0;k--) {
				
				System.out.print(" ");
				}
			for(k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
			}
		
		
		}
		
	}
	
	

