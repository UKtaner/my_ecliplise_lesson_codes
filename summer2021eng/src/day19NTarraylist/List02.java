package day19NTarraylist;
import java.util.ArrayList;

public class List02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list2=new ArrayList<>();
		
		list2.add("Ali");
		list2.add("Nur");
		list2.add("Can");
		list2.add("Veli");
		
		System.out.println(list2);
		
		// .set()==> we replaced Ali with Ahmet.
		
		list2.set(2, "Ahmet");// 2 is index number
		System.out.println(list2);
		
		list2.set(list2.indexOf("Veli"), "Taner");
		System.out.println(list2);
		
		
		
		
	}

}
