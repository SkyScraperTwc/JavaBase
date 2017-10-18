package indi.twc.test.design;

public class SingletonPatternDemo {

	public static void main(String[] args) {
//		System.out.println(SingleObject.getSingleObject());
//		System.out.println(SingleObject.getSingleObject());
//		System.out.println("");
//		System.out.println(Singleton.getSingleton());
//		System.out.println(Singleton.getSingleton());
//		System.out.println("");
//		System.out.println(Singleton2.getSingleton2());
//		System.out.println(Singleton2.getSingleton2());
//		for (int i = 0; i < 1000; i++) {
//			MyThread myThread = new MyThread();
//			myThread.start();
//		}
		
		System.out.println(Singleton6.INSTANCE.hashCode());
		System.out.println(Singleton6.INSTANCE.hashCode());
		System.out.println(Singleton6.INSTANCE.hashCode());
	}
}

class MyThread extends Thread{
	@Override
	public void run(){
		System.out.println(Singleton2.getSingleton2());
	}
}

/**
 * 1、懒汉式，线程不安全
是否 Lazy 初始化：是
是否多线程安全：否
实现难度：易
描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
 * @author Administrator
 *
 */
class Singleton {  
	private static Singleton singleton;
	private Singleton(){
		
	}
	public static Singleton getSingleton() throws InterruptedException{
		if(singleton==null){
			Thread.sleep(2000);
			singleton = new Singleton();
		}
		return singleton;
	}
	
}

/**
 * 2、懒汉式，线程安全
是否 Lazy 初始化：是
是否多线程安全：是
实现难度：易
描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
优点：第一次调用才初始化，避免内存浪费。
缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。
 */
class Singleton2{

	private static Singleton2 instance;

	private Singleton2(){}

	//这种写法性能很低,不建议采用
//	public static synchronized Singleton2 getInstance(){
//		if(instance==null){
//			instance = new Singleton2();
//		}
//		return instance;
//	}

	// 对象实例化时与否判断（不使用同步代码块，instance不等于null时，直接返回对象，提高运行效率）
	public static Singleton2 getSingleton2(){
		if(instance==null){
			// 同步代码块（对象未初始化时，使用同步代码块，保证多线程访问时对象在第一次创建后，不再重复被创建）
			synchronized (Singleton2.class){
				// 未初始化，则初始instance变量
				if(instance==null){
					instance = new Singleton2();
				}
			}
		}
		return instance;
	}
}

/**
 * 3、饿汉式
是否 Lazy 初始化：否
是否多线程安全：是
实现难度：易
描述：这种方式比较常用，但容易产生垃圾对象。
优点：没有加锁，执行效率会提高。
缺点：类加载时就初始化，浪费内存。
它基于 classloder 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化，
虽然导致类装载的原因有很多种，在单例模式中大多数都是调用 getInstance 方法，
 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化 instance 显然没有达到 lazy loading 的效果。
 * @author Administrator
 *
 */
class Singleton3{
	private  static Singleton3 singleObject = new Singleton3();
	
	//让构造函数为 private，这样该类就不会被实例化
	private Singleton3(){
		
	}
	public static Singleton3 getSingleObject(){
		return singleObject;
	}
}

/**
 * 6、枚举
JDK 版本：JDK1.5 起
是否 Lazy 初始化：否
是否多线程安全：是
实现难度：易
描述：这种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，绝对防止多次实例化。
这种方式是 Effective Java 作者 Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，
绝对防止多次实例化。不过，由于 JDK1.5 之后才加入 enum 特性，用这种方式写不免让人感觉生疏，在实际工作中，也很少用。
不能通过 reflection attack 来调用私有构造方法。
代码实例：
 * @author Administrator
 *
 */
enum Singleton6 {  
    INSTANCE;  
    public void whateverMethod() {  
    }  
}  

/**
 * 经验之谈：一般情况下，不建议使用第 1 种和第 2 种懒汉方式，建议使用第 3 种饿汉方式。只有在要明确实现 lazy loading 效果时，
 * 才会使用第 5 种登记方式。如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。
 */


