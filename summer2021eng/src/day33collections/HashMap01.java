package day33collections;

import java.util.HashMap;
/*
 HashMap does not put the elements in any order. so that its faster.
 HashMap is putting the elements randomly.
 Keys must be unique in Maps, if you try to put repeated keys, java will overwrite.
 Values can be repeated in Maps
 We can use null in keys
 
 					HashMap			TreeMap			HashTable		SortedMap
 
 1.OrderEl		 .random							.random
 2.Speed		 .fast								.slow
 3.Key			 .unique
 4.RepeatedKey	 .overwrite
 5.Value 		 .repeatable
 
 
 */
public class HashMap01 {

	/*
 	1)HashMap does not put the elements in any order. 
 	  Because of that it is fast
 	2)Keys must be unique in Maps, if you try to put repeated key, Java will overwrite
 	3)Values can be repeated in Maps
 	4)We can use null in Keys but you can use it just once
 	  We can use null in Values repeatedly
 	5)HashMaps are not thread-safe and not synchronized
 */

public static void main(String[] args) {
	
	HashMap<Integer, String> hm1 = new HashMap<>();
	
	hm1.put(100, "Ali Can");
	hm1.put(101, "Veli Han");
	hm1.put(102, "Mark Stone");
	hm1.put(103, "Angie Ocean");
	hm1.put(100, "Kemal Kuzu");
	hm1.put(104, "Angie Ocean");
	hm1.put(null, "Angie Ocean");
	hm1.put(105, null);
	hm1.put(106, null);
	hm1.put(107, null);
	
	//Returns the value to which the specified key is mapped
	System.out.println(hm1.get(100));//Kemal Kuzu
	//For non-existing keys it returns null
	System.out.println(hm1.get(108));//null
	
	System.out.println(hm1.getOrDefault(108, "No value for that key"));
	
	//Returns the keys in a Set Collection
	System.out.println(hm1.keySet());//[null, 100, 101, 102, 103, 104, 105, 106, 107]
	
	System.out.println(hm1.values());//[Angie Ocean, Kemal Kuzu, Veli Han, Mark Stone, Angie Ocean, Angie Ocean, null, null, null]
	
	System.out.println(hm1.containsKey(108));//false
	System.out.println(hm1.containsKey(103));//true
	System.out.println(hm1.containsValue("Veli Han"));//true
	
	
HashMap<Integer, String> hm2 = new HashMap<>();
	
	hm2.put(108, "X");
	hm2.put(109, "Y");
	hm2.put(110, "Z");
// 	
	hm1.putAll(hm2);
	hm1.putIfAbsent(111, "Taner");
	
	hm1.replace(108, "LLL");
	
	hm1.replace(112, "????");
	hm1.replace(106, null, "Ali");// if the old value is maching then it will replace 
	
	hm1.replace(106, null, "Veli");// if the old value is not maching then it will not replace...
	
	System.out.println(hm1.size());//13
	
	System.out.println(hm1);


	}

}
