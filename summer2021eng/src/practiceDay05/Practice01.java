package practiceDay05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice01 {
	

	
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(3);

		list.add(5);

		list.add(7);

		list.add(9);



		int i = 0;

		int x = 0;

		while(i<list.size()) {

			x = x + list.get(i);

			i++;

		}

		System.out.println(x);

}

}





