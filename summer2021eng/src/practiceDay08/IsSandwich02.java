package practiceDay08;

public class IsSandwich02 {
	/*1.A sandwich is two pieces of bread with something in between. 
	Print the string that is between the first and last appearance of "bread" in the given string, 
	or return string "nothing" if there are not two pieces of bread.EX: breadozkanbread --> ozkan, breadozkan --> nothing
	
     * @param str
     * @returns String between the word od breads otherwise returns "nothing"
     */
    static String isSandwich(String str){
        int first = str.indexOf("bread");
        int second = str.lastIndexOf("bread");
        if(first == second)
            return "nothing";
        return str.substring(first + 5, second);
    }
	// way by void
    static void isSandwich1(String str) {
		//str= breadozkanbread
		int first=str.indexOf("bread");
		int last=str.lastIndexOf("bread");
		if(first==last) {
		System.out.println(str.substring(first+1,last));	
		}else {
			System.out.println("Nothing");
		}	
	}
    
	public static void main(String[] args) {
	
		System.out.println(isSandwich("breadozkanbread"));
	
		isSandwich1("breadozkanbread");
	}

}
