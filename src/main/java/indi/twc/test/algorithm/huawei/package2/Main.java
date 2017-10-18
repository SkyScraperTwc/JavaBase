package indi.twc.test.algorithm.huawei.package2;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{ 
    
     public static void main(String args[]){  
         Scanner sc=new Scanner(System.in);
         while(sc.hasNext()){
        	  int num = sc.nextInt(); 
        	   //装载空字符串，必�?
        	  String nul = sc.nextLine();
        	  
        	  String str[] = new String[num];
        		for (int i = 0; i < num; i++) {  
        			str[i] = sc.nextLine();
				}
//        		System.out.println(Arrays.toString(str));
        		handle(str);	 
         }
     }
     
     public static void handle(String[] str){
    	//TreeMap按照key升序输出！！�?
    	 TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
    	 for (int i = 0; i < str.length; i++) { 
    		 String[] spt = str[i].split(" ");
    		 int key = Integer.valueOf(spt[0]);
    		 int value = Integer.valueOf(spt[1]);
	    		 if(treeMap.containsKey(key)){ 
	    			 int val = treeMap.get(key);
	    			 val = val + value; 
	    			 treeMap.put(key, val);
	    		 }else{
	    			 treeMap.put(key, value); 
	    		 }
		}
    	 for (Entry<Integer, Integer> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
     } 
}
             
     
   
