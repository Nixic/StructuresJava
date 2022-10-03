package patterns.structural.proxy;

public class ProxyUsageExample {

    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
        object.process();

    }

}
