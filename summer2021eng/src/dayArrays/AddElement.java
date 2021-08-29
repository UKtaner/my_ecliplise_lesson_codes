package dayArrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {

	public static void main(String[] args) {
	
	     //original array
        String[] colorsArray = {"Red", "Green", "Blue" }; 
        
        System.out.println("Original Array: " + Arrays.toString(colorsArray));
 
        //length of original array
        int orig_length = colorsArray.length;
        
        //define new array with length more than the original array
        String[] newArray = new String[ orig_length + 1 ];
        
        //new element to be added to string array
        String newElement = "Orange";
       
        //add all elements of original array to new array
        for (int i=0; i <colorsArray.length; i++)
        {
         newArray[i] = colorsArray [i];
         }
        //add new element to the end of new array
        newArray[newArray.length- 1] = newElement;
        //make new array as original array and print it
        colorsArray = newArray;   
        System.out.println("Array after adding new item: " + Arrays.toString(colorsArray));
    }
}
