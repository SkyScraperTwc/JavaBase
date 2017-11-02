package indi.twc.test.thread;
/**
 * /** 
* һ���򵥵������� 
* ��DeadLock��Ķ���flag==1ʱ��td1����������o1,˯��500���� 
* ��td1��˯�ߵ�ʱ����һ��flag==0�Ķ���td2���߳�������������o2,˯��500���� 
* td1˯�߽�������Ҫ����o2���ܼ���ִ�У�����ʱo2�ѱ�td2������ 
* td2˯�߽�������Ҫ����o1���ܼ���ִ�У�����ʱo1�ѱ�td1������ 
* td1��td2�໥�ȴ�������Ҫ�õ��Է���������Դ���ܼ���ִ�У��Ӷ������� 
 * @author TanWC
 *
 */
public class DeadLockDemoTest {

	public static void main(String[] args) {
	    DeadLock dl1 = new DeadLock();  
        DeadLock dl2 = new DeadLock();  
        dl1.flag = 1;  
        dl2.flag = 2;  
        //td1,td2�����ڿ�ִ��״̬����JVM�̵߳�����ִ���ĸ��߳��ǲ�ȷ���ġ�  
        //td2��run()������td1��run()֮ǰ����  
        new Thread(dl1).start();  
        new Thread(dl2).start();  
	}

}


class DeadLock implements Runnable {  
    public int flag;  
    //��̬������������ж������  
    private static Object lock1 = new Object(), lock2 = new Object();  
    @Override 
    public void run() {  
//        System.out.println("flag=" + flag);  
        if (flag == 1) {  
            synchronized (lock1) {  
                try {  
                	System.out.println("�߳�dl1�ɹ�������lock1������100ms˯��״̬��");
                    Thread.sleep(100);  
                } catch (Exception e) {  
                    e.printStackTrace();  
                }  
	                System.out.println("�߳�dl1���ѣ��ȴ�lock2�����ͷţ������߳�dl2��Ը�ͷš�����");
	                synchronized (lock2) {  
	                    System.out.println("1");  
	                }  
            }  
        }  
        if (flag == 2) {  
            synchronized (lock2) {  
                try {  
                	System.out.println("�߳�dl2�ɹ�������lock2������100ms˯��״̬��");
                    Thread.sleep(100);  
                } catch (Exception e) {  
                    e.printStackTrace();  
                }  
	                System.out.println("�߳�dl2���ѣ��ȴ�lock1�����ͷţ������߳�dl1��Ը�ͷš�����");
	                synchronized (lock1) {  
	                    System.out.println("0");  
                }  
            }  
        }  
    }  
}