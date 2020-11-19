package com.patterns.abstract_factory;

public class BigCircleDrawer implements ShapeFactory{

    @Override
    public void draw() {
        System.out.println("I am drawing a big Circle");
    }
}
