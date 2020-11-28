package com.patterns.observer;

public class YouTube {
    public static void main(String[] args) {
        Channel keeya = new Channel();
        Subscriber s1 = new Subscriber("Sherry");
        Subscriber s2 = new Subscriber("Kayaga");
        Subscriber s3 = new Subscriber("Emma");

        keeya.subscribe(s1);
        keeya.subscribe(s2);
        keeya.subscribe(s3);

        s1.subscribe(keeya);
        s2.subscribe(keeya);
        s3.subscribe(keeya);

        keeya.unsubscribe(s3);
        s3.unSubscribe(keeya);

        keeya.upload("This is fun");
    }
}
