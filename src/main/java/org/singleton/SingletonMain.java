package org.singleton;

import org.singleton.example.Singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton singleton = Singleton.fetchInstance();
        System.out.println(singleton.hashCode());

        Singleton singleton1 = Singleton.fetchInstance();
        System.out.println(singleton1.hashCode());

        Singleton singleton2 = Singleton.fetchInstance();
        System.out.println(singleton2.hashCode());
    }
}
