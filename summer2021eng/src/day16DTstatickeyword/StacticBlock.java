package day16DTstatickeyword;

public class StacticBlock {

		static int age;
		static int year=2020;
		
		static {
			age=21;
		}
		
		static {
			System.out.println("Static 1");
		}
		
		static {
			System.out.println("Static 2");
		}
		
		static {
			System.out.println("Static 3");
		}
		
		
		public static void main(String[] args) {
			
		}
		
		public static void test1() {
			System.out.println("test1");
		}
		
		public static void test2() {
			System.out.println("test2");
		}
	
}
