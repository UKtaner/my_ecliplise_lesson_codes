package dayArryList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SwapList {

	public static void main(String[] args) {
		
		        int firstIndex, secondIndex;
		        Scanner sc = new Scanner(System.in);

		        ArrayList<Integer> intList = new ArrayList<>();

		        for(int i = 1; i< 10; i++){
		            intList.add(i);
		        }

		        System.out.println("Enter the first index :");
		        firstIndex = sc.nextInt();

		        System.out.println("Enter the second index :");
		        secondIndex = sc.nextInt();

		        System.out.println("Original list before swap : "+intList);

		        Collections.swap(intList, firstIndex, secondIndex);

		        System.out.println("List after swap : "+intList);
		    }
		}