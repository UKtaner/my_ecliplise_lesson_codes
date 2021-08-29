package day27DTexceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {

	public static void main(String[] args) throws IOException {
		FileInputStream fIS=new FileInputStream("src/day27DTexceptions/TextFile01");

		int i=0;
		
		while((i=fIS.read())!=-1) {
			System.out.print((char)i);
		}
		fIS.close();
		
	}

}
