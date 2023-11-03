package okhravi.singleton;

public class SingletonTest {
    public static void main(String[] args) {

        // Trying to instantiate many Singletons
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();

        // But when we try to print it's instances... we always get the same one
        System.out.println("\n");
        System.out.println("singleton = " + singleton);
        System.out.println("singleton2 = " + singleton2);
        System.out.println("singleton3 = " + singleton3);

    }
}
