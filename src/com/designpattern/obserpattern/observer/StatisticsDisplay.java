package com.designpattern.obserpattern.observer;

import com.designpattern.obserpattern.subject.WeatherData;

public class StatisticsDisplay implements DisplayElement, Observer{
    private final WeatherData subject;
    private int data1;
    private int data2;

    public StatisticsDisplay(WeatherData subject) {
        this.subject = subject;
        this.subject.addObserver(this);
        pullUpdate(); // get latest updates
    }

    @Override
    public void display() {
        System.out.println("StatisticsDisplay data1 - " + data1 + " ,data2 - " + data2);
    }

    @Override
    public void pullUpdate() {
        data1 = subject.data1;
        data2 = subject.data2;
    }

    @Override
    public void pushUpdate(int data1, int data2) {
        this.data1 = data1;
        this.data2 = data2;
    }
}
