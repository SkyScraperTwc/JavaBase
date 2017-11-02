package indi.twc.test.collection;

/**
 * ArrayBlockingQueue是数组实现的线程安全的有界的阻塞队列
 * 线程安全是指，ArrayBlockingQueue内部通过“互斥锁”保护竞争资源，实现了多线程对竞争资源的互斥访问。而有界，则是指ArrayBlockingQueue对应的数组是有界限的。
 * 阻塞队列，是指多线程访问竞争资源时，当竞争资源已被某线程获取时，其它要获取该资源的线程需要阻塞等待；
 * 而且，ArrayBlockingQueue是按 FIFO（先进先出）原则对元素进行排序，元素都是从尾部插入到队列，从头部开始返回。
 */
public class BlockingQueueTest {
   public static void main(String[] args) {

   }
}
