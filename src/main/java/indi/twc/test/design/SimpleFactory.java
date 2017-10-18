package indi.twc.test.design;

//简单工厂模式
public class SimpleFactory {

	public static void main(String[] args) {
		Factory factory = new Factory();
		BMW bmw = (BMW320) factory.createBMW("BMW320");
	}

}

//产品类
interface BMW {  
	
}

//具体产品类
class BMW320 implements BMW {
    public BMW320(){  
        System.out.println("制造-->BMW320");  
    }  
}

class BMW523 implements BMW {
    public BMW523(){  
        System.out.println("制造-->BMW523");  
    }  
}

//具体工厂类
class Factory{
	public BMW createBMW(String type){
		if(type.equals("BMW320")){
			return new BMW320();
		}
		if(type.equals("BMW523")){
			return new BMW523();
		}
		return null;
	}
}