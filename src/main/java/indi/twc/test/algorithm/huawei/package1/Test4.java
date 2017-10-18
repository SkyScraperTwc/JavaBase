package indi.twc.test.algorithm.huawei.package1;

public class Test4{
     public static void main(String args[]) 
    		 	throws ClassNotFoundException, InstantiationException, IllegalAccessException{  
    	 
    	  A a11 = new A();  
    	  System.out.println("-----------");
    	  A a22 = new A();  
     }      
                  
  }

class A { 
	public static int i;
	
	public int j; 
	 
	static{ 
		System.out.println(i);  
	}
	
	{
		System.out.println(j); 
	}
	
	public A(){  
		
	} 
	 
	public void run(){
		 System.out.println("run...");
	}
} 
 
 
