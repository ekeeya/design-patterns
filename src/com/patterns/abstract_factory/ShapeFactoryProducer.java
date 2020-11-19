package com.patterns.abstract_factory;

public class ShapeFactoryProducer {
    private ShapeFactoryProducer(){

    }
    public static AbstractShapeFactory getShapeFactory(String factoryType){
        switch (factoryType){
            case "BigFactory": return  new BigShapeFactory();
            case "SmallFactory": return new SmallShapeFactory();
        }
        return null;
    }
}

