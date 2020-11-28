package com.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{

    List<Subscriber> subs =  new ArrayList<>();
    public String title;

    @Override
    public void subscribe(Subscriber subscriber) {
        subs.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subs.remove(subscriber);
    }

    @Override
    public void notifyObservers() {
        for(Subscriber sub: subs){
            sub.update();
        }
    }
    public void upload(String title){
        this.title = title;
        notifyObservers();
    }

}
