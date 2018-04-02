package indi.twc.test.thread;

public class ThreadTest {
	public static void main(String[] args){
		A a = new A();
		Runnable runnable = new MyThread(a);
		Runnable runnable2 = new MyThread2(a);
		new Thread(runnable,"thread----1").start();
		new Thread(runnable2,"thread----2").start();
	}
}

class MyThread implements Runnable {
	private A a;

	public MyThread(A a) {
		this.a = a;
	}
	@Override
	public void run() {
		a.fun();
	}
}

class MyThread2 implements Runnable {
	private A a;

	public MyThread2(A a) {
		this.a = a;
	}
	@Override
	public void run() {
		a.fun2();
	}
}

class A {
	public synchronized void fun() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("fun---"+Thread.currentThread().getName()+"---------"+i);
		}
	}
	public static synchronized void fun2() {
		for (int i = 1; i <= 100; i++) {
			System.out.println("fun2---"+Thread.currentThread().getName()+"---------"+i);
		}
	}
}