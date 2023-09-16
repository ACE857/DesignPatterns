package com.designpattern.obserpattern;

import com.designpattern.obserpattern.observer.CurrentConditionDisplay;
import com.designpattern.obserpattern.observer.StatisticsDisplay;
import com.designpattern.obserpattern.subject.WeatherData;

public class Simulator {
    public static void main(String[] args) {
        WeatherData subject = new WeatherData();
        subject.updateData(1, 2);
        CurrentConditionDisplay currentDisplayObserver = new CurrentConditionDisplay(subject);
        currentDisplayObserver.display();

        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(subject);
        statisticsDisplay.display();

        subject.updateData(3, 4);
        currentDisplayObserver.display();
        statisticsDisplay.display();
    }
}
