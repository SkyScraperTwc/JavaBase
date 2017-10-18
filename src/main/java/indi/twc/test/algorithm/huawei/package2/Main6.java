package indi.twc.test.algorithm.huawei.package2;
 
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main6{ 
    
     public static void main(String args[]){  
    	 Scanner scan = new Scanner(System.in);
    	 
    	 while(scan.hasNext()){
    		 String str = scan.nextLine(); 
    		 if(checkRepeat(str) && checkLength(str) && checkSymbol(str)){
    			 System.out.println("OK");
    		 }else{
    			 System.out.println("NG");
    		 }
    	 }  
     }
     
    			 
     //判断有无相同长度�?的子串重�?
     public static boolean checkRepeat(String str){
    	 for (int i = 0; i < str.length()-2; i++) {
			String HeadStr = str.substring(i, i+3);
			String tailStr = str.substring(i+3, str.length());
			
			if(tailStr.contains(HeadStr)){
				return false;
			}
//			if(tailStr.length()<3){
//				return true;
//			}
		} 
		return true; 
     }
      
     public static boolean checkLength(String str){
    	 if(str.length()>8){
    		 return true;
    	 }else{
    		 return false; 
    	 }
     }
     
     public static boolean checkSymbol(String str){
    	 Map<String,Integer> map = new HashMap<String,Integer>();
    	 
    	 for (int i = 0; i < str.length(); i++) {
			 int cn = str.charAt(i);
			 
			 if(cn>=48 && cn<=57){
				 map.put("number", 1);
			 } 
			 
			 if(cn>=97 && cn<=122){
				 map.put("low", 1);
			 }
			 
			 if(cn>=65 && cn<=90){
				 map.put("up", 1);
			 }
			 
			 if(cn<=47 || (cn>=58 && cn<=64) || (cn>=91 && cn<=96) || cn>=123){
				 map.put("symbol", 1);
			 }
		 }
    	  
    	 if(map.size()>=3){
    		 return true;
    	 }else{
    		 return false; 
    	 }
     }
}
             
     
   
