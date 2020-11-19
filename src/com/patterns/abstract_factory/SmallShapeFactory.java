package com.patterns.abstract_factory;

public class SmallShapeFactory implements AbstractShapeFactory {
    @Override
    public ShapeFactory getShapeInstance(String shapeType) {
        switch (shapeType){
            case "SmallCircle": return new SmallCircleDrawer();
            case "SmallRectangle":return new SmallRectangleDrawer();
        }
        return null;
    }
}
