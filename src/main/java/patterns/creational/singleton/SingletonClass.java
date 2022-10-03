package patterns.creational.singleton;

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
