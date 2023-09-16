package com.designpattern.strategypattern.behaviour;

public class Quack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Quack quack.");
    }
}
