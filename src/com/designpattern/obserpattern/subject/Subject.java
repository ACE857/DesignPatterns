package com.designpattern.obserpattern.subject;

import com.designpattern.obserpattern.observer.Observer;

public interface Subject {
    void notifyObserver();
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
}
