/**
 * 
 */
package indi.twc.test.thread;

/**
 * @author TanWC
 *
 */
public class TestSleep {
	public static void main(String[] args) {
		MyThread5 th1 = new MyThread5();
		
		th1.start();
	}
}

class MyThread5 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+"--------"+i);
			
		}
	}
 }
	
