package indi.twc.test.collection;
import java.util.HashMap;

public class UnSafeHashMapTest {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("A", "123");
		
		ReadThread2 readThread = new ReadThread2(hashMap);
		WriteThread2 writeThread = new WriteThread2(hashMap);
		
		Thread thread1 = new Thread(readThread, "readThread-----");
		Thread thread2 = new Thread(writeThread, "writeThread-----");
		
		thread1.start();
		thread2.start();
	}
}

class ReadThread2 implements Runnable {
    private HashMap<String, String> hashMap;

    public ReadThread2(HashMap<String, String> hashMap) {
        this.hashMap = hashMap;
    }

    @Override
    public void run() {
        hashMap.put("A", "456");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(hashMap);
    }
}
class WriteThread2 implements Runnable {
    private HashMap<String, String> hashMap;

    public WriteThread2(HashMap<String, String> hashMap) {
        this.hashMap = hashMap;
    }

    @Override
    public void run() {
            hashMap.put("A", "789");
    }
}

