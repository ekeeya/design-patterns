package com.patterns.factory;

public class ShapeFactory {
    Shape factoryMethod(String shape){
        if(shape.equals("C")){
            return new Circle();
        }else{
            return new Rectangle();
        }
    }
}
