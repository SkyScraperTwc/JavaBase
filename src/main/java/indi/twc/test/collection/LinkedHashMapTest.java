package indi.twc.test.collection;
 
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;


public class LinkedHashMapTest{
    
     public static void main(String args[]){   
    	 Scanner scan = new Scanner(System.in);
    	 while(scan.hasNext()){
    		 String str = scan.nextLine();
    		 LinkedHashMap<Character, Integer> hm 
    		 			= new LinkedHashMap<Character, Integer>();
    		 char[] ch = str.toCharArray();
    		 for (int i = 0; i < ch.length; i++) { 
    			 if(hm.containsKey(ch[i])){
    				 int oldValue = hm.get(ch[i]);
    				 hm.put(ch[i], oldValue+1);
    			 }else{
    				 hm.put(ch[i],1);  
    			 } 
			} 
    		 
    		 for (Entry<Character, Integer> entry : hm.entrySet()) {
				if(entry.getValue()==1){
					System.out.println(entry.getKey());
					break;
				}
			}
    	 }
    	         
    	 }     
  }       
 
       