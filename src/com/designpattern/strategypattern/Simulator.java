package com.designpattern.strategypattern;

import com.designpattern.strategypattern.behaviour.Squeak;

public class Simulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.quack();
        duck.setQuackBehaviour(new Squeak());
        System.out.println("Updating quack behaviour");
        duck.quack();
    }
}
