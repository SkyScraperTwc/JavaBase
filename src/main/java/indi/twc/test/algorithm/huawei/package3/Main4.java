package indi.twc.test.algorithm.huawei.package3;
 
import java.util.Scanner;

/**
 * 字符串加解密
 * @author Administrator 
 *
 */ 
public class Main4{ 
    
     public static void main(String args[]){   
    	 Scanner scan  = new Scanner(System.in);
    	 while(scan.hasNext()){
    		 String password = scan.nextLine();
    		 Encrypt(password.toCharArray());
    		 
    		 String password2 = scan.nextLine();
    		 unEncrypt(password2.toCharArray());
		 }
     } 
     public static void Encrypt (char aucPassword[]){
    	  StringBuffer sb = new StringBuffer();
    	  for (int i = 0; i < aucPassword.length; i++) {
			if('A'<=aucPassword[i] && aucPassword[i]<='Z'){
				if(aucPassword[i]=='Z'){
					sb.append('a');
				}else{
					sb.append((char)(aucPassword[i]+1+32));
				}
				
			}
			
			if('a'<=aucPassword[i] && aucPassword[i]<='z'){
				if(aucPassword[i]=='z'){
					sb.append('A');
				}else{
					sb.append((char)(aucPassword[i]+1-32));
				}
			}
			
			if('0'<=aucPassword[i] && aucPassword[i]<='9'){
				if(aucPassword[i]=='9'){
					sb.append('0');
				}else{
					sb.append((char)(aucPassword[i]+1));
				}
			}
			 
		}
    	  System.out.println(sb.toString());
     }	  
     
     public static void unEncrypt(char result[]){
   	  StringBuffer sb = new StringBuffer();
   	  for (int i = 0; i < result.length; i++) { 
			if('A'<=result[i] && result[i]<='Z'){
				if(result[i]=='A'){
					sb.append('z');
				}else{
					sb.append((char)(result[i]-1+32));
				}
				
			}
			
			if('a'<=result[i] && result[i]<='z'){
				if(result[i]=='a'){
					sb.append('Z');
				}else{
					sb.append((char)(result[i]-1-32));
				}
			}
			 
			if('0'<=result[i] && result[i]<='9'){
				if(result[i]=='0'){
					sb.append('9');
				}else{
					sb.append((char)(result[i]-1));
				}
			}
			 
		}
   	     System.out.println(sb.toString());
    }	
}  
               
      
   
 