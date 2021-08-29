package practiceDay04;

public class Question03 {

	public Question03() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
/*
  create 3 char variables then print A L I on the console using
   String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";	
 */

		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.println(str.charAt(0)+" "+ str.charAt(11)+" "+str.charAt(8));
	

		System.out.println(str.substring(0, 1)+" "+str.substring(11,12)+" "+str.substring(8,9));
		
		
		char a=str.charAt(str.indexOf('A'));
		char l=str.charAt(str.indexOf('L'));
		char i=str.charAt(str.indexOf('I'));
		
		System.out.println(a+" "+l+" "+i+" ");
			
		}
		
		
		
		/*
	String pickachu="ABCDEFGIHKLMNOPQRSTUVZ";
	char A=pickachu.charAt(pickachu.indexOf('A'));
	char L=pickachu.charAt(pickachu.indexOf('L'));
	char I=pickachu.charAt(pickachu.indexOf('I'));
	System.out.println(""+A+L+I);

		 *
		String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
				
		System.out.print(alph.substring(0,1) + " ");
		System.out.print(alph.substring(11,12)+ " ");
		System.out.println(alph.substring(8,9));
		 */
	
	
	
	
	}
	


