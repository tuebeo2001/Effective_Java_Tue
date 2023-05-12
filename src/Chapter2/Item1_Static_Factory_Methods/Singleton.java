package Chapter2.Item1_Static_Factory_Methods;

public class Singleton {
    public static volatile Singleton instance = null;
    int number;

    public Singleton(int number) {
        this.number = number;
    }

    public static Singleton getSingletonInstance(int number) {
        if (instance == null) {
            synchronized (Singleton.class) { //only 1 thread can run on this class at the same time
                if (instance == null) {
                    instance = new Singleton(number);
                }
            }
        }
        return instance;
    }
}
