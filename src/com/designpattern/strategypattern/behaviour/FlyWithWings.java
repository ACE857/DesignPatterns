package com.designpattern.strategypattern.behaviour;

public class FlyWithWings implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Duck flying with wings.");
    }
}
