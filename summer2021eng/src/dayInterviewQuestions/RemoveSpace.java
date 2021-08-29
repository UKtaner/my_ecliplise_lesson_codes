package dayInterviewQuestions;

public class RemoveSpace {
	 static void removespace(String str) {
		 
		 System.out.println(str.replaceAll("\\s", ""));	 
	 }

		public static void main(String[] args) {
			removespace("t  y uuk ik");

		}

	}