package indi.twc.test.thread;

public class ThreadTest {
	public static void main(String[] args){
		MyThread thread1 = new MyThread("MyThread---1");
		MyThread thread2 = new MyThread("MyThread---2");
		
		thread1.start();
		thread2.start();
	}
}

class MyThread extends Thread {
	private Object lock = new Object();

	public MyThread(String name) {
		super(name);
	}

	@Override
   public void run() {
		synchronized (lock){
			for (int i = 0; i < 50; i++) {
				System.out.println(Thread.currentThread().getName()+"---------"+i);
			}
		}
   }
}


