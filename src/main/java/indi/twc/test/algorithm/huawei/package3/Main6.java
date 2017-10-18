package indi.twc.test.algorithm.huawei.package3;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *单词倒排
 * @author Administrator  
 *
 */  
public class Main6{ 
    
     public static void main(String args[]){   
    	 Scanner scan  = new Scanner(System.in);
    	 while(scan.hasNext()){
    	 String str = scan.nextLine();
    	 char[] ch = str.toCharArray();
    	 List<String> list = new ArrayList<String>();
    	 StringBuffer sb= new StringBuffer();
    	  
    	 for (int i = 0; i < ch.length; i++) {
			if(('a'<=ch[i] && ch[i]<='z') || ('A'<=ch[i] && ch[i]<='Z')){
				sb.append(ch[i]);	 
			}else{ 
				list.add(sb.toString());
				sb.delete(0, sb.length());//清空  
			} 
		}
    	 list.add(sb.toString()); 
    	 
    	 for (int i = list.size()-1; i >=2; i--) { 
			 System.out.print(list.get(i)+" ");
		}
    	 if(list.get(0).length()==0){
    		 System.out.print(list.get(1));
    	 }else{
    		 System.out.println(list.get(1)+" "+list.get(0));
    	 }
    	 
      }
    	 
   }
 }
    		 
               
      
   
 