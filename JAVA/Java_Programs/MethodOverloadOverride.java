class A {
    void show() {
        System.out.println("Class A");
    }
}

class B extends A {
    void show() {
        System.out.println("Class B");
    }
}

class Overload {
    void print(int x) {
        System.out.println("Integer: " + x);
    }

    void print(String x) {
        System.out.println("String: " + x);
    }
}

public class MethodOverloadOverride {
    public static void main(String[] args) {
        Overload ol = new Overload();
        ol.print(10);
        ol.print("Hello");

        A obj = new B();
        obj.show();
    }
}