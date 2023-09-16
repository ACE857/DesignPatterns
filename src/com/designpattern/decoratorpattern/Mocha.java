package com.designpattern.decoratorpattern;

public class Mocha extends CondimentDecorator{
    private Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.9;
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + " + Mocha";
    }
}
