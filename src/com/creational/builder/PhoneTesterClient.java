package com.creational.builder;

public class PhoneTesterClient {
    public static void main(String[] args){
        Phone p = new PhoneBuilder().setOs("Android").setRam(2).getPhone();
        System.out.println(p.getOs());
        System.out.println(p.getProcessor());
        System.out.println(p.getRam());
    }
}
