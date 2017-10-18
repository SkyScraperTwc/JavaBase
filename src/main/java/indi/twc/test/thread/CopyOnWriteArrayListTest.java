package indi.twc.test.thread;
import java.util.concurrent.*;
import java.util.ArrayList;
import java.util.List;

public class CopyOnWriteArrayListTest {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		CopyOnWriteArrayList<Integer> copyList = new CopyOnWriteArrayList<Integer>(list);
		
		ReadThread readThread = new ReadThread(copyList);
		WriteThread writeThread = new WriteThread(copyList);
		
		Thread thread1 = new Thread(readThread, "readThread-----");
		Thread thread2 = new Thread(writeThread, "writeThread-----");
		
		thread1.start();
		thread2.start();
	}
}
class ReadThread implements Runnable {
    private List<Integer> list;

    public ReadThread(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (Integer ele : list) {
            System.out.println("ReadThread-----------:"+list.hashCode()+"------"+ele);
            System.out.println();
        }
    }
}
class WriteThread implements Runnable {
    private List<Integer> list;

    public WriteThread(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
    	for (int i = 4; i < 30; i++) {
    		list.add(i);
    		System.out.println(list);
		}
    }
}

