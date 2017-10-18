package indi.twc.test.algorithm.huawei.package2;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2{  
    
     public static void main(String args[]){  
         Scanner sc=new Scanner(System.in);
         while(sc.hasNext()){
        	 String s = sc.nextLine();
        	 List<Character> list = new ArrayList<Character>();
        	 for (int i = s.length()-1; i>=0; i--) {
				if(list.contains(s.charAt(i))){
				    continue;	
				}  
				  list.add(s.charAt(i)); 
			}
        	 String str = "";
        	 for (int i = 0; i < list.size(); i++) {
        		 str = str + list.get(i);
			}
        	 System.out.println(str);
         }
     }

}
             
     
   
