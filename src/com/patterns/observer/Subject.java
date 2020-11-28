package com.patterns.observer;

public interface Subject {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifyObservers();
}
