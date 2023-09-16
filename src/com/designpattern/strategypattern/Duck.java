package com.designpattern.strategypattern;

import com.designpattern.strategypattern.behaviour.FlyBehaviour;
import com.designpattern.strategypattern.behaviour.QuackBehaviour;

public class Duck {
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    public Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public FlyBehaviour getFlyBehaviour() {
        return flyBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public QuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void quack() {
        quackBehaviour.quack();
    }

    public void fly() {
        flyBehaviour.fly();
    }

    public void display() {
        System.out.println("Displaying duck.");
    }

    public void swim() {
        System.out.println("Swimming duck.");
    }
}
