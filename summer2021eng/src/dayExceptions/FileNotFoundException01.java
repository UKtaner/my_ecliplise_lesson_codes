package dayExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundException01 {

	public static void main(String[] args) {
		try {
		
			 File file = new File("E://file.txt");

        FileReader fr;
		
			fr = new FileReader(file);
		
		System.out.println(fr);
		} catch (FileNotFoundException e) {
			
			System.out.println("File does not exist"+e.getStackTrace());
			
		}

}
}