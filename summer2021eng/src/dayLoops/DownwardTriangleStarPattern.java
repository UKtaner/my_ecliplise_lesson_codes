package dayLoops;

public class DownwardTriangleStarPattern {
/*
 				* * * * * * * 
				* * * * * * 
				* * * * * 
				* * * * 
				* * * 
				* * 
				* 

 */
	public static void main(String[] args) {
		int i,k;
		for(i=7; i>=0;i--) {
			for(k=0;k<i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}}}
