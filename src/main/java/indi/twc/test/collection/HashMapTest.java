package indi.twc.test.collection;
 
import java.util.HashMap;


public class HashMapTest{
    
 	public static void main(String args[]){
		HashMap <String, Integer> hashMap = new HashMap <String, Integer>();
		hashMap.put("0", 0);
		hashMap.put("1", 1);
		hashMap.put("2", 2);
		hashMap.put("3", 3);
		hashMap.put("4", 4);
		hashMap.put("5", 5);
		hashMap.put("6", 6);
		hashMap.put("7", 7);
		hashMap.put("8", 8);
		hashMap.put("9", 9);
		for (String string : hashMap.keySet()) {
			System.out.println(string);
		}
 	}
}
 
       