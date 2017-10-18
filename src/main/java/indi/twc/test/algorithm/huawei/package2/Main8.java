package indi.twc.test.algorithm.huawei.package2;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 汽水�?
 * @author Administrator 
 *
 */
public class Main8{ 
    
     public static void main(String args[]){  
    	 Scanner scan = new Scanner(System.in);
	    	 while(scan.hasNext()){
	    		
	    		 List list = new ArrayList<Integer>();
	    		 while(true){
	    			 int number = scan.nextInt();
	    			 if(number==0){
	    				 break;
	    			 }
	    			 
	    			 if(number==1){
	    				 list.add(0);
	    			 }
	    			 //处理
	    			 if(number%2!=0){
	    				 list.add((number-1)/2);
	    			 }else{
	    				 list.add(number/2);
	    			 }
				} 
	    		 for (Object object : list) {
					System.out.println(object);
				}
	    		 
	    	 } 
    	 }
    		 
 } 
              
     
   
 