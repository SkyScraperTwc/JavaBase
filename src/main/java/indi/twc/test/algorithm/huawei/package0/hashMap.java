package indi.twc.test.algorithm.huawei.package0;
 
import java.util.HashMap;


public class hashMap{ 
    
     public static void main(String args[]){   
    	 HashMap <String, Integer> hashMap = new HashMap <String, Integer>();
    	 
    	 hashMap.put("0", 0);
    	 hashMap.put("1", 3); 
    	 hashMap.put("2", 1);   
    	 hashMap.put("3", 2); 
    	 hashMap.put("4", 6);   
    	 hashMap.put("5", 5);    
    	 hashMap.put("6", 8);
    	 hashMap.put("7", 7);  
    	 hashMap.put("8", 7);
    	 hashMap.put("9", 7);  
    	 	for (String string : hashMap.keySet()) {
				System.out.println(string);
			}
    	 }    
  }     
 
       