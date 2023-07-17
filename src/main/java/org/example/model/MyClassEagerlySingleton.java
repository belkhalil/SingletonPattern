package org.example.model;

/**
 * Eagerly creation of singleton
 */
public class MyClassEagerlySingleton {
    private static MyClassEagerlySingleton uniqueInstance = new MyClassEagerlySingleton();
    private MyClassEagerlySingleton() {
    }
    public static MyClassEagerlySingleton getInstance() {

        return uniqueInstance;
    }
}
