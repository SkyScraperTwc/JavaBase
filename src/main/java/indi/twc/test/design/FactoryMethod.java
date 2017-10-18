package indi.twc.test.design;

public class FactoryMethod {
	
	public static void main(String[] args) {
		FactoryBMW factoryBMW000 = new FactoryBMW000();
		BMW000 bmw000 = (BMW000) factoryBMW000.createBMW();
		bmw000.show();
		
		FactoryBMW factoryBMW001 = new FactoryBMW001();
		BMW001 bmw001 = (BMW001) factoryBMW001.createBMW();
		bmw001.show();
	}

}

interface BMWSEC {
}

class BMW000 implements BMWSEC {
    public void show(){
    	System.out.println("????-->BMW000");
    }
}

class BMW001 implements BMWSEC {
    public void show(){  
        System.out.println("????-->BMW001");  
    }  
}

interface FactoryBMW{
	public BMWSEC createBMW();
}

class FactoryBMW000 implements FactoryBMW {
	@Override
	public BMWSEC createBMW() {
		return new BMW000();
	}
}

class FactoryBMW001 implements FactoryBMW {

	@Override
	public BMWSEC createBMW() {
		return new BMW001();
	}
}