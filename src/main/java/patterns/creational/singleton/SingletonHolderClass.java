package patterns.creational.singleton;

/**
 * Class holder singleton example.
 *
 * Pluses: Lazy initialization
 *         Thread safe
 *         High performance in a multithreading environment
 *
 * Minuses: If initialization has error it will cause ExceptionInInitializerError on first call
 * and NoClassDefFoundError on next calls
 *
 */
public class SingletonHolderClass {

    private String info = "Initial class info";

    private SingletonHolderClass() {
    }

    private static class SingletonHolder {
        public static final SingletonHolderClass HOLDER_INSTANCE = new SingletonHolderClass();
    }

    public static SingletonHolderClass getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
