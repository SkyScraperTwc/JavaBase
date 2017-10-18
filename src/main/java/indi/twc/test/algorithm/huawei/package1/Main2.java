package indi.twc.test.algorithm.huawei.package1;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2{ 
    
	public static void main(String args[]){  
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			long input = scan.nextLong();
			getResult(input);
		}
     }      
            
	public static String getResult(long ulDataInput){
		List list = new ArrayList<Integer>();
		while(ulDataInput!=1){ 
			for (int i = 2; i <= ulDataInput; i++) {
				if(ulDataInput%i==0){
					list.add(i);
					ulDataInput = ulDataInput/i;
					break;
				}
			}
		}
		String s = "";
		for (Object object : list) {
			s = s + object + " ";
		}
		System.out.println(s);
		return null; 
     } 
} 
      
   
 