package indi.twc.test.algorithm.huawei.package2;

import java.util.*;

/**
 * 删除字符串中出现次数�?��的字�?
 * @author Administrator 
 *
 */
public class Main9{ 
     public static void main(String args[]){  
    	 Scanner scan = new Scanner(System.in);
	    	 while(scan.hasNext()){
	    		 Map<Character,Integer> map = new HashMap<Character,Integer>();
	    		 
	    		 String str = scan.nextLine();
	    		 for (int i = 0; i < str.length(); i++) {
	    			 char c = str.charAt(i);
	    			 
	    			 if(!map.containsKey(c)){ 
	    				 map.put(str.charAt(i), 1); 
	    			 }else{
	    				 int val = map.get(c) + 1;  
	    				 map.put(c, val);   
	    			 }
				}   
	    		 Collection list = map.values(); 
	    		 Object min = Collections.min(list);//�?���?
	    		 
	    		 String newStr = "";
	    		 //foreach语法�?��被编译器转为了对Iterator.next()的调�?
	    		 for (Character c: str.toCharArray()) {
					if(map.get(c)!=min){
						newStr = newStr + c;
					} 
				}
	    	
	    		 System.out.println(newStr);
	    	 } 
    	 }
    		  
 }  
              
      
   
 