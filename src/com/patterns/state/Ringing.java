package com.patterns.state;

public class Ringing implements MobileAlertState {
    @Override
    public void alert() {
        System.out.println("Phone is ringing");
    }
}
