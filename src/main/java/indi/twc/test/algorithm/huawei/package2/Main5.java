package indi.twc.test.algorithm.huawei.package2;
 
import java.util.Scanner;

public class Main5{ 
    
     public static void main(String args[]){  
    	 Scanner scan = new Scanner(System.in);
    	 while(scan.hasNext()){
    		 String str = scan.nextLine();
    		 
    		 String s[] = str.split(";");
    		 int x=0,y=0;
    		 for (int i = 0; i < s.length; i++) {
    			 //判断�?
    			 if(s[i].length()==3){ 
    				 char char1 = s[i].charAt(0); 
    				 char char2 = s[i].charAt(1);
    				 char char3 = s[i].charAt(2); 
      				 
    				 if((char2<='9' && char2>='0') || (char3<='9' && char3>='0')){
    					 char[] stepNum = {char2,char3};
    					 String sn = new String(stepNum);
    					 Integer snInt = Integer.valueOf(sn);
    					 
    					 switch (char1) { 
    					 case (char)'A':
    						 x = x-snInt;
    						 break; 
    					 case 'D':
    						 x = x+snInt;
    						 break; 
    					 case 'W':
    						 y = y+snInt;
    						 break;  
    					 case 'S':
    						 y = y-snInt; 
    						 break; 
    						 default:break;
    					 }
    					 
    				 }
    				  
    			 }
    			 
    			 if(s[i].length()==2){
    				 char char1 = s[i].charAt(0); 
    				 char char2 = s[i].charAt(1);
      				 
    				 if((char2<='9' && char2>='0')){
    					 Integer snInt = Integer.valueOf(char2);
    					 
    					 switch (char1) { 
    					 case 'A':
    						 x = x-snInt;
    						 break; 
    					 case 'D':
    						 x = x+snInt;
    						 break; 
    					 case 'W':
    						 y = y+snInt;
    						 break;  
    					 case 'S':
    						 y = y-snInt; 
    						 break; 
    					 default:break;
    					 }
    				 }
    			 }
    			 
    			 System.out.println(s[i]);
			}
    		 System.out.println(x+","+y);
    	 }
     } 

}
             
     
   
