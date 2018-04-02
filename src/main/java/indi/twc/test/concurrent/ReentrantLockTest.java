package indi.twc.test.concurrent;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {

    public static void main(String[] args) {
//        RunnableA runnableA = new RunnableA(new ReentrantLock());
//        new Thread(runnableA).start();
//        new Thread(runnableA).start();

        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        RunnableB runnableB = new RunnableB(lock, condition);
        RunnableC runnableC = new RunnableC(lock, condition);
        new Thread(runnableB).start();
        new Thread(runnableC).start();

    }

}

class RunnableA implements Runnable {

    private ReentrantLock lock;

    public RunnableA(ReentrantLock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName()+"----"+i);
        }
        lock.unlock();
    }
}

class RunnableB implements Runnable {

    private ReentrantLock lock;

    private Condition condition;

    public RunnableB(ReentrantLock lock, Condition condition) {
        this.lock = lock;
        this.condition = condition;
    }

    @Override
    public void run() {
        lock.lock();
        System.out.println("开始wait");
        try {
            for (int i = 1; i <= 100; i++) {
                System.out.println(Thread.currentThread().getName()+"----"+i);
                if (i == 50) {
                    condition.await();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}

class RunnableC implements Runnable {

    private ReentrantLock lock;

    private Condition condition;

    public RunnableC(ReentrantLock lock, Condition condition) {
        this.lock = lock;
        this.condition = condition;
    }

    @Override
    public void run() {
        lock.lock();
        try {
            for (int i = 1; i <= 100; i++) {
                System.out.println(Thread.currentThread().getName()+"----"+i);
                if (i == 50) {
                    condition.signal();
                }
            }
        } finally {
            lock.unlock();
        }

    }
}
