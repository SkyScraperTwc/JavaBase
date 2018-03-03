package indi.twc.test.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {
    public static void main(String[] args) throws InterruptedException {
        AtomicIntegerRunnable runnable = new AtomicIntegerRunnable();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
        Thread.sleep(15000);

        System.out.println("------------------------");
        System.out.println(AtomicIntegerRunnable.count.get());
    }
}

class AtomicIntegerRunnable implements Runnable {

//    public static int count = 0;

    public static AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        long begin = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(10);
                count.incrementAndGet();
                System.out.println(count);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }
}