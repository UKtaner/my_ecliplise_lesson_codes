package practiceDay07;

public class MinMaxOfArray {

	static void maxmin(int[] input) {
		
		int max=0;
		int min=0;
		for(int i=0;i<input.length;i++) {
			if(input[i]<min) {
				min=input[i];
			}if(input[i]>min) {
				max=input[i];
			}
			
		}
		System.out.println(("min: "+min+"\nmax: "+max));
	}
	
	public static void main(String[] args) {
	
		maxmin(new int [] {3,2,5,4,1,6});

	}

}
