package pass2;

import java.util.Scanner;

public class Temp {
	public static boolean isPalidrom(String str) {
		return new StringBuilder(str).reverse().toString().equals(str);
	}
	public static void main(String[] args) {
		System.out.println(isPalidrom("racecar"));
	}

}
