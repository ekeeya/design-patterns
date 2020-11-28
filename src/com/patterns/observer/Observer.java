package com.patterns.observer;

public interface Observer {
    void update();
    void subscribe(Channel channel);
    void unSubscribe(Channel channel);
}
