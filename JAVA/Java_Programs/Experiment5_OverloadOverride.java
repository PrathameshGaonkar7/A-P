class OverloadExample {
    void show(int a) {
        System.out.println("Integer: " + a);
    }

    void show(double a) {
        System.out.println("Double: " + a);
    }

    void show(String a) {
        System.out.println("String: " + a);
    }
}

class Parent {
    void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    @Override
    void greet() {
        System.out.println("Hello from Child");
    }
}

public class Experiment5_OverloadOverride {
    public static void main(String[] args) {
        OverloadExample ol = new OverloadExample();
        ol.show(10);
        ol.show(12.34);
        ol.show("Java");

        Parent ref = new Child(); // dynamic dispatch
        ref.greet();
    }
}