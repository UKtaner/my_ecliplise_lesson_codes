package day27NTexceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
// i.o. is a library
// io stands for input output
// if you want to "Input" from a "File" like a"Stream", we will use FileInputStream class.  
public class E01 {
/*
 1) FileNotFoundException:
 	a- The file with the specified path does not exist
 	b- if the file is unaccessible
 	c- FileNotFoundException is a child of IOException
 	
 2) IOException:
 	a-it can handle all exceptions about input and output.
 	b-IOException is a parent of FileNotFoundException
 	c- When we use IOException, not need to use FileNotFoundException any longer. 
 Note: All exceptions are a class.	
 Note: When you see an Exception, you have 2 options
	    		a)Using "throws" declaration in the method name line
	    		b)Using try-catch block
	 */
	
	//public static void main(String[] args) throws FileNotFoundException {
	//1. way...throws==>means asking for help  in java, means throwing exception...
	//2. way...	
		public static void main(String[] args) throws IOException {	
		FileInputStream fis=new FileInputStream("src/day27NTexceptions/Textfile01");// I input file
		// there are many methods inside the classes and to access them, we need and object. 
		// if I do not create an object, can not access non static things...
		//fis object is created in FileInputStream class, and read() method comes from there.
		// FileInputStream("path") is using a path
		
		int i=0;
				while((i = fis.read()) !=-1) {// I read file
					System.out.print((char)i);
					// for "i" getting ascii values and converting to char.
					//read(int) is returning int
				}
		fis.close();
		
	}

}
