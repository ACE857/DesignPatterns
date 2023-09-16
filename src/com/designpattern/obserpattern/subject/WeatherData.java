package com.designpattern.obserpattern.subject;

import com.designpattern.obserpattern.observer.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherData implements Subject{

    public int data1, data2;
    Set<Observer> observers = new HashSet<>();

    @Override
    public void notifyObserver() {
        System.out.println("Pull updates in progress.");
        observers.forEach(Observer::pullUpdate);
        System.out.println("Push updates in progress.");
        observers.forEach(observer -> observer.pushUpdate(data1, data2));
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void updateData(int data1, int data2) {
        this.data1 = data1;
        this.data2 = data2;
        notifyObserver();
    }
}
