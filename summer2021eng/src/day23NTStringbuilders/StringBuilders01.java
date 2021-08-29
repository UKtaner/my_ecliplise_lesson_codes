package day23NTStringbuilders;

public class StringBuilders01 {

	public static void main(String[] args) {

// to update the string, we can use StringBuilder
		
		StringBuilder sb= new StringBuilder();
		System.out.println(sb);
		System.out.println(sb.capacity());//default capacity is 16
		
		sb.append("Ali");
		System.out.println(sb);
		sb.append(" is a friend of Veli");
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		
		String str="Veli";
		str.toUpperCase();
		System.out.println(str);
		
		StringBuilder sb1=new StringBuilder("Veli is my friend");
		System.out.println(sb1);
		
		sb1.append(" and my classmate");
		System.out.println(sb1);
		StringBuilder sb2=new StringBuilder(5);// (5) reserve space in the memory and shows the capacity of your string, but can also excess that 
		sb2.append("Javaxas");
		
		System.out.println(sb2);
		System.out.println("sb2.capacity==> "+sb2.capacity());
		System.out.println("sb2.length==> "+sb2.length());
		
		StringBuilder sb3=new StringBuilder("Java");
		
		sb3.append('a').append('b').append('c');
		System.out.println(sb3);
		sb3.append("Ahmet", 1, 3);
		System.out.println(sb3);
		
		System.out.println(sb3.charAt(5));
		
		System.out.println(sb3.delete(4, 7));
		
		StringBuilder sb4=new StringBuilder("Java");
		
		StringBuilder sb5=new StringBuilder("Java");
		
		System.out.println(sb4.equals(sb5));
		
		System.out.println(sb4.indexOf("a"));
		
		System.out.println(sb4.insert(1, "QX"));
		
		System.out.println(sb4.insert(0, "cctc",1,3));
		
		System.out.println(sb4.reverse());//avaXQJtc
		
		System.out.println(sb4.replace(3, 4, "*"));
		
		System.out.println(sb4.replace(3, 4, ""));
		
		System.out.println(sb4.replace(3,4,"x"));//avaxJtc
		
		sb4.setCharAt(0, '9');
		
		System.out.println(sb4);
		
		sb4.trimToSize();
		
		System.out.println(sb4);
		
		
		
		
		
		
		
		
	}

}
