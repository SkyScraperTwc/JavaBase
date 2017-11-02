package indi.twc.test.other;

public class ExtendsTest{
    
     public static void main(String args[]){   
    	 Super s = new SuperClass();
    	 System.out.println(1/0);
    	 }   
    	 
  }

class Super{
	final int i;
	public Super() {
		i = 3; 
		int j;
		System.out.println("Super constructor");
	}
	 
	public int f(){
		System.out.println("Super"); 
		return 0;
		  
	}  
}

class SuperClass extends Super{ 
	public SuperClass() {
		super();
		System.out.println("SuperClass constructor");
	}
	
	public int f(){
		System.out.println("SuperClass");
		return 0;
	} 
}
      