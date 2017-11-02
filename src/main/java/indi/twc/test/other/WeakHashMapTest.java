package indi.twc.test.other;
 
import java.util.WeakHashMap;


public class WeakHashMapTest {
	 int abc = 5;

     public static void main(String args[]){
    	 WeakHashMap<Integer, byte[]> weakHashMap = new WeakHashMap<Integer, byte[]>();
    	 for (int i = 0; i < 1000000; i++) {
			 Integer integer = new Integer(i);
			System.out.println(weakHashMap.size());
			weakHashMap.put(integer, new byte[i]);
		}

//    	 HashMap<Integer, byte[]> hashMap = new HashMap<>();
//    	 for (int i = 0; i < 10000; i++) {
//			Integer integer = new Integer(i);
//			hashMap.put(integer, new byte[i]);
//		}
     }
  }
