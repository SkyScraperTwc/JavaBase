package indi.twc.test.algorithm.huawei.package3;
 
import java.util.Scanner;

/**
 * 整数与IP地址间的转换
 * @author Administrator 
 *
 */ 
public class Main8{  
     
     public static void main(String args[]){    
    	 Scanner scan = new Scanner(System.in);
    	 while(scan.hasNext()){
    		 String s1 = scan.nextLine();
    		 long l2 = scan.nextInt();
    		 handleS1(s1); 
    		 handleS2(l2); 
    	 } 
    	 
     } 
     
	public static void handleS1(String s1) {
		String[] arrayStr = s1.split("\\."); 
		StringBuffer sb = new StringBuffer("");
		for (int i = 0; i < arrayStr.length; i++) {
			int at = Integer.valueOf(arrayStr[i]); 
			String s = Integer.toBinaryString(at);  
			if(s.length()<8){
				StringBuffer adds = new StringBuffer("");
				for (int j = 0; j < 8-s.length(); j++) {
					adds.append("0");
				}
				s = adds.append(s).toString();
			}
			sb.append(s);  
		}
		long total = 0;
		for (int i = 0; i<sb.length(); i++) {
			int num = Integer.valueOf(String.valueOf(sb.charAt(31-i)));
			total = (long) (total + num*Math.pow(2,i));
		}
		System.out.println(total);
	} 
	 
	private static void handleS2(Long l2) {
		String s2 = Long.toBinaryString(l2);
		if(s2.length()<32){
			StringBuffer adds = new StringBuffer("");
			for (int j = 0; j < 32-s2.length(); j++) {
				adds.append("0");
			}
			s2 = adds.append(s2).toString();
		}
		String[] arrayStr = new String[4];
		for (int i = 0; i < arrayStr.length; i++) {
			arrayStr[i] = s2.substring(8*i,8*(i+1));
		}
		
		StringBuffer out = new StringBuffer("");
		for (int i = 0; i < arrayStr.length; i++) {
			int total = 0;
			for (int j = 0; j<8; j++) {
				int num = Integer.valueOf(String.valueOf(arrayStr[i].charAt(7-j)));
				total = (int) (total + num*Math.pow(2,j)); 
			}
			if(i==3){
				out.append(String.valueOf(total));
			}else{
				out.append(String.valueOf(total)+".");
			}
		}
		System.out.println(out.toString());
	}
 } 
    		  
               
       
   
 