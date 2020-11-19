package com.patterns.abstract_factory;

public class BigShapeFactory implements AbstractShapeFactory {
    @Override
    public ShapeFactory getShapeInstance(String shapeType) {
        switch (shapeType){
            case "BigCircle": return new BigCircleDrawer();
            case "BigRectangle":return new BigRectangleDrawer();
        }
        return null;
    }
}
