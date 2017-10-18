package indi.twc.test.algorithm.huawei.package2;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 删除字符串中出现次数�?��的字�?
 * @author Administrator 
 *
 */
public class Main10{ 
    
     public static void main(String args[]){   
    	 Map<Character,Integer> map = new HashMap<Character,Integer>();
    	 map.put('a', 0);
    	 map.put('v', 0);  
    	 map.put('b', 0); 
    	 map.put('t', 0); 
    	 map.put('y', 0);
    	 map.put('u', 0);
    	 map.put('i', 0);
    	 map.put('o', 0);
//    	 System.out.println(map);
    	 //foreach语法�?��被编译器转为了对Iterator.next()的调�?
    	 for (Entry<Character, Integer> entry: map.entrySet()) {
    		System.out.println(entry.getKey());
		} 
    	 
    	 
    	 
    	 List<Integer> list = new ArrayList<Integer>();
    	 list.add(1);
    	 list.add(3);
    	 list.add(4);
    	 list.add(6);
    	 list.add(2);
    	 list.add(4);
    	 list.add(5);
    	 list.add(6);
    	 list.add(7);
    	 list.add(8); 
    	 
//    	 Iterator<Integer> iterator = list.iterator();
//    	 while(iterator.hasNext()){
//    		 System.out.println(iterator.next());
//    	 } 
    	 //按顺序输�?
//    	 for (Integer integer : list) {
//			System.out.println(integer);
//		} 
    	 
    	 }
    		 
 } 
              
      
   
 