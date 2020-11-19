package com.patterns.factory;

public class FactoryDemo {
    public static void main(String[] args){
        ShapeFactory factory = new ShapeFactory();
        Shape shape;
        shape = factory.factoryMethod("C");
        shape.draw();
    }
}
