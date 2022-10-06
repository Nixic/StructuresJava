package patterns.creational.singleton;

/**
 * This is synchronized and double-checked locking singleton example
 *
 * Pluses:  Lazy initialization
 *          Thread safe
 *          High performance in a multithreading environment
 *
 * Minuses: not supported of Java version < 1.5
 */
public class SynchronizedAndDoubleCheckedSingleton {

    private static SynchronizedAndDoubleCheckedSingleton INSTANCE;
    private String info = "Initial class info";

    private SynchronizedAndDoubleCheckedSingleton() {
    }

    public static SynchronizedAndDoubleCheckedSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (SynchronizedAndDoubleCheckedSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SynchronizedAndDoubleCheckedSingleton();
                }
            }
        }
        return INSTANCE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
