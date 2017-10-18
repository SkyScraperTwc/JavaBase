package indi.twc.test.algorithm.huawei.package3;
 
import java.util.Scanner;

/**
 * 字符串运�?密码截取
 * @author Administrator 
 *
 */ 
public class Main7{ 
     
     public static void main(String args[]){    
    	 Scanner scan  = new Scanner(System.in);
    	 int max = 0;
    	 while(scan.hasNext()){ 
    		 String instr = scan.nextLine(); 
    		 String str = ""; 
    		 for (int i = 0; i < instr.length(); i++) { 
    			 for (int j = instr.length(); j >= i+1; j--) { 
    				   for (int k = i; k < j; k++) {
						str = str + instr.charAt(k);
					}
//    				 str = instr.substring(i, j);
    				 
    				 int length = testSymmetry(str); 
    				 str = "";
					 if(length>max){
						 max = length; 
						 break; 
					 } 
				}
			}   
    		 System.out.println(max); 
    		 
    	 } 
     } 
      
     public static int testSymmetry(String str){
    	int length = str.length(); 
    	//偶数 
    	if(length % 2==0){ 
    		char[] ch = str.toCharArray();
    		for (int i = 0; i <length/2; i++) {
				if(ch[i]==ch[length-1-i]){
					continue;
				}else{
					return 0; 
				}  
			} 
    	}
    	//奇数
    	if(length % 2!=0){
    		char[] ch = str.toCharArray();
    		for (int i = 0; i < length/2+1; i++) {
    			if(ch[i]==ch[length-1-i]){
					continue; 
				}else{
					return 0; 
				}  
			}
    	}  
		return length; 
     }
 }
    		  
               
      
   
 