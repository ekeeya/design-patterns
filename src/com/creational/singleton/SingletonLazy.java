package com.creational.singleton;

public class SingletonLazy {
    private static SingletonLazy obj1 = null;
    private SingletonLazy(){
        System.out.println("Object created");
    }
    public static SingletonLazy getInstance(){
        if (obj1 == null){
            obj1 = new SingletonLazy();
        }
        return obj1;
    }
}
