package pass1;

public class Findmaxmin {

	  static String findmaxandmin(int[] arr){

	    int min =Integer.MAX_VALUE;
	    int max = Integer.MIN_VALUE;
	    for (int i =0; i<arr.length;i++){
	      if( arr[i]> max)
	      max=arr[i];
	      else if (arr[i]<min)
	      min=arr[i];
	    }
	    return "min: "+  min + "\nmax: "+ max;

	  }
	  public static void main(String[] args) {
	    System.out.println(findmaxandmin(new int[]{3,2,5,4,1,6}));
	  
			}
		}