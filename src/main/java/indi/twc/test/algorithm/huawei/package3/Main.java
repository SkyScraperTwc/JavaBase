package indi.twc.test.algorithm.huawei.package3;
 
import java.util.Scanner;

/**
 * 字符串排�?
 * @author Administrator 
 *
 */
public class Main{ 
    
     public static void main(String args[]){   
          Scanner scan = new Scanner(System.in);
          while(scan.hasNext()){
        	  String str = scan.nextLine();
        	  char ch[] = str.toCharArray(); 
        	  StringBuffer sb = new StringBuffer();
        	  
           for (int i = 0; i < 26; i++) {
        	  for (int j = 0; j < ch.length; j++) {
        			  if(ch[j]=='A'+i || ch[j]=='a'+i){
        				  sb.append(ch[j]);
        			  } 
        		  }    
			}
           
          for (int i = 0; i < ch.length; i++) {
        	  if(!(ch[i]>='A'&&ch[i]<='Z') && !(ch[i]>='a'&&ch[i] <='z')){
        		  sb.insert(i, ch[i]);
        	  }
		}
            
        	 System.out.println(sb);
         }
     }
    		  
 } 
               
      
   
 