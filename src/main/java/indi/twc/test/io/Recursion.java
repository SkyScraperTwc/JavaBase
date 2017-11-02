package indi.twc.test.io;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) throws Exception {
		Scanner scan = new  Scanner(System.in);
		System.out.println("------");
		double n = scan.nextLong();
		double sum = f2(n);
        System.out.println(sum);
	}
   public static double f1(double n) throws Exception{
	   		if(n<1){
	   			throw new Exception("-------");
	   		}else if(n==1){
	   			return 1; 
	   		}else if(n>1){
	   			  return n*f1(n-1);
	   		}
			return 0;
	   
   }
   public static double f2 (double n) throws Exception{
	   	if(n==1 || n==2){
	   		return 1;
	   	}else{
	   		return f2(n-1)+f2(n-2);
	   	}
   }
	
}
