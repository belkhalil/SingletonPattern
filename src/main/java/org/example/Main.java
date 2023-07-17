package org.example;

import org.example.model.MyClassLazilySingleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Singleton pattern");
        //First implementation of Singleton pattern
        MyClassLazilySingleton myClass = MyClassLazilySingleton.getInstance();

    }
}