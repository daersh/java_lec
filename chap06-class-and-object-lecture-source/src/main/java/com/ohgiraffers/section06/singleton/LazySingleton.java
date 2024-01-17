package com.ohgiraffers.section06.singleton;

public class LazySingleton {
    static LazySingleton instance;

    private LazySingleton(){}
    public static LazySingleton getInstance() {
        if(instance == null) instance=new LazySingleton();

        return instance;
    }
}
