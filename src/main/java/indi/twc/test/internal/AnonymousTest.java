package indi.twc.test.internal;

public class AnonymousTest {
    //接口做参数
    public void productMethod(Product product){
        System.out.println("购买一个"+product.getName()+"，花掉了"+product.getPrice());
    }

    public static void main(String[] args) {
        AnonymousTest test = new AnonymousTest();
        test.productMethod(new Product() {
            @Override
            public double getPrice() {
                return 567.8;
            }

            @Override
            public String getName() {
                return "twc";
            }
        });
    }
}
