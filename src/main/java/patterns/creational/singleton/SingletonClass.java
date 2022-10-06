package patterns.creational.singleton;

/**
 * This is first and very simple example of singleton.
 *
 * Pluses: Lazy initialization
 *
 * Minuses: Not thread safe
 *
 * !!! Use it if you don't need multithreading
 */
public class SingletonClass {

    private static SingletonClass INSTANCE;
    private String info = "Initial class info";

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SingletonClass();
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
