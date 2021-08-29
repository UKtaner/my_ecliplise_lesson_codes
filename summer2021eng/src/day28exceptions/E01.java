package day28exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class E01 {

	/*
	what is the exception? Unexpected issue
	How to handle exception?
	- in method line , we throw exception...(asking for help)... 
	- in try/catch() block, we can print whatever we want in catch.
	- in try/catch(),u can not use try alone, after try we need to use either catch or something else
	TYPES OF EXCEPTIONS.......................................
	1-  FileNotFoundException works for path issue and unaccessible issues
	2- 	IOException class works and covers all for every issues.
		IOException is a parent of FileNotFoundException.
	3- 	AritheticException is to throw exceptions for undefined mathematical issues.
...............................................................................
1. day		-We learned how to read a text file character by character.
2.day	 	-We will learn how to read a text file line by line by using "BufferedReader"
	 */
	 
			// br object is created.
			//BufferedReader==> data type
			//Read means input operation and io is input/output library
			//BufferedReader()==> constructor
			//FileReader("path")==> is a class	 
	
// we can use "try/catch" inside the "try" again.
// Using nested codes are not preferable...............	
	
	public static void main(String[] args) {
		
		try {
			BufferedReader br=new BufferedReader(new FileReader("src/day27NTexceptions/Textfile01"));		
//-We will learn how to read a text file line by line.
// FileReader is meant for reading streams of characters.Stream is  a sequence of elements/objects			
			String line =br.readLine();
			while(line !=null) {
				System.out.println(line);
				line=br.readLine();
			}
			
		} catch (FileNotFoundException e) {// child exception should be 1.
			System.out.println("There is an issue about path or accessing file...");
		
		
		} catch (IOException e) {// parent exception should be last
			System.out.println("There is an issue in reading file...");
			
		}
		
		
		
	}

}
