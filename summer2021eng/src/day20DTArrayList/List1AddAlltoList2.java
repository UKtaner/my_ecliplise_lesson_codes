package day20DTArrayList;

import java.util.ArrayList;
import java.util.List;

public class List1AddAlltoList2 {

	public static void main(String[] args) {
	
        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(23);
        list1.add(12);
        list1.add(11);
        list1.add(13);
        list1.add(10);
        System.out.println(list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(25);
        list2.add(2);
        list2.add(17);
        list2.add(18);
        list2.add(1);
        list2.add(115);
        System.out.println(list2);
        
        list2.addAll(2,list1);
        System.out.println(list2);
        
        List<Integer> list5 = new ArrayList<>();
        
        list5.add(99);
        list5.add(98);
        
        list5.addAll(list2);
        System.out.println(list5);
        

	}

}
