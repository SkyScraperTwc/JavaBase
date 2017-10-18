package indi.twc.test.algorithm.huawei.package3;
 
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 整数与IP地址间的转换
 * @author Administrator 
 *
 */ 
public class Main9{  
     
     public static void main(String args[]){    
    	 Scanner scan = new Scanner(System.in);
    	 while(scan.hasNext()){
    		 String str = scan.nextLine();
    		 char[] ch = str.toCharArray();
    		 Map<Character,Integer> treeMap = new TreeMap<Character,Integer>();
    		 for (int i = 0; i < ch.length; i++) {
				 if(treeMap.containsKey(ch[i])){
					 int num = treeMap.get(ch[i]);
					 treeMap.put(ch[i], num+1);
				 }else{
					 treeMap.put(ch[i], 1);
				 } 
			}  
    		StringBuffer sb = new StringBuffer();
	    	for (Entry<Character,Integer> entry : treeMap.entrySet()) {
	    		for (int i = 0; i < entry.getValue(); i++) {
	    			sb.append(entry.getKey());
				}
			}
	    	System.out.println(sb.toString());
     }  
  }   
}
    		  
               
       
   
 