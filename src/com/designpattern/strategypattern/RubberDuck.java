package com.designpattern.strategypattern;

import com.designpattern.strategypattern.behaviour.NoFly;
import com.designpattern.strategypattern.behaviour.Squeak;

public class RubberDuck extends Duck{
    public RubberDuck() {
        super(new NoFly(), new Squeak());
    }

    @Override
    public void display() {
        System.out.println("Displaying rubber duck.");
    }
}
