package okhravi.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.printf("Class: %s, Memory Address: %s", this.getClass().getSimpleName(), this.hashCode());
    }

    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
