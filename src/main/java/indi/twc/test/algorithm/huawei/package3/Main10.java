package indi.twc.test.algorithm.huawei.package3;
 
import java.util.Scanner;

/**
 * 蛇形矩阵
 * @author Administrator 
 *
 */ 
public class Main10{  
     
     public static void main(String args[]){    
    	 Scanner scan = new Scanner(System.in);
    	 while(scan.hasNext()){
    		 int N = scan.nextInt(); 
    		 int num=1;
    		 int num2 = 1;
    		 int a[][] = new int[N][N];
    		 for (int i = 0; i < a.length; i++) { 
    			num2 = i+num2;
    			num = num2;
				for (int j = 0; j < a.length-i; j++) {
					 a[i][j] = num;
					 num = num + j + 2 + i;
				} 
			}
    		 for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					if(a[i][j]!=0){
						if(i+j!=N-1){
							System.out.print(String.valueOf(a[i][j])+" ");
						}else{
							System.out.print(String.valueOf(a[i][j]));
						}
					}
				}
				System.out.println();
			}
     }  
  }   
}
    		  
               
       
   
 