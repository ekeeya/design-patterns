package com.patterns.state;

public class   Mobile {
    public static void main(String[] args) {
        MobileContext mobileContext = new MobileContext();
        mobileContext.alert();

        mobileContext.setState(new Vibration());
        mobileContext.alert();
    }
}
