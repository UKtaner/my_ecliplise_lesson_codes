package day31DTIteratorscollection;

import java.util.LinkedList;

public class LinkedList01 {
	/*
     * It is very similar to the list but the structure is completely different
     * we call the member of linkedlist "Node"
     * each node has two parts  1) data  2) pointer
     * at the beginning of linkedlist there is a "Head" it does not have data part
     * at the end of the linkedlist the pointer points to the null
     */
    
    /*
     * Assertion is quick and easy in linkedlist
     * in assertion we just break the pointer and link the new node
     * but for list we need to update indexes
     */
    
    /*
     * Deletion is also quick and easy with linkedlist
     * we just broke the connection take the element 
     */
    
    /*
     * reaching an element is easy with list. 
     * Because we can directly reach element by using index
     * but it is too hard and takes time to reach a node in linkedlist.
     * because it checks every nodes one by one
     */
	public static void main(String[] args) {
		
	LinkedList<String>ll1= new LinkedList<>();
	ll1.add("Samet");
	ll1.add("Huseyin");
	ll1.add("Muhammed");
	
	System.out.println(ll1);
	// add() comes from the list interface	
	
	ll1.add(1,"Osman");
	System.out.println(ll1);
	
	ll1.addFirst("Ali Can");
	System.out.println(ll1);//[Ali Can, Samet, Osman, Huseyin, Muhammed]
	ll1.addLast("Veli Can");
	
	System.out.println(ll1);//[Ali Can, Samet, Osman, Huseyin, Muhammed, Veli Can]
	
	ll1.add(4, "Nur Can");
	
	System.out.println(ll1);//[Ali Can, Samet, Osman, Huseyin, Nur Can, Muhammed, Veli Can]
	
	
	//ll1.contains()
	System.out.println(ll1.contains("Ali Can"));//true
	
	//element()==> will return the first element
	System.out.println(ll1.element());//Ali Can
	
	System.out.println(ll1.getFirst());//Ali Can
	
	System.out.println(ll1.indexOf("Veli Can"));
	
	System.out.println(ll1.peek());
	
	System.out.println(ll1.pollFirst());
	
	LinkedList<String>ll2= new LinkedList<>();
	System.out.println(ll2.element());
	// if our LinkedList is empty we need to handle it
	// otherwise it will give an exception "NoSuchElementException"
	
	
	
	
	}

}
