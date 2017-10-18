package indi.twc.test.algorithm.huawei.package2;
 
import java.util.Scanner;

/**
 * �?��密码破解
 * @author Administrator
 *
 */
public class Main7{ 
    
     public static void main(String args[]){  
    	 Scanner scan = new Scanner(System.in);
	    	 while(scan.hasNext()){
	    		 String s = scan.nextLine();
	    		 String str = "";
	    		 for (int i = 0; i < s.length(); i++) {
					char c = s.charAt(i);
					
					if(c>='A' && c<='Z'){ 
						char c1 = (char) (c + 32 + 1);
						if(c1=='{'){
							c1 = 'a';
						}
						str = str + c1;
					}
					
					if(c>='a' && c<='c'){
						str = str + "2";
					}
					if(c>='d' && c<='f'){ 
						str = str + "3";
					}
					if(c>='g' && c<='i'){
						str = str + "4";
					}
					if(c>='j' && c<='l'){
						str = str + "5";
					}
					if(c>='m' && c<='o'){
						str = str + "6";
					}
					if(c>='p' && c<='s'){
						str = str + "7";
					}
					if(c>='t' && c<='v'){
						str = str + "8";
					}
					if(c>='w' && c<='z'){
						str = str + "9";
					}
					
					if(c>='0' && c<='9'){
						str = str + c;
					}
					
				}
	    		 System.out.println(str);
	    		 
	    	 }
    	 }
 } 
             
     
   
