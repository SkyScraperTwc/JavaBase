package indi.twc.test.thread;

public class ThreadLocalTest {
	public static void main(String[] args) throws InterruptedException {
		TestThread testThread = new TestThread();
		Thread thread1 = new Thread(testThread);
		Thread thread2 = new Thread(testThread);
		Thread thread3 = new Thread(testThread);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}     
   
}  

class Connection{
	public Connection(){
		System.out.println(Thread.currentThread().getName()+this);
	}
}
class TestThread implements Runnable {
    private static ThreadLocal<Connection> connThreadLocal = new ThreadLocal<Connection>();
	
    public static Connection getConnection(){
    	if(connThreadLocal.get() == null){
    		Connection conn = new Connection();
    		connThreadLocal.set(conn);
    		return connThreadLocal.get();
    	}else{
    		return connThreadLocal.get();
    	}
    }
    
	@Override
	public void run() {
		Connection connection = getConnection();
		System.out.println(Thread.currentThread().getName()+connection.toString());
	}
	
}
   

