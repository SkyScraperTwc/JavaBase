package indi.twc.test.algorithm.huawei.package2;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main4{ 
    
     public static void main(String args[]){  
    	 Scanner scan = new Scanner(System.in);
    	 TreeSet<String> treeSet = new TreeSet<String>(); 
    	 List<String> list = new ArrayList<String>();
    	 
    	 while(scan.hasNext()){
    		 int num = scan.nextInt()+1;
    		 for (int i = 0; i < num; i++) {
    			 String s = scan.nextLine(); 
    			 if(treeSet.contains(s)){
    				 list.add(s);
    				 continue;
    			 }
    			 treeSet.add(s); 
			} 
    		 treeSet.remove("");
    		 for (String string : treeSet) {
				System.out.println(string); 
				
				for (String s : list) {
					if(s.equals(string)){
						System.out.println(s);
					}
				}
			}
    	 }
     } 

}
             
     
   
