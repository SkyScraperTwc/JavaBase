package indi.twc.test.collection;
 
import java.util.HashMap;


public class HashSetTest{
    
     public static void main(String args[]){   
    	 HashMap<A,Integer> hashMap = new HashMap<A,Integer>();
    	 A a1 = new A(1);
    	 A a2 = new A(1);
    	 A a3 = new A(3);
    	 A a4 = new A(4); 
    	 hashMap.put(a1,0);
    	 hashMap.put(a2,0);
    	 hashMap.put(a3,0); 
    	 hashMap.put(a4,0);
    	 System.out.println(hashMap); 
    	 
      }       
   }

class A{   
	   
	private Integer id;   
	        
	public A(Integer id ) { 
		this.id = id;        
	}     
	    
	@Override  
	public String toString() {     
		return String.valueOf(id); 
	}   
	    
	@Override
	public boolean equals(Object obj) { 
		A it = (A)obj;
		if(it.id.equals(this.id)) {
			return true;
		}
		else {
			return false;
		}
	}
//	@Override    
//	public int hashCode() {  
//		
//		return id.hashCode();
//	} 
	 
}