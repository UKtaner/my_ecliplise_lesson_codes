package practiceDay08;

public class IsSandwich {
	/*1.A sandwich is two pieces of bread with something in between. 
	Print the string that is between the first and last appearance of "bread" in the given string, 
	or return string "nothing" if there are not two pieces of bread.EX: breadozkanbread --> ozkan, breadozkan --> nothing*/
	
	public static void main(String[] args) {
		// 1. way
		String s = "breadozkanbread";
		if (s.substring(0,5).equals("bread") && s.substring(s.length()-5).equals("bread")) {
			System.out.println(s.substring(5,s.length()-5));
		} else {
			System.out.println("nothing");
		}
	}
}
