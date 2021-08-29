package pass1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddingFromArrayToList {

	public static void main(String[] args) {
	//Character ch[]=new Character[4];
	Character ch[]= {'a','b','c','d'};
	ch[0]='a';
	ch[1]='b';
	ch[2]='c';
	ch[3]='d';
	
	System.out.println(Arrays.toString(ch));//[a, b, c, d]
	
	List<Character>list=new ArrayList<>();
	
	list.add(ch[0]);
	list.add(ch[1]);
	list.add(ch[2]);
	list.add(ch[3]);
	System.out.println(list);//[a, b, c, d]==> added to the list
	
	for(int i=0; i<ch.length;i++) {
		list.add(ch[i]);
	}
	
	System.out.println(list);  	
	
	List<Character>list1=Arrays.asList(ch);
	System.out.println(list1);
	
	Integer num[]= {1,2,3,4,5};
	List<Integer>inlist=Arrays.asList(num);
	inlist.set(0,9);;
	
	
	System.out.println(inlist);
	
	String str[]= {"asd","FRTGr","trt"};
	
	List<String>list2=Arrays.asList(str);
	System.out.println(list2);
	
	List<Integer>list3=new ArrayList<>();
	list3.add(1);
	list3.add(2);
	list3.add(3);
	
	Integer in[]=list3.toArray(new Integer[0]);
	System.out.println(Arrays.toString(in));
	}
	
	
	
	}


