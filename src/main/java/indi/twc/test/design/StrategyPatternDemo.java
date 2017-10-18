package indi.twc.test.design;

/**
 * 最最直观的区别应该是，工厂模式里用户最终使用的是工厂“生产”出来的类的对象，策略模式里用户最终使用的是“配置”了某一策略的Context对象。
 * 其实一句话就能说得很清楚——工厂模式是创建型的设计模式，它接受指令，创建出符合要求的实例；而策略模式是行为型的设计模式，它接受已经创建好的实例，实现不同的行为。
 * @author Administrator
 *
 */
public class StrategyPatternDemo {

	public static void main(String[] args) {
		Context context = new Context();
		
		//OperationAdd策略
		context.setStrategy(new OperationAdd());
		System.out.println(context.executeOperation(1, 6));
		
		//OperationSub策略
		context.setStrategy(new OperationSub());
	    System.out.println(context.executeOperation(2, 10));
	}

}

//策略模式抽象类
interface Strategy{
 public int doOperation(int num1, int num2);
}

//策略模式具体类
class OperationAdd implements Strategy {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 + num2;
	} 
}

//策略模式具体类
class OperationSub implements Strategy {

	@Override
	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}
}

//策略模式具体类
class Context{
	public Strategy strategy;
	
	public int executeOperation(int num1, int num2){
		return strategy.doOperation(num1, num2);
	}
	
	//你使用哪个策略
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
}