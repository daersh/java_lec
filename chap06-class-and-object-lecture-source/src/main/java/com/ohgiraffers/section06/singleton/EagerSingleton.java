package com.ohgiraffers.section06.singleton;

public class EagerSingleton {

    private static EagerSingleton instance= new EagerSingleton();

    public EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return  instance;
    }
}
