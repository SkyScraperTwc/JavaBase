package indi.twc.test.algorithm.huawei.package3;
 
import java.util.Arrays;
import java.util.Scanner;

/**
 * 字符串合并处�?
 * @author Administrator 
 *
 */ 
public class Main5{ 
    
     public static void main(String args[]){   
    	 Scanner scan  = new Scanner(System.in);
    	 while(scan.hasNext()){
    		 String str1 = scan.next();
    		 String str2 = scan.next(); 
    		 
    		 StringBuffer sb = new StringBuffer(str1+str2); 
    		 StringBuffer sb1 = new StringBuffer();
    		 StringBuffer sb2 = new StringBuffer(); 
    		  
    		 for (int i = 0; i < sb.length(); i++) {
    			 //
    			 if(i%2==0){ 
    				 sb1.append(sb.charAt(i));
    			 }else{
    				 sb2.append(sb.charAt(i));
    			 } 
			}  
    		 char[] ch1 = sb1.toString().toCharArray();
    		 char[] ch2 = sb2.toString().toCharArray();
    		 Arrays.sort(ch1);
    		 Arrays.sort(ch2);
    		 
    		 StringBuffer sortStr = new StringBuffer(); 
    		 for (int i = 0; i < sb.length()/2+1; i++) {
    			 if(i<ch1.length){
    				 sortStr.append(ch1[i]); 
    			 }
    			 if(i<ch2.length){
    				 sortStr.append(ch2[i]);
    			 }
			}
//    		 System.out.println(sortStr);  
    		 StringBuffer result = new StringBuffer();
    		 for (int i = 0; i < sortStr.length(); i++) {
    			 result.append(bit_reverse(sortStr.charAt(i)));
			}
    		    System.out.println(result);
    	 } 
    	 
     }
     
     public static char bit_reverse(char c){
    	    switch(c){
    	        case '0': c = '0'; break;
    	        case '1': c = '8'; break;
    	        case '2': c = '4'; break;
    	        case '3': c = 'C'; break;
    	        case '4': c = '2'; break;
    	        case '5': c = 'A'; break;
    	        case '6': c = '6'; break;
    	        case'7':c = 'E'; break;
    	        case'8':c = '1'; break; 
    	        case'9':c = '9'; break;
    	        case 'a':c = '5'; break;
    	        case('b'): c = 'D'; break;
    	        case('c'):c = '3'; break;
    	        case('d'):c = 'B'; break;
    	        case('e'):c = '7'; break;
    	        case('f'):c = 'F'; break;
    	        case('A'):c = '5'; break;
    	        case('B'):c = 'D'; break; 
    	        case('C'):c = '3'; break; 
    	        case('D'):c = 'B'; break;
    	        case('E'):c = '7'; break;
    	        case('F'):c = 'F'; break;
    	        default:break;
    	    }
    	    return c;
    	}
 }
    		 
               
      
   
 