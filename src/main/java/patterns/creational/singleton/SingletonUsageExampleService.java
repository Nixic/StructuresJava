package patterns.creational.singleton;

public class SingletonUsageExampleService {

    private static final SingletonClass SINGLETON_CLASS = SingletonClass.getInstance();
    private static final SynchronizedAndDoubleCheckedSingleton SYNCHRONIZED_SINGLETON_CLASS = SynchronizedAndDoubleCheckedSingleton.getInstance();
    private static final SingletonHolderClass SINGLETON_HOLDER_CLASS = SingletonHolderClass.getInstance();

    public static SingletonClass getSingletonClass() {
        SINGLETON_CLASS.setInfo("New class info of lazy singleton");
        return SINGLETON_CLASS;
    }

    public static SynchronizedAndDoubleCheckedSingleton getSynchronizedSingletonClass() {
        SYNCHRONIZED_SINGLETON_CLASS.setInfo("New class info of synchronized singleton");
        return SYNCHRONIZED_SINGLETON_CLASS;
    }

    public static SingletonHolderClass getHolderSingletonClass() {
        SINGLETON_HOLDER_CLASS.setInfo("New class info of holder singleton");
        return SINGLETON_HOLDER_CLASS;
    }

    public static void main(String[] args) {
        System.out.println(SINGLETON_CLASS.getInfo());
        System.out.println(getSingletonClass().getInfo());

        System.out.println(SYNCHRONIZED_SINGLETON_CLASS.getInfo());
        System.out.println(getSynchronizedSingletonClass().getInfo());

        System.out.println(SINGLETON_HOLDER_CLASS.getInfo());
        System.out.println(getHolderSingletonClass().getInfo());
    }

}
