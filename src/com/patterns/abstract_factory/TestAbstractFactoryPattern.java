package com.patterns.abstract_factory;

import com.patterns.factory.Shape;

public class TestAbstractFactoryPattern {
    public static void main(String[] args) {
        // Get the abstract shape factory first
        AbstractShapeFactory abstractShapeFactory =  ShapeFactoryProducer.getShapeFactory("BigFactory");
        ShapeFactory shape = abstractShapeFactory.getShapeInstance("BigCircle");
        shape.draw();

        // Get a small triangle
        System.out.println("+-----------------+");
        AbstractShapeFactory abstractShapeFactory1 = ShapeFactoryProducer.getShapeFactory("SmallFactory");
        ShapeFactory shape2 = abstractShapeFactory1.getShapeInstance("SmallRectangle");
        shape2.draw();
    }
}
