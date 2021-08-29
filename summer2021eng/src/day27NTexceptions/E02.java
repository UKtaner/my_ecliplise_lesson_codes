package day27NTexceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 	1)You can use multiple "catch blocks" for a single "try block"
 	2)If you use multiple "catch blocks", order the Exception Classes from child to parent, otherwise
 	  you will get Compile Time Error.
 	3)If you use multiple "catch blocks", you can get different messages for every Exception
 	4)try-block cannot be used alone
 	5)When you type code if you get red underline for Exceptions, that kind of Exceptions are called "Checked Exceptions" 
 	  If you do not get any red underline for some Exceptions, they are called "Unchecked Exceptions"
 	  FileNotFoundException and IOException are "checked exceptions"
 	6)If there is any Exception Java stops execution
 */

public class E02 {

	public static void main(String[] args) {
		FileInputStream fis=null;
		// if the obj complains it s scope issue
		try {
			 fis=new FileInputStream("src/day27exceptions/Textfile01");
			 int i=0;
			 while((i = fis.read()) !=-1) {
					System.out.print((char)i);
					
				}
			 fis.close();
		
		} catch (FileNotFoundException e) {
			System.err.println("I think the path is wrong or file does not exist...");
			//e.getStackTrace();
			System.out.println(e.getMessage());//e.getMessage()==> gives short message
			// catch(){} is a method and using parameter variable is "e" obj and data type is "FileNotFoundException"
			//System.out.println(e.getStackTrace());//e.getStackTrace()==> gives detailed message
		}	catch(IOException e) {
			
			System.err.println("There are some issues in reading the file...");
			
		}
		
		
	}

}
