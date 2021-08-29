package practiceDay07;

public class ArrayStrReverse {
//Reverse sentence:"Coding is great."
	static String[] reverseStr(String str) {
		
	String [] arr=new String[str.length()];
	
	for(int i=arr.length-1;i>=0;i--) {
		
		arr[i]=str.charAt(i)+"";
		System.out.print(arr[i]);
	}		
		return arr;	
	}
	
	public static void main(String[] args) {
		reverseStr("Coding is great.");

	}

}
