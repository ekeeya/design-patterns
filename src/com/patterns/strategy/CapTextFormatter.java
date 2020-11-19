package com.patterns.strategy;

public class CapTextFormatter implements  TextFormatter{
    @Override
    public void format(String text) {
        System.out.println("[CapsText formatter]: "+text.toUpperCase());
    }
}
