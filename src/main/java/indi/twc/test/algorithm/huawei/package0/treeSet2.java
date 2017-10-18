package indi.twc.test.algorithm.huawei.package0;
 
import java.util.TreeSet;

public class treeSet2{    
    
     public static void main(String args[]){    
    	 TreeSet<Integer> treeSet = new TreeSet<Integer>(); 
    	 treeSet.add(3);
    	 treeSet.add(8); 
    	 treeSet.add(1); 
    	 treeSet.add(2);
    	 treeSet.add(4); 
    	 treeSet.add(7);  
    	 treeSet.add(6);  
		 System.out.println(treeSet);
    	  for (Integer integer : treeSet) {
			System.out.println(integer);
		}
    }   
}      
    
