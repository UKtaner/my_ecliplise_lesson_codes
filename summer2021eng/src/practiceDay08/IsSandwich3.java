package practiceDay08;

public class IsSandwich3 {
	static String sandwich(String s) {
		
		if(s.indexOf("bread")==s.lastIndexOf("bread") || !s.contains("bread"))
		return "nothing";
		else {
			return s.substring(s.indexOf("bread")+5, s.lastIndexOf("bread"));
		}
	}
	public static void main(String[] args) {
	
		System.out.println(sandwich("breadozkanbread"));
		
	}

}
