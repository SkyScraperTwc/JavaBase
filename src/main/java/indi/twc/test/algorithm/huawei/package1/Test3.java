package indi.twc.test.algorithm.huawei.package1;


public class Test3{ 
    
     public static void main(String args[]){  
    	 System.out.println(mySum(3));
     }     
            
     static int mySum(int n){ 
    	  int up = 1;
    	  int down = 1; 
    	  for(int i=n+1;i<=2*n;i++){ 
    		  up = up*i;  
    	  }
    	  for(int i=1;i<=n;i++){
    		  down = down*i;    
    	  }
		return up/down;
    	  
     }
   }
     
  
