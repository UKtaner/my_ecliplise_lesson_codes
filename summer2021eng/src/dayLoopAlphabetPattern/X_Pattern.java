package dayLoopAlphabetPattern;

public class X_Pattern {

	public static void main(String[] args) {
		for(int i=1; i<9;i++) {
			for(int j=1;j<9;j++) {
				if (i==j||j==(9-i)) {
					System.out.print("*"+" ");
				}else {
					System.out.print(" "+" ");
				}
					
				}
			System.out.println();
		}
			
		}

}
