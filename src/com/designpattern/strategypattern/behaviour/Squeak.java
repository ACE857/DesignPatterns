package com.designpattern.strategypattern.behaviour;

public class Squeak implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Squeak quack.");
    }
}
