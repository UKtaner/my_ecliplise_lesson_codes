package practiceDay08;

public class IsCountSame {
    //2.Print true if the string "java" and "python" appear the same number of times in the given string word. EX : javajavajavpythonpythonpyt --> true

    /**
     * @param str
     * @returns if the string "java" and "python" appear the same number of times in the given str.
     */
    static boolean isCountSame(String str){
        int countJava, countPython;
        countJava = countPython = 0;
        str=str.replace(" ", "").toLowerCase();
        
        for(int i = 0; i < str.length() - 5; i++){
            if(str.substring(i, i + 4).equalsIgnoreCase("java"))
                countJava++;
            if(str.substring(i, i + 6).equalsIgnoreCase("python"))
                countPython++;

        }
       if(str.endsWith("java")) 
    	   countJava++;
       
        return countJava == countPython;
    }



	public static void main(String[] args) {
	
		System.out.println(isCountSame("pythonjavajavapython"));
		
	}

}
