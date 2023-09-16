package com.designpattern.strategypattern.behaviour;

public class NoFly implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Duck cannot fly.");
    }
}
