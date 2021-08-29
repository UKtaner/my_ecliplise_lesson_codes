package replit;

public class W6Q01MaxMinOccurrance {

	 /*
	 Write a Java program to get a String from user as input and find the maximum occurring character in that string.
	 (Ignore case sensitivity)
	 
	input : Learning java is easy 
	output: maximum occurring character is : a
	 */
	static void maxOccur(String str) {
		int []occur=new int[str.length()];
		char maxChar=str.charAt(0);
		char arr[]=str.toLowerCase().toCharArray();
		int l=arr.length;
		for(int i=0;i<l;i++) {
			occur[i]=1;
			for(int j = i+1; j < l; j++) {
				if(arr[i]==arr[j]&&arr[i]!=' ') {
					occur[i]++;
				}}}
			int max=0;
			for(int i = 0; i <l; i++) {
			
			if(max<occur[i]) {
				max=occur[i];
				maxChar=arr[i];
			}}
	System.out.println("maximum occurring character is : " + maxChar);     
		  	
	}
		public static void main(String[] args) {
			maxOccur("Learning java is easy");
		
		}	 
}