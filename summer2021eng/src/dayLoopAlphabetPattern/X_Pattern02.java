package dayLoopAlphabetPattern;

public class X_Pattern02 {

	public static void main(String[] args) {
		for(int i=1; i<9;i++) {
			for(int j=1;j<9;j++) {
				if (i==j||j+i==9) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
					
				}
			System.out.println();
		}
			
		}

}
