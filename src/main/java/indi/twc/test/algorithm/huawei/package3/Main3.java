package indi.twc.test.algorithm.huawei.package3;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 素数伴侣
 * @author Administrator 
 *
 */ 
public class Main3{ 
    
     public static void main(String args[]){   
    	 Scanner scan  = new Scanner(System.in);
    	 while(scan.hasNext()){
    		int num = scan.nextInt(); 
    		List<Integer> list = new ArrayList<Integer>();
    		
    		for (int i = 0; i < num; i++) {
				list.add(scan.nextInt()); 
			} 
    		
    		int cnt = 0;
    		 
    		for (int i = 0; i < list.size(); i++) { 
				for (int j = i+1; j < list.size(); j++) { 
					//判断是否为素�?
					int jgNum = list.get(i)+list.get(j);
					int k;
					for (k = 2; k <= jgNum; k++) {
						if(jgNum%k==0) break;
					}
					 //是素�?
					 if(k!=jgNum){  
						 cnt++; 
						 break;
					 }
				}
			}
    	 }   
     }
    		  
 } 
               
      
   
 