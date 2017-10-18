package indi.twc.test.thread;

public class TestThreadLocal {
	//�̰߳�ȫ��,�ڱ�д���̴߳���ʱ�����԰Ѳ���ȫ�ı�����װ��ThreadLocal
	//���ڶ��߳���Դ��������⣬ͬ�����Ʋ����ˡ���ʱ�任�ռ䡱�ķ�ʽ����ThreadLocal�����ˡ��Կռ任ʱ�䡱�ķ�ʽ��
	//ǰ�߽��ṩһ�ݱ������ò�ͬ���߳��Ŷӷ��ʣ�������Ϊÿһ���̶߳��ṩ��һ�ݱ�������˿���ͬʱ���ʶ�����Ӱ�졣
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
//�ܽ�һ�仰����һ���������ƽ���ʱ�任�ռ䣬һ���Ǵ洢�������пռ任ʱ��
class TestThread implements Runnable {
	// ��ʹ��ThreadLocal����Connection����  
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
   

