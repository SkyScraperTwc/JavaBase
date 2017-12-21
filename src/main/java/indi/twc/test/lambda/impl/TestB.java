package indi.twc.test.lambda.impl;

public class TestB {
    public static void main(String[] args) {
        // 1.1使用匿名内部类
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world !");
            }
        });
        threadA.start();

        // 1.2使用 lambda expression
        Thread threadB = new Thread(()-> System.out.println("Hello world !"));
        threadB.start();

        // 2.1使用匿名内部类
        Runnable runnableA = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world !");
            }
        };

        // 2.2使用 lambda expression
        Runnable runnableB = () -> System.out.println("Hello world !");

        // 直接调用 run 方法(没开新线程哦!)
        runnableA.run();
        runnableB.run();

    }
}
