package com.creational.singleton;

public class SingletonLazyMultithreaded {
    private static SingletonLazyMultithreaded obj1 = null;
    private SingletonLazyMultithreaded(){}

    public static synchronized SingletonLazyMultithreaded getInstance(){
        if(obj1 == null){
            obj1 = new SingletonLazyMultithreaded();
        }
        return obj1;
    }
}
