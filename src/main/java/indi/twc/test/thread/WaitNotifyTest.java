package indi.twc.test.thread;

public class WaitNotifyTest {

	public static void main(String[] args) {
		Thread1 th1 = new Thread1();
		Thread1 th2 = new Thread1();
		Thread2 th3 = new Thread2();
		
		th1.start();
		th2.start();
		th3.start();
	}

}

class Thread1 extends Thread{
	@Override
	public void run() {
		synchronized (Thread.class) {
			for (int i = 0; i < 10; i++) {
				System.out.println(getName() + "----->" + i);
				if (i == 5) {
						try {
							// ��Ҫ��synchronized�����һ��,�Ὣ�������ó���cpu�����ٵ�������ֱ�������̷߳�notify֪ͨ
							Thread.class.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						};
				}
				
			}

		}  
	}   
}

class Thread2 extends Thread {
	@Override 
	public void run() {  
		synchronized (Thread.class) {
			for (int i = 0; i < 10; i++) {
				System.out.println(getName() + "----->" + i);
				if (i == 5) {
						Thread.class.notify();//��Ҫ��synchronized�����һ��֪ͨ�����߳����ϻὫ���ų��������߳̿���������;
				}
				
			}

		}
	}
}	