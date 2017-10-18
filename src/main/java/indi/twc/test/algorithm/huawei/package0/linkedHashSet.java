package indi.twc.test.algorithm.huawei.package0;
 
import java.util.LinkedHashSet;


public class linkedHashSet{ 
    
     public static void main(String args[]){  
    	 //LinkedHashMap=?????????? 
    	 LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
    	 linkedHashSet.add(3);
    	 linkedHashSet.add(1);
    	 linkedHashSet.add(2);
    	 linkedHashSet.add(6);  
    	 linkedHashSet.add(5);
    	 linkedHashSet.add(7); 
    	 linkedHashSet.add(4);
    	 linkedHashSet.add(8);
    	 for (Integer integer : linkedHashSet) {
			System.out.println(integer);
		}
	     linkedHashSet.clear();  
      }   
}    
      