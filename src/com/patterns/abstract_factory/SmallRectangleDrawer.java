package com.patterns.abstract_factory;

public class SmallRectangleDrawer implements  ShapeFactory{
    @Override
    public void draw() {
        System.out.println("I am drawing a small Rectangle");
    }
}
