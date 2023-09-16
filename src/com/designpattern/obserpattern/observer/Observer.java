package com.designpattern.obserpattern.observer;

public interface Observer {
    void pullUpdate();

    void pushUpdate(int data1, int data2);
}
