package indi.twc.test.concurrent;
 
import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationExceptionTest{ 
     public static void main(String args[]){   
    	   ArrayList<Integer> list = new ArrayList<Integer>();
           list.add(2);
           Iterator<Integer> iterator = list.iterator();
           synchronized (iterator) {
        	   while(iterator.hasNext()){
            	   Integer integer = iterator.next();
            	   if(integer==2){
                       iterator.remove();
                   }
               }
           }
     }    
  }     
 
       