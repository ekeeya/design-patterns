package com.patterns.state;

public class Vibration implements MobileAlertState{
    @Override
    public void alert() {
        System.out.println("Phone is vibrating");
    }
}
