package com.designpattern.strategypattern.behaviour;

public class Mute implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Mute quack.");
    }
}
