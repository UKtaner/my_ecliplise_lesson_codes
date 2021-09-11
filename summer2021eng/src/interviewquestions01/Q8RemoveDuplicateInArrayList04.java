package interviewquestions01;

import java.util.Arrays;

public class Q8RemoveDuplicateInArrayList04 {

	public static void main(String[] args) {
		
	String str="Java is al so easy so easy Java";
	String dups="";
	
	for(int i=0;i<str.length();i++) {
		for(int j=i+1;j<str.length();j++) {
			if(str.charAt(i)==str.charAt(j)) {
				if(!dups.contains(String.valueOf(str.charAt(j)))) {
					dups+=str.charAt(j);
						break;
			}
		}
	}
}		
								System.out.println(dups.replaceAll(" ", ""));//Javsoey
								char []c=dups.toCharArray();
							    System.out.println(Arrays.toString(c).replaceAll(" ", ""));//[J,a,v,,s,o,e,y]
		
		    
	}
}