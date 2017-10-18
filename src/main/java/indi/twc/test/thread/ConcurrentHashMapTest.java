package indi.twc.test.thread;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2017/6/5 0005.
 */
public class ConcurrentHashMapTest {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<String, String>();
        concurrentHashMap.put("A", "123");

        ReadThread3 readThread = new ReadThread3(concurrentHashMap);
        WriteThread3 writeThread = new WriteThread3(concurrentHashMap);

        Thread thread1 = new Thread(readThread, "readThread-----");
        Thread thread2 = new Thread(writeThread, "writeThread-----");

        thread1.start();
        thread2.start();
    }
}

class ReadThread3 implements Runnable {
    private ConcurrentHashMap<String, String> concurrentHashMap;

    public ReadThread3(ConcurrentHashMap<String, String> concurrentHashMap) {
        this.concurrentHashMap = concurrentHashMap;
    }

    @Override
    public void run() {
        concurrentHashMap.put("A", "456");
        for (int i=0;i<10000;i++){
            System.out.println("--------------------");
        }
        System.out.println(concurrentHashMap);
    }
}
class WriteThread3 implements Runnable {
    private ConcurrentHashMap<String, String> concurrentHashMap;

    public WriteThread3(ConcurrentHashMap<String, String> concurrentHashMap) {
        this.concurrentHashMap = concurrentHashMap;
    }

    @Override
    public void run() {
        for (int i=0;i<10000;i++){
            System.out.println("*************");
        }
        concurrentHashMap.put("A", "789");
    }
}

