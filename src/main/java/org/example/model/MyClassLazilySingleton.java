package org.example.model;

/**
 * In this example we use a lazily creation of singleton
 */
public class MyClassLazilySingleton {
    private static MyClassLazilySingleton uniqueInstance;
    private MyClassLazilySingleton() {
    }
    public static synchronized MyClassLazilySingleton getInstance() {
        //We added synchronized to make our singleton thread safe
        if (uniqueInstance == null) {
            uniqueInstance = new MyClassLazilySingleton();
        }
        return uniqueInstance;
    }
}
