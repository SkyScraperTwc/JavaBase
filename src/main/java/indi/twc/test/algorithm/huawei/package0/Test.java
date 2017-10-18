package indi.twc.test.algorithm.huawei.package0;
 
import java.util.ArrayList;
import java.util.Collections;

public class Test{ 
    
     public static void main(String args[]){  
//    	 ListNode listNode = null;
//    	 System.out.println( printListFromTailToHead(listNode));

    	 ListNode head = new ListNode(0); 
    	 ListNode node = new ListNode(1);  
    	 head.next = node; 
    	 for (int i = 1; i < 10 ; i++) {
    		 ListNode tail = new ListNode(i);  
    		 node.next = tail; 
    		 node = tail;  
		}
    	 
    	 ListNode print = head;
    	 while(print!=null){
    		 System.out.println(print.val);
    		 print = print.next;
    		 
    	 } 
    	 
     }    
        
      /**
       * 
       * @param listNode
       * @return
       * 
       * 	   
       *  public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
	    	ArrayList<Integer> result = new ArrayList<Integer>();
	    	if(listNode==null){
	    		return result;  
	    	}
	    	while(listNode.next!=null){ 
	    		result.add(listNode.val);
	    		listNode = listNode.next;  
	    		if(listNode.next==null){
	    			result.add(listNode.val);
	    		}
	    	}
	    	Collections.reverse(result);// 将ArrayLista中的元素进行倒序
			return result;
	    }
       */
     public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
	    	ArrayList<Integer> result = new ArrayList<Integer>();
	    	if(listNode==null){
	    		return result;  
	    	}
	    	while(listNode.next!=null){ 
	    		result.add(listNode.val);
	    		listNode = listNode.next;  
	    		if(listNode.next==null){ 
	    			result.add(listNode.val);
	    		}
	    	}
	    	Collections.reverse(result);// 将ArrayLista中的元素进行倒序
			return result;
	    }
     
	}

class ListNode {
    int val;
   ListNode next = null; 
    ListNode(int val) {
        this.val = val;
    } 
}
