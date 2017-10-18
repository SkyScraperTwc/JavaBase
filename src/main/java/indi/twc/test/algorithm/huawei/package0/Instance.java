package indi.twc.test.algorithm.huawei.package0;

public class Instance{
    
     public static void main(String args[]){    
    	 C c1 = C.getInstance();
    	 System.out.println(c1);
    	 
    	 C c2 = C.getInstance();
    	 System.out.println(c2);
    	 
    	 C c3 = C.getInstance();
    	 System.out.println(c3);
     }  
}


class C{
	private C() {
	}
	
	private static C c = new C();
	
	public static C getInstance() {
		return c;
	}
}