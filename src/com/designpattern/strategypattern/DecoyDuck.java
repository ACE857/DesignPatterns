package com.designpattern.strategypattern;

import com.designpattern.strategypattern.behaviour.Mute;
import com.designpattern.strategypattern.behaviour.NoFly;

public class DecoyDuck extends Duck{
    public DecoyDuck() {
        super(new NoFly(), new Mute());
    }

    @Override
    public void display() {
        System.out.println("Displaying decoy duck.");
    }
}
