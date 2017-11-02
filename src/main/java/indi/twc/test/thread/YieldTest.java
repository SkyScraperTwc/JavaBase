package indi.twc.test.thread;


public class YieldTest {

	public static void main(String[] args) throws InterruptedException {
		MyRunnable1 thread1 = new MyRunnable1();
		Thread th1 = new Thread(thread1);
		Thread th2 = new Thread(thread1);
		
		th2.start();
		th1.start();    
		  
	}     
   
}        
   
class MyRunnable1 implements Runnable{       
	@Override     
	public void run() {   
			for (int i = 0; i < 30; i++) {
				if(i==10){
					Thread.yield();
				}
				System.out.println(Thread.currentThread().getName()+"-------------------------->"+i); 
		}
	}  
} 
