package indi.twc.test.thread;

public class TestSynchronized1 {
	public static void main(String[] args){
		SyncThread1 st1 = new SyncThread1();
		  
		Thread thread1 = new Thread(st1, "SyncThread---1");
		Thread thread2 = new Thread(st1, "SyncThread---2");
		
		thread1.start();
		thread2.start();
	}
}

class SyncThread1 implements Runnable {
//	@Override
//	public void run() {
//		 for (int i = 0; i < 500; i++) {
//				System.out.println(Thread.currentThread().getName()+"---------"+i);
//		  }
//	}
	private int ticket = 100;

	@Override
	public void run() {
		while (ticket>0){
			ticket--;
			System.out.println(Thread.currentThread().getName()+"----------"+ticket);
		}
	}
}


