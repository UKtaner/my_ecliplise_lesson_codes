package interviewquestions01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Q8RemoveDuplicateInArrayList03 {
	
		
	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter list length");
		
		int len=scan.nextInt();
		
		String str="";
		System.out.println("Enter elements");
		List<String> list = new ArrayList<String>();
		
		for(int i=0;i<len;i++) {
			str=scan.next();
			list.add(str);
			
		}
		
		System.out.println(list);
		HashSet<String> listset = new HashSet<String>(list);
		System.out.println(listset);
			
			}
		}
		
	