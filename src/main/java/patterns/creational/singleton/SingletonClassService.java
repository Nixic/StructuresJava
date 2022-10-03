package patterns.creational.singleton;

public class SingletonClassService {

    private static SingletonClass singletonClass = SingletonClass.getInstance();

    public static SingletonClass getSingletonClass() {
        singletonClass.setInfo("New class info");
        return singletonClass;
    }

    public static void main(String[] args) {
        System.out.println(singletonClass.getInfo());
        System.out.println(getSingletonClass().getInfo());
    }


}
