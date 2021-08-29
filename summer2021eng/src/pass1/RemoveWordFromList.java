package pass1;

import java.util.ArrayList;
import java.util.List;

public class RemoveWordFromList {
/*	16. Write a method that takes two parameters: an ArrayList of Strings called wordList, and a String called targetWord. 
 * Method removes the targetWord from ArrayList.EX :ArrayList("hi","hey","hi","yo"));  ----> removeAll(wordList,"hi"); --->["hey","yo"].
	
	*/

	static List<String> removeWord(List<String> al, String word){
		
        for(int i = 0; i < al.size(); i++){
            if(al.get(i).equals(word)) {
                al.remove(al.get(i));
                i--;
            }
        }
        return al;
    }
	
	public static void main(String[] args) {
		
		System.out.println(removeWord(new ArrayList<>(List.of("a","a","a","b","c","a")),"a"));
		
	}
	}


