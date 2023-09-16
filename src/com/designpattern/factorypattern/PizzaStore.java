package com.designpattern.factorypattern;

public abstract class PizzaStore {
    //factory method - provides an abstract interface to create one product and each subclass
    // decides which concrete to instantiate
    public abstract Pizza createPizza(String name);
}
