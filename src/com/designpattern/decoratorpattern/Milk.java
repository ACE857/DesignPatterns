package com.designpattern.decoratorpattern;

public class Milk extends CondimentDecorator{
    Beverage beverage;
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + " + Milk";
    }
}
