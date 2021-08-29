package practiceDay06;

public class IsReverseStr2 {


	
	public static String isReverse(String str){
	    	
	  String reversedStr="";
	  
	  for(int i=str.length()-1;i>=0;i--) {
		
		  reversedStr+=str.charAt(i); 
		  
	 
	    
	    }return reversedStr; 
	} 
	public static void main(String[] args) {

 System.out.println(isReverse("1234"));

	}

}
