package indi.twc.test.algorithm.huawei.package0;
 
import java.util.TreeSet;

public class treeSet{    
    
     public static void main(String args[]){    
    	 TreeSet<A1> treeSet = new TreeSet<A1>(); 
    	 A1 a1 = new A1();System.out.println("a1----"+a1.hashCode());
    	 A1 a2 = new A1();System.out.println("a2----"+a2.hashCode());
    	 A1 a3 = new A1();System.out.println("a3----"+a3.hashCode());
    	 A1 a4 = new A1();System.out.println("a4----"+a4.hashCode());
    	 
    	 treeSet.add(a1); 
    	 treeSet.add(a2);      
    	 treeSet.add(a3); 
    	 treeSet.add(a4);     
    	 //TreeSet是有序的     
     	 for (A1 a : treeSet) {  
			System.out.println(a.hashCode());  
		}
    	 }    
  }

class A1 implements Comparable{

   @Override
   public int compareTo(Object o) {
       int a;
       if(this.hashCode()<o.hashCode()){
           a = 1;
       }else{
           a = -1;
       }
       return a;
   }

}