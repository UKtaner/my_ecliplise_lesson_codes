package pass1;

public class ReverseStr {
//Write a method that accepts a String and returns reverse of the same String. EX: java -> avaj	
/////////////////////1.way////////////////////////
	static String isReverse1(String str) {
				String reversed1="";
			for (int i=str.length()-1; i>=0;i--) {
				reversed1+=str.charAt(i);
				//reversed+=str.charAt(i)+" ";
			}
			return reversed1;	
		}
//////////////////////2.way///////////////////////////////
		static void isReverse2(String str) {	
			String reversed2="";
			for(int i=0; i<str.length();i++) {
				reversed2+=str.charAt(str.length()-i-1);
			}
			System.out.println(reversed2);		
		}
////////////////////////3.way//////////////////////////////////	
		static void isReverse3(String str) {
			StringBuffer reversed3=new StringBuffer(str);		
			System.out.println(reversed3.reverse());
		}
////////////////////////4.way/////////////////////////////////////////
		static void isReverse4(String str) {
			StringBuilder reversed4 = new StringBuilder();
			reversed4.append(str);
			System.out.println(reversed4.reverse());	
		}
///////////////////////////5.way//////////////////////////////////////
		public static String isReverse5(String str){  
		    char ch[]=str.toCharArray();  
		    String reversed5="";  
		    for(int i=ch.length-1;i>=0;i--){  
		    	reversed5+=ch[i];  
		    }  
		    return reversed5;  
		}  		
		public static void main(String[] args) {
			System.out.println(isReverse1("Ali-1"));// with return
			isReverse2("Ali-2");// with void
			isReverse3("Ali-3");// with void
			isReverse4("Ali-4");// with void
			System.out.println(isReverse5("Ali-5"));// with return
			
		}

	}