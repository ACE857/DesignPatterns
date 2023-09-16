package com.designpattern.strategypattern;

import com.designpattern.strategypattern.behaviour.FlyWithWings;
import com.designpattern.strategypattern.behaviour.Quack;

public class ReadHeadDuck extends Duck{
    public ReadHeadDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("Displaying red head duck.");
    }
}
