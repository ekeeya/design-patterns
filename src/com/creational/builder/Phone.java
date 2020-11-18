package com.creational.builder;

public class Phone {
    private String os;
    private int ram;
    private String processor;
    private double screenSize;

    public String getOs() {
        return os;
    }

    public int getRam() {
        return ram;
    }

    public String getProcessor() {
        return processor;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getBattery() {
        return battery;
    }

    private int battery;

    public Phone(String os, int ram, String processor, double screenSize, int battery) {
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
    }

}
