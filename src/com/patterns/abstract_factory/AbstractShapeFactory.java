package com.patterns.abstract_factory;

public interface AbstractShapeFactory {
     ShapeFactory getShapeInstance(String shapeType);
}
