package indi.twc.test.collection;

import java.util.LinkedList;
import java.util.Queue;
/**
 * LinkedList类实现了Queue接口，因此我们可以把LinkedList当成Queue来使用。。
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        //添加元素
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        for(String q : queue){
            System.out.println(q);
        }

        System.out.println("===");
        System.out.println("poll="+queue.poll()); //返回第一个元素，并在队列中删除
        for(String q : queue){
            System.out.println(q);
        }

        System.out.println("===");
        System.out.println("element="+queue.element()); //返回第一个元素
        for(String q : queue){
            System.out.println(q);
        }

        System.out.println("===");
        System.out.println("peek="+queue.peek()); //返回第一个元素
        for(String q : queue){
            System.out.println(q);
        }

        System.out.println("===");
        System.out.println("peek="+queue.remove()); //返回第一个元素
        for(String q : queue){
            System.out.println(q);
        }
    }
}
