package dayLoops;

public class Triangle01 {

	public static void main(String[] args) {
		/*
					*
					**
					***
					****
					*****
					****
					***
					**
					*
		 */
	
	
		for(int i=1;i<=5; i++) {// stands for row
			
			for(int j=0; j<i;j++) {// stands for column
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i=4;i>0;i--) {
			for(int j=0; j<i;j++) {// stands for column
				System.out.print("*");
				
			}
		System.out.println();
		}
		
		
	}

}
