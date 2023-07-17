package org.example.model;

public class Singleton {

    //the key word volatile is to mack sur that the instance will be safe thread
    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    //Double-check locking creation
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized ((Singleton.class)) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
