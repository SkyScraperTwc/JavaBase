package indi.twc.test.algorithm.huawei.package1;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{ 
    
     public static void main(String args[]){  
    	 Scanner scan = new Scanner(System.in);
    	 while(scan.hasNext()){
    		 String str1 = scan.nextLine();
    		 String str2 = scan.nextLine();
    		 handle(str1,str2);
    	 }
     }     
            
     public static void handle(String str1 , String str2){
    	 List<String> list = new ArrayList<String>();
    	 String reg[] = {str1 ,str2};
    	 for (int i = 0; i < reg.length; i++) {
    		 String zeroStr = "";
    		 String newStr1 = ""; 
    		 if(reg[i] .length()<8){
    			 for (int j = 0; j < 8-reg[i] .length(); j++) {
    				 zeroStr = zeroStr.concat("0");
    			 }   
    			 newStr1 = reg[i].concat(zeroStr); 
    			 list.add(newStr1); 
    		 }else{
    			 for (int n = 0; n < reg[i] .length()/8+1; n++) {
    				 if((n+1)*8>=reg[i] .length()){ 
    					 
    					 newStr1 = reg[i] .substring(n*8,reg[i] .length());
    					 
    					 for (int j = 0; j < 8-(reg[i] .length()-n*8) ;j++) {
    						 zeroStr = zeroStr.concat("0");
    					 } 
    					 newStr1 = newStr1.concat(zeroStr);
    					 list.add(newStr1); 
    					 break; 
    				 }  
    				 newStr1 = reg[i] .substring(n*8, (n+1)*8);
    				 list.add(newStr1);
    			 }
    		 }
		}
    	 for (String string : list) {
			System.out.println(string);
		}
     } 
   }
     
   
