package indi.twc.test.design;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        AbstractTemplate template = new ConcreteTemplate();
        template.templateMethod();
    }
}

abstract class AbstractTemplate {
    public void templateMethod(){
        abstractMethod();
        hookMethod();
    }

    protected abstract void abstractMethod();

    protected void hookMethod(){
        System.out.println("hookMethod()...");
    }
}

class ConcreteTemplate extends AbstractTemplate {

    @Override
    protected void abstractMethod() {
        System.out.println("ConcreteTemplate...abstractMethod()");
    }
}