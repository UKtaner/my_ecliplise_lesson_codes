package practiceDay08;

public class IsCountSame2 {
//2.Print true if the string "java" and "python" appear the same number of times in the given string word.
	static boolean isSameNumber (String str) {
		String[] words = str.split("\\s+");
		int nj=0;
			int np=0;
			
			//for(int w=0; w<words.length;w++) {
		for (String w : words) {
			
			if (w.contains("java")) {
				nj++;
			}
			if (w.contains("python")) {
				np++;
			}
			
		}
		if(nj==np) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(isSameNumber("javapython"));

	}

}