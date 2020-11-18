package com.creational.singleton;

public class Singleton {
    private static Singleton obj1 =  new Singleton();
    private Singleton(){}

    public static Singleton getInstance(){
        return obj1;
    }
}
