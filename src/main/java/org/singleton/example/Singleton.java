package org.singleton.example;

public class Singleton {
    private static Singleton singleton;
    private Singleton() {}

    public static Singleton fetchInstance() {
        synchronized (Singleton.class) {
            if (singleton == null) {
                singleton = new Singleton();
            }
            return singleton;
        }
    }
}
