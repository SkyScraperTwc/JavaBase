package indi.twc.test.design;

//抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。
//该超级工厂又称为其他工厂的工厂。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
public class AbstractFactoryTest {
	
	public static void main(String[] args) {
		ShapeFactory shapeFactory = (ShapeFactory) FactoryCreator.getFactory("SHAPE");
		Shape shape1 = shapeFactory.getShape("SQUARE");
		shape1.draw();
		Shape shape2 = shapeFactory.getShape("Rectangle");
		shape2.draw();
		
		ColorFactory colorFactory = (ColorFactory) FactoryCreator.getFactory("color");
		Color color1 = colorFactory.getColor("red");
		color1.fill();
		Color color2 = colorFactory.getColor("GREEN");
		color2.fill();
	}
}

interface Shape {
	  void draw();
}

class Rectangle implements Shape {

	   @Override
	   public void draw() {
	      System.out.println("Inside Rectangle::draw() method.");
	   }
}

class Square implements Shape {

	   @Override
	   public void draw() {
	      System.out.println("Inside Square::draw() method.");
	   }
}

interface Color {
	   void fill();
}

class Red implements Color {

	   @Override
	   public void fill() {
	      System.out.println("Inside Red::fill() method.");
	   }
}

class Green implements Color {

	   @Override
	   public void fill() {
	      System.out.println("Inside Green::fill() method.");
	   }
}

//抽象工厂类
abstract class AbstractFactory{
	public Shape getShape(String shapeType) {
		return null;
	}
	public Color getColor(String colorType) {
		return null;
	}
}

//具体工厂类ShapeFactory
class ShapeFactory extends AbstractFactory {
    
	@Override
	public Shape getShape(String shapeType) {
		 if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	      } else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
	      return null;
	}
}

//具体工厂类ColorFactory
class ColorFactory extends AbstractFactory {
	@Override
	public Color getColor(String colorType){
	      if(colorType.equalsIgnoreCase("RED")){
	         return new Red();
	      } else if(colorType.equalsIgnoreCase("GREEN")){
	         return new Green();
	      }
	      return null;
	}
}

//工厂创造器
class FactoryCreator{
	public static AbstractFactory getFactory(String choice){
		if(choice.equalsIgnoreCase("SHAPE")){
	         return new ShapeFactory();
	      } else if(choice.equalsIgnoreCase("COLOR")){
	         return new ColorFactory();
	      }
		return null;
	}
}


