package indi.twc.test.thread;

public class WaitNotifyTest {

	public static void main(String[] args) {
		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();

		th1.start();
		th2.start();
	}

}

class Thread1 extends Thread{
	@Override
	public void run() {
		synchronized (Thread.class) {
			for (int i = 1; i <= 100; i++) {
				System.out.println(getName() + "----->" + i);
				if (i == 50) {
					try {
						Thread.class.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}

		}  
	}   
}

class Thread2 extends Thread {
	@Override 
	public void run() {  
		synchronized (Thread.class) {
			for (int i = 1; i <= 100; i++) {
				System.out.println(getName() + "----->" + i);
				if (i == 50) {
					Thread.class.notify();
				}
				
			}

		}
	}
}	