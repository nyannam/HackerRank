public class DemoDefaultMethod implements DemoDefaultInterface8 {

    @Override
    public void abc() {
        System.out.println("I am Demo class Implementing method in DemoDefaultInterface8 Interface");
    }
}

class MainClassDefaultMethodInInterface {
    public static void main(String[] args) {
        DemoDefaultInterface8 defaultMethodDemo = new DemoDefaultMethod();
        defaultMethodDemo.abc();
        defaultMethodDemo.show();
    }
}