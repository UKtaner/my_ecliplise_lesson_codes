package pass1;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {

	public static void main(String[] args) {
		List<Character>list=new ArrayList<>();//[] now list is empty
		
// lest add some value....
		
		list.add('a');
		list.add('c');
		list.add('t');
		list.add('k');
		
		System.out.println(list);//[a, c, t, k] new list
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+"*");//a*c*t*k*
		}	
			System.out.println();	
			
		for(Character w:list) {
			System.out.print(w+"!");
		}
		System.out.println();
		for(Character w:list) {
		
			if(w=='a' || w=='e' || w=='i' || w=='o' || w=='u') {
				
				continue;		
			}
			System.out.print(w);
		}
		System.out.println();
		
		for(Character w:list) {
		System.out.println((int)w);	
		System.out.println();		
		}
		
		int sum=0;
		for(Character w:list) {
			sum=sum+w;
		}
		System.out.println("in total: "+sum);
		
		String s[] = {"Ali", "Can", "Hasan", "Ekrem"};		
		for(String w : s) {
			if(!w.endsWith("n")) {
			// continue;	
			// if you use continue, remove ! and get the syso out of if loop...	
				System.out.print(w + " ");
	}
	
		
		}}	
}



