package day04_concat;

public class OperatorSigns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isTrue =5+2==7;
		
		boolean isFalse =5+2==8;
		
		// to assign operator
		//== equal sign or comparison
	
	//!=  
		
		boolean isTrue1 = 5+2!=8;
		boolean noteq = 5+2 !=25;//true
		System.out.println(noteq);
		//">", ">=", "<", "<=" ==> All returns boolean
		
		// && ==> and operator .. IF YOU HAVE AT LEAST ONE FALSE
		// RESULT WILL BE FALSE..
		// || ==> or operator if you have one true the result will be true
		
		System.out.println(5>8);//false
		System.out.println(8>11-5);//true//(8>7)
		
		boolean b1 = 5>2;	//true   
		boolean b2 = 5==2+3;//true	   
		boolean b3 = 5==2;//false	   
		boolean b4 = 5<2; //false
		
		//to get true from &&, everything must be true
		System.out.println(b1&&b2);//true
		
		System.out.println(b1&&b3);//false
		System.out.println(b3&&b4);//false///?
		
		// to get false OR operation, everything must be false
		System.out.println(b2||b1);// true
		System.out.println(b3||b4);//false
		
		System.out.println(b1||b2||b3||b4);
		
	}

}
