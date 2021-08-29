package dayLoops;

public class RightTrianglePattern {

	public static void main(String[] args) {
		/*
						* 
						* * 
						* * * 
						* * * * 
						* * * * * 
		 */
		
		for(int i=1;i<=5; i++) {// stands for row
			
			for(int j=0; j<i;j++) {// stands for column
				System.out.print("* ");
			}
			System.out.println();
		}

		
		
	}

}
