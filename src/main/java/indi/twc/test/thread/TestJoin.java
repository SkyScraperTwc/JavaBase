package indi.twc.test.thread;

public class TestJoin {
   public static void main(String[] args) throws InterruptedException{
	   MyRunnable m1 = new MyRunnable();
	   Thread th1 = new Thread(m1,"th---1");
	   Thread th2 = new Thread(m1,"th---2");
	   Thread th3 = new Thread(m1,"th---3");
	   
	    th1.start();
		th1.join(); // wait t1 to be finished,join()实现线程同步！
		th2.start();
		th3.start();
	   
   } 
}  

 
class MyRunnable implements Runnable{ 
	@Override
	public void run(){   
			for (int i = 0; i <= 20; i++) {  
				System.out.println(Thread.currentThread().getName()+"---------"+i);
		}
	}  
}
 
  










class MyThr2 extends Thread{
	public void run(){
		 for (int i = 0; i < 1000; i++) {
			 try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println("*********"+i);
		}
	} 
}