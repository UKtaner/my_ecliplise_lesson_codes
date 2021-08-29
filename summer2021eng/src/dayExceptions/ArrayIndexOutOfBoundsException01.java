package dayExceptions;

public class ArrayIndexOutOfBoundsException01 {

	public static void main(String[] args) {
		try {
		int[] input= {1,2,3,5,7,8};
		
		System.out.println(input[3]);//5
		System.out.println(input[7]);//ArrayIndexOutOfBoundsException
		}
		catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index is Out Of Bounds");
		}
		
		}
	}


