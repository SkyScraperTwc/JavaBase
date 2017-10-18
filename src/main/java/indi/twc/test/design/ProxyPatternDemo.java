package indi.twc.test.design;

public class ProxyPatternDemo {

	public static void main(String[] args) {
		Image image = new ProxyImage("123");
		image.display();
	}

}

interface Image {
	  void display();
}

class RealImage implements Image {
	   
	   private String fileName;

	   public RealImage(String fileName){
	      this.fileName = fileName;
	      System.out.println("Loading " + fileName);
	   }

	   @Override
	   public void display() {
	      System.out.println("Displaying " + fileName);
	   }
}

class ProxyImage implements Image {
	private RealImage realImage;
	
	public ProxyImage(String fileName){
		realImage = new RealImage(fileName);
	}
	
	@Override
	public void display() {
		realImage.display();
	}
	
} 