package com.designpattern.strategypattern;

import com.designpattern.strategypattern.behaviour.FlyWithWings;
import com.designpattern.strategypattern.behaviour.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("Displaying mallard duck.");
    }
}
