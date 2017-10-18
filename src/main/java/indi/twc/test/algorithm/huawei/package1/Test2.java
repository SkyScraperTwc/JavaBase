package indi.twc.test.algorithm.huawei.package1;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test2{ 
    
     public static void main(String args[]){  
//    	 ReverseList(new ListNode(3));
    	 Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    	 
    	 
     }   
       
     public static ListNode ReverseList(ListNode head) {
    	 ArrayList<ListNode> list = new ArrayList<ListNode>();
    	 if(head==null){
    		 return null; 
    	 } 
    	 ListNode node = head;
    	 while(node!=null){ 
    		 list.add(node); 
    		 node = node.next;    
    	 }   
    	 Object[] ln = (Object[]) list.toArray(); 
    	 
    	 ListNode newHead = list.get(0);
    	 ListNode newNode = newHead; 
    	 for (int i = ln.length-1; i >0; i--) {
    		 newNode.next = (ListNode) ln[i]; 
    		 newNode = newNode.next;
		}  
    	 String str = "";
    	 return newHead; 
     }
}

class ListNode { 
    int val;
    ListNode next = null;

    ListNode(int val) { 
        this.val = val;
    }
}
