package indi.twc.test.thread;

public class SynchronizedATest {
	public static void main(String[] args){
		SyncThreadA st1 = new SyncThreadA();
		  
		Thread thread1 = new Thread(st1, "SyncThread---1");
		Thread thread2 = new Thread(st1, "SyncThread---2");
		
		thread1.start();
		thread2.start();
	}
}

class SyncThreadA implements Runnable {
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


