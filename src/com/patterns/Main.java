package com.patterns;

import com.patterns.singleton.SingletonLazy;

public class Main {
    public static void main(String[] args){
        SingletonLazy obj =  SingletonLazy.getInstance();
    }
}
