package fun;

/**
 * Overloading example with Object type as param, but null on call implementation
 */
public class OverloadingExample {

    void method(Parent parent) {
        System.out.println("parent");
    }

    void method(Child child) {
        System.out.println("child");
    }

    public static void main(String[] args) {
        OverloadingExample example = new OverloadingExample();
        example.method(null);
    }

    class Parent {
    }

    class Child extends Parent {
    }

}
