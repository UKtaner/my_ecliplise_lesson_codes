package dayLoopAlphabetPattern;

public class T_pattern {
/*
 			 * * * * * * *
	 			   *
	 			   *
	 			   *
	 			   *
	 			   *
	 			 
 */				
	public static void main(String[] args) {
		
		int i,j,n=7;
		for(i=1; i<=n;i++) 
		{
			for(j=1;j<=n;j++)
			{
				if(i==1||j==7)
				{
					
					System.out.print("* ");
				}
					
			else
			{
			System.out.print(" ");
			}
		}
			System.out.println();
		}
	}
	
}
		




