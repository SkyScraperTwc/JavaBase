package indi.twc.test.algorithm.huawei.package3;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 查找兄弟单词
 * @author Administrator 
 *
 */ 
public class Main2{ 
    
     public static void main(String args[]){   
    	 Scanner scan  = new Scanner(System.in);
    	 while(scan.hasNext()){
    		int total = scan.nextInt(); 
    		String s[] = new String[total];
    		for (int i = 0; i < total; i++) { 
				s[i] = scan.next();  
			}  
//    		System.out.println(Arrays.toString(s));
    		
    		String tgStr = scan.next();
    		int index = scan.nextInt();   
    		
//    		System.out.println(tgStr); 
//    		System.out.println(index);  
    		
    		int cnt = 0; 
    		List<Character> cpList = new ArrayList<Character>();
    		List<Character> tgList = new ArrayList<Character>();
    		List<String> broList = new ArrayList<String>();
    		
    		for (int i = 0; i < tgStr.length(); i++) {
    			tgList.add(tgStr.charAt(i));
			} 
    		Collections.sort(tgList); 
    		 
    		for (int i = 0; i < s.length; i++) {
    			if(s[i].equals(tgStr)){
    				continue;
    			}  
				for (int j = 0; j < s[i].length(); j++) {
					cpList.add(s[i].charAt(j)); 
				}
				Collections.sort(cpList);
				if(cpList.equals(tgList)){
					broList.add(s[i]);
					cnt++; 
				}
				cpList.clear();
			} 
    		System.out.println(cnt);   
    		
    		Collections.sort(broList);  
    		if(broList!=null && broList.size()>0 && broList.size()>=index && index>=1){
    				String outStr = broList.get(index-1); 
    				System.out.println(outStr);
    		}
    	 }  
     }
    		  
 } 
               
      
   
 