package indi.twc.test.thread;

public class VolatileTest {
    public static void main(String[] args) {
        VolatileRunnable volatileRunnable = new VolatileRunnable();
        Thread thread = new Thread(volatileRunnable);
        Thread thread2 = new Thread(volatileRunnable);
        thread.start();
        thread2.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //结果不一定是200000
        System.out.println(VolatileRunnable.count);
    }
}


class VolatileRunnable implements Runnable {
    public volatile static int count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            count++;
        }
    }
}
